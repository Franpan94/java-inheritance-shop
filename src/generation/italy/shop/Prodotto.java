package generation.italy.shop;

import java.util.Random;

public class Prodotto {
	private int codice;
	private int iva;
	private String marca;
	private float prezzo;
	private String nome;
	
     public Prodotto(String marca, float prezzo, String nome) {
    	 
    	 this.marca = marca;
    	 this.prezzo = prezzo;
    	 this.nome = nome;
    	 
    	 Random rnd = new Random();
    	 codice = rnd.nextInt(10000, 100000);
    	 iva = 20;
     }
     
     public int getCodice() {
    	 return codice;
     }
     
     public int getIva() {
    	 return iva;
     }
     
     public void setIva(int iva) {
    	 this.iva = iva;
     }
     
     public String getMarca() {
    	 return marca;
     }
     
     public void setMarca(String marca) {
    	 this.marca = marca;
     }
     
     public float getPrezzo() {
    	 return prezzo;
     }
     
     public void setPrezzo(float prezzo) {
    	 this.prezzo = prezzo;
     }
     
     public String getNome() {
    	 return nome;
     }
     
     public void setNome(String nome) {
    	 this.nome = nome;
     }
     
     public float getPrezzoIvato() {
    	 return prezzo + (prezzo * (float)iva)/(float)100;
     }
     
     @Override
    public String toString() {
    	return "Nome Prodotto: " + nome + "\nMarca Prodotto: " + marca 
    			+ "\nCodice Prodotto: " + codice + "\nPrezzo prodotto: " + prezzo + " €" +
    			"\nIva: " + iva + "%" + "\nPrezzo Ivato: " + getPrezzoIvato() + " €";
    }
}
