package gsb.tests.dao;

import java.util.HashMap;

import gsb.modele.Medecin;
import gsb.modele.Stocker;
import gsb.modele.dao.MedecinDao;
import gsb.modele.dao.StockerDao;

public class StockerDaoTest {

	public static void main(String[] args) {
		
		HashMap<String,Stocker> stocker = new HashMap<String,Stocker>();
		stocker =	StockerDao.retournerDictionnaireDesStocks();
		if (stocker.containsKey("")){
			System.out.println(stocker.get("").getMedicament()+" "+stocker.get("").getMedicament());
		}
		else{
			System.out.println("Valeur non trouvée.");
		}
	}
}
