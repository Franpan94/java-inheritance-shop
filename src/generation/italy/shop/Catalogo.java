package generation.italy.shop;

import java.util.Scanner;

public class Catalogo {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Prodotto [] p = new Prodotto[5];
		
		for(int i=0; i<p.length; i++) {
			System.out.print("Nome prodotto: ");
			String nome = sc.nextLine();
			
			System.out.print("\nMarca prodotto: ");
			String marca = sc.nextLine();
			
			System.out.print("\nPrezzo prodotto: ");
			String prezz = sc.nextLine();
			int prezzo = Integer.parseInt(prezz);
			
			System.out.print("\nCategorie prodotti: " + "\n1.TV , 2.Smartphone, 3.Cuffie" 
					         + "\nSegli il numero della categoria a cui appartiene: ");
			int scelta = sc.nextInt();
			
			if(scelta == 1) {
				System.out.print("\nGrandezza televisore: ");
				int dimensioniTv = sc.nextInt();
				System.out.print("Smart? (Rispondere con true o false): ");
				boolean smart = sc.nextBoolean();
				System.out.println("-------------------------------------------");
				Televisore t = new Televisore(marca, prezzo, nome, smart, dimensioniTv);
				p[i] = t;
			}
			
			if(scelta == 2) {
				System.out.print("\nDimensione memoria del cellulare: ");
				int dimensioneMemoria = sc.nextInt();
				System.out.println("-------------------------------------------");
				Smartphone s = new Smartphone(marca, prezzo, nome, dimensioneMemoria);
				p[i] = s;
			}
			
			if(scelta == 3) {
				System.out.println("\nColore cuffie: ");
				String coloreCuffie = sc.nextLine();
				
;				System.out.print("\nWireless? (Rispondere con true o false): ");
				String wireles = sc.nextLine();
				boolean wireless = Boolean.parseBoolean(wireles);
				
				System.out.println("-------------------------------------------");
				
				Cuffie c = new Cuffie(marca, prezzo, nome, wireless, coloreCuffie);
				p[i] = c;
				
			}
			
			System.out.println("Nuovo prodotto: " + p[i]);
			System.out.println("-------------------------------------------");
			break;
		}
			
	}
}
