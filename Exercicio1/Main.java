package Exercicio1;

public class Main {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("João", 5000.00, "Vendas");
        System.out.println("Nome: " + gerente1.nome);
        System.out.println("Salário: " + gerente1.salario);
        System.out.println("Setor: " + gerente1.setor);
    }
}
