package Ej6;

public class Pila {
    private Nodo tope;
    public Pila(){
        tope = null;
    }

    public void apilar(Object dato){
        Nodo nodoAux = new Nodo();
        nodoAux.setValor(dato);
        if (!esVacia()) {
            nodoAux.setSiguiente(tope);
        }
        tope = nodoAux;
    }

    public Object desapilar(){
        Nodo nodoAux;
        if(esVacia()){
            return null;
        }

        nodoAux = tope;
        tope = nodoAux.getSiguiente();
        return nodoAux.getValor();
    }

    public Object recuperar(){
        return tope.getValor();
    }

    public boolean esVacia(){
        return tope == null;
    }

    public void mostrarPila(){
        if (this.esVacia()){
            System.out.println("pila vacia");
        } else {
            Pila pilaAux = new Pila();
            String acumulador = "";
            int i = 1;
            while (!this.esVacia()){
                acumulador += "Nodo " + i + " " + this.recuperar() + "\n";
                i++;

                pilaAux.apilar(this.desapilar());
            }
            System.out.println(acumulador);

            while(!pilaAux.esVacia()){
                this.apilar(pilaAux.desapilar());
            }
        }
    }
}
