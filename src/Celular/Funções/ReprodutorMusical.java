package Celular.Funções;

public class ReprodutorMusical extends ServiçoIphone {
	
		public void abrirAplicativo(){
			System.out.print(" | PlayList Online | ");
			opçõesMusica();
			verificarConexãoInternet();
		}
		public void funcionalidadeAplicativo() {
			System.out.print(" > Tocando música escolhida ");
		}
}
