package gsb.modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

import gsb.modele.Medicament;
import gsb.modele.Visiteur;
import gsb.modele.Offre;
import gsb.modele.Visite;

/**
 * @author Simon
 *
 */
public class OffreDao {
	/**
	 * @param uneVisite
	 * @param unMedicament
	 * @return une offre
	 */
	public static Offre rechercher(Visite uneVisite, Medicament unMedicament) {
		Offre uneOffre = null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from OFFRE where REF='"
				+ uneVisite.getReference() + "'" + "and ID_MEDIC='" + unMedicament.getDepotLegal() + "'");
		try {
			if (reqSelection.next()) {
				unMedicament = MedicamentDao.rechercher(reqSelection.getString(1));
				uneVisite = VisiteDao.rechercher(reqSelection.getString(2));
				uneOffre = new Offre(uneVisite, unMedicament, reqSelection.getInt(3));
			}
			;
		} catch (Exception e) {
			System.out.println("erreur reqSelection.next() pour la requï¿½te - select * from OFFRE where REF='"
					+ uneVisite.getReference() + "'" + "and ID_MEDIC='" + unMedicament.getDepotLegal() + "'");
			e.printStackTrace();
		}
		ConnexionMySql.fermerConnexionBd();
		return uneOffre;
	}

	/**
	 * @return un arraylist d'offre
	 */
	public static ArrayList<Offre> retournerCollectionDesOffres() {
		ArrayList<Offre> collectionDesOffres = new ArrayList<Offre>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select REF,ID_MEDIC from OFFRE");
		try {
			while (reqSelection.next()) {
				Visite visite = VisiteDao.rechercher(reqSelection.getString(1));
				Medicament medicament = MedicamentDao.rechercher(reqSelection.getString(2));
				collectionDesOffres.add(OffreDao.rechercher(visite, medicament));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionOffres()");
		}
		return collectionDesOffres;
	}

	/**
	 * @return un hashmap d'offre
	 */
	public static HashMap<String, Offre> retournerDictionnaireDesOffre() {
		HashMap<String, Offre> diccoDesOffres = new HashMap<String, Offre>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select REF, ID_MEDIC from OFFRE");
		try {
			while (reqSelection.next()) {
				String codeOffre = reqSelection.getString(1) + "" + reqSelection.getString(2);
				Visite visite = VisiteDao.rechercher(reqSelection.getString(1));
				Medicament medicament = MedicamentDao.rechercher(reqSelection.getString(2));
				diccoDesOffres.put(codeOffre, OffreDao.rechercher(visite, medicament));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerDiccoDesMedicaments()");
		}
		return diccoDesOffres;
	}

	/**
	 * @param reference
	 * @param depotLegal
	 * @param quantite
	 */
	public static void insererOffre(String reference, String depotLegal, String quantite) {
		ResultSet reqSelection = ConnexionMySql.execReqSelection(
				"select REF, ID_MEDIC from OFFRIR where ref='" + reference + "' and id_medic='" + depotLegal + "'");
		try {

			if (reqSelection.next()) {
				JOptionPane jop3 = new JOptionPane();
				jop3.showMessageDialog(null, "Cette insertion existe déjà dans la base de donnée", "Erreur",
						JOptionPane.ERROR_MESSAGE);

			}else{
				int insert = ConnexionMySql
				.execReqMaj("insert into offrir values ('" + reference + "','" + depotLegal + "','" + quantite + "' )");
		
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerDiccoDesMedicaments()");
		}
		
		ConnexionMySql.fermerConnexionBd();
	}
}
