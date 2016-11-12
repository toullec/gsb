package gsb.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gsb.modele.dao.MedicamentDao;
import gsb.modele.dao.StockerDao;
import gsb.modele.dao.VisiteurDao;
import gsb.vue.JIFMedicamentStock;
import gsb.vue.MenuPrincipal;

public class JIFMedicamentStockCtrl implements ActionListener{
	private JIFMedicamentStock vueStock;
	private MenuPrincipal vue;
	
	public JIFMedicamentStockCtrl(MenuPrincipal vue, JIFMedicamentStock vueStock){
		this.vueStock = vueStock;
		this.vue=vue;
	}
	
	@Override
	public void actionPerformed(ActionEvent evt) {

		if(evt.getSource() == vueStock.getEntrerBtn()){
			//vueStock.remplirText(StockerDao.rechercher(VisiteurDao.rechercher(vueStock.getJTCode().getText()),MedicamentDao.rechercher(vueStock.getJTMedic().getText())));
			vueStock.remplirTab(vueStock.getJTCode().getText());
		}
		
	}

}
