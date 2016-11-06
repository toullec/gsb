package gsb.tests;


import gsb.modele.Medecin;
import gsb.modele.Medicament;
import gsb.modele.Visite;
import gsb.modele.Visiteur;
import gsb.modele.dao.MedecinDao;
import gsb.modele.dao.MedicamentDao;
import gsb.modele.dao.VisiteurDao;
import gsb.service.VisiteService;

public class VisiteServiceTest {

	public static void main(String[] args){
		//Visiteur visiteur = VisiteurDao.rechercher("b59");
		//Medicament medicament = MedicamentDao.rechercher("m001");
		Visite uneVisite = VisiteService.rechercherVisite("V0001");
		System.out.println(uneVisite.getReference());
		System.out.println(uneVisite.getDate());
		System.out.println(uneVisite.getCommentaire());
		System.out.println(uneVisite.getMatricule());
		System.out.println(uneVisite.getMedecin());
		
	}
}
