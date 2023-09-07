import Ej9.Fechas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Probando fechas.");
        Fechas fechas = new Fechas();
        LocalDate fecha1 = fechas.devolverFechaConFormato("04-05-2005");
        LocalDate fecha2 = fechas.devolverFechaConFormato("06-04-2005");
        LocalDate fecha3 = fechas.devolverFechaConFormato("21-11-2000");

        System.out.println("fecha 1: " + fecha1.toString());
        System.out.println("fecha 2: " + fecha2.toString());
        System.out.println("fecha 3: " + fecha3.toString());

        System.out.println("La fecha 1 es menor que la fecha 2?: " + fechas.esMenorQue(fecha1,fecha2));
        System.out.println("La fecha 2 es menor que la fecha 1?: " + fechas.esMenorQue(fecha2,fecha1));

        System.out.println("La fecha 3 es mayor que la fecha 1?: " + fechas.esMayorQue(fecha3,fecha1));
        System.out.println("La fecha 1 es mayor que la fecha 3?: " + fechas.esMayorQue(fecha1,fecha3));

        System.out.println("La fecha 2 esta entre la fecha 1 y la fecha 3?: " + fechas.isEntreFechas(fecha2,fecha1,fecha3));
        System.out.println("La fecha 1 esta entre la fecha 2 y la fecha 3?: " + fechas.isEntreFechas(fecha1,fecha2,fecha3));
    }
}