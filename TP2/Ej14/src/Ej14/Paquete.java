package Ej14;

import java.util.ArrayList;
import java.util.List;

public class Paquete {
    private String destino;
    private Double precio;
    private Integer clientesMaximos;
    private final ArrayList<Proveedor> proveedores = new ArrayList<>();

    public Paquete(String destino, Integer clientesMaximos, Proveedor... proveedoresParam) {
        setDestino(destino);
        setClientesMaximos(clientesMaximos);

     /*   proveedores.add(proveedor1);
        proveedores.add(proveedor2);
        proveedores.add(proveedor3);

        setPrecio(proveedor1.calcularPrecioExtra(getClientesMaximos()) +
                  proveedor2.calcularPrecioExtra(getClientesMaximos()) +
                  proveedor3.calcularPrecioExtra(getClientesMaximos())); */

        double precioTotal = 0.0;
        for (Proveedor proveedor : proveedoresParam) {
            proveedores.add(proveedor);
            precioTotal += proveedor.calcularPrecioExtra(getClientesMaximos());
        }
        setPrecio(precioTotal);
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getClientesMaximos() {
        return clientesMaximos;
    }

    public void setClientesMaximos(Integer clientesMaximos) {
        this.clientesMaximos = clientesMaximos;
    }

    public String toString(){
        String acumulador = "";
        acumulador += "PAQUETE DESTINO: " + getDestino() +
                      "\nPRECIO: " + getPrecio() +
                      "\nCLIENTES MAXIMOS: " + getClientesMaximos() +
                      "\nPROVEEDORES: " + "\n";

        for (Proveedor elemento: proveedores) {
            acumulador += elemento.toString();
        }

        return acumulador;
    }
}
