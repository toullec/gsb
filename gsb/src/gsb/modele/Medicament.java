package gsb.modele;

public class Medicament {
	private String depotLegal;
	private String nomCommercial;
	private String composition;
	private String effets;
	private String contreIndication;
	private float prixEchantillon;
	private String codeFamille;
	private String libelleFamille;
	
	
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


	public String getDepotLegal() {
		return depotLegal;
	}


	public void setDepotLegal(String depotLegal) {
		this.depotLegal = depotLegal;
	}


	public String getNomCommercial() {
		return nomCommercial;
	}


	public void setNomCommercial(String nomCommercial) {
		this.nomCommercial = nomCommercial;
	}


	public String getComposition() {
		return composition;
	}


	public void setComposition(String composition) {
		this.composition = composition;
	}


	public String getEffets() {
		return effets;
	}


	public void setEffets(String effets) {
		this.effets = effets;
	}


	public String getContreIndication() {
		return contreIndication;
	}


	public void setContreIndication(String contreIndication) {
		this.contreIndication = contreIndication;
	}


	public float getPrixEchantillon() {
		return prixEchantillon;
	}


	public void setPrixEchantillon(int prixEchantillon) {
		this.prixEchantillon = prixEchantillon;
	}


	public String getCodeFamille() {
		return codeFamille;
	}


	public void setCodeFamille(String codeFamille) {
		this.codeFamille = codeFamille;
	}


	public String getLibelleFamille() {
		return libelleFamille;
	}


	public void setLibelleFamille(String libelleFamille) {
		this.libelleFamille = libelleFamille;
	}
	
	
	
	
	

}
