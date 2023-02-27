public class App{
    public static void main(String[] args) {
        
        Telefone telefone = new Telefone();
        ReprodutorDeSom ipod = new ReprodutorDeSom();
        Navegador safari = new Navegador();
        
        // REPRODUTOR DE SOM
        ipod.menu();
        System.out.println();
       
        ipod.selecionarMusica();
        System.out.println();
         
        ipod.pausar();
        System.out.println();
        
        // TELEFONE
        telefone.menu();
        System.out.println();
        
        telefone.abreTeclado();
        System.out.println();
        
        telefone.iniciarCorreioVoz();
        System.out.println();
        
        telefone.ligar();
        System.out.println();
        
        telefone.atender();
        System.out.println();
        

        // NAVEGADOR
        safari.menu();
        System.out.println();

        safari.exibirPagina();
        System.out.println();
        
        safari.novaAba();
        System.out.println();
        
        safari.atualizarPagina();
    }
}