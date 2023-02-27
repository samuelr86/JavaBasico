public class CorreioVoz extends Tela{
    @Override
    public void menu() {
        toqueNaTela();

        System.out.println("1. Ler Mensagem\n"+"2. Apagar Mensagem\n"+"3. Proxima Mensagem\n");
    }

    @Override
    protected void toqueNaTela() {
       
        System.out.println("Escolha a opcao.");
    }
    
}
