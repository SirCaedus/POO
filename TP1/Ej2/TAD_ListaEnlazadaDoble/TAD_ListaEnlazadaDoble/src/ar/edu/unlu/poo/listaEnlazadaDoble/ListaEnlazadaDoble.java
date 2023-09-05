package ar.edu.unlu.poo.listaEnlazadaDoble;

public class ListaEnlazadaDoble {
    private Nodo primero;
    private int largoLista;

    public ListaEnlazadaDoble(){
        primero = null;
        largoLista = 0;
    }

    public boolean isVacia(){
        return  primero == null;
    }

    public int LargoLista(){
        return largoLista;
    }
    public void agregarLista(Object dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        if(primero == null){
            primero = nuevoNodo;
        } else {
            Nodo nodoAux = recuperarNodo(largoLista);
            nuevoNodo.setAnterior(nodoAux);
            nodoAux.setProximo(nuevoNodo);
        }

        largoLista++;
    }

    public void eliminarDeLista(int index){
        if (index < 1 || index >= largoLista){
            throw new IndexOutOfBoundsException("El valor del indice esta fuera de rango");
        }

        if (index == 1){
            primero = primero.getProximo();
            primero.setAnterior(null);
        } else {
            Nodo nodoActual = recuperarNodo(index);
            Nodo nodoAnterior = nodoActual.getAnterior();
            Nodo nodoSiguiente = nodoActual.getProximo();

            nodoAnterior.setProximo(nodoSiguiente);
            nodoSiguiente.setAnterior(nodoAnterior);
        }

        largoLista--;
    }

    public Object recuperarDeLista(int index){
        if (index < 1 || index > largoLista){
            throw new IndexOutOfBoundsException("El valor del indice esta fuera de rango");
        }

        Nodo NodoAux = recuperarNodo(index);
        return NodoAux.getDato();
    }

    public void insertarEnLista(int index, Object dato){
        if (index < 1 || index > largoLista + 1){
            throw new IndexOutOfBoundsException("El valor del indice esta fuera de rango");
        }

        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);

        if (index == 1){
            Nodo nodoAux = primero;
            nodoAux.setAnterior(nuevoNodo);
            nuevoNodo.setProximo(nodoAux);
            primero = nuevoNodo;
        } else {
            Nodo nodoActual = recuperarNodo(index);
            Nodo nodoAnterior = nodoActual.getAnterior();

            nodoActual.setAnterior(nuevoNodo);
            nodoAnterior.setProximo(nuevoNodo);

            nuevoNodo.setAnterior(nodoAnterior);
            nuevoNodo.setProximo(nodoActual);
        }

        largoLista++;
    }

    private Nodo recuperarNodo(int index){
        Nodo nodoAux = primero;
        for(int i = 1; i < index; i++){
            nodoAux = nodoAux.getProximo();
        }
        return nodoAux;
    }

    public String toString(){
        String acumulador = "";
        int i = 1;
        Nodo nodoAux = primero;
        if(primero == null){
            acumulador = "Lista vacia";
        } else {
            while (nodoAux != null){
                acumulador += "Nodo " + i + " " + nodoAux.getDato() + "\n";
                i++;
                nodoAux = nodoAux.getProximo();
            }

        }
        return acumulador;
    }
}
