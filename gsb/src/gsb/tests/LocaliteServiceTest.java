package gsb.tests;

import gsb.modele.Localite;
import gsb.service.LocaliteService;

public class LocaliteServiceTest {

	public static void main(String[] args){
		Localite uneLocalite = LocaliteService.rechercherLocalite("46000");
		System.out.println(uneLocalite.getCodePostal());
		System.out.println(uneLocalite.getVille());
	}
}

