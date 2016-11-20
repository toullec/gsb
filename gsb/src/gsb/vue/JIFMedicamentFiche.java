package gsb.vue;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import gsb.modele.Medecin;
import gsb.modele.Medicament;
import gsb.modele.dao.MedecinDao;
import gsb.modele.dao.MedicamentDao;

/**
 * @author Simon
 *
 */
public class JIFMedicamentFiche  extends JInternalFrame{
	private static final long serialVersionUID =1L;
	private JTextField depotLegalJT;
	private JTextField nomJT;
	private JTextField compositionJT;
	private JTextField effetsJT;
	private JTextField contreIndicJT;
	private JTextField codeFamilleJT;
	private JTextField libelleFamilleJT;
	private JTextField prixEchantillonJT;
	
	private JLabel depotLegalJL;
	private JLabel nomJL;
	private JLabel compositionJL;
	private JLabel effetsJL;
	private JLabel contreIndicJL;
	private JLabel codeFamilleJL;
	private JLabel libelleFamilleJL;
	private JLabel prixEchantillonJL;
	
	protected JPanel p;  
	protected JPanel pTexte;
	protected MenuPrincipal fenetreContainer;
	
	private Medicament leMedicament;
	
	
	/**
	 * @param uneFenetreContainer
	 * @param code
	 */
	public JIFMedicamentFiche(MenuPrincipal uneFenetreContainer, String code){
		super();
		this.fenetreContainer = uneFenetreContainer;
		leMedicament = MedicamentDao.rechercher(code);//envoyer depuis le controleur le code
		
		depotLegalJT = new JTextField();
		nomJT = new JTextField();
		compositionJT = new JTextField();
		effetsJT = new JTextField();
		contreIndicJT = new JTextField();
		codeFamilleJT = new JTextField();
		libelleFamilleJT = new JTextField();
		
		depotLegalJL = new JLabel("Depot legal:");
		nomJL = new JLabel("Nom commercial:");
		compositionJL = new JLabel("Composition:");
		effetsJL = new JLabel("Effets:");
		contreIndicJL = new JLabel("Contre indication:");
		codeFamilleJL = new JLabel("Code famille:");
		libelleFamilleJL = new JLabel("Libelle famille:");
		prixEchantillonJL = new JLabel("Prix echantillon");
		prixEchantillonJT= new JTextField();
		
		p = new JPanel();
		pTexte = new JPanel(new GridLayout(8,2));
		
		pTexte.add(depotLegalJL);
		pTexte.add(depotLegalJT);
		pTexte.add(nomJL);
		pTexte.add(nomJT);
		pTexte.add(compositionJL);
		pTexte.add(compositionJT);
		pTexte.add(effetsJL);
		pTexte.add(effetsJT);
		pTexte.add(contreIndicJL);
		pTexte.add(contreIndicJT);
		pTexte.add(codeFamilleJL);
		pTexte.add(codeFamilleJT);
		pTexte.add(libelleFamilleJL);
		pTexte.add(libelleFamilleJT);
		pTexte.add(prixEchantillonJL);
		pTexte.add(prixEchantillonJT);//ajout des composants dans le panel texte
		
		
		p.add(pTexte);
		remplirText(leMedicament);
        Container contentPane = getContentPane();
        contentPane.add(p);
		
	}
	
	public void remplirText(Medicament unMedicament) 	
    {  // méthode qui permet de remplir les zones de texte à partir des valeurs passées en paramètres
        depotLegalJT.setText(unMedicament.getDepotLegal());        
        nomJT.setText(unMedicament.getNomCommercial()); 
        compositionJT.setText(unMedicament.getComposition());
        effetsJT.setText(unMedicament.getEffets());
        contreIndicJT.setText(unMedicament.getContreIndication());
        codeFamilleJT.setText(unMedicament.getCodeFamille());
        prixEchantillonJT.setText(""+unMedicament.getPrixEchantillon());
        libelleFamilleJT.setText(unMedicament.getLibelleFamille());
        
        
     }

}
