package Ej9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Fechas {

    public LocalDate devolverFechaConFormato(String fecha){
        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");

        LocalDate fechaNueva = null;
        try {
            fechaNueva = LocalDate.parse(fecha,formato1);
        } catch (DateTimeParseException e1) {
            fechaNueva = LocalDate.parse(fecha,formato2);
        }

        return fechaNueva;

    }

    public boolean isEntreFechas(LocalDate fechaObjetivo, LocalDate fecha1, LocalDate fecha2){

        if(fechaObjetivo.isAfter(fecha1) && fechaObjetivo.isBefore(fecha2)){
            return true;
        } else return fechaObjetivo.isBefore(fecha1) && fechaObjetivo.isAfter(fecha2);
    }

    public boolean esMayorQue(LocalDate fechaObjetivo, LocalDate fechaCompara){
        return fechaObjetivo.isAfter(fechaCompara);
    }

    public boolean esMenorQue(LocalDate fechaObjetivo, LocalDate fechaCompara){
        return fechaObjetivo.isBefore(fechaCompara);
    }
}
