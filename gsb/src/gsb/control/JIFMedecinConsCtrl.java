package gsb.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gsb.modele.Medecin;
import gsb.vue.JIFMedecinCons;

/**
 * @author Simon
 *
 */
public class JIFMedecinConsCtrl implements ActionListener {
	protected JIFMedecinCons vue;

	public JIFMedecinConsCtrl(JIFMedecinCons vue) {
		this.vue = vue;
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		Object source = evt.getSource();
		int indiceEnCours = 0;
		if (source == vue.getPremier()) {//premier medecin de la liste

			Medecin leMedecin = vue.getLesMedecins().get(indiceEnCours);
			vue.remplirText(leMedecin);
		} else if (source == vue.getDernier()) {//dernier medecin de la liste
			indiceEnCours = vue.getLesMedecins().size() - 1;
			Medecin leMedecin = vue.getLesMedecins().get(indiceEnCours);
			vue.remplirText(leMedecin);
		} else if (source == vue.getPrecedent()) {// pr�cedent m�decin
			if (indiceEnCours > 0)
				indiceEnCours = indiceEnCours - 1;
			Medecin leMedecin = vue.getLesMedecins().get(indiceEnCours);
			vue.remplirText(leMedecin);
		} else if (source == vue.getSuivant()) {//m�decin suivant
			if (indiceEnCours < (vue.getLesMedecins().size() - 1))
				indiceEnCours = indiceEnCours + 1;
			Medecin leMedecin = vue.getLesMedecins().get(indiceEnCours);
			vue.remplirText(leMedecin);
		}

	}

}
