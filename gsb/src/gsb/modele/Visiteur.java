package gsb.modele;

/**
 * @author Simon
 *
 */
public class Visiteur {
	private String matricule;
	private String nom;
	private String prenom;
	private String login;
	private String mdp;
	private String adresse;
	private Localite codePostal;
	private String dateEntree;
	private String codeUnit;
	private String nomUnite;
	
	
	/**
	 * @param matricule
	 * @param nom
	 * @param prenom
	 * @param login
	 * @param mdp
	 * @param adresse
	 * @param codePostal
	 * @param dateEntree
	 * @param codeUnit
	 * @param nomUnite
	 */
	public Visiteur(String matricule, String nom, String prenom, String login, String mdp, String adresse,
			Localite codePostal, String dateEntree, String codeUnit, String nomUnite) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.mdp = mdp;
		this.adresse = adresse;
		this.codePostal=codePostal;
		this.dateEntree = dateEntree;
		this.codeUnit = codeUnit;
		this.nomUnite = nomUnite;
	}


	/**
	 * @return matricule
	 */
	public String getMatricule() {
		return matricule;
	}


	/**
	 * @param matricule
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	/**
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}


	/**
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**
	 * @return prenom 
	 */
	public String getPrenom() {
		return prenom;
	}


	/**
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	/**
	 * @return login
	 */
	public String getLogin() {
		return login;
	}


	/**
	 * @param login
	 */
	public void setLogin(String login) {
		this.login = login;
	}


	/**
	 * @return mot de passe
	 */
	public String getMdp() {
		return mdp;
	}


	/**
	 * @param mdp
	 */
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}


	/**
	 * @return adresse
	 */
	public String getAdresse() {
		return adresse;
	}


	/**
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	
	/**
	 * @return code postal
	 */
	public Localite getCodePostal(){
		return this.codePostal;
	}
	
	/**
	 * @param codePostal
	 */
	public void setCodePostal(Localite codePostal){
		this.codePostal=codePostal;
	}

	/**
	 * @return date entree
	 */
	public String getDateEntree() {
		return dateEntree;
	}


	/**
	 * @param dateEntree
	 */
	public void setDateEntree(String dateEntree) {
		this.dateEntree = dateEntree;
	}


	/**
	 * @return code unite
	 */
	public String getCodeUnit() {
		return codeUnit;
	}


	/**
	 * @param codeUnit
	 */
	public void setCodeUnit(String codeUnit) {
		this.codeUnit = codeUnit;
	}


	/**
	 * @return nom de l'unite
	 */
	public String getNomUnite() {
		return nomUnite;
	}


	/**
	 * @param nomUnite
	 */
	public void setNomUnite(String nomUnite) {
		this.nomUnite = nomUnite;
	}

	

}
