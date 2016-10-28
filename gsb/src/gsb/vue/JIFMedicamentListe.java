package gsb.vue;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;

import gsb.control.JIFMedicamentListeCtrl;
import gsb.modele.Medecin;
import gsb.modele.Medicament;
import gsb.modele.dao.MedecinDao;
import gsb.modele.dao.MedicamentDao;

public class JIFMedicamentListe extends JInternalFrame{
	private JButton ficheBtn;
	private JIFMedicamentListeCtrl ctrl;
	private JTextField JTCode;
	private JTextField JTFamille;
	private JTextField JTNom;
	private JLabel JLCode;
	private JLabel JLFamille;
	private JLabel JLNom;
	protected JPanel p;  
	protected JPanel pTexte;
	protected JPanel pBoutons;
	protected JTable table;
	
	protected JScrollPane scrollPane;
	protected JPanel pSaisie;
	protected MenuPrincipal fenetreContainer;
	private HashMap<String,Medicament> diccoMedicament;
	
	
	
	public JIFMedicamentListe(MenuPrincipal uneFenetreContainer){
		super();
		this.fenetreContainer = uneFenetreContainer;
		ctrl = new JIFMedicamentListeCtrl(fenetreContainer,this);
		p = new JPanel();  // panneau principal de la fenêtre
        pBoutons = new JPanel();    // panneau supportant les boutons
        pTexte = new JPanel(new GridLayout(3,2));
		ficheBtn = new JButton("Fiche medicament détaillé");
		pBoutons.add(ficheBtn);
		JLCode = new JLabel("Code");
		JLNom = new JLabel("Nom");
		JLFamille= new JLabel("Famille");
		JTCode = new JTextField();
		//JTNom = new JTextField("Nom");
		//JTFamille = new JTextField("Famille");
		
		//pTexte.add(JLCode);
       // pTexte.add(JTCode);
       // pTexte.add(JLNom);
       // pTexte.add(JTNom);
        //pTexte.add(JTFamille);
       // pTexte.add(JTFamille);
        
        
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
		
		pSaisie = new JPanel(new GridLayout(1,3));
		
		pSaisie.add(JLCode);
		pSaisie.add(JTCode);
		pSaisie.add(ficheBtn);
		p.add(pSaisie);
		
		this.attacherReactions();
		
		 p.add(pTexte);
         p.add(pBoutons);
         
         
         Container contentPane = getContentPane();
         contentPane.add(p);
		
	}
	
	 public void remplirText(Medicament unMedicament) 	
	    {  // méthode qui permet de remplir les zones de texte à partir des valeurs passées en paramètres
	        JTCode.setText(unMedicament.getDepotLegal());        
	        JTNom.setText(unMedicament.getNomCommercial()); 
	        JTFamille.setText(unMedicament.getCodeFamille());
	        
	        
	     }
	
	public void attacherReactions(){
		this.ficheBtn.addActionListener(ctrl);
		table.getSelectionModel().addListSelectionListener(table);
	}
	
	
	public JButton getFicheBtn(){
		return this.ficheBtn;
	}
	
	public HashMap<String,Medicament> getDiccoMedicament(){
		return this.diccoMedicament;
	}
	
	public JTable getTable(){
		return this.table;
	}
	
	
	public JTextField getJTCode(){
		return this.JTCode;
	}
	
}
