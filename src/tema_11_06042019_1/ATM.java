package tema_11_06042019_1;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public  class ATM {
	
	private Client client=new Client();
	private List<Cont> listaConturi=new ArrayList<Cont>();
	
	private Connection getConnection() {
		try {
			DriverManager.setLoginTimeout(10);
			return DriverManager.getConnection("jdbc:mysql://localhost/atm?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Bucharest",
					"root", "password");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Vezi ca ai gresit url-ul de conctare la Db");
			return null;
		}
	}

	public Client getClient(String id) {
		try (Connection connection = getConnection()) {
			Statement statement = connection.createStatement();
			String query = "select * from client where id_client=?";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				client.setNume(rs.getString(1));
				client.setPrenume(rs.getString(2));
				client.setId(rs.getString(3));
				client.setCnp(rs.getString(4));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		getCont(id);
		client.setListaConturi(listaConturi);
		System.out.println(client.toString());	
		return client;
	}
	
	public void getCont(String id) {
		try (Connection connection = getConnection()) {
			Statement statement = connection.createStatement();
			String query = "select c.* from cont_client cc join cont c \n" + 
					"on cc.id_cont=c.id_cont where cc.id_client=?;";
			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Cont cont=new Cont();
				cont.setId_cont(rs.getString(1));
				cont.setContIBAN(rs.getString(2));
				cont.setPin(rs.getInt(3));
				cont.setBalanta(rs.getInt(4));
				listaConturi.add(cont);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		System.out.println(listaConturi.toString());
	}

	public boolean writeCont(List<Cont> listaConturi) {
		
		boolean result=true;
		for (int i = 1; i <= listaConturi.size(); i++) {
			try (Connection connection = getConnection()) {
				String update = "update cont set contIBAN=?, pin=?, balanta=? where id_cont=?";
				PreparedStatement ps = connection.prepareStatement(update);
				ps.setString(1, listaConturi.get(i-1).getContIBAN());
				ps.setInt(2, listaConturi.get(i-1).getPin());
				ps.setInt(3, listaConturi.get(i-1).getBalanta());
				ps.setString(4, listaConturi.get(i-1).getId_cont());
				int rows = ps.executeUpdate();
				result=rows > 0;
			} catch (SQLException e) {
				e.printStackTrace();
				result=false;
			}
		}
		return result;
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		String atm_id;
		int atm_pin;
		int atm_cnt;
		int repeat_a = 1;
		int repeat_b = 1;
		int nr_cont = 0;
		System.out.println("Va rugam sa introduceti ID-ul de client: ");
		atm_id = sc.nextLine();
		getClient(atm_id);
		System.out.println(client.getId_client());
		while (repeat_a == 1) {
			if (atm_id.equals(client.getId_client())) {
				if (client.getListaConturi().size() == 1) {
					System.out.println("Introduceti cod-ul PIN: ");
					atm_pin = sc.nextInt();
					while (repeat_b == 1) {
						if (client.getListaConturi().get(0).checkPIN(atm_pin) == true) {
							atm_opt(client, atm_id, 0);
							repeat_b = 2;
						} else {
							System.out.println("Cod PIN incorect! Introduceti codul PIN corect: ");
							atm_pin = sc.nextInt();
						}
					}
				} else {
					// 2 conturi/client
					System.out.println("Aveti asociate " + client.getListaConturi().size()
							+ " conturi, alegeti contul pe care doriti sa faceti operatiuni:");
					for (Cont i : client.getListaConturi()) {
						System.out.println(++nr_cont + " -> " + i.getContIBAN());
					}
					atm_cnt = sc.nextInt();
					System.out.println("Introduceti cod-ul PIN: ");
					atm_pin = sc.nextInt();
					while (repeat_b == 1) {
						if (client.getListaConturi().get(atm_cnt - 1).checkPIN(atm_pin) == true) {
							atm_opt(client, atm_id, atm_cnt - 1);
							repeat_b = 2;
						} else {
							System.out.println("Cod PIN incorect! Introduceti codul PIN corect: ");
							atm_pin = sc.nextInt();
						}
					}
				}
				repeat_a = 2;
			} else {
				System.out.println("ID inexistent! Introduceti un ID valid: ");
				atm_id = sc.nextLine();
			}
		}
	}
	
	public void atm_opt(Client client, String atm_id, int atm_cnt) {
		int repeat_c = 1;
		int atm_opt;
		int atm_new_pin;
		int atm_rtr;
		int atm_dep;
		Scanner sc = new Scanner(System.in);
		while (repeat_c == 1) {
			System.out.println("Alegeti operatiunea dorita:");
			System.out.println("1 -> Afisare IBAN");
			System.out.println("2 -> Schimbare PIN");
			System.out.println("3 -> Afisare sold");
			System.out.println("4 -> Retragere");
			System.out.println("5 -> Depunere");
			System.out.println("6 -> Exit");
			atm_opt = sc.nextInt();
			switch (atm_opt) {
			case 1: {
				System.out.println(client.getListaConturi().get(atm_cnt).getContIBAN());
				break;
			}
			case 2: {
				System.out.println("Introduceti codul nou: ");
				atm_new_pin = sc.nextInt();
				client.getListaConturi().get(atm_cnt).setPin(atm_new_pin);
				System.out.println("Codul Pin a fost schimbat");
				break;
			}
			case 3: {
				System.out.println("Soldul contului este: " + client.getListaConturi().get(atm_cnt).getBalanta());
				break;
			}
			case 4: {
				System.out.println("Introduceti suma pe care doriti sa o retrageti: ");
				atm_rtr = sc.nextInt();
				if (atm_rtr <= client.getListaConturi().get(atm_cnt).getBalanta()) {
					client.getListaConturi().get(atm_cnt).retragere(atm_rtr);
					System.out.println("Soldul contului este: " + client.getListaConturi().get(atm_cnt).getBalanta());
				} else {
					System.out.println("Soldul actual nu permite aceasta retragere!");
				}
				break;
			}
			case 5: {
				System.out.println("Introduceti suma pe care doriti sa o depuneti: ");
				atm_dep = sc.nextInt();
				client.getListaConturi().get(atm_cnt).depunere(atm_dep);
				System.out.println("Soldul contului este: " + client.getListaConturi().get(atm_cnt).getBalanta());
				break;
			}
			case 6: {
				repeat_c = 2;
				if(writeCont(listaConturi)) {
					System.out.println("Toate operatiunile efectuate au fost salvate!");
					System.out.println("La revedere!");
				} else {
					System.out.println("Operatiunile efectuate nu au fost salvate!");
					System.out.println("La revedere!");
				}
				break;
			}
			default:
				System.out.println("Operatiune nedefinita");
			}
		}

	}
	
	public static void main(String[] args) {
		ATM atm=new ATM();
		atm.start();
//		atm.getClient("FI002");
	}

}
