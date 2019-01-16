package tema_1_24112018;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		calculOperatii();
//		calculSumaCifre();
//		verificarePalindrom();
//		verificareDiviz();
//		adunareNrPrime();
		
	}	
		private static void calculOperatii(){
			
		//1. Implement an arithmetic calculator using a switch.
		int x;
		int y;
		int op;
		int dif;
int cat;
long sum;
		long prod;
		
		System.out.println("Introduceti primul numar: ");
		x = sc.nextInt();
		
		System.out.println("Introduceti al doilea numar: ");
		y = sc.nextInt();
		
		System.out.println("Introduceti operatia dorita (1 = +; 2 = -; 3 = *;  4 = /): ");
		op = sc.nextInt();
		
		switch (op) {
			case 1: { 
				sum=x+y;
				System.out.println("Suma numerelor este: " +sum);
				break;
			}
			case 2: { 
				dif=x-y;
				System.out.println("Diferenta numerelor este: " +dif);
				break;
			}
			case 3: { 
				prod=x*y;
				System.out.println("Produsul numerelor este: " +prod);
				break;
			}
			case 4: {
				if (y==0) System.out.println("Impartirea la 0 nu este posibila");
				else {
					cat=x/y;
					System.out.println("Catul numerelor este: " +cat);
					break;
			}
		}
			default: System.out.println("Operatie nedefinita");
		}
		}
		
		private static void calculSumaCifre(){
			
			//2. Write a program that calculates the sum of digits of a number.
			int x;
			int c;
			int sum;
			
			
			System.out.println("Introduceti numarul: ");
			x = sc.nextInt();
			
			sum=0;

			 while (x!=0){
				c=x%10;
				x=x/10;
				sum=sum+c;
			};
			
			System.out.println("Suma cifrelor numarului este: " +sum);
			
		}
		private static void verificarePalindrom(){
			
			//Write a program that determines if a number is palindrom	
			int x;
			int x1;
			int c;
			int pal;
			
			
			System.out.println("Introduceti numarul: ");
			x = sc.nextInt();
			x1=x;
			
			pal=0;

			 while (x!=0){
				c=x%10;
				x=x/10;
				pal=pal*10+c;
			};
			
			if (x1==pal)
				System.out.println ("Numarul introdus este palindrom");
			else
				System.out.println ("Numarul introdus nu este palindrom");
		}
		
		private static void verificareDiviz() {
			
			/*Write a program that prints a message for all numbers from 1 to100. 
			*For multiples of 3 prints “Tres”, for multiples of 5 prints “Cinco”, 
			*and for multiples of both 3 and 5 prints “TresCinco”.
			*/
			for (int i=1; i<=100;i++) {
				System.out.println("Valoarea curenta este:" +i);
				if (i%15==0) System.out.println("TresCinco");
				else if (i%5==0) System.out.println("Cinco");
				else if (i%3==0) System.out.println("Tres");
			}

		}
		private static void adunareNrPrime() {
			//Calculate sum of all prime numbers up to 100
			int x;
			int sum=1;
			int div;
			
			for (int j=2;j<=100;j++) {
				div=0;
				for (int i=1;i<=j;i++) { 
					
					if (j%i==0) 
						div=div+1;
				}
				if (div==2) sum=sum+j;	
			}
			System.out.println("Suma nr prime mai mici de 100 este " + sum);
		}
}


