package iphone;

public class UsandoIphone {

	public static void main(String[] args) {
		
		Iphone usando = new Iphone();
		
		// Testando as funcionalidades
		usando.tocarMusica();
		usando.pausarMusica();
		usando.selecionarMusica("Imagine - John Lennon");
        
		usando.ligar("123456789");
		usando.atender();
		usando.correioDeVoz();
        
		usando.exibirPagina("www.google.com");
		usando.adicionarNovaAba();
		usando.atualizarPagina();

	}

}
