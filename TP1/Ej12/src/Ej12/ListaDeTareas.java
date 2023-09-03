package Ej12;

import java.time.LocalDate;
import java.util.*;

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

    public Tarea buscarTarea(String nombre){
        String resultado = "";
        for (Tarea tarea : lista){
            if(tarea.getDescripcion().contains(nombre)){
                resultado = tarea.getTarea();
                System.out.println(resultado);
                return tarea;
            }
        }
        System.out.println("No se encontro la tarea especificada.");
        return null;
    }

    public void crearTarea(){
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese el nombre/descripcion de la tarea: ");
        String descripcion = sc.nextLine();

        System.out.println("\ningrese el estado de la tarea (realizada/no realizada): ");
        String estado = sc.nextLine();

        System.out.println("\ningrese la prioridad de la tarea (baja/alta): ");
        String prioridad = sc.nextLine();

        System.out.println("\ningrese la fecha limite de la tarea (formato yyyy-MM-dd): ");
        LocalDate fechaLimite = LocalDate.parse(sc.nextLine());

        System.out.println("\ningrese la fecha recordatorio de la tarea (formato yyyy-MM-dd): ");
        LocalDate fechaRecordatorio = LocalDate.parse(sc.nextLine());

        agregarTarea(prioridad,estado,descripcion,fechaLimite,fechaRecordatorio);
    }

    public void realizarTarea(Tarea tarea){
        tarea.setEstado("Realizada");
    }

    public void mostrarTareas(){
        String resultado = "";
        for (Tarea tarea : lista){
            resultado = tarea.getTarea();
            System.out.println(resultado);
        }
    }

    public void mostrarTareasNoVencidas(){
        ArrayList<Tarea> nuevaLista = new ArrayList<>();

        for (Tarea tarea : lista){
            if(!tarea.isVencida()){
                nuevaLista.add(tarea);
            }
        }

        nuevaLista.sort(Comparator.comparing(Tarea::getPrioridad));
        nuevaLista.sort(Comparator.comparing(Tarea::getFechaLimite));

        String resultado = "";
        for (Tarea tarea : nuevaLista){
            resultado = tarea.getTarea();
            System.out.println(resultado);
        }
    }
}
