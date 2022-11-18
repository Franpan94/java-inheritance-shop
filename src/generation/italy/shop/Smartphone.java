package generation.italy.shop;

import java.util.Random;

public class Smartphone extends Prodotto{
	private int imei;
	private int memoria;
	
    public Smartphone (String marca, float prezzo, String nome, int memoria) {
    	super(marca, prezzo, nome);
    	this.memoria = memoria;
    	
    	Random rnd = new Random();
    	imei = rnd.nextInt(100000000, 1000000000);
    }

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nMemoria cellulare: " + memoria + " Giga" + "\nCodice IMEI: " + imei;
	}
}
