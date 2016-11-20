package gsb.vue;

import java.awt.Container;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

import gsb.control.JIFVisiteMAJCtrl;
import gsb.modele.Medicament;
import gsb.modele.Visite;
import gsb.modele.dao.MedicamentDao;
import gsb.modele.dao.VisiteDao;

/**
 * @author Simon
 *
 */
public class JIFVisiteMAJ extends JInternalFrame {
	private JButton btnModifier;
	private JLabel referenceJL;
	private JLabel dateVisiteJL;
	private JLabel commentaireJL;
	private JLabel matriculeJL;
	private JLabel codeMedecinJL;
	private JLabel depotLegalJL;
	private JLabel quantiteJL;
	private JLabel medic1JL;
	private JLabel medic2JL;

	private JTextField referenceJT;
	private JTextField dateVisiteJT;
	private JTextField commentaireJT;
	private JTextField matriculeJT;
	private JTextField codeMedecinJT;
	private JComboBox<String> referenceCB;
	private JComboBox<String> medic1CB;
	private JComboBox<String> medic2CB;

	private JPanel pTexte;
	private JPanel p;
	private MenuPrincipal fenetreContainer;
	private ArrayList<Visite> diccoVisite;
	private ArrayList<Medicament> diccoMedicament;

	private JIFVisiteMAJCtrl ctrl;

	public JIFVisiteMAJ() {
		ctrl = new JIFVisiteMAJCtrl(this);
		this.fenetreContainer = fenetreContainer;
		this.diccoVisite = VisiteDao.retournerCollectionDesVisites();
		this.referenceCB = new JComboBox<String>();
		this.medic1CB = new JComboBox<String>();
		this.medic2CB = new JComboBox<String>();
		this.diccoMedicament = MedicamentDao.retournerCollectionDesMedicaments();
		this.medic1CB.addItem("");
		this.medic2CB.addItem("");
		
		for (Medicament medicament : diccoMedicament) {//liste des medicaments

			medic1CB.addItem(medicament.getDepotLegal());
		}

		for (Medicament medicament : diccoMedicament) {// 2eme liste des medicaments

			medic2CB.addItem(medicament.getDepotLegal());
		}
		for (Visite visite : diccoVisite) {//liste de références

			referenceCB.addItem(visite.getReference());
		}

		referenceCB.addActionListener(ctrl);
		
		referenceJL = new JLabel("Reference:");
		dateVisiteJL = new JLabel("Date visite");
		matriculeJL = new JLabel("Matricule");
		commentaireJL = new JLabel("Commentaire");
		codeMedecinJL = new JLabel("Code medecin");
		medic1JL = new JLabel("Medicament 1:");
		medic2JL = new JLabel("Medicament 2:");

		referenceJT = new JTextField();
		dateVisiteJT = new JTextField();
		matriculeJT = new JTextField();
		commentaireJT = new JTextField();
		codeMedecinJT = new JTextField();
		btnModifier = new JButton("Modifier");

		p = new JPanel(); // panneau principal de la fenêtre
		pTexte = new JPanel(new GridLayout(8, 2));
		

		pTexte.add(referenceJL);
		// pTexte.add(referenceJT);
		pTexte.add(referenceCB);
		pTexte.add(dateVisiteJL);
		pTexte.add(dateVisiteJT);
		pTexte.add(matriculeJL);
		pTexte.add(matriculeJT);
		pTexte.add(commentaireJL);
		pTexte.add(commentaireJT);
		pTexte.add(codeMedecinJL);
		pTexte.add(codeMedecinJT);
		pTexte.add(medic1JL);
		pTexte.add(medic1CB);
		pTexte.add(medic2JL);
		pTexte.add(medic2CB);
		pTexte.add(btnModifier);//ajout des composants dans le panel texte

		p.add(pTexte);
		
		this.btnModifier.addActionListener(ctrl);
		Container contentPane = getContentPane();
		contentPane.add(p);

	}

	/**
	 * @param reference
	 */
	public void remplirTexte(String reference) {
		Visite visite = VisiteDao.rechercher(reference);
		dateVisiteJT.setText(visite.getDate());
		matriculeJT.setText(visite.getMatricule().getMatricule());
		commentaireJT.setText(visite.getCommentaire());
		codeMedecinJT.setText(visite.getMedecin().getCodeMed());
	}

	/**
	 * @return bouton modifier
	 */
	public JButton getBtnModifier() {
		return this.btnModifier;
	}

	/**
	 * @return commentaire
	 */
	public JTextField getCommentaireJT() {
		return this.commentaireJT;
	}
	
	/**
	 * @return le matricule
	 */
	public JTextField getMatriculeJT(){
		return this.matriculeJT;
	}
	

	/**
	 * @return la reference
	 */
	public JComboBox getReferenceCB() {
		return this.referenceCB;
	}
	
	/**
	 * @return medicament 1
	 */
	public JComboBox getMedic1CB(){
		return this.medic1CB;
	}
	
	
	/**
	 * @return medicament 2
	 */
	public JComboBox getMedic2CB(){
		return this.medic2CB;
	}
}
