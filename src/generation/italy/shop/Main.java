package generation.italy.shop;

public class Main {
  public static void main(String[] args) {
	
	  Prodotto p = new Prodotto("ProXmax", 1200, "Iphone");
	  System.out.println(p);
	  System.out.println("-----------------------------------");
	  
	  Smartphone s = new Smartphone("Samsung", 689, "Galaxy S 10", 30);
	  System.out.println(s);
	  System.out.println("------------------------------------");
	  
	  // Test1 smartTV 
	  Televisore t = new Televisore("SV3", 1500, "Sony", true, 32);
	  System.out.println(t);
	  System.out.println("------------------------------------");
	  
	  // Test2 no smartTV 
	  Televisore t1 = new Televisore("G7", 1800, "Lg", false, 60);
	  System.out.println(t1);
	  System.out.println("------------------------------------");
	  
	  // Test1 wireless 
	  Cuffie c = new Cuffie("V36", 10, "Huaweii", true, "nero");
	  System.out.println(c);
	  System.out.println("------------------------------------");
		  
	  // Test2 no wireless 
	  Cuffie c1 = new Cuffie("N25", 15, "AKG", false, "bianco");
	  System.out.println(c1);
	  System.out.println("------------------------------------");
}
}
