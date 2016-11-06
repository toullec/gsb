package gsb.modele;

public class Offre {
	private Medicament unMedic;
	private Visite uneVisite;
	private int depot;

	public Offre(Visite uneVisite,Medicament unMedic, int depot){
		this.unMedic=unMedic;
		this.uneVisite=uneVisite;
		this.depot=depot;
		
	}


	public Medicament getUnMedic() {
		return unMedic;
	}

	public void setUnMedic(Medicament unMedic) {
		this.unMedic = unMedic;
	}

	public Visite getUneVisite() {
		return uneVisite;
	}

	public void setUnVisiteur(Visite uneVisite) {
		this.uneVisite = uneVisite;
	}

	public int getDepot() {
		return depot;
	}

	public void setDepot(int depot) {
		this.depot = depot;
	}

	
}
