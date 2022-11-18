package generation.italy.shop;

public class Televisore extends Prodotto {
     private int dimensioni;
     private boolean isSmart;
     
     public Televisore(String marca, float prezzo, String nome, boolean isSmart, int dimensioni) {
    	 super(marca, prezzo, nome);
    	 this.dimensioni = dimensioni;
    	 this.isSmart = isSmart;
     }

	public boolean isSmart() {
		return isSmart;
	}

	public void setSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}

	public int getDimensioni() {
		return dimensioni;
	}

	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nE' una SmartTV: " + isSmart() + "\nDimensioni: " 
	    + dimensioni + " pollici";
	}
}
