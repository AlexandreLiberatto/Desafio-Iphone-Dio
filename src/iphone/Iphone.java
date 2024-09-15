package iphone;

import acessorios.AparelhoTelefonico;
import acessorios.NavegadorInternet;
import acessorios.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	public void tocarMusica() {
		System.out.println("Tocando musica...");
		
	}

	public void pausarMusica() {
		System.out.println("Pausando musica...");
		
	}

	public void selecionarMusica(String musica) {
		System.out.println(musica);
		
	}

	public void exibirPagina(String url) {
		System.out.println(url);
		
	}

	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba...");
		
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página...");
		
	}

	public void ligar(String numero) {
		System.out.println(numero);
		
	}

	public void atender() {
		System.out.println("Atendendo ligação...");
		
	}

	public void correioDeVoz() {
		System.out.println("Acessando correio de voz...");
		
	}

	

}
