package Exercicio3;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Vinicius", "Engenharia de Software");

        System.out.println("Nome do Aluno: " + aluno1.nome);
        System.out.println("Matrícula do Aluno: " + aluno1.getMatricula());

    }
}
