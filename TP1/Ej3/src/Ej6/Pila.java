package Ej6;

public class Pila {
    private Nodo tope;
    public Pila(){
        tope = null;
    }

    public void apilar(Object dato){
        Nodo nodoAux = new Nodo();
        nodoAux.setValor(dato);
        if (!isVacia()) {
            nodoAux.setSiguiente(tope);
        }
        tope = nodoAux;
    }

    public Object desapilar(){
        Nodo nodoAux;
        if(isVacia()){
            return null;
        }

        nodoAux = tope;
        tope = nodoAux.getSiguiente();
        return nodoAux.getValor();
    }

    public Object recuperar(){
        return tope.getValor();
    }

    public boolean isVacia(){
        return tope == null;
    }

    public void mostrarPila(){
        if (this.isVacia()){
            System.out.println("pila vacia");
        } else {
            Pila pilaAux = new Pila();
            String acumulador = "";
            int i = 1;
            while (!this.isVacia()){
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
