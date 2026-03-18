package Exercicio3;

public class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
}

class Aluno extends Pessoa {
    private String Matricula;
    public Aluno(String nome, String Matricula) {
        super(nome);
        this.Matricula = Matricula;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }
}