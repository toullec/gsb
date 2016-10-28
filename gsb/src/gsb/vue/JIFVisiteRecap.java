package gsb.vue;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import gsb.control.JIFVisiteAjoutCtrl;

public class JIFVisiteRecap extends JInternalFrame{
	private JButton btnAjouter;
	private JLabel referenceJL;
	private JLabel dateVisiteJL;
	private JLabel commentaireJL;
	private JLabel matriculeJL;
	private JLabel codeMedecinJL;
	
	private JTextField referenceJT;
	private JTextField dateVisiteJT;
	private JTextField commentaireJT;
	private JTextField matriculeJT;
	private JTextField codeMedecinJT;
	
	private JPanel pTexte;
	private JPanel p;
	private MenuPrincipal fenetreContainer;
	
	
	
	public JIFVisiteRecap(MenuPrincipal fenetreContainer){
		super();
		
this.fenetreContainer = fenetreContainer;
		
		referenceJL = new JLabel("Reference:");
		dateVisiteJL = new JLabel("Date visite");
		matriculeJL = new JLabel("Matricule");
		commentaireJL = new JLabel("Commentaire");
		codeMedecinJL = new JLabel("Code medecin");
		
		referenceJT = new JTextField();
		dateVisiteJT = new JTextField();
		matriculeJT = new JTextField();
		commentaireJT = new JTextField();
		codeMedecinJT = new JTextField();
		
		p = new JPanel();  // panneau principal de la fenêtre
        pTexte = new JPanel(new GridLayout(6,2));
        
        pTexte.add(referenceJL);
        pTexte.add(referenceJT);
        pTexte.add(dateVisiteJL);
        pTexte.add(dateVisiteJT);
        pTexte.add(matriculeJL);
        pTexte.add(matriculeJT);
        pTexte.add(commentaireJL);
        pTexte.add(commentaireJT);
        pTexte.add(codeMedecinJL);
        pTexte.add(codeMedecinJT);
        
        
        
        p.add(pTexte);
        
        
        Container contentPane = getContentPane();
        contentPane.add(p);
	}
}
