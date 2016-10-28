package gsb.tests;

import gsb.modele.Visiteur;
import gsb.service.VisiteurService;

public class VisiteurServiceTest {

	public static void main(String[] args){
		Visiteur unVisiteur = VisiteurService.rechercherFamille("a131", null);
		System.out.println(unVisiteur.getNom());
		System.out.println(unVisiteur.getPrenom());
		System.out.println(unVisiteur.getTelephone());
		System.out.println(unVisiteur.getAdresse());
		System.out.println(unVisiteur.getDateentree());
		System.out.println(unVisiteur.getUneUnite());
		System.out.println(unVisiteur.getLogin());
		System.out.println(unVisiteur.getMatricule());
		
	}

	
}
