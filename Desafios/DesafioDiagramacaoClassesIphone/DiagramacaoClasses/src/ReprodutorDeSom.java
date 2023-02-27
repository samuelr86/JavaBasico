public class ReprodutorDeSom extends Tela{
    private void tocar(){
        
        System.out.println("Executando musica...");

    }

    public void pausar(){
        toqueNaTela();
        System.out.println("Musica em Pausa!");
    }
    
    public void selecionarMusica(){
        toqueNaTela();
        acionaAutoFalante();
        System.out.println("Musica selecionada.");
        tocar();
    }

    private void acionaAutoFalante() {
        System.out.println("Auto falante ligado.");
    }

    @Override
    public void menu() {
        System.out.println("Exibindo Menu");
        System.out.println("1. Selecionar Musica\n"+"2. Tocar\n"+"3. Pausar");

    }

    @Override
    protected void toqueNaTela() {
        System.out.println("Tocando no icone.");
    }
}
