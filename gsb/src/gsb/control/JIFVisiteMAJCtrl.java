package gsb.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gsb.modele.Medicament;
import gsb.modele.Stocker;
import gsb.modele.Visiteur;
import gsb.modele.dao.MedicamentDao;
import gsb.modele.dao.OffreDao;
import gsb.modele.dao.StockerDao;
import gsb.modele.dao.VisiteDao;
import gsb.modele.dao.VisiteurDao;
import gsb.vue.JIFVisiteMAJ;

/**
 * @author Simon
 *
 */
public class JIFVisiteMAJCtrl implements ActionListener {
	private JIFVisiteMAJ vue;

	public JIFVisiteMAJCtrl(JIFVisiteMAJ vue) {
		this.vue = vue;
	}

	@Override
	public void actionPerformed(ActionEvent evt) {

		if (evt.getSource() == vue.getBtnModifier()) {//clic sur le bouton modifier
			VisiteDao.modifierVisite(vue.getCommentaireJT().getText(),
					vue.getReferenceCB().getSelectedItem().toString());//modification du commentaire dans la visite

			if (vue.getMedic1CB().getSelectedItem().toString() != "") {
				OffreDao.insererOffre(vue.getReferenceCB().getSelectedItem().toString(), vue.getMedic1CB().getSelectedItem().toString(),
						"1");//insertion d'une offre avec le medicament selectionn
				
				Visiteur visiteur =VisiteurDao.rechercher(vue.getMatriculeJT().getText());
				Medicament medicament = MedicamentDao.rechercher(vue.getMedic1CB().getSelectedItem().toString());
				Stocker stock =StockerDao.rechercher(visiteur,medicament);
				if(stock.getQteStock()!=0){
					
					int modif = stock.getQteStock()-1;
					stock.setQteStock(modif);
				}
			}

			if (vue.getMedic2CB().getSelectedItem().toString() != "") {//si le médicament est sélectionné
				OffreDao.insererOffre(vue.getReferenceCB().getSelectedItem().toString(), vue.getMedic2CB().getSelectedItem().toString(),
						"1");
				//insertion d'une offre avec le médicament sélectionné
				Visiteur visiteur =VisiteurDao.rechercher(vue.getMatriculeJT().getText());
				Medicament medicament = MedicamentDao.rechercher(vue.getMedic2CB().getSelectedItem().toString());
				Stocker stock =StockerDao.rechercher(visiteur,medicament);
				if(stock.getQteStock()!=0){
					
					int modif = stock.getQteStock()-1;
					stock.setQteStock(modif);
				}
				

			}
		}
		
		if (evt.getSource() == vue.getReferenceCB()) {//clic sur la liste de reference des visites
				vue.remplirTexte(vue.getReferenceCB().getSelectedItem().toString());//les champs sont complétés
				
				vue.validate();//MAJ des champs complétés
			}

			

	}
}
