package gsb.tests.unit;

import gsb.modele.Offre;
import gsb.modele.dao.MedicamentDao;
import gsb.modele.dao.OffreDao;
import gsb.modele.dao.VisiteDao;
import junit.framework.TestCase;

/**
 * @author Simon
 *
 */
public class OffreTest extends TestCase{
	private Offre offre;
	//unMedic 3MYC7
	//uneVisite v0024
	
	public void setUp() throws Exception{
		offre = new OffreDao().rechercher(VisiteDao.rechercher("v0024"), MedicamentDao.rechercher("3MYC7")); 
		
	}
	
	
}
