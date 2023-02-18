package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        
    }
    static void entradandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{

            atendeu = atender();
            continuarTentando = !atender();
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso.");
            }

            if(atendeu){
                System.out.println("Conseguimos contatod com "+ candidato+" na "+tentativasRealizadas);
            }else{
                System.out.println("Não conseguimos contato com "+candidato+" número maximo de tentativas "+ tentativasRealizadas+ " realizadas.");
            }

            tentativasRealizadas++;
        }while(continuarTentando && tentativasRealizadas <3);

    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados(){
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO", "MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento.");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("candidato nº"+(i+1)+", é o "+candidatos[i]);
        }

        System.out.println("Imprimindo de forma abreviada...");

        for (String selecionado : candidatos) {
            System.out.println("O candidato selecionado é:"+ selecionado);
        }
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta.");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }
    }
    static void selecaoCandidatos(){
        String[] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO", "MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados=0;
        int candidatoAtual =0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados<5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato "+ candidato + " solicitou este valor de salário "+ salarioPretendido);
            if(salarioBase >= salarioPretendido && candidatoAtual < candidatos.length){
                System.out.println("O candidato "+candidato+" foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
            
        }
        
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.0,2200.0);
    }
}
