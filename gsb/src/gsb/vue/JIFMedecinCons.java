/*
 * Créé le 17 nov. 2014
 *
 * TODO Pour changer le modèle de ce fichier généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
package gsb.vue;

import gsb.control.JIFMedecinConsCtrl;
import gsb.modele.Medecin;
import gsb.modele.dao.MedecinDao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 * @author Isabelle
 * 17 nov. 2014
 * TODO Pour changer le modèle de ce commentaire de type généré, allez à :
 * Fenêtre - Préférences - Java - Style de code - Modèles de code
 */
public class JIFMedecinCons extends JIFMedecin {
	
	/**
	 * Commentaire pour <code>serialVersionUID</code>
	 */
	private static final long serialVersionUID = 1L;
	private JButton premier;
    private JButton suivant;
    private JButton precedent; 
    private JButton dernier; 
    private ArrayList<Medecin> lesMedecins;
	private int indiceEnCours;
	private JIFMedecinConsCtrl ctrl;
        
    public JIFMedecinCons() {
        super();
        ctrl = new JIFMedecinConsCtrl(this);
        premier = new JButton("Premier");
        pBoutons.add(premier);
        suivant = new JButton("Suivant");
        pBoutons.add(suivant);
        precedent = new JButton("Precedent");
        pBoutons.add(precedent);
        dernier = new JButton("Dernier");
        pBoutons.add(dernier);
        // déclaration des sources d'évènements
       
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setTitle("Consultation données Medecin");
        
        // récupération des données Medecin dans la collection
        lesMedecins = MedecinDao.retournerCollectionDesMedecins();
        indiceEnCours = 0;
        
        if (lesMedecins.size()!=0){ // si collection non vide, affichage des données du premier Medecin
        	Medecin leMedecin = lesMedecins.get(0);
	    	remplirText(leMedecin);
	    	}
        
        // ajout d'un écouteur d'évènement pour la fermeture de la fenêtre
        addInternalFrameListener(new InternalFrameAdapter(){
            public void  internalFrameClosing(InternalFrameEvent e) {
                          //le code que tu veux exécuter à la fermeture de la JInternalFrame
            }
        });
        
        this.attacherReactions();
    }
	
    
    public void attacherReactions(){
    	 premier.addActionListener(ctrl);
        suivant.addActionListener(ctrl);
        precedent.addActionListener(ctrl);
        dernier.addActionListener(ctrl);
    }
    
    public JButton getPremier(){
    	return this.premier;
    }
    
    public JButton getSuivant(){
    	return this.suivant;
    }
    
    public JButton getPrecedent(){
    	return this.precedent;
    }
    
    public JButton getDernier(){
    	return this.dernier;
    }
    
    public ArrayList<Medecin> getLesMedecins(){
    	return this.lesMedecins;
    }

}
