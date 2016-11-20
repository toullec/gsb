package gsb.tests.dao;

import java.util.HashMap;

import gsb.modele.Visite;
import gsb.modele.dao.VisiteDao;

/**
 * @author Simon
 *
 */
public class VisiteDaoTest {

	public static void main(String[] args) {
		HashMap<String, Visite> visite = new HashMap<String, Visite>();
		visite = VisiteDao.retournerDictionnaireDesVisites();
		
		if(visite.containsKey("v001")){
			System.out.println(visite.get("v001").getReference());
		}
		else{
			System.out.println("Valeur non trouvée.");
		}
	}
}
