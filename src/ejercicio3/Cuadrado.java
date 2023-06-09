package ejercicio3;

public class Cuadrado implements FiguraGeometrica{
    private int alto;
    private int ancho;

    public Cuadrado(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return this.alto*this.ancho;
    }

    @Override
    public double calcularPerimetro() {
        return (this.alto+this.ancho)*2;
    }
}
