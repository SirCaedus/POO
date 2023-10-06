package Ej1;

public class Actividad {
    private String nombre;
    private Suscripcion suscripcion;

    public Actividad(String nombre, Suscripcion suscripcion){
        setNombre(nombre);
        setSuscripcion(suscripcion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }

    public String toString(){
        String acumulador = getNombre()
                + " Suscripcion requerida: " + getSuscripcion()
                + "\n";

        return acumulador;
    }

}
