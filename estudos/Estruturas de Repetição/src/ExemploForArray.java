
// CONTROLE DE FLUXO -  FOR EM ARRAYS


public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Julia", "Felipe","Jonas", "Marcos"};
        
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no índice i = "+x+" é "+alunos[x]);
        }

        // mais usado em coleções
        for (String string : alunos) {
            System.out.println("Nome do aluno é " + string);
        }
    }
}
