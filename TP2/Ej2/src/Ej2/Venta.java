package Ej2;

import java.time.LocalDate;

public class Venta {

    private Integer idVenta;
    private Cliente cliente;
    private Paquete paquete;
    private LocalDate fecha;

    public Venta(Integer idVenta, Cliente cliente, Paquete paquete, LocalDate fecha) {
        setIdVenta(idVenta);
        setCliente(cliente);
        setPaquete(paquete);
        setFecha(fecha);
    }
    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String toString() {
        return ("VENTA ID: " + getIdVenta() + "\n" + paquete.toString());
    }
}
