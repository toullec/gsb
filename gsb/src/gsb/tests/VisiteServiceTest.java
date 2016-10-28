package gsb.tests;


import gsb.modele.Visite;
import gsb.service.VisiteService;

public class VisiteServiceTest {

	public static void main(String[] args){
		Visiteur visiteur = new Visiteur();
		Medecin medecin = new Medecin();
		Visite uneVisite = VisiteService.rechercherVisite("V0001", null , null);
		System.out.println(uneVisite.getReference());
		System.out.println(uneVisite.getDate());
		System.out.println(uneVisite.getCommentaire());
		System.out.println(uneVisite.getUnMedecin());
		System.out.println(uneVisite.getUnVisiteur());
		
	}
}
