package gsb.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import gsb.modele.Medecin;
import gsb.vue.JIFMedecinFiche;
import gsb.vue.JIFMedecinListeDic;
import gsb.vue.MenuPrincipal;

/**
 * @author Simon
 *
 */
public class JIFMedecinListeDicCtrl implements ActionListener, ListSelectionListener{
	protected JIFMedecinListeDic vue;
	protected MenuPrincipal fenetreContainer;
	
	public JIFMedecinListeDicCtrl(JIFMedecinListeDic vue, MenuPrincipal fenetreContainer){
		this.vue=vue;
		this.fenetreContainer=fenetreContainer;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object source = arg0.getSource();
   		if (source == vue.getJBafficherFiche()){//clic sur le bouton fiche détaillee
   			if (vue.getDiccoMedecin().containsKey(vue.getJTcodeMedecin().getText())){
   	   			Medecin unMedecin = vue.getDiccoMedecin().get(vue.getJTcodeMedecin().getText());
   	   			fenetreContainer.ouvrirFenetre(new JIFMedecinFiche(unMedecin));//ouverture de la fenetre de la fiche
   			}
   		}
   		
	}

	@Override
	public void valueChanged(ListSelectionEvent evt) {


		if(evt.getValueIsAdjusting()){
			//la valeur sélectionné dans le tableau est affiché dans codeMedecinJT
   			vue.getJTcodeMedecin().setText((String)vue.getTable().getValueAt(vue.getTable().getSelectedRow(), vue.getTable().getSelectedColumn()));
   			
			
		}
		
	}
}
