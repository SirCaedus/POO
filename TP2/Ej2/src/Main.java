import Ej2.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //inicializo el sistema
        Sistema sistema = new Sistema();

        // Crear instancias de Proveedor
        Proveedor transporte1 = new Proveedor("JetSmart", Clasificacion.TRANSPORTE);
        Proveedor hospedaje1 = new Proveedor("RIU Hotel", Clasificacion.HOSPEDAJE);
        Proveedor excursion1 = new Proveedor("Trekking", Clasificacion.EXCURSION);
        Proveedor transporte2 = new Proveedor("BuqueBus", Clasificacion.TRANSPORTE);
        Proveedor hospedaje2 = new Proveedor("Hostel 'Sarita'", Clasificacion.HOSPEDAJE);
        Proveedor excursion2 = new Proveedor("Buceo", Clasificacion.EXCURSION);
        Proveedor transporte3 = new Proveedor("FlechaBus", Clasificacion.TRANSPORTE);
        Proveedor hospedaje3 = new Proveedor("Cabañas 'Doña Elisa'", Clasificacion.HOSPEDAJE);
        Proveedor excursion3 = new Proveedor("Tour local", Clasificacion.EXCURSION);

        sistema.nuevoProveedor(transporte1);
        sistema.nuevoProveedor(hospedaje1);
        sistema.nuevoProveedor(excursion1);
        sistema.nuevoProveedor(transporte2);
        sistema.nuevoProveedor(hospedaje2);
        sistema.nuevoProveedor(excursion2);
        sistema.nuevoProveedor(transporte3);
        sistema.nuevoProveedor(hospedaje3);
        sistema.nuevoProveedor(excursion3);

        sistema.proveedores();

        // Crear instancias de Cliente
        Cliente cliente1 = new Cliente("Juan Gonzalez");
        Cliente cliente2 = new Cliente("Martin Mansilla");
        Cliente cliente3 = new Cliente("Josue Ramirez");
        Cliente cliente4 = new Cliente("Carolina Alvarez");

        sistema.nuevoCliente(cliente1);
        sistema.nuevoCliente(cliente2);
        sistema.nuevoCliente(cliente3);
        sistema.nuevoCliente(cliente4);

        sistema.clientes();

        // Crear instancias de Paquete

        Paquete paquete1 = sistema.nuevoPaquete("Playa Tropical", transporte1, hospedaje1, excursion1);
        Paquete paquete2 = sistema.nuevoPaquete("Montañas Verdes", transporte2, hospedaje2, excursion2);
        Paquete paquete3 = sistema.nuevoPaquete("Ciudad Histórica", transporte3, hospedaje3, excursion3);
        paquete3.addExcursion(excursion1);

        sistema.paquetes();

        //crear instancias de compras

        sistema.compra(cliente1, paquete1, LocalDate.now());
        sistema.compra(cliente2, paquete2, LocalDate.now());
        sistema.compra(cliente3, paquete3, LocalDate.now());
        sistema.compra(cliente4, paquete2, LocalDate.now());

        sistema.ventas();

    }
}