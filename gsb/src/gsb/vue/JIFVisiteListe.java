package gsb.vue;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.Map;

import javax.swing.*;


import gsb.modele.Visite;
import gsb.modele.dao.VisiteDao;

public class JIFVisiteListe extends JInternalFrame{
	private JLabel codeVisiteurJL;
	private JLabel dateVisiteJL;
	private JTextField codeVisiteurJT;
	private JTextField dateVisiteJT;
	protected JTable table;
	
	
	private JPanel pTexte;
	private JPanel p;
	private MenuPrincipal fenetreContainer;
	protected JPanel pSaisie;
	private HashMap<String,Visite> diccoVisite;
	protected JScrollPane scrollPane;
	
	public JIFVisiteListe(MenuPrincipal fenetreContainer){
		super();
		this.fenetreContainer=fenetreContainer;
		codeVisiteurJL = new JLabel("Code visiteur:");
		dateVisiteJL = new JLabel("Date visite:");
		codeVisiteurJT = new JTextField();
		dateVisiteJT = new JTextField();
		p = new JPanel();  // panneau principal de la fenêtre
        pTexte = new JPanel(new GridLayout(3,2));
	
        diccoVisite = VisiteDao.retournerDictionnaireDesVisites();
		int nbLignes= diccoVisite.size();
		int i=0;
		String[][] data = new String[nbLignes][3] ;
		//for(Medecin unMedecin : lesMedecins){
		
		
		for (Map.Entry<String,Visite> uneEntree : diccoVisite.entrySet()){
			data[i][0] = uneEntree.getValue().getReference();
			data[i][1] = uneEntree.getValue().getCodeMed();
			data[i][2] = uneEntree.getValue().getDate();

			i++;
			}
		String[] columnNames = {"Reference", "Code medecin","Lieu"};
		table = new JTable(data, columnNames);
		
		scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(400, 200));
		
		pSaisie = new JPanel(new GridLayout(2,2));
		pSaisie.add(codeVisiteurJL);
		pSaisie.add(codeVisiteurJT);
		pSaisie.add(dateVisiteJL);
		pSaisie.add(dateVisiteJT);
		
		p.add(pSaisie);
		p.add(scrollPane);
		
        
        Container contentPane = getContentPane();
        contentPane.add(p);
		
	}
}
