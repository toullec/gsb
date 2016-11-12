package gsb.service;

import java.util.ArrayList;
import java.util.HashMap;

import gsb.modele.Visiteur;
import gsb.modele.Visiteur;
import gsb.modele.dao.VisiteurDao;
import gsb.modele.dao.VisiteurDao;

public class VisiteurService {
	public static Visiteur rechercherFamille(String unMatricule) {
		Visiteur unVisiteur = null;
		try {
			if (unMatricule == null) {
				throw new Exception("Donnée obligatoire : code");
			}
			unVisiteur = VisiteurDao.rechercher(unMatricule);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return unVisiteur;
	}

	public static ArrayList<Visiteur> retournerCollectionDesVisiteurs() {
		ArrayList<Visiteur> visiteur = VisiteurDao.retournerCollectionDesVisiteurs();
		try {
			if (visiteur == null) {
				throw new Exception("Visiteur null");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return visiteur;
	}

	public static HashMap<String, Visiteur> retournerDictionnaireDesVisiteurs() {
		HashMap<String, Visiteur> visiteur = VisiteurDao.retournerDictionnaireDesVisiteurs();

		try {
			if (visiteur == null) {
				throw new Exception("Visiteur null");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return visiteur;
	}

}