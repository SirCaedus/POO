import Ej5.ListaDeTareas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicializando tareas.");

        ListaDeTareas lista = new ListaDeTareas();
        LocalDate ayer = LocalDate.now().minusDays(1);
        LocalDate maniana = LocalDate.now().plusDays(1);

        lista.agregarTarea("Urgente","Incompleta","Ir al supermercado mañana.",maniana);
        lista.agregarTarea("Urgente","Completa","Consultar repuesto del auto.",ayer);
        lista.agregarTarea("No urgente","Incompleta","Ir al cine a ver la nueva película de Marvel.",ayer);

        lista.mostrarTareas();

    }
}
