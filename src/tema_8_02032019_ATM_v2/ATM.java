package tema_8_02032019_ATM_v2;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.function.Function;

import static java.util.stream.Collectors.toMap;

public  class ATM {
	
	private Map<String, Client> listaClienti = new HashMap<>();

	private Map<String, Client> read_file() throws IOException {
		Path path = Paths.get("/Users/mariusdobre/eclipse-workspace/ATM_input.txt");
		listaClienti = Files.lines(path).map(line -> mapToClient(line))
				.collect(toMap(Client::getId, Function.identity()));
		return listaClienti;
	}
	
	private void write_file(Map<String, Client> listaClienti) throws IOException {
		Path path = Paths.get("/Users/mariusdobre/eclipse-workspace/ATM_input.txt");
		List<String> lines = new ArrayList<String>();
		listaClienti.forEach((id,client) -> lines.add(id+","+client));
		Files.write(path, lines, StandardOpenOption.CREATE);
	}
	
	private Client mapToClient(String line) {
		String idClientfile = line.substring(0, line.indexOf(","));
		int len = idClientfile.length() + 1;
		String prenumeClientFile = line.substring(len, line.indexOf(",", len + 1));
		len = len + prenumeClientFile.length() + 1;
		String numeClientFile = line.substring(len, line.indexOf(",", len + 1));
		len = len + numeClientFile.length() + 1;
		String idClientFile2 = line.substring(len, line.indexOf(",", len + 1));
		len = len + idClientFile2.length() + 1;
		String CNPFile = line.substring(len, line.indexOf(",", len + 1));
		len = len + CNPFile.length() + 1;
		String IBANFile = line.substring(len, line.indexOf(",", len + 1));
		len = len + IBANFile.length() + 1;
		String PinFile = line.substring(len, line.indexOf(",", len + 1));
		len = len + PinFile.length() + 1;
		int intPinFile = Integer.parseInt(PinFile);
		String BalantaFile = line.substring(len, line.length());
		int intBalantaFile = Integer.parseInt(BalantaFile);
		Cont cont = new Cont(IBANFile, intPinFile, intBalantaFile);
		Client client = new Client(prenumeClientFile, numeClientFile, idClientFile2, CNPFile, cont);
		return client;
	}

	public void start() {
		Scanner sc = new Scanner(System.in);
		String atm_id;
		int atm_pin;
		int atm_cnt=0;
		int repeat_a = 1;
		int repeat_b = 1;
		int nr_cont = 0;
		try {
			read_file();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Va rugam sa introduceti ID-ul de client: ");
		atm_id = sc.nextLine();
		while (repeat_a == 1) {
			if (listaClienti.keySet().contains(atm_id) == true) {
				System.out.println("Introduceti cod-ul PIN: ");
				atm_pin = sc.nextInt();
				while (repeat_b == 1) {
					if (listaClienti.get(atm_id).getListaConturi().checkPIN(atm_pin) == true) {
						atm_opt(listaClienti, atm_id, 0);
						try {
							write_file(listaClienti);
						} catch (IOException e) {
							e.printStackTrace();
						}
						repeat_b = 2;
					} else {
						System.out.println("Cod PIN incorect! Introduceti codul PIN corect: ");
						atm_pin = sc.nextInt();
					}
				}
				repeat_a = 2;
			} else {
				System.out.println("ID inexistent! Introduceti un ID valid: ");
				atm_id = sc.nextLine();
			}
		}
	}
	
	public void atm_opt(Map<String, Client> listaClienti, String atm_id, int atm_cnt) {
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
				System.out.println(listaClienti.get(atm_id).getListaConturi().getContIBAN());
				break;
			}
			case 2: {
				System.out.println("Introduceti codul nou: ");
				atm_new_pin = sc.nextInt();
				listaClienti.get(atm_id).getListaConturi().setPin(atm_new_pin);
				System.out.println("Codul Pin a fost schimbat");
				break;
			}
			case 3: {
				System.out.println("Soldul contului este: "
						+ listaClienti.get(atm_id).getListaConturi().getBalanta());
				break;
			}
			case 4: {
				System.out.println("Introduceti suma pe care doriti sa o retrageti: ");
				atm_rtr = sc.nextInt();
				if (atm_rtr <= listaClienti.get(atm_id).getListaConturi().getBalanta()) {
					listaClienti.get(atm_id).getListaConturi().retragere(atm_rtr);
					System.out.println("Soldul contului este: "
							+ listaClienti.get(atm_id).getListaConturi().getBalanta());
				} else {
					System.out.println("Soldul actual nu permite aceasta retragere!");
				}
				break;
			}
			case 5: {
				System.out.println("Introduceti suma pe care doriti sa o depuneti: ");
				atm_dep = sc.nextInt();
				listaClienti.get(atm_id).getListaConturi().depunere(atm_dep);
				System.out.println("Soldul contului este: "
						+ listaClienti.get(atm_id).getListaConturi().getBalanta());
				break;
			}
			case 6: {
				repeat_c = 2;
				System.out.println("La revedere!");
				break;
			}
			default:
				System.out.println("Operatiune nedefinita");
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		ATM atm=new ATM();
		atm.start();
//		atm.read_file("MP003");
	}

}
