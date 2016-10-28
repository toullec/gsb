package gsb.vue;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

import gsb.control.JIFVisiteMAJCtrl;



public class JIFVisiteMAJ extends JInternalFrame{
	private JButton btnModifier;
	private JLabel referenceJL;
	private JLabel dateVisiteJL;
	private JLabel commentaireJL;
	private JLabel matriculeJL;
	private JLabel codeMedecinJL;
	private JLabel depotLegalJL;
	private JLabel quantiteJL;
	
	private JTextField referenceJT;
	private JTextField dateVisiteJT;
	private JTextField commentaireJT;
	private JTextField matriculeJT;
	private JTextField codeMedecinJT;
	
	private JPanel pTexte;
	private JPanel p;
	private MenuPrincipal fenetreContainer;
	
	private JIFVisiteMAJCtrl ctrl;
	
	public JIFVisiteMAJ(MenuPrincipal fenetreContainer){
		ctrl = new JIFVisiteMAJCtrl(this);
		this.fenetreContainer=fenetreContainer;
		
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
        pTexte = new JPanel(new GridLayout(2,6));
        
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
        
        pTexte.add(btnModifier);
        
        p.add(pTexte);
        
        this.btnModifier.addActionListener(ctrl);
        Container contentPane = getContentPane();
        contentPane.add(p);
	
	}
	
	
	
	
	public JButton getBtnModifier(){
		return this.btnModifier;
	}
	
}
