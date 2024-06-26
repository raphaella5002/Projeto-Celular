package Celular.Funções;

public abstract class ServiçoIphone {
	
	public abstract void abrirAplicativo();
	public abstract void funcionalidadeAplicativo();
	
	protected void verificarConexãoInternet() {
		System.out.print(" Verificando conexão com rede de Internet... ");
	}
	protected void verificandoConexãoSinal() {
		System.out.print(" Verificando conexão com rede... ");
	}
	public void opçõesMusica() {
		System.out.print(" Escolha a música de sua preferência: ");
	}
	public void agendaContatos() {
		System.out.print(" Selecione o contato que deseja ligar: ");
		System.out.print(" > Ligando... ");
	}
	public void açãoLigar() {
		System.out.print(" > Ligação Efetuada ");
	}
}