package gsb.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import gsb.vue.JIFVisiteListe;
import gsb.vue.JIFVisiteRecap;
import gsb.vue.MenuPrincipal;

/**
 * @author Simon
 *
 */
public class JIFVisiteListeCtrl implements ActionListener, ListSelectionListener {
	private JIFVisiteListe vueListe;
	private MenuPrincipal vue;

	public JIFVisiteListeCtrl(MenuPrincipal vue, JIFVisiteListe vueListe) {
		this.vueListe = vueListe;
		this.vue = vue;
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if (evt.getSource() == vueListe.getVisiteDetBtn()) {//clic sur la visite detaillee
			vue.ouvrirFenetre(new JIFVisiteRecap(vue, vueListe.getReferenceJT().getText()));

		} else if (evt.getSource() == vueListe.getEntrerBtn()) {//clic sur le bouton entrer
			//remplissage du tableau

			vueListe.remplirTab(vueListe.getCodeVisiteurJT().getText(), vueListe.getDateVisite().getText());
			
			vueListe.validate();//mise à jour du tableau

		}

	}

	public void valueChanged(ListSelectionEvent evt) {

		if (evt.getValueIsAdjusting()) {
			//remplissage du referenceJT lors du clic sur le tableau
			vueListe.getReferenceJT().setText((String) vueListe.getTable()
					.getValueAt(vueListe.getTable().getSelectedRow(), vueListe.getTable().getSelectedColumn()));

		}

	}
}
