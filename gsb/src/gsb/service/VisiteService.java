package gsb.service;

import gsb.modele.Medecin;
import gsb.modele.Visite;
import gsb.modele.Visiteur;
import gsb.modele.dao.VisiteDao;

public class VisiteService {

	public static Visite rechercherVisite(String reference){
		Visite uneVisite = null;
		try{
			if(reference==null){
				throw new Exception("Donne obligatoire : reference");
			}
			uneVisite = VisiteDao.rechercher(reference);	
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return uneVisite;
	}	
}
