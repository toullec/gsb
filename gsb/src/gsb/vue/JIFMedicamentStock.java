package gsb.vue;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

import gsb.control.JIFMedicamentListeCtrl;
import gsb.control.JIFMedicamentStockCtrl;
import gsb.modele.Medicament;
import gsb.modele.Stocker;
import gsb.modele.dao.MedicamentDao;
import gsb.modele.dao.StockerDao;
import gsb.modele.dao.VisiteurDao;

/**
 * @author Simon
 *
 */
public class JIFMedicamentStock extends JInternalFrame {
	private JTextField JTCode;
	private JTextField JTStock;
	private JTextField JTMedic;
	private JTextField JTNom;
	private JLabel JLCode;
	private JLabel JLStock;
	private JLabel JLMedic;
	private JLabel JLNom;
	protected JPanel p;
	protected JPanel pTexte;
	protected JPanel pBoutons;
	protected JTable table;
	protected JButton entrerBtn;

	protected JScrollPane scrollPane;
	protected JPanel pSaisie;
	protected MenuPrincipal fenetreContainer;
	protected JIFMedicamentStockCtrl ctrl;
	private HashMap<String, Stocker> diccoStock;

	/*
	 * affiche le stock du visiteur que l'on a entr� dans le textfield
	 */
	public JIFMedicamentStock(MenuPrincipal uneFenetreContainer) {
		super();
		this.fenetreContainer = uneFenetreContainer;
		ctrl = new JIFMedicamentStockCtrl(fenetreContainer,this);
		p = new JPanel(); // panneau principal de la fen�tre
		pTexte = new JPanel(new GridLayout(3, 2));
		entrerBtn = new JButton("Entrer");

		JLCode = new JLabel("Code  visiteur");
		JLMedic = new JLabel("Code  Medicament");
		// JLNom = new JLabel("Nom");
		// JLStock= new JLabel("Stock");
		JTCode = new JTextField();
		JTMedic = new JTextField();
		pTexte.add(JLCode);
		pTexte.add(JTCode);

		
		

		scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(400, 200));
		//p.add(scrollPane);
		this.entrerBtn.addActionListener(ctrl);

		pSaisie = new JPanel(new GridLayout(1, 3));
		pSaisie.add(JLCode);
		pSaisie.add(JTCode);
		//pSaisie.add(JLMedic);
		//pSaisie.add(JTMedic);
		pSaisie.add(entrerBtn);

		p.add(pSaisie);

		Container contentPane = getContentPane();
		contentPane.add(p);

	}
	
	public void remplirTab(String visiteur){//rempli le tableau selon le visiteur
		diccoStock = StockerDao.retournerDictionnaireDesStocks(VisiteurDao.rechercher(visiteur));
		int nbLignes = diccoStock.size();
		String[] columnNames = { "Code", "Nom", "Stock" };
		String[][] data = new String[nbLignes][3];
		table = new JTable(data, columnNames);
		
		
		int i = 0;
		
		// for(Medecin unMedecin : lesMedecins){

		for (Map.Entry<String, Stocker> uneEntree : diccoStock.entrySet()) {
			data[i][0] = uneEntree.getValue().getVisiteur().getMatricule();
			data[i][1] = uneEntree.getValue().getMedicament().getDepotLegal();
			data[i][2] = "" + uneEntree.getValue().getQteStock();

			i++;
		}
		
		scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(400, 200));
		p.add(scrollPane);
		Container contentPane = getContentPane();
		contentPane.add(p);
		contentPane.repaint();
		contentPane.validate();
	}

	public void remplirText(Stocker unStock) { // m�thode qui permet de
														// remplir les zones de
														// texte � partir des
														// valeurs pass�es en
														// param�tres
		JTCode.setText(unStock.getVisiteur().getMatricule());
		JTNom.setText(unStock.getMedicament().getDepotLegal());
		JTStock.setText(""+unStock.getQteStock());
		

	}
	
	/**
	 * @return le bouton entrer
	 */
	public JButton getEntrerBtn(){
		return this.entrerBtn;
	}
	
	/**
	 * @return le code visiteur
	 */
	public JTextField getJTCode(){
		return this.JTCode;
	}
	
	/**
	 * @return le nom du medicament
	 */
	public JTextField getJTMedic(){
		return this.JTMedic;
	}

}
