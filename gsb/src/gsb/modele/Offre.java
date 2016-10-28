package gsb.modele;

public class Offre {
	private Medicament unMedic;
	private Visiteur unVisiteur;
	private int depot;

	public Offre(Medicament unMedic,Visiteur unVisiteur, int depot){
		this.unMedic=unMedic;
		this.unVisiteur=unVisiteur;
		this.depot=depot;
		
	}


	public Medicament getUnMedic() {
		return unMedic;
	}

	public void setUnMedic(Medicament unMedic) {
		this.unMedic = unMedic;
	}

	public Visiteur getUnVisiteur() {
		return unVisiteur;
	}

	public void setUnVisiteur(Visiteur unVisiteur) {
		this.unVisiteur = unVisiteur;
	}

	public int getDepot() {
		return depot;
	}

	public void setDepot(int depot) {
		this.depot = depot;
	}

	
}
