package Exercicio1;

class Funcionario {
    protected String nome;
    protected double salario;
}

class Gerente extends Funcionario {
    private String setor;
    public Gerente(String nome, double salario, String setor) {
        this.nome = nome;
        this.salario = salario;
        this.setor = setor;
    }

    public String getSetor(){
        return setor;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }
}