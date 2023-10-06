package Ej2;

public class Proveedor {
    private String nombre;
    private Clasificacion clasificacion;

    public Proveedor(String nombre,Clasificacion clasificacion) {
        setNombre(nombre);
        setClasificacion(clasificacion);
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String toString() {
        return ("PROVEEDOR Nombre: " + getNombre() + " | " +
                "Clasificacion: " + getClasificacion() + "\n");
    }
}
