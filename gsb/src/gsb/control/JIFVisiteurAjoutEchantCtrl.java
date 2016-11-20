package gsb.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gsb.modele.dao.MedicamentDao;
import gsb.modele.dao.OffreDao;
import gsb.modele.dao.StockerDao;
import gsb.modele.dao.VisiteurDao;
import gsb.vue.JIFVisiteurAjoutEchant;

/**
 * @author Simon
 *
 */
public class JIFVisiteurAjoutEchantCtrl implements ActionListener{
	private JIFVisiteurAjoutEchant vue;
	
	public JIFVisiteurAjoutEchantCtrl(JIFVisiteurAjoutEchant vue){
		this.vue =vue;
	}
	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource()== vue.getAjouterBtn()){//clic sur le bouton ajouter
			//insertion d'un stock
			StockerDao.inserer(VisiteurDao.rechercher(vue.getCodeVisiteurJT().getText()),MedicamentDao.rechercher(vue.getDepotLegalJT().getText()),vue.getQuantiteJT().getText());
		}
		
	}

	
}
