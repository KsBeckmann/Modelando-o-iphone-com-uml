import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.selecionarMusica("Musica 1");
        reprodutorMusical.tocarMusica();
        reprodutorMusical.pausarMusica();

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.ligar("99999-9999");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioDeVoz();

        NavegadorInternet navegadorInternet = new NavegadorInternet();
        navegadorInternet.exibirPagina("youtube.com");
        navegadorInternet.atualizarPagina();
        navegadorInternet.adicionarNovaAba();
    }
}
