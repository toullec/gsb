package gsb.modele;

/**
 * @author Simon
 *
 */
public class Offre {
	private Medicament unMedic;
	private Visite uneVisite;
	private int depot;

	/**
	 * @param uneVisite
	 * @param unMedic
	 * @param depot
	 */
	public Offre(Visite uneVisite,Medicament unMedic, int depot){
		this.unMedic=unMedic;
		this.uneVisite=uneVisite;
		this.depot=depot;
		
	}


	/**
	 * @return un medicament
	 */
	public Medicament getUnMedic() {
		return unMedic;
	}

	/**
	 * @param unMedic
	 */
	public void setUnMedic(Medicament unMedic) {
		this.unMedic = unMedic;
	}

	/**
	 * @return une visite
	 */
	public Visite getUneVisite() {
		return uneVisite;
	}

	/**
	 * @param uneVisite
	 */
	public void setUnVisiteur(Visite uneVisite) {
		this.uneVisite = uneVisite;
	}

	/**
	 * @return le depot
	 */
	public int getDepot() {
		return depot;
	}

	/**
	 * @param depot
	 */
	public void setDepot(int depot) {
		this.depot = depot;
	}

	
}
