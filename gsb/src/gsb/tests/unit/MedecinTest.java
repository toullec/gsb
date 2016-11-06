package gsb.tests.unit;

import gsb.modele.Medecin;
import gsb.modele.dao.LocaliteDao;
import gsb.modele.dao.MedecinDao;
import junit.framework.TestCase;

public class MedecinTest extends TestCase{
	private Medecin medecin;
	
	public void setUp() throws Exception{
		medecin = MedecinDao.rechercher("m001");
		//nom=SMITH
		//prenom=JEAN
		//adresse=5 rue de la Poste
		//localite=23200
		//telephone=05-55-12-65-45
		//potentiel=
		//specialite=Cardiologue
	}
	
	public void tearDown() throws Exception {
		System.out.println("--------------------------- fin test --------------------------------");
	}
	
	
	public void testGetNom(){
		System.out.println("--------------------------- testGetNom --------------------------------");
		assertEquals("Est ce que nom est correct", "SMITH", medecin.getNom());
	}
	
	public final void testSetNom() {
		System.out.println("--------------------------- testSetNom --------------------------------");
		medecin.setNom("TOULLEC");;
		assertEquals("Est ce que le nouveau nom est correct", "TOULLEC", medecin.getNom());
	}
	
	
	public void testGetPrenom(){
		System.out.println("--------------------------- testGetPrenom --------------------------------");
		assertEquals("Est ce que prenom est correct", "", medecin.getPrenom());
	}
	
	public final void testSetPrenom() {
		System.out.println("--------------------------- testSetPrenom --------------------------------");
		medecin.setPrenom("Simon");;
		assertEquals("Est ce que le nouveau prenom  est correct", "Simo,", medecin.getPrenom());
	}
	
	
	public void testGetAdresse(){
		System.out.println("--------------------------- testGetAdresse --------------------------------");
		assertEquals("Est ce que  est correct", "5 rue de la Poste", medecin.getAdresse());
	}
	
	public final void testSetAdresse() {
		System.out.println("--------------------------- testSetAdresse --------------------------------");
		medecin.setAdresse("10 rue de la Poste");;
		assertEquals("Est ce que le nouveau adresse est correct", "10 rue de la Poste", medecin.getAdresse());
	}
	
	public void testGetTelephone(){
		System.out.println("--------------------------- testGetTelephone --------------------------------");
		assertEquals("Est ce que telephone  est correct", "05-55-12-65-45", medecin.getTelephone());
	}
	
	public final void testSetTelephone() {
		System.out.println("--------------------------- testSetTelephone --------------------------------");
		medecin.setTelephone("06-55-12-65-45");;
		assertEquals("Est ce que le nouveau telephone est correct", "06-55-12-65-45", medecin.getTelephone());
	}
	
	
	public void testGetPotentiel(){
		System.out.println("--------------------------- testGetPotentiel --------------------------------");
		assertEquals("Est ce que potentiel est correct", "", medecin.getPotentiel());
	}
	
	public final void testSetPotentiel() {
		System.out.println("--------------------------- testSetPotentiel --------------------------------");
		medecin.setPotentiel("potentiel");;
		assertEquals("Est ce que le nouveau potentiel est correct", "potentiel", medecin.getPotentiel());
	}
	
	public void testGetSpecialite(){
		System.out.println("--------------------------- testGetSpecialite --------------------------------");
		assertEquals("Est ce que specialite est correct", "Cardiologue", medecin.getSpecialite());
	}
	
	public final void testSetSpecialite() {
		System.out.println("--------------------------- testSetSpecialite --------------------------------");
		medecin.setSpecialite("Neurologue");
		assertEquals("Est ce que le nouveau Specialite est correct", "Neurologue", medecin.getSpecialite());
	}
	
	//nom=SMITH
			//prenom=JEAN
			//adresse=5 rue de la Poste
			//localite=23200
			//telephone=05-55-12-65-45
			//potentiel=
			//specialite=Cardiologue
	public final void nettoyer(){
		medecin.setNom("SMITH");
		medecin.setPrenom("JEAN");
		medecin.setAdresse("5 rue de la Poste");
		medecin.setLaLocalite(LocaliteDao.rechercher("23200"));
		medecin.setTelephone("05-55-12-65-45");
		medecin.setPotentiel("");
		medecin.setSpecialite("Cardiologue");
	}
}
