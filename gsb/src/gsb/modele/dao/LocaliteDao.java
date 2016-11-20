/*
 * Créé le 22 févr. 2015
 *
 * TODO Pour changer le modèle de ce fichier généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
package gsb.modele.dao;

import gsb.modele.Localite;
import gsb.modele.Medecin;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;


/**
 * @author Isabelle
 * 22 févr. 2015
 * TODO Pour changer le modèle de ce commentaire de type généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
public class LocaliteDao {
	
	/**
	 * @param codeLocalite
	 * @return
	 */
	public static Localite rechercher(String codeLocalite){//recherche une localite selon le code postal
		Localite uneLocalite=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from LOCALITE where CODEPOSTAL='"+codeLocalite+"'");
		try {
			if (reqSelection.next()) {
				uneLocalite = new Localite(reqSelection.getString(1), reqSelection.getString(2));	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requête - select * from LOCALITE where CODEPOSTAL='"+codeLocalite+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneLocalite;
	}
	
	/**
	 * @return arraylist de localites
	 */
	public static ArrayList<Localite> retournerCollectionDesLocalites(){// retourne un arraylist de localite
		ArrayList<Localite> collectionDesLocalites = new ArrayList<Localite>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select CODEPOSTAL from Localite");
		try{
		while (reqSelection.next()) {
			String codeLocalite = reqSelection.getString(1);
		    collectionDesLocalites.add(LocaliteDao.rechercher(codeLocalite));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionDesLocalites()");
		}
		return collectionDesLocalites;
	}
	
	/**
	 * @return dictionnaire de localites
	 */
	public static HashMap<String,Localite> retournerDictionnaireDesLocalites(){// retourne un dictionnaire de localites
		HashMap<String, Localite> diccoDesLocalites = new HashMap<String, Localite>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select CODEPOSTAL from LOCALITE");
		try{
		while (reqSelection.next()) {
			String codeLocalite = reqSelection.getString(1);
		    diccoDesLocalites.put(codeLocalite, LocaliteDao.rechercher(codeLocalite));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerDiccoDesLocalites()");
		}
		return diccoDesLocalites;
	}

}
