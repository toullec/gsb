package gsb.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import gsb.modele.dao.MedicamentDao;
import gsb.vue.JIFMedecinCons;
import gsb.vue.JIFMedicamentFiche;
import gsb.vue.JIFMedicamentListe;
import gsb.vue.MenuPrincipal;

/**
 * @author Simon
 *
 */
public class JIFMedicamentListeCtrl implements ActionListener,ListSelectionListener {
	private JIFMedicamentListe vueListe;
	private MenuPrincipal vue;
	
	public JIFMedicamentListeCtrl(MenuPrincipal vue,JIFMedicamentListe vueListe){
		this.vue=vue;
		this.vueListe=vueListe;
	}
	@Override
	public void actionPerformed(ActionEvent evt) {
	
		
		if(evt.getSource() == vueListe.getFicheBtn()){//clic sur le bouton fiche detaillee
			if(MedicamentDao.rechercher(vueListe.getJTCode().getText()) == null){
				JOptionPane jop3 = new JOptionPane();
				jop3.showMessageDialog(null, "Code inconnu", "Erreur", JOptionPane.ERROR_MESSAGE);

				
			}else{
				vue.ouvrirFenetre(new JIFMedicamentFiche(vue,vueListe.getJTCode().getText()));// ouverture de la fenetre
				
			}
			
			
		}
		
	}
	
	public void valueChanged(ListSelectionEvent evt) {


		if(evt.getValueIsAdjusting()){
			//on clic sur le tableau et la valeur s'affiche dans le codeJT
   			vueListe.getJTCode().setText((String)vueListe.getTable().getValueAt(vueListe.getTable().getSelectedRow(), vueListe.getTable().getSelectedColumn()));
   			
			
		}
		
	}

}
