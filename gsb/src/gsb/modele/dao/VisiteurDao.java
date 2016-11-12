package gsb.modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import gsb.modele.Localite;
import gsb.modele.Visite;
import gsb.modele.Visiteur;
//import gsb.modele.Unite;

public class VisiteurDao {
	public static Visiteur rechercher(String matricule) {
		Visiteur uneVisiteur = null;
		Localite localite = null;
		ResultSet reqSelection = ConnexionMySql
				.execReqSelection("select * from Visiteur where matricule='" + matricule + "'");
		try {
			if (reqSelection.next()) {
				localite = LocaliteDao.rechercher(reqSelection.getString(7));
				uneVisiteur = new Visiteur(reqSelection.getString(1), reqSelection.getString(2),
						reqSelection.getString(3), reqSelection.getString(4), reqSelection.getString(5),
						reqSelection.getString(6), localite, reqSelection.getString(8), reqSelection.getString(9),
						reqSelection.getString(10));
			}
			;
		} catch (Exception e) {
			System.out.println("erreur reqSelection.next() pour la requ�te - select * from visiteur where matricule='"
					+ matricule + "'");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		return uneVisiteur;
	}
	
	
	
	public static ArrayList<Visiteur> retournerCollectionDesVisiteurs() {
		ArrayList<Visiteur> collectionDesVisiteurs = new ArrayList<Visiteur>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select MATRICULE from VISITEUR");
		try {
			while (reqSelection.next()) {
				String reference = reqSelection.getString(1);
				//collectionDesVisites.add(VisiteDao.rechercher(reference));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesVisiteurs()");
		}
		return collectionDesVisiteurs;
	}

	public static HashMap<String, Visiteur> retournerDictionnaireDesVisiteurs() {
		HashMap<String, Visiteur> diccoDesVisiteurs = new HashMap<String, Visiteur>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select MATRICULE from VISITEUR");
		try {
			while (reqSelection.next()) {
				String matricule = reqSelection.getString(1);
				
				diccoDesVisiteurs.put(matricule, VisiteurDao.rechercher(matricule));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerDiccoDesVisites()");
		}
		return diccoDesVisiteurs;
	}
}