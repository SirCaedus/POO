package ar.edu.unlu.poo.lista;

public class ListaEnlazada {
    private Nodo primero;
    private int largoLista;

    public ListaEnlazada(){
        primero = null;
        largoLista = 0;
    }

    public boolean listaEstaVacia(){
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
            nodoAux.setProximo(nuevoNodo);
        }
    }

    public void eliminarDeLista(int index){
        if (index < 0 || index >= largoLista){
            throw new IndexOutOfBoundsException("El valor del indice esta fuera de rango");
        }

        if (index == 0){
            primero = primero.getProximo();
        } else {
            Nodo nodoAnterior = recuperarNodo(index - 1);
            Nodo nodoActual = nodoAnterior.getProximo();
            nodoAnterior.setProximo(nodoActual.getProximo());
        }

        largoLista--;
    }

    public Object recuperarDeLista(int index){
        if (index < 0 || index >= largoLista){
            throw new IndexOutOfBoundsException("El valor del indice esta fuera de rango");
        }

        Nodo NodoAux = recuperarNodo(index);
        return NodoAux.getDato();
    }

    public void insertarEnLista(int index, Object dato){
        if (index < 0 || index > largoLista){
            throw new IndexOutOfBoundsException("El valor del indice esta fuera de rango");
        }

        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);

        if (index == 0){
            nuevoNodo.setProximo(primero);
            primero = nuevoNodo;
        } else {
            Nodo nodoAnterior = recuperarNodo(index -1);
            nuevoNodo.setProximo(nodoAnterior.getProximo());
            nodoAnterior.setProximo(nuevoNodo);
        }

        largoLista++;
    }

    private Nodo recuperarNodo(int index){
        Nodo nodoAux = primero;
        for(int i = 0; i < index; i++){
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
