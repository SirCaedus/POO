package Ej14;

public class Transporte extends Proveedor {
    public Transporte(String nombre, Clasificacion clasificacion, double precioBase, int minClientes) {
        super(nombre,clasificacion, precioBase, minClientes);
    }

    @Override
    public double calcularPrecioExtra(int clientesMaximos) {
        double precioCatering = getPrecioBase() * 0.3 / 100;
        System.out.println(precioCatering);
        return getPrecioBase() + (precioCatering * clientesMaximos);
    }
}
