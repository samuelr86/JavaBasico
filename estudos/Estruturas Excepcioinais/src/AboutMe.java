
// TRY CATCH


import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {

            // criando um objeto Scanner
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite seu nome:");
            String nome = sc.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = sc.next();

            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();

            // imprimindo dados obtidos pelo usuário
            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm ");

            sc.close();
        } catch (Exception e) {

            System.err.println("Os campos idade e altura precisão ser numéricos.");
        }

    }
}
