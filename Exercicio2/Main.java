package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo("Vermelho", 5, 3);
        Circulo circulo1 = new Circulo("Azul", 4);
        System.out.println("Cor do Retângulo: " + retangulo1.cor);
        System.out.println("Área do Retângulo: " + retangulo1.calcularArea());
        System.out.println("Cor do Círculo: " + circulo1.cor);
        System.out.println("Área do Círculo: " + circulo1.calcularArea());
        
        
    }
}
