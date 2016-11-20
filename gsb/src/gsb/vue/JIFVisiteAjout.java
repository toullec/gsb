package gsb.vue;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

import gsb.control.JIFVisiteAjoutCtrl;

/**
 * @author Simon
 *
 */
public class JIFVisiteAjout extends JInternalFrame{
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
	
	private JIFVisiteAjoutCtrl ctrl;
	
	/**
	 * @param fenetreContainer
	 */
	public JIFVisiteAjout(MenuPrincipal fenetreContainer){
		super();
		this.ctrl = new JIFVisiteAjoutCtrl(this,fenetreContainer);
		this.fenetreContainer = fenetreContainer;
		
		referenceJL = new JLabel("Reference:");
		dateVisiteJL = new JLabel("Date visite:");
		matriculeJL = new JLabel("Matricule:");
		commentaireJL = new JLabel("Commentaire:");
		codeMedecinJL = new JLabel("Code medecin:");
		
		referenceJT = new JTextField();
		dateVisiteJT = new JTextField();
		matriculeJT = new JTextField();
		commentaireJT = new JTextField();
		codeMedecinJT = new JTextField();
		btnAjouter = new JButton("Ajouter");
		
		p = new JPanel();  // panneau principal de la fenêtre
        pTexte = new JPanel(new GridLayout(6,2));
        
        pTexte.add(referenceJL);
        pTexte.add(referenceJT);
        pTexte.add(dateVisiteJL);
        pTexte.add(dateVisiteJT);
        pTexte.add(commentaireJL);
        pTexte.add(commentaireJT);
        pTexte.add(matriculeJL);
        pTexte.add(matriculeJT);
        pTexte.add(codeMedecinJL);
        pTexte.add(codeMedecinJT);//ajout des composants dans le panel texte
        
        pTexte.add(btnAjouter);
        
        p.add(pTexte);
        
        this.btnAjouter.addActionListener(ctrl);
        Container contentPane = getContentPane();
        contentPane.add(p);
		
	}
	
	/**
	 * @return la réference
	 */
	public JTextField getReferenceJT(){
		return this.referenceJT;
	}
	/**
	 * @return la date de la visite
	 */
	public JTextField getDateVisiteJT(){
		return this.dateVisiteJT;
	}
	
	/**
	 * @return le matricule
	 */
	public JTextField getMatriculeJT(){
		return this.matriculeJT;
	}
	
	/**
	 * @return le commentaire
	 */
	public JTextField getCommentaireJT(){
		return this.commentaireJT;
	}
	
	/**
	 * @return le code medeci
	 */
	public JTextField getCodeMedecinJT(){
		return this.codeMedecinJT;
	}
	
	/**
	 * @return le bouton ajouter
	 */
	public JButton getBtnAjouter(){
		return this.btnAjouter;
	}
}
