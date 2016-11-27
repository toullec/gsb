package gsb.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gsb.modele.dao.VisiteDao;
import gsb.vue.JIFVisiteAjout;
import gsb.vue.JIFVisiteMAJ;
import gsb.vue.MenuPrincipal;

/**
 * @author Simon
 *
 */
public class JIFVisiteAjoutCtrl implements ActionListener{
	private JIFVisiteAjout vueAjout;
	protected MenuPrincipal fenetreContainer;
	
	public JIFVisiteAjoutCtrl(JIFVisiteAjout vueAjout, MenuPrincipal fenetreContainer){
		this.vueAjout=vueAjout;
		this.fenetreContainer=fenetreContainer;
	}
	@Override
	public void actionPerformed(ActionEvent evt) {
		
		if(evt.getSource() ==vueAjout.getBtnAjouter()){//clic sur le bouton ajouter
			//insertion d'une visite
			VisiteDao.ajouterVisite(vueAjout.getReferenceJT().getText(),vueAjout.getDateVisiteJT().getText()
					,vueAjout.getCommentaireJT().getText(),vueAjout.getMatriculeJT().getText(),vueAjout.getMedecinCB().toString());
			
		}
		
	}

}
