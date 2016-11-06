package gsb.service;

import gsb.modele.Medicament;
import gsb.modele.Offre;
import gsb.modele.Visite;
import gsb.modele.dao.LocaliteDao;
import gsb.modele.dao.OffreDao;

public class OffreService {
	public static Offre rechercherOffre(Visite visite, Medicament medicament){
		Offre offre=null;
		
		
		try {
			if ( visite== null || medicament==null) {
				throw new Exception("Donnée obligatoire : code");
			}
			offre = OffreDao.rechercher(visite,medicament);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return offre;
	}
	
}
