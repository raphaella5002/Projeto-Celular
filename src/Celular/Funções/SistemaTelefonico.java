package Celular.Funções;

public class SistemaTelefonico extends ServiçoIphone {

	public void abrirAplicativo() {
		System.out.print(" | Telephon | ");
		verificandoConexãoSinal();
		agendaContatos();
	}

	public void funcionalidadeAplicativo() {
		açãoLigar();
	}

}
