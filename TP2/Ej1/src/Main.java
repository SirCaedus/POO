import Ej1.Sistema;
import Ej1.Suscripcion;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       Sistema sistema = new Sistema();

        String reporteSocios = sistema.reporteSocios();
        String listaActividades = sistema.listaActividades();
        String listaSocios = sistema.listaSocios();

        System.out.println("Socios inscriptos el ultimo mes: " + reporteSocios);
        System.out.println("Lista de actividades ordenadas por suscripcion: " + listaActividades);
        System.out.println("Lista de socios ordenados por suscripcion: " + listaSocios);

        LocalDate fechaNacimientoPrueba = LocalDate.of(2000,11,21);

       sistema.inscripcion("Juan","Gonzalez",fechaNacimientoPrueba,123456,"juan@email.com","Montes 34","111111", Suscripcion.DESTACADA);
       sistema.inscripcion("Martin","Mansilla",fechaNacimientoPrueba,123457,"martin@email.com","oca 393","222222", Suscripcion.INTERMEDIA);
       sistema.inscripcion("Carolina","Alvarez",fechaNacimientoPrueba,123458,"caro@email.com","Loyola 43","333333", Suscripcion.DESTACADA);
       sistema.inscripcion("Francisca","Saez",fechaNacimientoPrueba,123459,"fran@email.com","Julio Roca 122","444444", Suscripcion.BASICA);
       sistema.inscripcion("Josue","Ramirez",fechaNacimientoPrueba,987673,"josu@email.com","Moreno 596","555555", Suscripcion.INTERMEDIA);
       sistema.inscripcion("Lucia","Garcia",fechaNacimientoPrueba,198357,"lucia@email.com","Corrientes 300","666666", Suscripcion.BASICA);


       sistema.registrarActividad("Esgrima",Suscripcion.DESTACADA);
       sistema.registrarActividad("Natacion",Suscripcion.INTERMEDIA);
       sistema.registrarActividad("Equitacion",Suscripcion.DESTACADA);
       sistema.registrarActividad("Ajedrez",Suscripcion.BASICA);
       sistema.registrarActividad("Lanzamiento de Bala",Suscripcion.INTERMEDIA);

       reporteSocios = sistema.reporteSocios();
       listaActividades = sistema.listaActividades();
       listaSocios = sistema.listaSocios();

       System.out.println("Socios inscriptos el ultimo mes:\n" + reporteSocios);
       System.out.println("Lista de actividades ordenadas por suscripcion:\n" + listaActividades);
       System.out.println("Lista de socios ordenados por suscripcion:\n" + listaSocios);
    }
}