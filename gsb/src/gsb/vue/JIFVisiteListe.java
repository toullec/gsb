package gsb.vue;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

import gsb.control.JIFVisiteListeCtrl;
import gsb.modele.Visite;
import gsb.modele.dao.VisiteDao;

/**
 * @author Simon
 *
 */
public class JIFVisiteListe extends JInternalFrame {
	private JLabel codeVisiteurJL;
	private JLabel dateVisiteJL;
	private JTextField codeVisiteurJT;
	private JTextField dateVisiteJT;
	private JTextField referenceJT;
	private JLabel referenceJL;
	private JButton visiteDetBtn;
	private JButton entrerBtn;
	protected JTable table;

	private JPanel pTexte;
	private JPanel p;
	private MenuPrincipal fenetreContainer;
	private JIFVisiteListeCtrl ctrl;
	protected JPanel pSaisie;
	protected JPanel pSaisie2;
	private HashMap<String, Visite> diccoVisite;
	protected JScrollPane scrollPane;

	/**
	 * @param fenetreContainer
	 */
	public JIFVisiteListe(MenuPrincipal fenetreContainer) {
		super();
		this.fenetreContainer = fenetreContainer;
		ctrl = new JIFVisiteListeCtrl(fenetreContainer, this);
		codeVisiteurJL = new JLabel("Code visiteur:");
		dateVisiteJL = new JLabel("Date visite:");
		referenceJL = new JLabel("Reference:");
		codeVisiteurJT = new JTextField();
		referenceJT = new JTextField();
		dateVisiteJT = new JTextField();
		p = new JPanel(); // panneau principal de la fen�tre
		pTexte = new JPanel(new GridLayout(3, 2));
		visiteDetBtn = new JButton("Visite detaillee");
		this.entrerBtn = new JButton("Entrer");

		diccoVisite = VisiteDao.retournerDictionnaireDesVisites();
		int nbLignes = diccoVisite.size();
		int i = 0;
		String[][] data = new String[nbLignes][3];
		
		//tableau des visites
		for (Map.Entry<String, Visite> uneEntree : diccoVisite.entrySet()) {
			data[i][0] = uneEntree.getValue().getReference();
			data[i][1] = uneEntree.getValue().getMedecin().getCodeMed();
			data[i][2] = uneEntree.getValue().getDate();

			i++;
		}
		String[] columnNames = { "Reference", "Code medecin", "Date" };
		table = new JTable(data, columnNames);
		ListSelectionModel listSelectionModel = table.getSelectionModel();
		listSelectionModel.addListSelectionListener(ctrl);

		scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(400, 200));

		pSaisie = new JPanel(new GridLayout(3, 2));
		pSaisie2 = new JPanel(new GridLayout(1, 3));
		pSaisie.add(codeVisiteurJL);
		pSaisie.add(codeVisiteurJT);
		pSaisie.add(dateVisiteJL);
		pSaisie.add(dateVisiteJT);
		pSaisie.add(entrerBtn);

		pSaisie2.add(referenceJL);
		pSaisie2.add(referenceJT);
		pSaisie2.add(visiteDetBtn);

		p.add(pSaisie);
		p.add(scrollPane);
		p.add(pSaisie2);

		this.visiteDetBtn.addActionListener(ctrl);
		this.entrerBtn.addActionListener(ctrl);
		Container contentPane = getContentPane();
		contentPane.add(p);

	}

	/**
	 * @param visiteur
	 * @param date
	 */
	public void remplirTab(String visiteur, String date) {//remplissage du tableau
		
		if(date==null){
			diccoVisite = VisiteDao.rechercherHash(visiteur,date);
		}else{
			diccoVisite = VisiteDao.rechercherHash(visiteur);
			
		}
		
		scrollPane.removeAll();
		p.remove(table);
		p.remove(scrollPane);
		int nbLignes = diccoVisite.size();
		int i = 0;
		String[][] data = new String[nbLignes][3];
		// for(Medecin unMedecin : lesMedecins){

		for (Map.Entry<String, Visite> uneEntree : diccoVisite.entrySet()) {
			data[i][0] = uneEntree.getValue().getReference();
			data[i][1] = uneEntree.getValue().getCommentaire();
			data[i][2] = uneEntree.getValue().getDate();

			i++;
		}
		String[] columnNames = { "Reference", "Code medecin", "Date" };
		table = new JTable(data, columnNames);

		scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(400, 200));
		p.add(scrollPane);

		Container contentPane = getContentPane();
		contentPane.add(p);
	}

	/**
	 * @return le bouton de la fiche detaillee
	 */
	public JButton getVisiteDetBtn() {
		return this.visiteDetBtn;
	}

	/**
	 * @return le bouton entrer
	 */
	public JButton getEntrerBtn() {
		return this.entrerBtn;
	}

	/**
	 * @return la table
	 */
	public JTable getTable() {
		return this.table;
	}

	/**
	 * @return la reference
	 */
	public JTextField getReferenceJT() {
		return this.referenceJT;
	}

	/**
	 * @return le code visiteur
	 */
	public JTextField getCodeVisiteurJT() {
		return this.codeVisiteurJT;
	}

	/**
	 * @return la date de la visite
	 */
	public JTextField getDateVisite() {
		return this.dateVisiteJT;
	}
}
