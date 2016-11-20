package gsb.modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import gsb.modele.Medecin;
import gsb.modele.Medicament;
import gsb.modele.Stocker;
import gsb.modele.Visite;
import gsb.modele.Visiteur;

/**
 * @author Simon
 *
 */
public class StockerDao {

	/**
	 * @param matricule
	 * @param medic
	 * @return un stock selon le matricule et l'id_medic
	 */
	public static Stocker rechercher(Visiteur matricule, Medicament medic) {
		Stocker unStock = null;
		// Medicament medicament=null;
		// Visiteur visiteur=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from STOCKER where ID_MAT='"
				+ matricule.getMatricule() + "'" + "and ID_MEDIC='" + medic.getDepotLegal() + "'");
		try {
			if (reqSelection.next()) {
				// medicament =
				// MedicamentDao.rechercher(reqSelection.getString(4));
				// visiteur=VisiteurDao.rechercher(reqSelection.getString(4));
				unStock = new Stocker(matricule, medic, reqSelection.getInt(3));

			}
		} catch (Exception e) {
			System.out.println("erreur reqSelection.next() pour la requete - select * from STOCKER where id_mat='"
					+ matricule + "'");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		return unStock;
	}

	/**
	 * @param matricule
	 * @return un stock selon le matricule du visiteur
	 */
	public static Stocker rechercher(Visiteur matricule) {
		Stocker unStock = null;
		Medicament medicament = null;
		// Visiteur visiteur=null;
		ResultSet reqSelection = ConnexionMySql
				.execReqSelection("select * from STOCKER where ID_MAT='" + matricule.getMatricule());
		try {
			if (reqSelection.next()) {
				medicament = MedicamentDao.rechercher(reqSelection.getString(4));
				// visiteur=VisiteurDao.rechercher(reqSelection.getString(4));
				unStock = new Stocker(matricule, medicament, reqSelection.getInt(3));

			}
		} catch (Exception e) {
			System.out.println("erreur reqSelection.next() pour la requete - select * from STOCKER where id_mat='"
					+ matricule + "'");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		return unStock;
	}

	/**
	 * @return une collection de stock
	 */
	public static HashMap<String, Stocker> retournerDictionnaireDesStocks() {
		HashMap<String, Stocker> diccoDesStocks = new HashMap<String, Stocker>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select id_mat,id_medic,qteStock from STOCKER");
		try {
			while (reqSelection.next()) {
				String id_mat = reqSelection.getString(1);
				String id_medic = reqSelection.getString(2);
				diccoDesStocks.put(id_mat,
						StockerDao.rechercher(VisiteurDao.rechercher(id_mat), MedicamentDao.rechercher(id_medic)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerDiccoDesStocks()");
		}
		return diccoDesStocks;
	}

	/**
	 * @param visiteur
	 * @return un hashmap de stock
	 */
	public static HashMap<String, Stocker> retournerDictionnaireDesStocks(Visiteur visiteur) {
		HashMap<String, Stocker> diccoDesStocks = new HashMap<String, Stocker>();
		if (visiteur != null) {
			ResultSet reqSelection = ConnexionMySql.execReqSelection(
					"select id_mat,id_medic,qteStock from STOCKER where id_mat='" + visiteur.getMatricule() + "'");
			try {
				while (reqSelection.next()) {
					String id_mat = reqSelection.getString(1);
					String id_medic = reqSelection.getString(2);
					diccoDesStocks.put(id_mat,
							StockerDao.rechercher(VisiteurDao.rechercher(id_mat), MedicamentDao.rechercher(id_medic)));
				}
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("erreur retournerDiccoDesStocks()");
			}
		}

		return diccoDesStocks;
	}

	/**
	 * @return une collection de stocks
	 */
	public static ArrayList<Stocker> retournerCollectionDesStocks() {
		ArrayList<Stocker> collectionDesStockers = new ArrayList<Stocker>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select REFERENCE from Stocker");
		try {
			while (reqSelection.next()) {
				String reference = reqSelection.getString(1);
				// collectionDesStockers.add(StockerDao.rechercher(reference));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesStockers()");
		}
		return collectionDesStockers;
	}

	/**
	 * @param visiteur
	 * @param depotLegal
	 * @param quantite
	 */
	public static void inserer(Visiteur visiteur, Medicament depotLegal, String quantite) {
		ResultSet reqSelection = ConnexionMySql.execReqSelection("insert into offrir values ('"
				+ visiteur.getMatricule() + "','" + depotLegal.getDepotLegal() + "','" + quantite + "' )");
		try {
			if (reqSelection.next()) {
				System.out.println("requete ok insert offrir");

			}
		} catch (Exception e) {
			System.out.println("erreur reqSelection.next() pour la requ�te -insert into offrir, ou depot legal='"
					+ depotLegal + "'");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
	}

}
