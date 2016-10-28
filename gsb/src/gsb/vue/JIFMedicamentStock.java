package gsb.vue;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

import gsb.control.JIFMedicamentListeCtrl;
import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;

public class JIFMedicamentStock extends JInternalFrame{
	private JIFMedicamentListeCtrl ctrl;
	private JTextField JTCode;
	private JTextField JTStock;
	private JTextField JTNom;
	private JLabel JLCode;
	private JLabel JLStock;
	private JLabel JLNom;
	protected JPanel p;  
	protected JPanel pTexte;
	protected JPanel pBoutons;
	protected JTable table;
	
	protected JScrollPane scrollPane;
	protected JPanel pSaisie;
	protected MenuPrincipal fenetreContainer;
	private HashMap<String,Medicament> diccoMedicament;
	
	
	public JIFMedicamentStock(MenuPrincipal uneFenetreContainer){
		super();
		this.fenetreContainer = uneFenetreContainer;
		
		p = new JPanel();  // panneau principal de la fenêtre
        pTexte = new JPanel(new GridLayout(3,2));
	
        JLCode = new JLabel("Code  visiteur");
		//JLNom = new JLabel("Nom");
		//JLStock= new JLabel("Stock");
		JTCode = new JTextField();
		
		
		pTexte.add(JLCode);
        pTexte.add(JTCode);
        
        
        diccoMedicament = MedicamentDao.retournerDictionnaireDesMedicaments();
		int nbLignes= diccoMedicament.size();
		int i=0;
		String[][] data = new String[nbLignes][3] ;
		//for(Medecin unMedecin : lesMedecins){
		
		for (Map.Entry<String,Medicament> uneEntree : diccoMedicament.entrySet()){
			data[i][0] = uneEntree.getValue().getDepotLegal();
			data[i][1] = uneEntree.getValue().getNomCommercial();
			data[i][2] = uneEntree.getValue().getCodeFamille();

			i++;
			}
		String[] columnNames = {"Code", "Nom","Famille"};
		table = new JTable(data, columnNames);
		
		scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(400, 200));
		p.add(scrollPane);
		
		pSaisie = new JPanel(new GridLayout(1,2));
		pSaisie.add(JLCode);
		pSaisie.add(JTCode);
		
		p.add(pSaisie);
		
		
		Container contentPane = getContentPane();
        contentPane.add(p);
	
	
	}
	

	 public void remplirText(Medicament unMedicament) 	
	    {  // méthode qui permet de remplir les zones de texte à partir des valeurs passées en paramètres
	        JTCode.setText(unMedicament.getDepotLegal());        
	        JTNom.setText(unMedicament.getNomCommercial()); 
	        //JTStock.setText(unMedicament.getQu());
	        //offrir?
	        
	        
	     }

}
