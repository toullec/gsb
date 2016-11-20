package gsb.tests;

import gsb.modele.Medicament;
import gsb.service.MedicamentService;

public class MedicamentServiceTest {

	public static void main(String[] args){
		Medicament unMedicament = MedicamentService.rechercherMedicament("3MYC7");
		System.out.println("DepotLegal:"+unMedicament.getDepotLegal());
		System.out.println("Nom commercial:"+unMedicament.getNomCommercial());
		System.out.println("Prix echantillon:"+unMedicament.getPrixEchantillon());
		System.out.println("Composition:"+unMedicament.getComposition());
		System.out.println("Contre indication:"+unMedicament.getContreIndication());
		
		System.out.println("Effets:"+unMedicament.getEffets());
	}
	
}
