public class Main {
    public static void main(String[] args) {
        Iphone meuiPhone = new Iphone();

        // Funcionalidades do AparelhoTelefonico do iPhone
        meuiPhone.ligar("1234567890");
        meuiPhone.atender();
        meuiPhone.iniciarCorreioVoz();

        // Funcionalidades do ReprodutorMusical do iPhone
        meuiPhone.tocarMusica();
        meuiPhone.pausarMusica();
        meuiPhone.selecionarMusica("Minha Música Preferido");

        //Funcionalidades do NavegadorInternet do iPhone
        meuiPhone.exibirPagina("https://www.urlteste.com");
        meuiPhone.adicionarNovaAba();
        meuiPhone.atualizarPagina();
    }
}
