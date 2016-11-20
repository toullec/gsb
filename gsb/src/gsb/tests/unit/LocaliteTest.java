package gsb.tests.unit;

import gsb.modele.Localite;
import gsb.modele.dao.LocaliteDao;
import junit.framework.TestCase;

/**
 * @author Simon
 *
 */
public class LocaliteTest extends TestCase{
	private Localite localite;
	
	public void setUp() throws Exception{
		localite = LocaliteDao.rechercher("13012");
	}
	
	
	public void tearDown() throws Exception{
		System.out.println("--------------------------- fin test --------------------------------");
	}
	
	public void testGetCodePostal(){
		System.out.println("--------------------------- testGetCodePostal --------------------------------");
		assertEquals("Est ce que codePostal est correct", "13012", localite.getCodePostal());
	}
	
	public final void testSetCodePostal() {
		System.out.println("--------------------------- testSetCodePostal --------------------------------");
		localite.setCodePostal("13000");;
		assertEquals("Est ce que le nouveau codePostal est correct", "13000", localite.getCodePostal());
	}
	
	
	public void testGetVille(){
		System.out.println("--------------------------- testGetVille --------------------------------");
		assertEquals("Est ce que  est correct", "Allauh", localite.getVille());
	}
	
	public final void testSetVille() {
		System.out.println("--------------------------- testSetVille --------------------------------");
		localite.setVille("Marseille");
		assertEquals("Est ce que le nouveau  est correct", "Marseille", localite.getVille());
	}
	
	public final void nettoyer(){
		localite.setCodePostal("13012");
		localite.setVille("Allauh");
	}
	
}
