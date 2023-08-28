package ar.edu.unlu.poo.listaEnlazadaDoble;

public class Nodo {
    private Object dato;
    private Nodo anterior = null;
    private Nodo proximo = null;

    public void setDato(Object dato){
        this.dato = dato;
    }

    public Object getDato(){
        return dato;
    }

    public void setProximo(Nodo nodo){
        this.proximo = nodo;
    }

    public Nodo getProximo(){
        return proximo;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo nodo) {
        this.anterior = nodo;
    }
}
