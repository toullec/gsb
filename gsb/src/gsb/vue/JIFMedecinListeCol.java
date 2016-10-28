/*
 * Créé le 3 mars 2015
 *
 * TODO Pour changer le modèle de ce fichier généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
package gsb.vue;

import gsb.control.JIFMedecinListeColCtrl;
import gsb.modele.Medecin;
import gsb.modele.dao.MedecinDao;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 * @author Isabelle
 * 3 mars 2015
 * TODO Pour changer le modèle de ce commentaire de type généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
public class JIFMedecinListeCol extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	private ArrayList<Medecin> lesMedecins;


	protected JPanel p;
	protected JScrollPane scrollPane;
	protected JPanel pSaisie;
	protected JTextField JTcodeMedecin;
	protected JButton JBafficherFiche;
	protected MenuPrincipal fenetreContainer;
	protected JIFMedecinListeColCtrl ctrl;

	public JIFMedecinListeCol(MenuPrincipal uneFenetreContainer) {
		
		fenetreContainer = uneFenetreContainer;
		// récupération des données Medecin dans la collection
		ctrl = new JIFMedecinListeColCtrl(this,uneFenetreContainer);
		lesMedecins = MedecinDao.retournerCollectionDesMedecins();

		int nbLignes = lesMedecins.size();

		JTable table;
		
		

		p = new JPanel(); // panneau principal de la fenêtre

		int i=0;
		String[][] data = new String[nbLignes][4] ;
		for(Medecin unMedecin : lesMedecins){
			data[i][0] = unMedecin.getCodeMed();
			data[i][1] = unMedecin.getNom();
			data[i][2] = unMedecin.getPrenom();
			data[i][3] = unMedecin.getLaLocalite().getVille() ;
			i++;
			}
		String[] columnNames = {"Code", "Nom","Prenom","Ville"};
		table = new JTable(data, columnNames);
		
		scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(400, 200));
		p.add(scrollPane);
		
		pSaisie = new JPanel();
		JTcodeMedecin = new JTextField(20);
		JTcodeMedecin.setMaximumSize(JTcodeMedecin.getPreferredSize());
		JBafficherFiche = new JButton("Afficher Fiche médecin");
		
		pSaisie.add(JTcodeMedecin);
		pSaisie.add(JBafficherFiche);
		p.add(pSaisie);
		this.attacherReactions();
		// mise en forme de la fenêtre
		Container contentPane = getContentPane();
		contentPane.add(p);
	}

	public void attacherReactions(){
		JBafficherFiche.addActionListener(ctrl);
	}
	
	public JButton getJBafficherFiche(){
		return this.JBafficherFiche;
	}
	
	public JTextField getJTcodeMedecin(){
		return this.JTcodeMedecin;
	}
	
}
