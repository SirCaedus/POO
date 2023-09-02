package Ej10;

import java.time.LocalDate;
import java.util.ArrayList;

public class ListaDeTareas {
    private ArrayList<Tarea> lista = new ArrayList<>();

    public void agregarTarea(String prioridad, String estado, String descripcion, LocalDate fechaLimite){
        Tarea tarea = new Tarea(prioridad,estado,descripcion,fechaLimite);

        lista.add(tarea);
        System.out.println("Se registro la tarea con exito.");
    }

    public void agregarTarea(String prioridad, String estado, String descripcion, LocalDate fechaLimite, LocalDate fechaRecordatorio){
        Tarea tarea = new Tarea(prioridad,estado,descripcion,fechaLimite,fechaRecordatorio);

        lista.add(tarea);
        System.out.println("Se registro la tarea con exito.");
    }

    public void mostrarTareas(){
        String resultado = "";
        for (Tarea tarea : lista){
            resultado = tarea.getTarea();
            System.out.println(resultado);
        }
    }
}
