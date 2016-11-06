package gsb.tests.unit;

import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;
import junit.framework.TestCase;

public class MedicamentTest extends TestCase{
	private Medicament medicament;
	
	
	public void setUp() throws Exception{
		medicament= MedicamentDao.rechercher("3MYC7");
		//med_nomcommercial=TRIMYCINE
		//composition=Triamcinolone (acétonide) + Néomycine + Nystatine
		//effets=Ce médicament est contre-indiqué en cas d'allergie à  l'un des constituants, d'infections de la peau ou de parasitisme non traités, d'acné. Ne pas appliquer sur une plaie, ni sous un pansement occlusif.
		//contreIndication=Ce médicament est contre-indiqué en cas d'allergie à  l'un des constituants, d'infections de la peau ou de parasitisme non traités, d'acné. Ne pas appliquer sur une plaie, ni sous un pansement occlusif.
		//prixEchantillon=null
		//codeFamille=CRT
		//libelleFamille=Corticoïde, antibiotique et antifongique à  usage local
	}
	
	public void tearDown() throws Exception {
		System.out.println("--------------------------- fin test --------------------------------");
	}

	
	public void testGetMedComm(){
		System.out.println("--------------------------- testGetMedComm --------------------------------");
		assertEquals("Est ce que nomCommercial est correct", "TRIMYCINE", medicament.getNomCommercial());
	}
	
	public final void testSetMedComm() {
		System.out.println("--------------------------- testSetMedComm --------------------------------");
		medicament.setNomCommercial("nouveau nom");
		assertEquals("Est ce que le nouveau nomCommercial est correct", "nouveau nom", medicament.getNomCommercial());
	}
	
	public void testGetComposition(){
		System.out.println("--------------------------- testGetComposition --------------------------------");
		assertEquals("Est ce que composition est correct", "Triamcinolone (acétonide) + Néomycine + Nystatine", medicament.getComposition());
	}
	
	public final void testSetComposition() {
		System.out.println("--------------------------- testSetComposition --------------------------------");
		medicament.setComposition("nouvelle composition");
		assertEquals("Est ce que le nouveau composition  est correct", "nouvelle composition", medicament.getComposition());
	}
	
	
	public void testGetEffets(){
		System.out.println("--------------------------- testGetEffets --------------------------------");
		assertEquals("Est ce que effet est correct", "Ce médicament est contre-indiqué en cas d'allergie à  l'un des constituants,"
				+ " d'infections de la peau ou de parasitisme non traités,"
				+ " d'acné. Ne pas appliquer sur une plaie, ni sous un pansement occlusif.", medicament.getEffets());
	}
	
	public final void testSetEffets() {
		System.out.println("--------------------------- testSetEffets --------------------------------");
		medicament.setEffets("nouvel effet");
		assertEquals("Est ce que le nouveau effet  est correct", "nouvel effet", medicament.getEffets());
	}
	
	
	public void testGetContreIndication(){
		System.out.println("--------------------------- testGetContreIndication --------------------------------");
		assertEquals("Est ce que contreIndication est correct", "ContreIndication", medicament.getContreIndication());
	}
	
	public final void testSetContreIndication() {
		System.out.println("--------------------------- testSetContreIndication --------------------------------");
		medicament.setContreIndication("nouvelle indication");;
		assertEquals("Est ce que le nouveau  est correct", "nouvelle indication", medicament.getContreIndication());
	}
	
	
	public void testGetPrix(){
		System.out.println("--------------------------- testGetPrix --------------------------------");
		assertEquals("Est ce que  est correct", null, medicament.getPrixEchantillon());
	}
	
	public final void testSetPrix() {
		System.out.println("--------------------------- testSetPrix --------------------------------");
		medicament.setPrixEchantillon(5);
		assertEquals("Est ce que le nouveau  est correct", 5, medicament.getPrixEchantillon());
	}
	
	
	public void testGetCodeFamille(){
		System.out.println("--------------------------- testGetCodeFamille --------------------------------");
		assertEquals("Est ce que codeFamille est correct", "CRT", medicament.getCodeFamille());
	}
	
	
	public final void testSetCodeFamille() {
		System.out.println("--------------------------- testSetCodeFamille --------------------------------");
		medicament.setCodeFamille("ABP");;
		assertEquals("Est ce que le nouveau  est correct", "ABP", medicament.getCodeFamille());
	}
	
	public void testGetLibelleFamille(){
		System.out.println("--------------------------- testGetLibelleFamille --------------------------------");
		assertEquals("Est ce que  est correct", "Corticoïde, antibiotique et antifongique à  usage local", medicament.getLibelleFamille());
	}
	
	public final void testSetLibelleFamille() {
		System.out.println("--------------------------- testSetLibelleFamille --------------------------------");
		medicament.setLibelleFamille("autre famille");;
		assertEquals("Est ce que le nouveau libelleFamille est correct", "autre famille", medicament.getLibelleFamille());
	}
	
	
	public final void nettoyer(){
		medicament.setNomCommercial("TRIMYCINE");
		medicament.setComposition("Triamcinolone (acétonide) + Néomycine + Nystatine");
		medicament.setEffets("Ce médicament est contre-indiqué en cas d'allergie à  l'un des constituants, d'infections de la peau ou de parasitisme non traités, d'acné. Ne pas appliquer sur une plaie, ni sous un pansement occlusif.");
		medicament.setContreIndication("Ce médicament est contre-indiqué en cas d'allergie à  l'un des constituants, d'infections de la peau ou de parasitisme non traités, d'acné. Ne pas appliquer sur une plaie, ni sous un pansement occlusif.");
		medicament.setPrixEchantillon(0);
		medicament.setCodeFamille("CRT");
		medicament.setLibelleFamille("Corticoïde, antibiotique et antifongique à  usage local");
	}
	
}
