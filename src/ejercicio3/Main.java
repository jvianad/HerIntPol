package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5,5);
        System.out.println("Area cuadrado: "+cuadrado.calcularArea());
        System.out.println("Perimetro cuadrado: "+cuadrado.calcularPerimetro());
        System.out.println();
        Circulo circulo = new Circulo(10);
        System.out.println("Area circulo = " + circulo.calcularArea());
        System.out.println("Perimetro circulo = " + circulo.calcularPerimetro());
        System.out.println();
        Triangulo triangulo = new Triangulo(10,10);
        System.out.println("Area triangulo = " + triangulo.calcularArea());
        System.out.println("Perimetro triangulo = " + triangulo.calcularPerimetro());
    }
}
