package gsb.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import gsb.vue.*;

public class MenuPrincipalCtrl implements ActionListener {
	protected MenuPrincipal vue;

	public MenuPrincipalCtrl(MenuPrincipal vue) {
		this.vue = vue;
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Raccord de méthode auto-généré
		if (evt.getSource() instanceof JMenuItem) {
			String ChoixOption = evt.getActionCommand();

			if (ChoixOption.equals("Consultation Medecin")) {
				// Creation d'une sous-fenêtre
				vue.ouvrirFenetre(new JIFMedecinCons());

			} else if (ChoixOption.equals("Liste Medecins")) {
				vue.ouvrirFenetre(new JIFMedecinListeDic(vue));
			}

			else if (ChoixOption.equals("Liste Medecins")) {
				vue.ouvrirFenetre(new JIFMedecinListeDic(vue));
			}

			else if (ChoixOption.equals("Consultation Medicament")) {
				vue.ouvrirFenetre(new JIFMedecinListeDic(vue));
			}

			else if (ChoixOption.equals("Liste Medicament")) {
				System.out.println("menuprincCtrl if liste medic");
				vue.ouvrirFenetre(new JIFMedicamentListe(vue));
			}

			else if (ChoixOption.equals("Ajout Medicaments")) {
				// vue.ouvrirFenetre(new JIFMedicament(vue));
			}
			else if (ChoixOption.equals("Stock echantillon")) {
				vue.ouvrirFenetre(new JIFMedicamentStock(vue));
			}
			else if (ChoixOption.equals("Ajout echantillon")) {
				vue.ouvrirFenetre(new JIFVisiteurAjoutEchant(vue));
			}

			else if (ChoixOption.equals("Consultation Visite")) {
				vue.ouvrirFenetre(new JIFMedecinListeDic(vue));
			}

			else if (ChoixOption.equals("Ajout Visite")) {
				vue.ouvrirFenetre(new JIFVisiteAjout(vue));
			}
			
			else if (ChoixOption.equals("Recapitulatif visite")) {
				vue.ouvrirFenetre(new JIFVisiteRecap(vue));
			}
			
			else if (ChoixOption.equals("Mise à jour")) {
				vue.ouvrirFenetre(new JIFVisiteMAJ(vue));
			}
			
			else if (ChoixOption.equals("Liste visite")) {
				vue.ouvrirFenetre(new JIFVisiteListe(vue));
			}

		}

	}

}
