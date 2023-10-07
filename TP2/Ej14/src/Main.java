import Ej14.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //inicializo el sistema
        Sistema sistema = new Sistema();

        // Crear instancias de Proveedor
        Transporte transporte1 = new Transporte("JetSmart", Clasificacion.TRANSPORTE,1500,50);
        Hospedaje hospedaje1 = new Hospedaje("RIU Hotel", Clasificacion.HOSPEDAJE,2000,60);
        GuiaTuristico guia1 = new GuiaTuristico("Trekking", Clasificacion.GUIA_TURISTICO,100,10);
        Transporte transporte2 = new Transporte("BuqueBus", Clasificacion.TRANSPORTE,1000,20);
        Hospedaje hospedaje2 = new Hospedaje("Hostel 'Sarita'", Clasificacion.HOSPEDAJE,800,10);
        GuiaTuristico guia2 = new GuiaTuristico("Buceo", Clasificacion.GUIA_TURISTICO,500,5);
        Transporte transporte3 = new Transporte("FlechaBus", Clasificacion.TRANSPORTE,900,15);
        Hospedaje hospedaje3 = new Hospedaje("Cabañas 'Doña Elisa'", Clasificacion.HOSPEDAJE,700,5);
        GuiaTuristico guia3 = new GuiaTuristico("Tour local", Clasificacion.GUIA_TURISTICO,200,10);

        sistema.nuevoProveedor(transporte1);
        sistema.nuevoProveedor(hospedaje1);
        sistema.nuevoProveedor(guia1);
        sistema.nuevoProveedor(transporte2);
        sistema.nuevoProveedor(hospedaje2);
        sistema.nuevoProveedor(guia2);
        sistema.nuevoProveedor(transporte3);
        sistema.nuevoProveedor(hospedaje3);
        sistema.nuevoProveedor(guia3);

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

        Paquete paquete1 = new Paquete("Playa Tropical", 50,transporte1, hospedaje1, guia1);
        Paquete paquete2 = new Paquete("Montañas Verdes", 100,transporte2, hospedaje2, guia2);
        Paquete paquete3 = new Paquete("Ciudad Histórica", 20,transporte3, hospedaje3, guia3);

        sistema.nuevoPaquete(paquete1);
        sistema.nuevoPaquete(paquete2);
        sistema.nuevoPaquete(paquete3);

        sistema.paquetes();

        //crear instancias de compras

        sistema.compra(cliente1, paquete1, LocalDate.now());
        sistema.compra(cliente2, paquete2, LocalDate.now());
        sistema.compra(cliente3, paquete3, LocalDate.now());
        sistema.compra(cliente4, paquete2, LocalDate.now());

        sistema.ventas();
    }
}