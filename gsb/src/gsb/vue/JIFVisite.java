package gsb.vue;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.*;

import javax.swing.*;

/**
 * @author Simon
 *
 */
public class JIFVisite extends JInternalFrame {
	protected JPanel p;
	protected JPanel pTexte;
	protected JPanel pBoutons;

	protected JLabel JLReference;
	protected JLabel JLDateVisite;
	protected JLabel JLCommentaire;
	protected JLabel JLMatricule;
	protected JLabel JLCodeMedecin;

	protected JTextField JTReference;
	protected JTextField JTDateVisite;
	protected JTextField JTCommentaire;
	protected JTextField JTMatricule;
	protected JTextField JTCodeMedecin;

	public JIFVisite() {
		p = new JPanel();
		pBoutons = new JPanel(); // panneau supportant les boutons
		pTexte = new JPanel(new GridLayout(9, 2));
		
		JLReference = new JLabel("Reference:");
		JLDateVisite = new JLabel("Date visite:");
		JLCommentaire = new JLabel("Commentaire:");
		JLMatricule = new JLabel("Matricule");
		JLCodeMedecin = new JLabel("Medecin");
		
		
		JTReference = new JTextField(20);
        JTReference.setMaximumSize(JTReference.getPreferredSize());
        JTDateVisite = new JTextField();
        JTCommentaire = new JTextField();
        JTMatricule = new JTextField();    
        JTCodeMedecin = new JTextField();
		
		
		pTexte.add(JLReference);
		pTexte.add(JTReference);
		pTexte.add(JLDateVisite);
		pTexte.add(JTDateVisite);
		pTexte.add(JLCommentaire);
		pTexte.add(JTCommentaire);
		pTexte.add(JLMatricule);
		pTexte.add(JTMatricule);
		pTexte.add(JLCodeMedecin);
		pTexte.add(JTCodeMedecin);
		
		
		p.add(pTexte);
		p.add(pBoutons);
		Container contentPane = getContentPane();
		contentPane.add(p);
	}

}
