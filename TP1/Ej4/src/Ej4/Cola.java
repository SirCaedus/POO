package Ej4;

public class Cola {

    private Nodo tope;
    private Nodo cola;

    public Cola(){
        tope = null;
        cola = null;
    }

    public void setTope(Nodo nodo){
        tope = nodo;
    }

    public void setCola(Nodo nodo){
        cola = nodo;
    }

    public boolean isVacia() {
        return tope == null;
    }

    public Object recuperar(){
        return tope.getDato();
    }

    public void encolar(Object dato){
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);

        if(!this.isVacia()){
            cola.setSiguiente(nuevoNodo);
        } else {
            setTope(nuevoNodo);
        }

        setCola(nuevoNodo);
    }

    public Object desencolar(){
        if(this.isVacia()){
            return null;
        }

        Nodo nodoAux = tope;
        tope = nodoAux.getSiguiente();

        return nodoAux.getDato();
    }

    public void mostrarCola(){
        if(this.isVacia()){
            System.out.println("La cola esta vacia.");
        } else {
            Cola colaAux = new Cola();
            String acumulador = "";
            int i = 1;
            while (!this.isVacia()){
                acumulador += "Nodo " + i + " " + this.recuperar() + "\n";
                i++;

                colaAux.encolar(this.desencolar());
            }
            System.out.println(acumulador);

            while(!colaAux.isVacia()){
                this.encolar(colaAux.desencolar());
            }
        }
    }


}
