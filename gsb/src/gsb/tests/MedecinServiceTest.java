/*
 * Cr�� le 23 f�vr. 2015
 *
 * TODO Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
package gsb.tests;

import gsb.modele.Medecin;
import gsb.service.MedecinService;

/**
 * @author Isabelle
 * 23 f�vr. 2015
 * TODO Pour changer le mod�le de ce commentaire de type g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
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
