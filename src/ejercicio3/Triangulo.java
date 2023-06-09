package ejercicio3;

public class Triangulo implements FiguraGeometrica{
    private int alto;
    private int ancho;

    public Triangulo(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return (this.alto * this.ancho) /2.0;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(Math.pow(alto, 2) + Math.pow(ancho, 2));
        return alto + ancho + hipotenusa;
    }
}
