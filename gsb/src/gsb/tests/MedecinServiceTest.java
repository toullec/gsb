/*
 * Créé le 23 févr. 2015
 *
 * TODO Pour changer le modèle de ce fichier généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
package gsb.tests;

import gsb.modele.Medecin;
import gsb.service.MedecinService;

/**
 * @author Isabelle
 * 23 févr. 2015
 * TODO Pour changer le modèle de ce commentaire de type généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
public class MedecinServiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Medecin unMedecin = MedecinService.rechercherMedecin("m002");
		System.out.println("Nom:"+unMedecin.getNom());
		System.out.println("Prenom:"+unMedecin.getPrenom());
		System.out.println("Adresse:"+unMedecin.getAdresse());
		System.out.println("Code postal:"+unMedecin.getLaLocalite().getCodePostal());
		System.out.println("Localite:"+unMedecin.getLaLocalite().getVille());
		System.out.println("Telephone:"+unMedecin.getTelephone());
		System.out.println("Potentiel"+unMedecin.getPotentiel());
		System.out.println("Specialite"+unMedecin.getSpecialite());
		
		

	}

}
