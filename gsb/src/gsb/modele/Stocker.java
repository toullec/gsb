package gsb.modele;

public class Stocker {
	private Visiteur visiteur;
	private Medicament medicament;
	private int qteStock;
	
	
	public Stocker(Visiteur visiteur, Medicament medicament, int qteStock) {
		
		this.visiteur = visiteur;
		this.medicament = medicament;
		this.qteStock = qteStock;
	}
	
	public Visiteur getVisiteur() {
		return visiteur;
	}

	public void setVisiteur(Visiteur visiteur) {
		this.visiteur = visiteur;
	}

	public Medicament getMedicament() {
		return medicament;
	}

	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}

	public int getQteStock() {
		return qteStock;
	}

	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}

}
