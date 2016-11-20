package gsb.tests.dao;

import java.util.HashMap;

import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;

/**
 * @author Simon
 *
 */
public class MedicamentDaoTest {

	
	public static void main(String[] args){
		HashMap<String, Medicament> medicament = new HashMap<String, Medicament>(); 
		medicament = MedicamentDao.retournerDictionnaireDesMedicaments();
		
		if(medicament.containsKey("3MYC7")){
			System.out.println(medicament.get("3MYC7").getNomCommercial());
		}else{
			System.out.println("Valeur non trouvée.");
		}
	}
}
