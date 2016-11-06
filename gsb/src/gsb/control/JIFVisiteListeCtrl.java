package gsb.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import gsb.vue.JIFVisiteListe;
import gsb.vue.JIFVisiteRecap;
import gsb.vue.MenuPrincipal;

public class JIFVisiteListeCtrl implements ActionListener,ListSelectionListener{
	private JIFVisiteListe vueListe;
	private MenuPrincipal vue;
	
	public JIFVisiteListeCtrl(MenuPrincipal vue,JIFVisiteListe vueListe){
		this.vueListe=vueListe;
		this.vue=vue;
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {
		if(evt.getSource() == vueListe.getVisiteDetBtn()){
			vue.ouvrirFenetre(new JIFVisiteRecap(vue,vueListe.getReferenceJT().getText()));
			
		}
		
	}
	
	
	public void valueChanged(ListSelectionEvent evt) {


		if(evt.getValueIsAdjusting()){
			System.out.println("vue.getTable()");
   			vueListe.getReferenceJT().setText((String)vueListe.getTable().getValueAt(vueListe.getTable().getSelectedRow(), vueListe.getTable().getSelectedColumn()));
   			
			
		}
		
	}
}
