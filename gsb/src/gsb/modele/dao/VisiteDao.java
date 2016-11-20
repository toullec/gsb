package gsb.modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;


import gsb.modele.Visite;
import gsb.modele.Medecin;
import gsb.modele.Medicament;
import gsb.modele.Visiteur;

/**
 * @author Simon
 *
 */
public class VisiteDao {
	/**
	 * @param reference
	 * @return une visite
	 */
	public static Visite rechercher(String reference) {
		Visite uneVisite = null;
		Medecin unMedecin;
		Visiteur unVisiteur;
		ResultSet reqSelection = ConnexionMySql
				.execReqSelection("select * from VISITE where REFERENCE='" + reference + "'");
		try {
			if (reqSelection.next()) {
				unMedecin = MedecinDao.rechercher(reqSelection.getString(5));
				unVisiteur = VisiteurDao.rechercher(reqSelection.getString(4));
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

	/**
	 * @return retourne une collection de visites
	 */
	public static ArrayList<Visite> retournerCollectionDesVisites() {
		ArrayList<Visite> collectionDesVisites = new ArrayList<Visite>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select REFERENCE from VISITE");
		try {
			while (reqSelection.next()) {
				String reference = reqSelection.getString(1);
				collectionDesVisites.add(VisiteDao.rechercher(reference));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesVisites()");
		}
		return collectionDesVisites;
	}

	/**
	 * @return un hashmap de visites
	 */
	public static HashMap<String, Visite> retournerDictionnaireDesVisites() {
		HashMap<String, Visite> diccoDesVisites = new HashMap<String, Visite>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select REFERENCE from VISITE");
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
	
	
	
	/**
	 * @param visiteur
	 * @return un hashmap selon le matricule du visiteur
	 */
	public static HashMap<String, Visite> rechercherHash(String visiteur) {
		HashMap<String, Visite> diccoDesVisites = new HashMap<String, Visite>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select REFERENCE from VISITE where matricule='"+visiteur+"'");
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
	
	/**
	 * @param visiteur
	 * @param date
	 * @return hashmpa selon le visiteur et la date
	 */
	public static HashMap<String, Visite> rechercherHash(String visiteur, String date) {
		HashMap<String, Visite> diccoDesVisites = new HashMap<String, Visite>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select REFERENCE from VISITE where matricule='"+visiteur+"'"
				+ "and datevisite='"+date+"'");
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
	
	/**
	 * @param commentaire
	 * @param reference
	 */
	public static void modifierVisite(String commentaire, String reference){
		int result =  ConnexionMySql.execReqMaj("update visite set commentaire='"+commentaire+"'"
				+ "where reference='"+reference+"'"); 
	}
	
	/**
	 * @param reference
	 * @param dateVisite
	 * @param commentaire
	 * @param matricule
	 * @param codeMedecin
	 */
	public static void ajouterVisite(String reference, String dateVisite, String commentaire, String matricule,String codeMedecin){
		int result =  ConnexionMySql.execReqMaj("insert into visite values('"+reference+"','"+dateVisite+"','"+commentaire+"'"
				+ ",'"+matricule+"','"+codeMedecin+"')");
		
		
		ConnexionMySql.fermerConnexionBd();
	}
	
	
	/**
	 * @param reference
	 * @param dateVisite
	 * @return une visite selon la reference et la date de la visite
	 */
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