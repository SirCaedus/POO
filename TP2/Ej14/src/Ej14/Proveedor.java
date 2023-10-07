package Ej14;

public abstract class Proveedor {
    private String nombre;
    private Clasificacion clasificacion;
    private double precioBase;
    private int minClientes;

    public Proveedor(String nombre, Clasificacion clasificacion, double precioBase, int minClientes) {
        setNombre(nombre);
        setClasificacion(clasificacion);
        setPrecioBase(precioBase);
        setMinClientes(minClientes);
    }

    public String getNombre() {
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

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getMinClientes() {
        return minClientes;
    }

    public void setMinClientes(int minClientes) {
        this.minClientes = minClientes;
    }

    public abstract double calcularPrecioExtra(int clientesMaximos);

    public String toString() {
        return ("PROVEEDOR Nombre: " + getNombre() + " | " +
                "Clasificacion: " + getClasificacion() + "\n" +
                "Precio Base: " + getPrecioBase() + "\n");
    }
}
