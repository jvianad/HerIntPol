package ejercicio1;

public class Profesion {
    protected final long sueldo = 2000000;
    private long bono;

    public Profesion(long bono){
        this.bono = bono;
    }

    public long calcularSueldo(){
        /*long total = 0;
        total = this.sueldo+this.bono;
        return total;*/

        return this.sueldo+this.bono;
    }

    public long getBono() {
        return bono;
    }

    public void setBono(long bono) {
        this.bono = bono;
    }

}
