package gsb.tests.unit;

import gsb.modele.Offre;
import gsb.modele.dao.MedicamentDao;
import gsb.modele.dao.OffreDao;
import gsb.modele.dao.VisiteDao;
import junit.framework.TestCase;

public class OffreTest extends TestCase{
	private Offre offre;
	//unMedic
	//uneVisite
	
	public void setUp() throws Exception{
		offre = new OffreDao().rechercher(VisiteDao.rechercher(""), MedicamentDao.rechercher("")); 
		
	}
	
	
}
