
import java.util.Scanner;



public class TestaConta {
    public static void main(String[] args) {
        ContaTerminal conta1 = new ContaTerminal();

        Scanner leitor = new Scanner(System.in);
        

        System.out.println("Insira o número da Conta:");
        conta1.numero = leitor.nextInt();
        

        System.out.println("Insira o número da agência:");
        conta1.agencia = leitor.next();
       

        System.out.println("Insira o seu nome Completo");
        conta1.nomeCliente = leitor.next();
        System.out.println();

        conta1.saldo = 238.47;

        System.out.println();
        System.out.println("Olá "+conta1.nomeCliente+" obrigado por criar uma conta em nosso banco, sua agência é "+conta1.agencia+", o número da sua conta é "+conta1.numero+" e seu saldo R$"+conta1.saldo+" já está disponível para saque!");

        leitor.close();
    }
}
