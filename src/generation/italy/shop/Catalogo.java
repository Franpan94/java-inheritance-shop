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
			String prezzoStr = sc.nextLine();
			int prezzo = Integer.parseInt(prezzoStr);
			
			System.out.print("\nCategorie prodotti: " + "\n1.TV , 2.Smartphone, 3.Cuffie" 
					         + "\nSegli il numero della categoria a cui appartiene: ");
			String scelta = sc.nextLine();
			
			if(scelta.equals("1")) {
				System.out.print("\nSmart? (Rispondere con si o no): ");
				String smartStr = sc.nextLine();
				boolean smart = smartStr.equals("si");
				
				System.out.print("\nGrandezza televisore: ");
				String dimensioniTvStr = sc.nextLine();
				int dimensioniTv = Integer.parseInt(dimensioniTvStr);
				
				System.out.println("-------------------------------------------");
				
				Televisore t = new Televisore(marca, prezzo, nome, smart, dimensioniTv);
				p[i] = t;
			}
			
			if(scelta.equals("2")) {
				System.out.print("\nDimensione memoria del cellulare: ");
				int dimensioneMemoria = sc.nextInt();
				
				System.out.println("-------------------------------------------");
				
				Smartphone s = new Smartphone(marca, prezzo, nome, dimensioneMemoria);
				p[i] = s;
			}
			
			if(scelta.equals("3")) {
				System.out.print("\nColore cuffie: ");
				String coloreCuffie = sc.nextLine();
				
;				System.out.print("\nWireless? (Rispondere con si o no): ");
				String wirelessStr = sc.nextLine();
				boolean wireless = wirelessStr.equals("si");
				
				System.out.println("-------------------------------------------");
				
				Cuffie c = new Cuffie(marca, prezzo, nome, wireless, coloreCuffie);
				p[i] = c;
				
			}
			
			System.out.println("Nuovo prodotto" + p[i]);
			System.out.println("-------------------------------------------");
			break;
		}
			
	}
}
