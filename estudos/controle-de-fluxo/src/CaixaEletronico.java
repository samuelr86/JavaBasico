
// CONTROLE DE FLUXO SIMPLES


public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo){            
            saldo = saldo - valorSolicitado;
        }
    
        System.out.println(saldo); // 8
        
        
        saldo = 25.0;
        valorSolicitado = 27.0;

        if(valorSolicitado < saldo){            
            saldo = saldo - valorSolicitado;
        }
    
        System.out.println(saldo); // 25
    }
}
