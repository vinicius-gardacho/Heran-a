package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo("Vermelho", true, 5, 3);
        Circulo circulo1 = new Circulo("Azul", false, 4);
        System.out.println("Cor do Retângulo: " + retangulo1.cor);
        System.out.println("Área do Retângulo: " + retangulo1.calcularArea());
        System.out.println("Cor do Círculo: " + circulo1.cor);
        System.out.println("Área do Círculo: " + circulo1.calcularArea());
        System.out.println("O Círculo está preenchido: " + circulo1.preenchida);
        System.out.println("O Retângulo está preenchido: " + retangulo1.preenchida);
    }
}
