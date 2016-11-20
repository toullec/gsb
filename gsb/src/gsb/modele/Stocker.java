package gsb.modele;

/**
 * @author Simon
 *
 */
public class Stocker {
	private Visiteur visiteur;
	private Medicament medicament;
	private int qteStock;
	
	
	/**
	 * @param visiteur
	 * @param medicament
	 * @param qteStock
	 */
	public Stocker(Visiteur visiteur, Medicament medicament, int qteStock) {
		
		this.visiteur = visiteur;
		this.medicament = medicament;
		this.qteStock = qteStock;
	}
	
	/**
	 * @return visiteur
	 */
	public Visiteur getVisiteur() {
		return visiteur;
	}

	/**
	 * @param visiteur
	 */
	public void setVisiteur(Visiteur visiteur) {
		this.visiteur = visiteur;
	}

	
	/**
	 * @return 
	 */
	public Medicament getMedicament() {
		return medicament;
	}

	/**
	 * @param medicament
	 */
	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}

	/**
	 * @return 
	 */
	public int getQteStock() {
		return qteStock;
	}

	/**
	 * @param qteStock
	 */
	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}

}
