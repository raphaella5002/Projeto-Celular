package Celular;

import Celular.Funções.NavegadorInternet;
import Celular.Funções.ReprodutorMusical;
import Celular.Funções.SistemaTelefonico;
import Celular.Funções.ServiçoIphone;

public class MeuIphone {
	public static void main(String[] args) {
		
		ServiçoIphone serviços = null;
		
		String appEscolhido = "Navegador";
		
		if (appEscolhido.equals("Navegador"))
			serviços = new NavegadorInternet();
		else if (appEscolhido.equals("Music"))
			serviços = new ReprodutorMusical();
		else if (appEscolhido.equals("Telephon"))
			serviços = new SistemaTelefonico();
		
		serviços.abrirAplicativo();
		serviços.funcionalidadeAplicativo();
		
		
	}

}
