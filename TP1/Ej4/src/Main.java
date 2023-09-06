import Ej4.Cola;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicializando la cola.");

        Cola cola = new Cola();

        cola.mostrarCola();
        boolean vacia = cola.isVacia();
        System.out.println("La cola esta vacia?: " + vacia);

        cola.encolar(1);
        cola.encolar(2);
        cola.encolar(50);
        cola.encolar("120");
        cola.encolar("12");

        cola.mostrarCola();
        Object dato = cola.recuperar();
        System.out.println("El primer dato de la cola es: " + dato);

        System.out.println("Desencolando dos posiciones");
        dato = cola.desencolar();
        dato = cola.desencolar();
        cola.mostrarCola();
        System.out.println("El ultimo dato desencolado es: " + dato);
    }
}