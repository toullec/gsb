package gsb.modele;

public class Stocker {
	private Visiteur visiteur;
	private Medicament medicament;
	private int qteStock;
	
	public Stocker(Visiteur visiteur, Medicament medicament,int qteStock){
		this.visiteur=visiteur;
		this.medicament=medicament;
		this.qteStock=qteStock;
	}
	
	
	public int getQteStock(){
		return this.qteStock;
	}
	
	public void setQteStock(int qteStock){
		this.qteStock =qteStock;
	}

}
