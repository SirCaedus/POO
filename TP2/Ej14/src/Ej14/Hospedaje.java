package Ej14;

public class Hospedaje extends Proveedor {

    public Hospedaje(String nombre, Clasificacion clasificacion, double precioBase, int minClientes) {
        super(nombre,clasificacion, precioBase, minClientes);
    }

    public double calcularPrecioExtra(int clientesMaximos) {
        double precio;
        if (getMinClientes() < clientesMaximos) {

            int aux =  (clientesMaximos - getMinClientes()) / 2;
            precio = getPrecioBase() - (getPrecioBase() * ((double) aux / 100));
        } else {
            precio = getPrecioBase();
        }

        return  precio;
    }
}
