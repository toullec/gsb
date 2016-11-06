package gsb.modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;


import gsb.modele.Visite;
import gsb.modele.Medecin;
import gsb.modele.Medicament;
import gsb.modele.Visiteur;

public class VisiteDao {
	public static Visite rechercher(String reference) {
		Visite uneVisite = null;
		Medecin unMedecin;
		Visiteur unVisiteur;
		ResultSet reqSelection = ConnexionMySql
				.execReqSelection("select * from VISITE where REFERENCE='" + reference + "'");
		try {
			if (reqSelection.next()) {
				unMedecin = MedecinDao.rechercher(reqSelection.getString(4));
				unVisiteur = VisiteurDao.rechercher(reqSelection.getString(5));
				uneVisite = new Visite(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getString(3),
						unVisiteur, unMedecin);

			}
		} catch (Exception e) {
			System.out.println("erreur reqSelection.next() pour la requete - select * from VISITE where REFERENCE='"
					+ reference + "'");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		return uneVisite;
	}

	public static ArrayList<Visite> retournerCollectionDesVisites() {
		ArrayList<Visite> collectionDesVisites = new ArrayList<Visite>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select REFERENCE from VISITE");
		try {
			while (reqSelection.next()) {
				String reference = reqSelection.getString(1);
				//collectionDesVisites.add(VisiteDao.rechercher(reference));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesVisites()");
		}
		return collectionDesVisites;
	}

	public static HashMap<String, Visite> retournerDictionnaireDesVisites() {
		HashMap<String, Visite> diccoDesVisites = new HashMap<String, Visite>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select REFERENCE,CODEMED,DATEVISITE from VISITE");
		try {
			while (reqSelection.next()) {
				String reference = reqSelection.getString(1);
				
				diccoDesVisites.put(reference, VisiteDao.rechercher(reference));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerDiccoDesVisites()");
		}
		return diccoDesVisites;
	}
	
	public static void ajouterVisite(String reference, String dateVisite, String commentaire, String matricule,String codeMedecin){
		int result =  ConnexionMySql.execReqMaj("insert into visite values('"+reference+"','"+dateVisite+"','"+commentaire+"'"
				+ ",'"+matricule+"','"+codeMedecin+"')");
		//System.out.println("ajouterVisite");
		/*try {
			while (reqSelection.next()) {
				//String reference = reqSelection.getString(1);
				
				//diccoDesVisites.put(reference, VisiteDao.rechercher(reference));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur ajouterVisite()");
		}*/
		
		ConnexionMySql.fermerConnexionBd();
	}
	
	
	public static Visite rechercher(String reference,String dateVisite) {
		Visite uneVisite = null;
		Medecin unMedecin;
		Visiteur unVisiteur;
		ResultSet reqSelection = ConnexionMySql
				.execReqSelection("select * from VISITE where REFERENCE='" + reference + "'"
						+ "and datevisite='"+dateVisite+"'");
		try {
			if (reqSelection.next()) {
				unMedecin = MedecinDao.rechercher(reqSelection.getString(4));
				unVisiteur = VisiteurDao.rechercher(reqSelection.getString(5));
				uneVisite = new Visite(reqSelection.getString(1), reqSelection.getString(2), reqSelection.getString(3),
						unVisiteur, unMedecin);

			}
		} catch (Exception e) {
			System.out.println("erreur reqSelection.next() pour la requete - select * from VISITE where REFERENCE='"
					+ reference + "' and dateVisite=");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		return uneVisite;
	}
	
}