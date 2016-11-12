package gsb.tests.dao;

import java.util.HashMap;

import gsb.modele.Medecin;
import gsb.modele.Offre;
import gsb.modele.dao.MedecinDao;
import gsb.modele.dao.OffreDao;

public class OffreDaoTest {

	public static void main(String[] args) {
		HashMap<String,Offre> offre = new HashMap<String,Offre>();
		offre =	OffreDao.retournerDictionnaireDesOffre();
		if (offre.containsKey("")){
			System.out.println(offre.get("").getUneVisite());
		}
		else{
			System.out.println("Valeur non trouvée.");
		}
	}
}
