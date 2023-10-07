package Ej14;

import java.time.LocalDate;
import java.util.*;

public class Sistema {
    private final ArrayList<Paquete> listaPaquetes = new ArrayList<>();
    private final ArrayList<Cliente> listaClientes = new ArrayList<>();
    private final ArrayList<Proveedor> listaProveedores = new ArrayList<>();
    private final ArrayList<Venta> listaVentas = new ArrayList<>();

    public void nuevoPaquete(Paquete paquete) {
            listaPaquetes.add(paquete);
    }

    public void nuevoCliente(Cliente cliente){
        listaClientes.add(cliente);
    }

    public void nuevoProveedor(Proveedor proveedor){
        listaProveedores.add(proveedor);
    }

    public void paquetes() {
        System.out.println("---- Lista de paquetes: ----\n");
        ejecutarInformacion(listaPaquetes);
    }

    public void clientes() {
        System.out.println("---- Lista de clientes: ----\n");
        ejecutarInformacion(listaClientes);
    }

    public void proveedores() {
        System.out.println("---- Lista de proveedores: ----\n");
        ejecutarInformacion(listaProveedores);
    }

    public void ventas() {
        System.out.println("---- Lista de ventas: ----\n");
        ejecutarInformacion(listaVentas);

        // Crear un HashMap para realizar un seguimiento del recuento de destinos
        Map<String, Integer> recuentoDestinos = new HashMap<>();
        for (Venta venta : listaVentas) {
            String destino = venta.getPaquete().getDestino();
            recuentoDestinos.put(destino, recuentoDestinos.getOrDefault(destino, 0) + 1);
        }

        // Encontrar el destino que más se repite
        String destinoMasRepetido = Collections.max(
                recuentoDestinos.entrySet(),
                Map.Entry.comparingByValue()
        ).getKey();

        System.out.println("El destino que más se repite es: " + destinoMasRepetido);
    }

    private <T> void ejecutarInformacion(ArrayList<T> lista){
        for (T elemento : lista){
            System.out.println(elemento.toString());
        }
    }

    public void compra(Cliente cliente, Paquete paquete, LocalDate fechaCompra) {
        Integer idVenta = listaVentas.size() + 1;
        Venta venta = new Venta(idVenta,cliente, paquete, fechaCompra);
        listaVentas.add(venta);
        listaVentas.sort(Comparator.comparing(ventas -> ventas.getPaquete().getDestino()));
    }
}
