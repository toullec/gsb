/*
 * Créé le 23 févr. 2015
 *
 * TODO Pour changer le modèle de ce fichier généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
package gsb.vue;

import gsb.control.JIFMedecinListeDicCtrl;
import gsb.modele.Medecin;
import gsb.modele.dao.MedecinDao;
import gsb.service.MedecinService;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;

/**
 * @author Isabelle 23 févr. 2015 TODO Pour changer le modèle de ce commentaire
 *         de type généré, allez à : Fenêtre - Préférences - Java - Style de
 *         code - Modèles de code
 */
public class JIFMedecinListeDic extends JInternalFrame {

	private static final long serialVersionUID = 1L;

	//private ArrayList<Medecin> lesMedecins;
	private HashMap<String,Medecin> diccoMedecin;
	protected JIFMedecinListeDicCtrl ctrl;


	protected JPanel p;
	protected JScrollPane scrollPane;
	protected JPanel pSaisie;
	protected JTextField JTcodeMedecin;
	protected JButton JBafficherFiche;
	protected MenuPrincipal fenetreContainer;
	protected JTable table;
	
	
	/**
	 * @param uneFenetreContainer
	 */
	public JIFMedecinListeDic(MenuPrincipal uneFenetreContainer) {
		
		

		fenetreContainer = uneFenetreContainer;
		ctrl = new JIFMedecinListeDicCtrl(this,uneFenetreContainer);
		// récupération des données Medecin dans la collection

		diccoMedecin = MedecinDao.retournerDictionnaireDesMedecins();
		int nbLignes= diccoMedecin.size();
		
		p = new JPanel(); // panneau principal de la fenêtre

		int i=0;
		String[][] data = new String[nbLignes][4] ;
	
		
		//tableau des médecins
		for (Map.Entry<String,Medecin> uneEntree : diccoMedecin.entrySet()){
			data[i][0] = uneEntree.getValue().getCodeMed();
			data[i][1] = uneEntree.getValue().getNom();
			data[i][2] = uneEntree.getValue().getPrenom();
			data[i][3] = uneEntree.getValue().getLaLocalite().getVille() ;
			
			i++;
			}
		String[] columnNames = {"Code", "Nom","Prenom","Ville"};
		table = new JTable(data, columnNames);
		ListSelectionModel listSelectionModel = table.getSelectionModel();
		listSelectionModel.addListSelectionListener(ctrl);
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
		JBafficherFiche.addActionListener(ctrl); // source d'évenement
		table.getSelectionModel().addListSelectionListener(table);
	}
	
	
	/**
	 * @return le bouton de la fiche
	 */
	public JButton getJBafficherFiche(){
		return this.JBafficherFiche;
	}
	
	/**
	 * @return code médecin
	 */
	public JTextField getJTcodeMedecin(){
		return this.JTcodeMedecin;
	}
	
	/**
	 * @return le dictionnaire de médecin
	 */
	public HashMap<String,Medecin> getDiccoMedecin(){
		return this.diccoMedecin;
	}
	
	/**
	 * @return
	 */
	public JTable getTable(){
		return this.table;
	}

	
	
}
