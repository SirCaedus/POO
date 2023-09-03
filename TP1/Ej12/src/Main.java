import Ej12.ListaDeTareas;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicializando tareas.");

        ListaDeTareas lista = new ListaDeTareas();
        LocalDate hoy = LocalDate.now();
        LocalDate ayer = hoy.minusDays(1);
        LocalDate maniana = hoy.plusDays(1);

        lista.agregarTarea("Baja","Incompleta","Ir al supermercado mañana.",maniana,hoy);
        lista.agregarTarea("Baja","Completa","Consultar repuesto del auto.",hoy,hoy);
        lista.agregarTarea("Baja","Completa","Ir al cine a ver la nueva película de Marvel.",ayer);

        lista.mostrarTareas();    }
}