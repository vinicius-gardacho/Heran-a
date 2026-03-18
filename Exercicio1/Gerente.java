package Exercicio1;

class Funcionario {

    protected String nome;
    protected double salario;
}
class Gerente extends Funcionario {
    public String setor;
    public Gerente(String nome, double salario, String setor) {
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
    }

}