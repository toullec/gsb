package gsb.modele;


/**
 * @author Simon
 *
 */
public class Medicament {
	private String depotLegal;
	private String nomCommercial;
	private String composition;
	private String effets;
	private String contreIndication;
	private float prixEchantillon;
	private String codeFamille;
	private String libelleFamille;
	
	
	/**
	 * @param depotLegal
	 * @param nomCommercial
	 * @param composition
	 * @param effets
	 * @param contreIndication
	 * @param prixEchantillon
	 * @param codeFamille
	 * @param libelleFamille
	 */
	public Medicament(String depotLegal, String nomCommercial, String composition, String effets,
			String contreIndication, float prixEchantillon, String codeFamille, String libelleFamille) {
		super();
		this.depotLegal = depotLegal;
		this.nomCommercial = nomCommercial;
		this.composition = composition;
		this.effets = effets;
		this.contreIndication = contreIndication;
		this.prixEchantillon = prixEchantillon;
		this.codeFamille = codeFamille;
		this.libelleFamille = libelleFamille;
	}


	/**
	 * @return le depot legal
	 */
	public String getDepotLegal() {
		return depotLegal;
	}


	/**
	 * @param depotLegal
	 */
	public void setDepotLegal(String depotLegal) {
		this.depotLegal = depotLegal;
	}


	
	/**
	 * @return le nom commercial
	 */
	public String getNomCommercial() {
		return nomCommercial;
	}


	/**
	 * @param nomCommercial
	 */
	public void setNomCommercial(String nomCommercial) {
		this.nomCommercial = nomCommercial;
	}


	/**
	 * @return la composition
	 */
	public String getComposition() {
		return composition;
	}


	/**
	 * @param composition
	 */
	public void setComposition(String composition) {
		this.composition = composition;
	}


	/**
	 * @return le nom de l'effet
	 */
	public String getEffets() {
		return effets;
	}


	/**
	 * @param effets
	 */
	public void setEffets(String effets) {
		this.effets = effets;
	}


	/**
	 * @return la contre indication
	 */
	public String getContreIndication() {
		return contreIndication;
	}


	/**
	 * @param contreIndication
	 */
	public void setContreIndication(String contreIndication) {
		this.contreIndication = contreIndication;
	}


	/**
	 * @return prix de l'echantillon
	 */
	public float getPrixEchantillon() {
		return prixEchantillon;
	}


	/**
	 * @param prixEchantillon
	 */
	public void setPrixEchantillon(int prixEchantillon) {
		this.prixEchantillon = prixEchantillon;
	}


	/**
	 * @return codeFamille
	 */
	public String getCodeFamille() {
		return codeFamille;
	}


	/**
	 * @param codeFamille
	 */
	public void setCodeFamille(String codeFamille) {
		this.codeFamille = codeFamille;
	}


	/**
	 * @return libelleFamille
	 */
	public String getLibelleFamille() {
		return libelleFamille;
	}


	/**
	 * @param libelleFamille
	 */
	public void setLibelleFamille(String libelleFamille) {
		this.libelleFamille = libelleFamille;
	}
	
	
	
	
	

}
