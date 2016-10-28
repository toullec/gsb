package gsb.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gsb.modele.Medecin;
import gsb.modele.dao.MedecinDao;
import gsb.vue.JIFMedecinFiche;
import gsb.vue.JIFMedecinListeCol;
import gsb.vue.MenuPrincipal;

public class JIFMedecinListeColCtrl implements ActionListener{
	protected JIFMedecinListeCol vue;
	protected MenuPrincipal fenetreContainer;
	
	public JIFMedecinListeColCtrl(JIFMedecinListeCol vue,MenuPrincipal fenetreContainer){
		this.vue=vue;
		this.fenetreContainer=fenetreContainer;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object source = arg0.getSource();
   		if (source == vue.getJBafficherFiche()){
   			Medecin unMedecin = MedecinDao.rechercher(vue.getJTcodeMedecin().getText());
   			if (unMedecin!=null){
   	   			fenetreContainer.ouvrirFenetre(new JIFMedecinFiche(unMedecin));
   			}
   		}	
	}
}
