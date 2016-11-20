/*
 * Cr�� le 23 f�vr. 2015
 *
 * TODO Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
package gsb.service;

import java.util.ArrayList;
import java.util.HashMap;

import gsb.modele.Medecin;
import gsb.modele.dao.MedecinDao;

/**
 * @author Isabelle
 * 23 f�vr. 2015
 * TODO Pour changer le mod�le de ce commentaire de type g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
/**
 * @author Simon
 *
 */
public class MedecinService {
	
	/**
	 * @param unCodeMedecin
	 * @return
	 */
	public static Medecin rechercherMedecin(String unCodeMedecin){
		Medecin unMedecin = null;
		try{
		if (unCodeMedecin==null) {
            throw new Exception("Donn�e obligatoire : code");
        }
		unMedecin = MedecinDao.rechercher(unCodeMedecin);
		}
		catch(Exception e){
			System.out.println( e.getMessage());
		}
		return unMedecin;
	}
	
	
	/**
	 * @return
	 */
	public static ArrayList<Medecin> retournerCollectionDesMedecins(){
		ArrayList<Medecin> medecin = MedecinDao.retournerCollectionDesMedecins();
			try{
			if (medecin==null) {
	            throw new Exception("Medecin null");
	        }
			
			}
			catch(Exception e){
				System.out.println( e.getMessage());
			}
			return medecin;
	}
	
	
	/**
	 * @return
	 */
	public static HashMap<String,Medecin> retournerDictionnaireDesMedecins(){
		HashMap<String,Medecin> medecin = MedecinDao.retournerDictionnaireDesMedecins();
	
		try{
			if (medecin==null) {
	            throw new Exception("Medecin null");
	        }
			
			}
			catch(Exception e){
				System.out.println( e.getMessage());
			}
		
		return medecin;
	}
	
}
