package gsb.tests.unit;

import gsb.modele.Visite;
import gsb.modele.dao.MedecinDao;
import gsb.modele.dao.VisiteDao;
import junit.framework.TestCase;

public class VisiteTest extends TestCase{
	private Visite visite;
	
	
	public void setUp() throws Exception{
		visite = VisiteDao.rechercher("v0001");
		//dateVisite=2002-01-20 00:00:00
		//commentaire=
		//codeMed=b59
	}
	
	public void tearDown() throws Exception {
		System.out.println("--------------------------- fin test --------------------------------");
	}

	public void testGetDate(){
		System.out.println("--------------------------- testGetDate --------------------------------");
		assertEquals("Est ce que dateVisite est correct", "2002-01-20 00:00:00", visite.getDate());
	}
	
	public final void testSetDate() {
		System.out.println("--------------------------- testSetDate --------------------------------");
		visite.setDate("2005-01-20 00:00:00");
		assertEquals("Est ce que le nouveau dateVisite est correct", "2005-01-20 00:00:00", visite.getDate());
	}
	
	
	public void testGetCodeMed(){
		System.out.println("--------------------------- testGetCodeMed --------------------------------");
		assertEquals("Est ce que  est correct", "b59", visite.getMedecin());
	}
	
	public final void testSetCodeMed() {
		System.out.println("--------------------------- testSetCodeMed --------------------------------");
		visite.setMedecin(MedecinDao.rechercher("c00"));
		assertEquals("Est ce que le nouveau  est correct", "c00", visite.getMedecin());
	}
	
	
	public final void nettoyer(){
		visite.setDate("2002-01-20 00:00:00");
		visite.setCommentaire("");
		visite.setMedecin(MedecinDao.rechercher("b59"));
	}
}
