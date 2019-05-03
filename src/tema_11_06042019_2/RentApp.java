package tema_11_06042019_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tema_11_06042019_2.Movie;

public class RentApp {	
	static int cid;
	
	private Connection getConnection() {
		try {
			DriverManager.setLoginTimeout(10);
			return DriverManager.getConnection("jdbc:mysql://localhost/movie?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Bucharest", "root", "password");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Vezi ca ai gresit url-ul de conctare la Db");
			return null;
		}
	}
	
	private void appStart() {
		cidRead();
		appMenu();
	}
	
	private void cidRead() {
		int repeat=1;
		Scanner sc = new Scanner(System.in);
		while (repeat == 1) {
			System.out.println("Introduceti id-ul de client: ");
			cid = sc.nextInt();
			Customer cust = new Customer();
			try (Connection connection = getConnection()) {
				Statement statement = connection.createStatement();
				String query = "select * from customer where cid=?";
				PreparedStatement ps = connection.prepareStatement(query);
				ps.setInt(1, cid);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					cust.setLogin(rs.getString(1));
					cust.setCid(rs.getInt(2));
					cust.setPassword(rs.getString(3));
					cust.setFirst_name(rs.getString(4));
					cust.setLast_name(rs.getString(5));
					cust.setRental_plan(rs.getInt(6));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if (cust.getFirst_name() == null) {
				System.out.println("Client inexistent");
			} else {
				System.out.println("Welcome " +cust.getFirst_name() +"!\n");
				repeat=2;
			}
		}
	}
	
	private void appMenu() {
		int opt=0;
		int repeat = 1;
		while (repeat == 1) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Aplicatie de inchiriat filme, optiuni disponibile:\n" 
								+ "1 - Cautare film\n" 
								+ "2 - Schimbarea planului\n" 
								+ "3 - Inchiriere film\n");
			System.out.println("Introduceti optiunea aleasa: ");
			opt = sc.nextInt();
			if (opt<1||opt>3) {
				System.out.println("Optiunea nu este disponibila, alegeti o optiune valida");
			} else {
				repeat=2;
			}
		}
		switch(opt) {
		case 1:{
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduceti titlul filmului cautat: ");
			String movieName = sc.nextLine();
//			a woman rebels
			getSomeMovies(movieName).forEach(System.out::println);
			break;
		}
		case 2:{
			planChange();
			break;
		}
		case 3:{
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduceti id-ul filmului cautat: ");
			String movieId = sc.nextLine();
			movieRental(movieId);
			break;
		}
		}
	}
	
	private List<MovieSearch> getSomeMovies(String movieName) {
		List<MovieSearch> movieList = new ArrayList<>();
		try (Connection connection = getConnection()) {
			Statement statement = connection.createStatement();
			String query = "select mi.movie_id,mi.movie_name,mi.year, ai.actor_name,r.status\n" + 
					"from \n" + 
					"movie_info as mi left join\n" + 
					"actor_movies as am on mi.movie_id=am.movie_id left join \n" + 
					"actor_ids as ai  on am.actor_id=ai.actor_id left join \n" + 
					"rental as r on mi.movie_id=r.movie_id\n" + 
					"where 1=1\n" + 
					"and mi.movie_name=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, movieName);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				MovieSearch movie = new MovieSearch();
				movie.setId(rs.getString("movie_id")); // dupa numele coloanei
				movie.setName(rs.getString(2));
				movie.setYear(rs.getInt(3));
				movie.setActorName(rs.getString(4));
				movie.setStatus(rs.getString(5));
				movieList.add(movie);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movieList;
	}
	
	private void planChange() {
		int repeat=1;
		Scanner sc = new Scanner(System.in);
		while (repeat == 1) {
			System.out.println("Tastati < plan > pt a afisa planurile disponibile ");
			String plan = sc.nextLine();
			if (plan.equals("plan")) {
				repeat=2;
			} else {
				System.out.println("Cuvant incorect! \n");
			}
		}
		List<Plan> planList = new ArrayList<>();
		try (Connection connection = getConnection()) {
			Statement statement = connection.createStatement();
			String query = "select distinct p.* from plan p";
			PreparedStatement ps = connection.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Plan plan = new Plan();
				plan.setPlan_id(rs.getInt(1));
				plan.setName(rs.getString(2));
				plan.setMax_rentals(rs.getInt(3));
				plan.setMonthly_fee(rs.getInt(4));
				planList.add(plan);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		planList.forEach(System.out::println);
		System.out.println("\nSelectati noul plan dorit: ");
		int newPlan = sc.nextInt();
		if (updatePlan(newPlan)) {
			System.out.println("Noul plan a fost adaugat!");
		}
	}
	
	public boolean updatePlan(int newPlan) {
		try (Connection connection = getConnection()) {
			String update = "update customer set rental_plan=? where cid=?";
			PreparedStatement ps = connection.prepareStatement(update);
			ps.setInt(1, newPlan);
			ps.setInt(2, cid);
			int rows = ps.executeUpdate();
			return rows > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public void movieRental(String movieId) {
		if(checkRental(movieId)) {
			System.out.println("Filmul este disponibil pt inchiriere!");
			if(addRental(movieId)) {
				System.out.println("Filmul a fost inchiriat!");
			}
		} else {
			System.out.println("Filmul este deja inchiriat!");
		}
	}
	
	public boolean checkRental(String movieId) {
		boolean rentalOK=true;
		List<Rental> rentalList = new ArrayList<>();
		try (Connection connection = getConnection()) {
			Statement statement = connection.createStatement();
			String query = "select * from rental where movie_id=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, movieId);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Rental rental = new Rental();
				rental.setCid(rs.getInt(1));
				rental.setMovie_id(rs.getString(2));
				rental.setStatus(rs.getString(3));
				rental.setRented_times(rs.getInt(4));
				rentalList.add(rental);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		for(Rental r:rentalList) {
			if(r.getStatus().equals("open")) {
				rentalOK=false;
			}
		}
		return rentalOK;
	}
	
	public boolean addRental(String movieId) {
		try (Connection connection = getConnection()) {
			String update = "insert into rental values (?,?,?,?)";
			PreparedStatement ps = connection.prepareStatement(update);
			ps.setInt(1, cid);
			ps.setString(2, movieId);
			ps.setString(3, "open");
			ps.setInt(4, 1);
			int rows = ps.executeUpdate();
			return rows > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static void main(String[] args) {
		new RentApp().appStart();
	}
}
