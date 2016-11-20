package gsb.modele;

/**
 * @author Simon
 *
 */
public class Visite {
	private String reference;
	private String date;
	private String commentaire;
	private Visiteur matricule;
	private Medecin medecin;
	
	
	/**
	 * @param reference
	 * @param date
	 * @param commentaire
	 * @param matricule
	 * @param medecin
	 */
	public Visite(String reference, String date, String commentaire, Visiteur matricule, Medecin medecin) {
		this.reference = reference;
		this.date = date;
		this.commentaire = commentaire;
		this.matricule = matricule;
		this.medecin = medecin;
	}


	/**
	 * @return reference
	 */
	public String getReference() {
		return reference;
	}


	/**
	 * @param reference
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}


	/**
	 * @return date
	 */
	public String getDate() {
		return date;
	}


	/**
	 * @param date
	 */
	public void setDate(String date) {
		this.date = date;
	}


	/**
	 * @return commentaire
	 */
	public String getCommentaire() {
		return commentaire;
	}


	/**
	 * @param commentaire
	 */
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}


	/**
	 * @return matricule
	 */
	public Visiteur getMatricule() {
		return matricule;
	}


	/**
	 * @param matricule
	 */
	public void setMatricule(Visiteur matricule) {
		this.matricule = matricule;
	}


	/**
	 * @return medecin
	 */
	public Medecin getMedecin() {
		return medecin;
	}


	/**
	 * @param medecin
	 */
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	
	
}