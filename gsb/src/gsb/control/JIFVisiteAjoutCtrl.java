package gsb.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gsb.vue.JIFVisiteAjout;

public class JIFVisiteAjoutCtrl implements ActionListener{
	private JIFVisiteAjout vue;
	
	public JIFVisiteAjoutCtrl(JIFVisiteAjout vue){
		this.vue=vue;
	}
	@Override
	public void actionPerformed(ActionEvent evt) {
		
		if(evt.getSource() ==vue.getBtnAjouter()){
			System.out.println("if vue.getBtnAjouter visiteAjoutCtrl");
		}
		
	}

}
