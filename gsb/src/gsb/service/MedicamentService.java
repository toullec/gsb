package gsb.service;

import java.util.ArrayList;
import java.util.HashMap;

import gsb.modele.Medicament;
import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;
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
	
	
	public static ArrayList<Medicament> retournerCollectionDesMedicaments(){
		ArrayList<Medicament> Medicament = MedicamentDao.retournerCollectionDesMedicaments();
			try{
			if (Medicament==null) {
	            throw new Exception("Medicament null");
	        }
			
			}
			catch(Exception e){
				System.out.println( e.getMessage());
			}
			return Medicament;
	}
	
	
	public static HashMap<String,Medicament> retournerDictionnaireDesMedicaments(){
		HashMap<String,Medicament> medicament = MedicamentDao.retournerDictionnaireDesMedicaments();
	
		try{
			if (medicament==null) {
	            throw new Exception("Medicament null");
	        }
			
			}
			catch(Exception e){
				System.out.println( e.getMessage());
			}
		
		return medicament;
	}
	

}
