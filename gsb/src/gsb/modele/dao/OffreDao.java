package gsb.modele.dao;

import java.sql.ResultSet;
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
	
	
}
