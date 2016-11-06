package gsb.tests.unit;

import gsb.modele.Stocker;
import gsb.modele.dao.MedicamentDao;
import gsb.modele.dao.StockerDao;
import gsb.modele.dao.VisiteurDao;
import junit.framework.TestCase;

public class StockerTest extends TestCase{
	private Stocker stock;
	//cette classe ne peut pour l'instant par être testée car il manque le jeu de données pour stocker
	public void setUp() throws Exception{
		stock = new StockerDao().rechercher(VisiteurDao.rechercher(""), MedicamentDao.rechercher("")); 
	}
	
	public void testGetMedicament(){
		System.out.println("--------------------------- testGetMedicament --------------------------------");
		assertEquals("Est ce que medicament est correct", "", stock.getMedicament().getDepotLegal());
	}
	
	public final void testSetMedicament() {
		System.out.println("--------------------------- testSetMedicament --------------------------------");
		stock.setMedicament(stock.getMedicament());;
		assertEquals("Est ce que le nouveau medicament  est correct", "", stock.getMedicament());
	}
	
	public void testGetVisiteur(){
		System.out.println("--------------------------- testGetVisiteur --------------------------------");
		assertEquals("Est ce que visiteur est correct", "", stock.getVisiteur().getMatricule());
	}
	
	public final void testSetVisiteur() {
		System.out.println("--------------------------- testSetVisiteur --------------------------------");
		stock.setVisiteur(stock.getVisiteur());;
		assertEquals("Est ce que le nouveau visiteur est correct", "", stock.getVisiteur().getMatricule());
	}
	
	public void testGetQteStock(){
		System.out.println("--------------------------- testGetQteStock --------------------------------");
		assertEquals("Est ce que qteStock est correct", "", stock.getQteStock());
	}
	
	public final void testSetStock() {
		System.out.println("--------------------------- testSetQteStock --------------------------------");
		stock.setQteStock(1);;
		assertEquals("Est ce que le nouveau qteStock est correct", 1, stock.getQteStock());
	}
	
	
	public void nettoyer(){
		//stock.setMedicament(medicament);
		//stock.setVisiteur(visiteur);
		//stock.setQteStock(qteStock);;
	}
	
}
