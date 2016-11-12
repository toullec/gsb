package gsb.tests.dao;

import java.util.HashMap;

import gsb.modele.Localite;
import gsb.modele.Medecin;
import gsb.modele.dao.LocaliteDao;
import gsb.modele.dao.MedecinDao;

public class LocaliteDaoTest {

	public static void main(String[] args) {
		HashMap<String,Localite> localite = new HashMap<String,Localite>();
		localite =	LocaliteDao.retournerDictionnaireDesLocalites();
		if (localite.containsKey("13012")){
			System.out.println(localite.get("13012").getCodePostal());
		}
		else{
			System.out.println("Valeur non trouvée.");
		}
	}
}
