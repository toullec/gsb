package gsb.tests.dao;

import java.util.HashMap;

import gsb.modele.Visiteur;
import gsb.modele.dao.VisiteurDao;

public class VisiteurDaoTest {

	public static void main(String[] args) {
		
		HashMap<String,Visiteur> visiteur = new HashMap<String, Visiteur>();
		
		visiteur = VisiteurDao.retournerDictionnaireDesVisiteurs();
		
		if (visiteur.containsKey("a131")){
			System.out.println(visiteur.get("a131").getNom());
		}
		else{
			System.out.println("Valeur non trouvée.");
		}
	}
}
