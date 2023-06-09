package ejercicio2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Clasica tarjetaClasica = new Clasica("Visa",5000000,"CVAS ERTY 55TT 67YT",636, LocalDate.of(2030,3,25));
        tarjetaClasica.imprimir();

        Dorada tarjetaDorada = new Dorada("MasterCard",10000000,"QWER ASDF ZXCV 4567",854,LocalDate.of(2025,2,15));
        tarjetaDorada.imprimir();

        Platinum tarjetaPlatinum = new Platinum("American Express",20000000,"FGHJ CVBN Z345 ET67",148,LocalDate.of(2028,8,30));
        tarjetaPlatinum.imprimir();

        Black tarjetaBlack = new Black("Visa",50000000,"6789 C4B2 TYUI 6F8H",753,LocalDate.of(2045,5,13));
        tarjetaBlack.imprimir();
    }
}
