package gsb.modele;

public class Visite {
	private String reference;
	private String date;
	private String commentaire;
	private String matricule;
	private String codeMed;
	
	
	public Visite(String reference, String date, String commentaire, String matricule, String codeMed){
		this.reference=reference;
		this.date=date;
		this.commentaire=commentaire;
		this.matricule=matricule;
		this.codeMed=codeMed;
			
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


	public String getMatricule() {
		return matricule;
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	public String getCodeMed() {
		return codeMed;
	}


	public void setCodeMed(String codeMed) {
		this.codeMed = codeMed;
	}
	
	
}
