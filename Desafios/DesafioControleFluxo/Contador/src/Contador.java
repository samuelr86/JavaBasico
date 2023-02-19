import java.util.Scanner;

public class Contador {
	public static void main(String[] args) throws ParametrosInvalidosException {
		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

		try {
			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			e.printStackTrace();
		}

		terminal.close();

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		// validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		validacaoException(parametroUm, parametroDois);
		int contagem = parametroDois - parametroUm;
		// realizar o for para imprimir os números com base na variável contagem

		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo número " + i);
		}
	}

	private static void validacaoException(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroDois < parametroUm)
			throw new ParametrosInvalidosException();

	}
}
