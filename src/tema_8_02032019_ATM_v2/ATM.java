package tema_8_02032019_ATM_v2;

import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Function;

public  class ATM {
	
	private Map<String,Client> listaClienti=new HashMap<>();
	
	private void read_file(String idClient) {
		
		Map<String,Client> clientFile=new HashMap<>();
		List<Cont> cont =new ArrayList<Cont>();
		
		
		Path path= Paths.get("/Users/mariusdobre/eclipse-workspace/ATM_input.txt");

		listaClienti=Files.lines(path)
					.map(line ->mapToClient(line))
					.collect(Collectors.toMap(Client::getId, (Client)Function.identity()));


		System.out.println(clientFile.get(idClient).getCnp());	
	}
	
	 private Client mapToClient(String line) {

		List<Cont> cont = new ArrayList<Cont>();

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

		cont.add(new Cont(IBANFile, intPinFile, intBalantaFile));

		Client client = new Client(prenumeClientFile, numeClientFile, idClientFile2, CNPFile, cont);
		
		return client;
	}

//	public void init() {
//		
//
//		
//		List<Cont> p1cont =new ArrayList<Cont>();
//		p1cont.add(new Cont("RO01 INGB 0000 0000 0000 0001",1234,1500));
//		Client client1=new Client("Ion","Popescu","IP001","1230190123456",p1cont);
//		listaClienti.put(client1.getId(),client1);
//		
//		List<Cont> p2cont =new ArrayList<Cont>();
//		p2cont.add(new Cont("RO01 INGB 0000 0000 0000 0002",2345,5000));
//		p2cont.add(new Cont("RO01 INGB 0000 0000 0000 0003",3456,2300));
//		Client client2=new Client("Florin","Ionescu","FI002","1140967123456",p2cont);
//		listaClienti.put(client2.getId(),client2);
//		
//		List<Cont> p3cont =new ArrayList<Cont>();
//		p3cont.add(new Cont("RO01 INGB 0000 0000 0000 0004",0001,5500));
//		Client client3=new Client("Maria","Popescu","MP003","2090891654321",p3cont);
//		listaClienti.put(client3.getId(), client3);
//		
//		List<Cont> p4cont =new ArrayList<Cont>();
//		p4cont.add(new Cont("RO01 INGB 0000 0000 0000 0005",0002,500));
//		p4cont.add(new Cont("RO01 INGB 0000 0000 0000 0006",0003,12000));
//		Client client4=new Client("Florin","Piersic","FP004","1080960654321",p4cont);
//		listaClienti.put(client4.getId(), client4);
//		
//	}
//	
//	
//	public void start() {
//		
//		Scanner sc = new Scanner(System.in);
//		String atm_id;
//		int atm_pin;
//		int atm_cnt;
//
//
//		int repeat_a=1;
//		int repeat_b=1;
//		int nr_cont=0;
//		
//		
//		init();
//		
//		
////		for(String key:listaClienti.keySet()) {
////			System.out.println(listaClienti.get(key).getId());
////			
////		}
//
//		
//
//	System.out.println("Va rugam sa introduceti ID-ul de client: ");
//	atm_id=sc.nextLine();
//	
//	while (repeat_a==1) {
//		
//		if(listaClienti.keySet().contains(atm_id)==true) {
//			
//			if(listaClienti.get(atm_id).getListaConturi().size()==1) {	
//				
//				System.out.println("Introduceti cod-ul PIN: ");
//				atm_pin=sc.nextInt();
//				
//				while(repeat_b==1) {
//					
//					if(listaClienti.get(atm_id).getListaConturi().get(0).checkPIN(atm_pin)==true) {
//						
//						atm_opt(listaClienti,atm_id,0);
//						
//						repeat_b=2;
//					} else {
//						System.out.println("Cod PIN incorect! Introduceti codul PIN corect: ");
//						atm_pin=sc.nextInt();
//					}
//				}
//				
//			} else {
//				
//				// 2 conturi/client
//				
//				System.out.println("Aveti asociate "+listaClienti.get(atm_id).getListaConturi().size()+" conturi, alegeti contul pe care doriti sa faceti operatiuni:");
//				for (Cont i : listaClienti.get(atm_id).getListaConturi()) {
//					System.out.println(++nr_cont +" -> " +i.getContIBAN());
//				}
//				atm_cnt=sc.nextInt();
//				
//				System.out.println("Introduceti cod-ul PIN: ");
//				atm_pin=sc.nextInt();
//				
//				while(repeat_b==1) {
//					
//					if(listaClienti.get(atm_id).getListaConturi().get(atm_cnt-1).checkPIN(atm_pin)==true) {
//						
//						atm_opt(listaClienti,atm_id,atm_cnt-1);
//						
//						repeat_b=2;
//					} else {
//						System.out.println("Cod PIN incorect! Introduceti codul PIN corect: ");
//						atm_pin=sc.nextInt();
//					}
//				}			
//			}
//					
//			repeat_a=2;	
//		} else {
//			System.out.println("ID inexistent! Introduceti un ID valid: ");
//			atm_id=sc.nextLine();
//		}
//	}		
//	}
//	
//	public void atm_opt(Map<String,Client> listaClienti, String atm_id, int atm_cnt ) {
//		
//		int repeat_c=1;
//		int atm_opt;
//		int atm_new_pin;
//		int atm_rtr;
//		int atm_dep;
//		Scanner sc = new Scanner(System.in);
//		
//		
//		while (repeat_c==1) {
//			System.out.println("Alegeti operatiunea dorita:");
//			System.out.println("1 -> Afisare IBAN");
//			System.out.println("2 -> Schimbare PIN");
//			System.out.println("3 -> Afisare sold");
//			System.out.println("4 -> Retragere");
//			System.out.println("5 -> Depunere");
//			System.out.println("6 -> Exit");
//			atm_opt=sc.nextInt();
//			
//			switch(atm_opt) {
//				case 1:{
//						System.out.println(listaClienti.get(atm_id).getListaConturi().get(atm_cnt).getContIBAN());
//						break;
//				}
//				case 2:{
//						System.out.println("Introduceti codul nou: ");
//						atm_new_pin=sc.nextInt();
//						listaClienti.get(atm_id).getListaConturi().get(atm_cnt).setPin(atm_new_pin);
//						System.out.println("Codul Pin a fost schimbat");
//						break;
//				}
//				case 3:{
//						System.out.println("Soldul contului este: "+listaClienti.get(atm_id).getListaConturi().get(atm_cnt).getBalanta());
//						break;
//				}
//				case 4:{
//						System.out.println("Introduceti suma pe care doriti sa o retrageti: ");
//						atm_rtr=sc.nextInt();
//						if(atm_rtr<=listaClienti.get(atm_id).getListaConturi().get(atm_cnt).getBalanta()) {
//							listaClienti.get(atm_id).getListaConturi().get(atm_cnt).retragere(atm_rtr);
//							System.out.println("Soldul contului este: "+listaClienti.get(atm_id).getListaConturi().get(atm_cnt).getBalanta());
//						} else {
//							System.out.println("Soldul actual nu permite aceasta retragere!");
//						}
//						break;
//				}
//				case 5:{
//						System.out.println("Introduceti suma pe care doriti sa o depuneti: ");
//						atm_dep=sc.nextInt();
//						listaClienti.get(atm_id).getListaConturi().get(atm_cnt).depunere(atm_dep);
//						System.out.println("Soldul contului este: "+listaClienti.get(atm_id).getListaConturi().get(atm_cnt).getBalanta());
//						break;
//				}
//				case 6:{
//					repeat_c=2;
//					System.out.println("La revedere!");
//					break;
//				}
//				default: System.out.println("Operatiune nedefinita");
//			}
//		}					
//		
//	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm=new ATM();
//		atm.start();
		atm.read_file("FP004");
	}

}
