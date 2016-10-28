package gsb.service;

import gsb.modele.Medecin;
import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;

public class MedicamentService {
	
	public static Medicament rechercherMedicament(String unMedicament){
		Medicament unMedic = null;
		try{
		if (unMedicament==null) {
            throw new Exception("Donnée obligatoire : code");
        }
		unMedic = MedicamentDao.rechercher(unMedicament);
		}
		catch(Exception e){
			System.out.println( e.getMessage());
		}
		return unMedic;
	}
	

}
