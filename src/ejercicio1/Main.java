package ejercicio1;

public class Main {
    public static void main(String[] args) {

        Profesion ingeniero = new Ingeniero(5000000);
        System.out.println("Total Ingeniero: "+ingeniero.calcularSueldo());

        Profesion medico = new Medico(3000000);
        System.out.println("Total Medico= " + medico.calcularSueldo());

        Profesion arquitecto = new Arquitecto(2000000);
        System.out.println("Total Arquitecto= " + arquitecto.calcularSueldo());



    }
}
