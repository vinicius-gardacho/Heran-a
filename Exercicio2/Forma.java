package Exercicio2;

class Forma {
    protected String cor;
    protected boolean preenchida;
    public Forma(String cor, boolean preenchida) {
        this.cor = cor;
        this.preenchida = preenchida;
    }
}

class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(String cor, boolean preenchida, double largura, double altura) {
        super(cor, preenchida);
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }
}

class Circulo extends Forma {
    private double raio;

    public Circulo(String cor, boolean preenchida, double raio) {
        super(cor, preenchida);
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}
