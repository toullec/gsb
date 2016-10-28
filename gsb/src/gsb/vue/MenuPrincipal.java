/*
 * Créé le 22 févr. 2015
 *
 * TODO Pour changer le modèle de ce fichier généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
package gsb.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import gsb.control.*;

/**
 * @author Isabelle 22 févr. 2015 TODO Pour changer le modèle de ce commentaire
 *         de type généré, allez à : Fenêtre - Préférences - Java - Style de
 *         code - Modèles de code
 */
public class MenuPrincipal extends JFrame  {

	/**
	 * Commentaire pour <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 2591453837113855452L;

	protected JInternalFrame myJInternalFrame;
	protected JDesktopPane desktopPane;
	protected JMenuBar mbar;
	
	
	
	//protected JMenuItem medicFicheJM;
	//protected JMenuItem medicListeJM;
	
	
	protected JMenu mMedecins;
	protected JMenuItem medConsultationJMI;
	protected JMenuItem medListeJMI;
	protected JMenu mMedicaments;
	protected JMenuItem medicConsultationJMI;
	protected JMenuItem medicAjoutJMI;
	protected JMenuItem listeMedicJM;
	protected JMenuItem stockEchantillonJMI;
	protected JMenuItem ajoutEchantillonJMI;
	protected JMenu mVisites;
	protected JMenuItem visiteConsultationJMI;
	protected JMenuItem visiteAjoutJMI;
	protected JMenuItem visiteListeJMI;
	protected JMenuItem visiteRecapJMI;
	protected JMenuItem visiteMAJJMI;
	protected MenuPrincipalCtrl ctrl;
	

	/**
	 * 
	 */
	public MenuPrincipal() {
		ctrl = new MenuPrincipalCtrl(this);

		myJInternalFrame = new JInternalFrame(); // pour affichage d'une seule
													// JInternalFrame à la fois
		desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.gray);
		JPanel contentPane = (JPanel) this.getContentPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);

		setTitle("GSB");
		setSize(500, 400);

		// Ajout d'une barre de menus à la fenêtre
		mbar = new JMenuBar();
		
		mMedecins = new JMenu("Medecins");
		medConsultationJMI = new JMenuItem("Consultation Medecin");
		mMedecins.add(medConsultationJMI);
		medListeJMI = new JMenuItem("Liste Medecins");
		mMedecins.add(medListeJMI);

		mMedicaments = new JMenu("Medicaments");
		medicConsultationJMI = new JMenuItem("Consultation Medicament");
		mMedicaments.add(medicConsultationJMI);
		medicAjoutJMI = new JMenuItem("Ajout Medicaments");
		mMedicaments.add(medicAjoutJMI);
		listeMedicJM = new JMenuItem("Liste Medicament");
		mMedicaments.add(listeMedicJM);
		stockEchantillonJMI = new JMenuItem("Stock echantillon");
		mMedicaments.add(stockEchantillonJMI);
		ajoutEchantillonJMI = new JMenuItem("Ajout echantillon");
		mMedicaments.add(ajoutEchantillonJMI);
		
		mVisites = new JMenu("Visites");
		visiteConsultationJMI = new JMenuItem("Consultation Visite");
		mVisites.add(visiteConsultationJMI);
		visiteAjoutJMI = new JMenuItem("Ajout Visite");
		mVisites.add(visiteAjoutJMI);
		visiteListeJMI = new JMenuItem("Liste visite");
		mVisites.add(visiteListeJMI);
		visiteRecapJMI = new JMenuItem("Recapitulatif visite");
		mVisites.add(visiteRecapJMI);
		visiteMAJJMI = new JMenuItem("Mise à jour");
		mVisites.add(visiteMAJJMI);
		
		mbar.add(mMedecins);
		mbar.add(mMedicaments);
		mbar.add(mVisites);
		setJMenuBar(mbar);
		this.attacherReactions();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void attacherReactions(){
		medConsultationJMI.addActionListener(ctrl); // installation d'un écouteur d'action
		medListeJMI.addActionListener(ctrl);
		medicConsultationJMI.addActionListener(ctrl);
		medicAjoutJMI.addActionListener(ctrl);
		listeMedicJM.addActionListener(ctrl);
		stockEchantillonJMI.addActionListener(ctrl);
		ajoutEchantillonJMI.addActionListener(ctrl);
		visiteConsultationJMI.addActionListener(ctrl);
		visiteAjoutJMI.addActionListener(ctrl);
		visiteMAJJMI.addActionListener(ctrl);
		visiteListeJMI.addActionListener(ctrl);
		visiteRecapJMI.addActionListener(ctrl);
		
	}
	

	public void ouvrirFenetre(JInternalFrame uneFenetre) {
		myJInternalFrame.dispose(); // si une fenêtre était dejà affichée, elle
									// est libérée
		myJInternalFrame = uneFenetre;
		myJInternalFrame.setVisible(true);
		myJInternalFrame.setResizable(true);
		myJInternalFrame.setMaximizable(true);
		myJInternalFrame.setClosable(true);
		myJInternalFrame.setSize(480, 380);
		desktopPane.add(myJInternalFrame);
	}

}
