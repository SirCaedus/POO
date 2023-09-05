import Ej6.Pila;
public class Main {
    public static void main(String[] args) {
        System.out.println("ejemplo");

        Pila pila = new Pila();

        if(pila.esVacia()){
            System.out.println("pila vacia");
        }

        pila.apilar(12);
        pila.apilar(10);
        pila.apilar("6");
        pila.apilar("1");

        if(!pila.esVacia()){
            System.out.println("pila tener cosas. tope ser " + pila.recuperar());
        } else {
            System.out.println("error al apilar");
        }

        pila.mostrarPila();
        Object valor = pila.desapilar();
        pila.mostrarPila();
    }
}