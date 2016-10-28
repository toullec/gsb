package gsb.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gsb.modele.dao.OffreDao;
import gsb.vue.JIFVisiteurAjoutEchant;

public class JIFVisiteurAjoutEchantCtrl implements ActionListener{
	private JIFVisiteurAjoutEchant vue;
	
	public JIFVisiteurAjoutEchantCtrl(JIFVisiteurAjoutEchant vue){
		this.vue =vue;
	}
	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource()== vue.getAjouterBtn()){
			OffreDao.inserer(vue.getCodeVisiteurJT().getText(),vue.getDepotLegalJT().getText(),vue.getQuantiteJT().getText());
		}
		
	}

	
}
