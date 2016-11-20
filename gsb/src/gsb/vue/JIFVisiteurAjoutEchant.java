package gsb.vue;

import javax.swing.*;

import gsb.control.JIFVisiteurAjoutEchantCtrl;

import java.awt.*;

/**
 * @author Simon
 *
 */
public class JIFVisiteurAjoutEchant extends JInternalFrame{
	private JTextField codeVisiteurJT;
	private JTextField depotLegalJT;
	private JTextField quantiteJT;
	
	private JLabel codeVisiteurJL;
	private JLabel depotLegalJL;
	private JLabel quantiteJL;
	
	protected JPanel p;  
	protected JPanel pTexte;
	protected JButton ajouterBtn;
	protected MenuPrincipal fenetreContainer;
	protected JIFVisiteurAjoutEchantCtrl ctrl;

	
	/**
	 * @param uneFenetreContainer
	 */
	public JIFVisiteurAjoutEchant(MenuPrincipal uneFenetreContainer){
		super();
		this.fenetreContainer = uneFenetreContainer;
		this.ctrl = new JIFVisiteurAjoutEchantCtrl(this);
		p = new JPanel();
		pTexte = new JPanel(new GridLayout(4,2));
		ajouterBtn = new JButton("Ajouter une quantite");
		this.ajouterBtn.addActionListener(ctrl);
		
		depotLegalJT = new JTextField();
		codeVisiteurJT = new JTextField();
		quantiteJT = new JTextField();
		
		depotLegalJL = new JLabel("Depot legal:");
		codeVisiteurJL = new JLabel("Code visiteur:");
		quantiteJL = new JLabel("Quantite:");
		
		pTexte.add(codeVisiteurJL);
		pTexte.add(codeVisiteurJT);
		pTexte.add(depotLegalJL);
		pTexte.add(depotLegalJT);
		pTexte.add(quantiteJL);
		pTexte.add(quantiteJT);
		
		pTexte.add(ajouterBtn);
		
		p.add(pTexte);
		
        Container contentPane = getContentPane();
        contentPane.add(p);
	}
	
	
	/**
	 * @return le bouton ajouter
	 */
	public JButton getAjouterBtn(){
		return this.ajouterBtn;
	}
	
	
	/**
	 * @return le code visiteur
	 */
	public JTextField getCodeVisiteurJT(){
		return this.codeVisiteurJT ;
	}
	
	/**
	 * @return le depot legal
	 */
	public JTextField getDepotLegalJT(){
		return this.codeVisiteurJT;
		
	}
	
	/**
	 * @return la quantité 
	 */
	public JTextField getQuantiteJT(){
		return this.quantiteJT;
	}


}
