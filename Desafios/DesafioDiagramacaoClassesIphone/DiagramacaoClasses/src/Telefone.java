public class Telefone extends Tela{

    public void ligar(){
        toqueNaTela();
        System.out.println("Ligando...");
    }

    public void atender(){
        toqueNaTela();
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioVoz(){
        toqueNaTela();
        CorreioVoz voz = new CorreioVoz();
        voz.menu();
    }

    public void abreTeclado(){
        toqueNaTela();
        System.out.println("Exibindo Teclado");
        System.out.println("1 2 3\n4 5 6\n7 8 9\n  0");
        
    }
    
    @Override
    protected void toqueNaTela() {
        System.out.println("Tocando no icone.");
    }

    @Override
    public void menu() {
        toqueNaTela();
        System.out.println("Abrindo Menu...");
        System.out.println("1. Favoritos\n"+"2. Contatos\n"+"3. Recentes\n"+"4. Teclado\n"+"5. Correio de Voz");
    }
    
}
