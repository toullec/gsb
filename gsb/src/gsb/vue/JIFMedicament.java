package gsb.vue;

import java.awt.GridLayout;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JIFMedicament extends JInternalFrame{
	protected JPanel p;  
	protected JPanel pTexte;
	protected JPanel pBoutons;
	

	//protected JLabel JLcode;
	
	public JIFMedicament(){
		p = new JPanel();  // panneau principal de la fenêtre
        pBoutons = new JPanel();    // panneau supportant les boutons
        pTexte = new JPanel(new GridLayout(3,2));
	}

}
