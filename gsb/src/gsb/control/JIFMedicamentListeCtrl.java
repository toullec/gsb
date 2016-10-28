package gsb.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gsb.vue.JIFMedecinCons;
import gsb.vue.JIFMedicamentFiche;
import gsb.vue.JIFMedicamentListe;
import gsb.vue.MenuPrincipal;

public class JIFMedicamentListeCtrl implements ActionListener {
	private JIFMedicamentListe vueListe;
	private MenuPrincipal vue;
	
	public JIFMedicamentListeCtrl(MenuPrincipal vue,JIFMedicamentListe vueListe){
		this.vue=vue;
		this.vueListe=vueListe;
	}
	@Override
	public void actionPerformed(ActionEvent evt) {
	
		if(evt.getSource() == vueListe.getTable()){
   			vueListe.getJTCode().setText((String)vueListe.getTable().getValueAt(vueListe.getTable().getSelectedRow(), vueListe.getTable().getSelectedColumn()));
   			
   		}
		if(evt.getSource() == vueListe.getFicheBtn()){
			System.out.println("if getFicheBtn");
			vue.ouvrirFenetre(new JIFMedicamentFiche(vue,vueListe.getJTCode().getText()));
			
		}
		
	}

}
