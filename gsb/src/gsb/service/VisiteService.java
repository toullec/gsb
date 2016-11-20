package gsb.service;

import java.util.ArrayList;
import java.util.HashMap;

import gsb.modele.Visite;
import gsb.modele.Visite;
import gsb.modele.Visiteur;
import gsb.modele.dao.VisiteDao;
import gsb.modele.dao.VisiteDao;

/**
 * @author Simon
 *
 */
public class VisiteService {

	/**
	 * @param reference
	 * @return
	 */
	public static Visite rechercherVisite(String reference){
		Visite uneVisite = null;
		try{
			if(reference==null){
				throw new Exception("Donne obligatoire : reference");
			}
			uneVisite = VisiteDao.rechercher(reference);	
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		return uneVisite;
	}	
	
	
	/**
	 * @return
	 */
	public static ArrayList<Visite> retournerCollectionDesVisites(){
		ArrayList<Visite> visite = VisiteDao.retournerCollectionDesVisites();
			try{
			if (visite==null) {
	            throw new Exception("Visite null");
	        }
			
			}
			catch(Exception e){
				System.out.println( e.getMessage());
			}
			return visite;
	}
	
	
	/**
	 * @return
	 */
	public static HashMap<String,Visite> retournerDictionnaireDesVisites(){
		HashMap<String,Visite> visite = VisiteDao.retournerDictionnaireDesVisites();
	
		try{
			if (visite==null) {
	            throw new Exception("Visite null");
	        }
			
			}
			catch(Exception e){
				System.out.println( e.getMessage());
			}
		
		return visite;
	}
	
}
