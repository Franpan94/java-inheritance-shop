package generation.italy.shop;

public class Cuffie extends Prodotto {
    String colore;
    boolean isWireless;
    
    public Cuffie(String marca, float prezzo, String nome, boolean isWireless, String colore) {
    	super(marca, prezzo, nome);
    	this.isWireless = isWireless;
    	this.colore = colore;
    }

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return isWireless;
	}

	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nColore cuffie: " + colore 
				                  + "\nSono Wireless: " +  isWireless;
	}
}
