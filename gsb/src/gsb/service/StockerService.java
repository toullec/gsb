package gsb.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import gsb.modele.Localite;
import gsb.modele.Stocker;
import gsb.modele.Visite;
import gsb.modele.Medicament;
import gsb.modele.Stocker;
import gsb.modele.Visiteur;
import gsb.modele.dao.ConnexionMySql;
import gsb.modele.dao.LocaliteDao;
import gsb.modele.dao.StockerDao;
import gsb.modele.dao.StockerDao;

/**
 * @author Simon
 *
 */
public class StockerService {
	/**
	 * @param visiteur
	 * @param medicament
	 * @param qteStock
	 * @return
	 */
	public static Stocker rechercherStock(Visiteur visiteur, Medicament medicament, int qteStock){
		Stocker stock = null;
		try {
			if (visiteur == null || medicament==null) {
				throw new Exception("Donnée obligatoire : code");
			}
			stock = StockerDao.rechercher(visiteur,medicament);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return stock;
		
	}

	
	/**
	 * @return
	 */
	public static ArrayList<Stocker> retournerCollectionDesStocks(){
		ArrayList<Stocker> Stocker = StockerDao.retournerCollectionDesStocks();
			try{
			if (Stocker==null) {
	            throw new Exception("Stocker null");
	        }
			
			}
			catch(Exception e){
				System.out.println( e.getMessage());
			}
			return Stocker;
	}
	
	
	/**
	 * @return
	 */
	public static HashMap<String,Stocker> retournerDictionnaireDesStockers(){
		HashMap<String,Stocker> stocker = StockerDao.retournerDictionnaireDesStocks();
	
		try{
			if (stocker==null) {
	            throw new Exception("Stocker null");
	        }
			
			}
			catch(Exception e){
				System.out.println( e.getMessage());
			}
		
		return stocker;
	}
	
	
	
}
