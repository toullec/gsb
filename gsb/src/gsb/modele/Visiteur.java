package gsb.modele;

public class Visiteur {
	private String matricule;
	private String nom;
	private String prenom;
	private String login;
	private String mdp;
	private String adresse;
	private String telephone;
	private String dateEntree;
	
	
	private String codeUnit;
	private String nomUnite;
	
	
	public Visiteur(String matricule, String nom, String prenom, String login, String mdp, String adresse,
			String telephone, String dateEntree, String codeUnit, String nomUnite) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.mdp = mdp;
		this.adresse = adresse;
		this.telephone = telephone;
		this.dateEntree = dateEntree;
		this.codeUnit = codeUnit;
		this.nomUnite = nomUnite;
	}


	public String getMatricule() {
		return matricule;
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getMdp() {
		return mdp;
	}


	public void setMdp(String mdp) {
		this.mdp = mdp;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getDateEntree() {
		return dateEntree;
	}


	public void setDateEntree(String dateEntree) {
		this.dateEntree = dateEntree;
	}


	public String getCodeUnit() {
		return codeUnit;
	}


	public void setCodeUnit(String codeUnit) {
		this.codeUnit = codeUnit;
	}


	public String getNomUnite() {
		return nomUnite;
	}


	public void setNomUnite(String nomUnite) {
		this.nomUnite = nomUnite;
	}

	

}
