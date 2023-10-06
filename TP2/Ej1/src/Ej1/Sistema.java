package Ej1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Sistema {
    private final ArrayList<Actividad> actividades = new ArrayList<>();
    private final ArrayList<Socio> socios = new ArrayList<>();

    public void inscripcion(String nombre, String apellido, LocalDate fechaNacimiento,
                            int dni, String email, String direccion,
                            String telefono, Suscripcion suscripcion){

        LocalDate fechaInscripcion = LocalDate.now();
        Socio socio = new Socio(nombre,apellido, fechaNacimiento,dni,email,direccion,telefono,suscripcion,fechaInscripcion);
        socios.add(socio);
    }

    public void registrarActividad(String nombre, Suscripcion suscripcion){
        Actividad actividad = new Actividad(nombre, suscripcion);
        actividades.add(actividad);
    }

    public String reporteSocios(){
        if(socios.isEmpty()){
            return "No hay ningun socio en la lista.";
        }

        StringBuilder resultado = new StringBuilder();

        socios.sort(Comparator.comparing(Socio::getSuscripcion));

        for (Socio socio : socios){
            resultado.append(socio);
        }

        return resultado.toString();
    }

    public String listaActividades(){
        if(actividades.isEmpty()){
            return "No hay actividades en la lista.";
        }

        StringBuilder resultado = new StringBuilder();

        actividades.sort(Comparator.comparing(Actividad::getSuscripcion));

        for (Actividad actividad : actividades){
            resultado.append(actividad);
        }

        return resultado.toString();

    }

    public String listaSocios(){
        if(socios.isEmpty()){
            return "No hay ningun socio en la lista.";
        }

        StringBuilder resultado = new StringBuilder();

        for (Socio socio : socios){
            LocalDate fechaSocio = socio.getFechaInscripcion();
            if(fechaSocio.getMonth() == LocalDate.now().getMonth()){
                resultado.append(socio);
            }
        }

        return resultado.toString();
    }
}
