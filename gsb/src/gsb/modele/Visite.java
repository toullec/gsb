package gsb.modele;

public class Visite {
	private String reference;
	private String date;
	private String commentaire;
	private Visiteur matricule;
	private Medecin medecin;
	
	
	public Visite(String reference, String date, String commentaire, Visiteur matricule, Medecin medecin) {
		super();
		this.reference = reference;
		this.date = date;
		this.commentaire = commentaire;
		this.matricule = matricule;
		this.medecin = medecin;
	}


	public String getReference() {
		return reference;
	}


	public void setReference(String reference) {
		this.reference = reference;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getCommentaire() {
		return commentaire;
	}


	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}


	public Visiteur getMatricule() {
		return matricule;
	}


	public void setMatricule(Visiteur matricule) {
		this.matricule = matricule;
	}


	public Medecin getMedecin() {
		return medecin;
	}


	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	
	
}