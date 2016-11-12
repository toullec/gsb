package gsb.modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import gsb.modele.Medicament;
import gsb.modele.Visiteur;
import gsb.modele.Offre;
import gsb.modele.Visite;

public class OffreDao {
	public static Offre rechercher(Visite uneVisite, Medicament unMedicament ){
		Offre uneOffre=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from OFFRE where REF='"+uneVisite.getReference()+"'"
				+ "and ID_MEDIC='"+unMedicament.getDepotLegal()+"'");
		try {
			if (reqSelection.next()) {
				unMedicament = MedicamentDao.rechercher(reqSelection.getString(1));
				uneVisite = VisiteDao.rechercher(reqSelection.getString(2));
				uneOffre = new Offre(uneVisite,unMedicament, reqSelection.getInt(3));	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requ�te - select * from OFFRE where REF='"+uneVisite.getReference()+"'"
				+ "and ID_MEDIC='"+unMedicament.getDepotLegal()+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneOffre;
	}
	
	
	
	public static ArrayList<Offre> retournerCollectionDesOffres(){
		ArrayList<Offre> collectionDesOffres = new ArrayList<Offre>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select REF,ID_MEDIC from OFFRE");
		try{
		while (reqSelection.next()) {
			Visite visite = VisiteDao.rechercher(reqSelection.getString(1));
			Medicament medicament = MedicamentDao.rechercher(reqSelection.getString(2));
		    collectionDesOffres.add(OffreDao.rechercher(visite, medicament));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerCollectionOffres()");
		}
		return collectionDesOffres;
	}
	
	public static HashMap<String,Offre> retournerDictionnaireDesOffre(){
		HashMap<String, Offre> diccoDesOffres = new HashMap<String, Offre>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select REF, ID_MEDIC from OFFRE");
		try{
		while (reqSelection.next()) {
			String codeOffre = reqSelection.getString(1)+""+reqSelection.getString(2);
			Visite visite = VisiteDao.rechercher(reqSelection.getString(1));
			Medicament medicament = MedicamentDao.rechercher(reqSelection.getString(2));
		    diccoDesOffres.put(codeOffre, OffreDao.rechercher(visite,medicament));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur retournerDiccoDesMedicaments()");
		}
		return diccoDesOffres;
	}
	
	
}
