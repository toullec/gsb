package gsb.modele.dao;

import java.sql.ResultSet;

import gsb.modele.Localite;
import gsb.modele.Visiteur;
//import gsb.modele.Unite;

public class VisiteurDao {
	public static Visiteur rechercher(String matricule){
		Visiteur uneVisiteur=null;
		Localite localite=null;
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select * from Visiteur where matricule='"+matricule+"'");
		try {
			if (reqSelection.next()) {
				localite = LocaliteDao.rechercher(reqSelection.getString(7));
				uneVisiteur = new Visiteur(reqSelection.getString(1), reqSelection.getString(2),reqSelection.getString(3),reqSelection.getString(4),reqSelection.getString(5),reqSelection.getString(6),localite,reqSelection.getString(8),reqSelection.getString(9),reqSelection.getString(10));	
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requ�te - select * from visiteur where matricule='"+matricule+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneVisiteur;
}
}