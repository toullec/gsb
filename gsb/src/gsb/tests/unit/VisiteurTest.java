package gsb.tests.unit;



import gsb.modele.Visiteur;
import gsb.modele.dao.LocaliteDao;
import gsb.modele.dao.VisiteurDao;
import junit.framework.TestCase;

public class VisiteurTest extends TestCase{
	private Visiteur visiteur;
	
	
	public void setUp() throws Exception{
		visiteur = VisiteurDao.rechercher("a131");
		//nom=Villechalane
		//prenom=Louis
		//login=lvillachane
		//mdp=jux7g
		//adresse=8 rue des Charmes
		//codePotal=46000
		//dateEntree=2005-12-21 00:00:00
		//codeUnit=SW
		//nomUnit=SWISS
	}
	/**
	 * @throws java.lang.Exception
	 */
	
	public void tearDown() throws Exception {
		System.out.println("--------------------------- fin test --------------------------------");
	}

	
	public void testVisiteur(){
		System.out.println("--------------------------- testVisiteur --------------------------------");
		assertNotNull("Visiteur bien instanciée",visiteur);
	}
	
	public void testGetMatricule(){
		System.out.println("--------------------------- testGetMatricule --------------------------------");
		assertEquals("Est ce que matricule est correct", "a131", visiteur.getMatricule());
	}
	
	public final void testSetMatricule() {
		System.out.println("--------------------------- testSetMatricule --------------------------------");
		visiteur.setMatricule("a150");
		assertEquals("Est ce que le nouveau matricule est correct", "a150", visiteur.getMatricule());
	}
	
	
	public void testGetNom(){
		System.out.println("--------------------------- testGetNom --------------------------------");
		assertEquals("Est ce que nom est correct", "Villechalane", visiteur.getNom());
	}
	
	public final void testSetNom() {
		System.out.println("--------------------------- testSetNom --------------------------------");
		visiteur.setNom("Villechalane2");
		assertEquals("Est ce que le nouveau nom est correct", "Villechalane2", visiteur.getNom());
	}
	
	
	
	public void testGetPrenom(){
		System.out.println("--------------------------- testGetPrenom --------------------------------");
		assertEquals("Est ce que prenom est correct", "Louis", visiteur.getPrenom());
	}
	
	public final void testSetPrenom() {
		System.out.println("--------------------------- testSetPrenom --------------------------------");
		visiteur.setPrenom("Lilian");
		assertEquals("Est ce que le nouveau prenom est correct", "Lilian", visiteur.getPrenom());
	}
	
	
	
	public void testGetLogin(){
		System.out.println("--------------------------- testGetLogin --------------------------------");
		assertEquals("Est ce que login est correct", "lvillachane", visiteur.getLogin());
	}
	
	public final void testSetLogin() {
		System.out.println("--------------------------- testSetLogin --------------------------------");
		visiteur.setLogin("lvillachane2");
		assertEquals("Est ce que le nouveau login est correct", "lvillachane2", visiteur.getLogin());
	}
	
	
	
	public void testGetMdp(){
		System.out.println("--------------------------- testGetMdp --------------------------------");
		assertEquals("Est ce que mdp est correct", "jux7g", visiteur.getMdp());
	}
	
	public final void testSetMdp() {
		System.out.println("--------------------------- testSetMdp --------------------------------");
		visiteur.setMdp("777A");
		assertEquals("Est ce que le nouveau mdp est correct", "777A", visiteur.getMdp());
	}
	
	
	public void testGetAdresse(){
		System.out.println("--------------------------- testGetAdresse --------------------------------");
		assertEquals("Est ce que adresse est correct", "8 rue des Charmes", visiteur.getAdresse());
	}
	
	public final void testSetAdresse() {
		System.out.println("--------------------------- testSetAdresse --------------------------------");
		visiteur.setAdresse("10 rue des Charmes");
		assertEquals("Est ce que le nouveau adresse est correct", "10 rue des Charmes", visiteur.getAdresse());
	}
	
	
	public void testGetCodePostal(){
		System.out.println("--------------------------- testGetCodePostal --------------------------------");
		assertEquals("Est ce que codePostal est correct", "46000", visiteur.getCodePostal());
	}
	
	public final void testSetCodePostal() {
		System.out.println("--------------------------- testSetCodePostal --------------------------------");
		visiteur.setMatricule("56000");
		assertEquals("Est ce que le nouveau codePostal est correct", "56000", visiteur.getCodePostal());
	}
	
	
	public void testGetDateEntree(){
		System.out.println("--------------------------- testGetDateEntree --------------------------------");
		assertEquals("Est ce que dateEntree est correct", "2005-12-21 00:00:00", visiteur.getDateEntree());
	}
	
	public final void testSetDateEntree() {
		System.out.println("--------------------------- testSetDateEntree --------------------------------");
		visiteur.setDateEntree("2006-12-21 00:00:00");
		assertEquals("Est ce que le nouveau dateEntree est correct", "2006-12-21 00:00:00", visiteur.getDateEntree());
	}
	
	
	
	public void testGetCodeUnite(){
		System.out.println("--------------------------- testGetCodeUnite --------------------------------");
		assertEquals("Est ce que codeUnite est correct", "SW", visiteur.getCodeUnit());
	}
	
	public final void testSetCodeUnite() {
		System.out.println("--------------------------- testSetCodeUnite --------------------------------");
		visiteur.setCodeUnit("BO");
		assertEquals("Est ce que le nouveau  est correct", "BO", visiteur.getCodeUnit());
	}
	
	
	public void testGetNomUnite(){
		System.out.println("--------------------------- testGetNomUnite --------------------------------");
		assertEquals("Est ce que nom unite est correct", "SWISS", visiteur.getNomUnite());
	}
	
	public final void testSetNomUnite() {
		System.out.println("--------------------------- testSet --------------------------------");
		visiteur.setNomUnite("BOURDIN");
		assertEquals("Est ce que le nouveau nom unite  est correct", "BOURDIN", visiteur.getCodeUnit());
	}
	
	
	public final void nettoyer(){
		visiteur.setNom("Villechalane");
		visiteur.setPrenom("Louis");
		visiteur.setLogin("lvillachane");
		visiteur.setMdp("jux7g");
		visiteur.setAdresse("8 rue des Charmes");
		visiteur.setCodePostal(LocaliteDao.rechercher("46000"));
		visiteur.setDateEntree("2005-12-21 00:00:00");
		visiteur.setCodeUnit("SW");
		visiteur.setNomUnite("SWISS");
	
	}
	
}
