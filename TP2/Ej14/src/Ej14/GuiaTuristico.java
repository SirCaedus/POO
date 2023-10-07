package Ej14;

public class GuiaTuristico extends Proveedor {
    public GuiaTuristico(String nombre, Clasificacion clasificacion, double precioBase, int minClientes){
        super(nombre,clasificacion,precioBase,minClientes);
    }

    public double calcularPrecioExtra(int clientesMaximos){
        if (clientesMaximos > 200) {
            return getPrecioBase() + 90;
        }
        return getPrecioBase();
    }
}
