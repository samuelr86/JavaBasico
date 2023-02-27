public class Navegador extends Tela{
    public void novaAba(){
        toqueNaTela();
        System.out.println("Abrindo Nova aba.");
        exibirPaginaBranco();
    }

    public void atualizarPagina(){
        toqueNaTela();
        System.out.println("Atualizando a pagina...");
        exibirPagina();
    }

    public void exibirPagina(){
        toqueNaTela();
        System.out.println("Exibindo pagina da web.");
    }
    public void exibirPaginaBranco(){
        
        System.out.println("Exibindo pagina em branco");
    }

    @Override
    protected void toqueNaTela() {
        System.out.println("Tocando no icone.");
    }

    @Override
    public void menu() {
        toqueNaTela();
        System.out.println("1. Atualizar pagina\n"+"2. Nova Aba\n"+"3. Fechar navegador");
    }
}
