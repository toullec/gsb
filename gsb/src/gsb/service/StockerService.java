package gsb.service;

import gsb.modele.Localite;
import gsb.modele.Medicament;
import gsb.modele.Stocker;
import gsb.modele.Visiteur;
import gsb.modele.dao.LocaliteDao;
import gsb.modele.dao.StockerDao;

public class StockerService {
	public static Stocker rechercherStock(Visiteur visiteur, Medicament medicament, int qteStock){
		Stocker stock = null;
		try {
			if (visiteur == null || medicament==null) {
				throw new Exception("Donnée obligatoire : code");
			}
			stock = StockerDao.rechercher(visiteur,medicament);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return stock;
		
	}

}
