package Celular.Funções;

public class NavegadorInternet extends ServiçoIphone {
	
	public void abrirAplicativo(){
		System.out.print(" | Navegador | ");
		System.out.print(" > Campo para digitar a pesquisa desejada. ");
		verificarConexãoInternet();
		System.out.print(" - Selecione o site de sua preferência: ");
	}
	public void funcionalidadeAplicativo() {
		System.out.print(" > Abrindo... ");
	}
	
	
}
