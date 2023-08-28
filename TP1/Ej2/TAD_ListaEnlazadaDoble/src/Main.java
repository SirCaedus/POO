import ar.edu.unlu.poo.listaEnlazadaDoble.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Probando Lista Enlazada Doble.");

        System.out.println("Inicializando Lista.");
        ListaEnlazadaDoble lista = new ListaEnlazadaDoble();

        System.out.println("Lista inicializada. Probando si está vacia: ");
        boolean estaVacia = lista.listaEstaVacia();
        System.out.println(estaVacia);

        System.out.println("Agregando valores a la lista.");
        lista.agregarLista(1);
        lista.agregarLista(2);
        lista.agregarLista(3);
        estaVacia = lista.listaEstaVacia();
        System.out.println("preguntando si la lista esta vacia: " + estaVacia);

        int largoLista = lista.LargoLista();
        System.out.println("preguntando el largo de la lista: " + largoLista);

        String contenidoLista = lista.recorrerLista();
        System.out.println(contenidoLista);

        System.out.println("eliminando el dato 2.");
        lista.eliminarDeLista(1);
        contenidoLista = lista.recorrerLista();
        System.out.println(contenidoLista);

        System.out.println("insertando el dato 2 en la posicion en la que estaba.");
        lista.insertarEnLista(1,2);
        contenidoLista = lista.recorrerLista();
        System.out.println(contenidoLista);

        System.out.println("recuperando el dato 2 en su posicion.");
        Object datoLista = lista.recuperarDeLista(1);
        System.out.println(datoLista);





    }
}