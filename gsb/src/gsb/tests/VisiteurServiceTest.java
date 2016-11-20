package gsb.tests;

import gsb.modele.Visiteur;
import gsb.service.VisiteurService;

/**
 * @author Simon
 *
 */
public class VisiteurServiceTest {

	public static void main(String[] args){
		Visiteur unVisiteur = VisiteurService.rechercherFamille("a131");
		System.out.println("Nom:"+unVisiteur.getNom());
		System.out.println("Prenom:"+unVisiteur.getPrenom());
		//System.out.println(unVisiteur.getTelephone());
		System.out.println("Adresse"+unVisiteur.getAdresse());
		//System.out.println(unVisiteur.getDateentree());
		//System.out.println(unVisiteur.getUneUnite());
		System.out.println("login:"+unVisiteur.getLogin());
		System.out.println("Matricule:"+unVisiteur.getMatricule());
		
	}

	
}
