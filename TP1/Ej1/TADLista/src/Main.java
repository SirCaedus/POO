import ar.edu.unlu.poo.lista.ListaEnlazada;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicializando lista");

        ListaEnlazada lista = new ListaEnlazada();

        boolean vacia = lista.isVacia();
        System.out.println("La lista esta vacia?: " + vacia);

        int largo = lista.LargoLista();
        System.out.println("El largo de la lista es de: " + largo);

        System.out.println("Agregando 1, 3 y 5 a la lista");
        lista.agregarLista(1);
        lista.agregarLista(3);
        lista.agregarLista(5);
        System.out.println(lista);

        vacia = lista.isVacia();
        System.out.println("La lista esta vacia?: " + vacia);

        largo = lista.LargoLista();
        System.out.println("El largo de la lista es de: " + largo);

        System.out.println("Eliminando el segundo elemento de la lista, pasaria a ser 1,5.");
        lista.eliminarDeLista(2);
        System.out.println(lista);

        System.out.println("Insertando en la segunda posicion el elemento 3, lista pasaria a 1,3,5.");
        lista.insertarEnLista(2,3);
        System.out.println(lista);

        System.out.println("Recuperando el tercer valor de la lista, seria 5.");
        System.out.println(lista.recuperarDeLista(3));

    }

}