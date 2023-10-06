package Ej2;

import java.util.ArrayList;

public class Paquete {

    private Integer PaqueteId;
    private String destino;
    private Proveedor transporte;
    private Proveedor hospedaje;
    private final ArrayList<Proveedor> excursiones = new ArrayList<>();

    private Paquete(Integer id, String destino, Proveedor transporte, Proveedor hospedaje, Proveedor excursion) {
        setPaqueteId(id);
        setDestino(destino);
        setTransporte(transporte);
        setHospedaje(hospedaje);
        addExcursion(excursion);
    }

    public static Paquete generarPaquete(Integer id, String destino, Proveedor transporte,
                                         Proveedor hospedaje, Proveedor excursion){
        if (transporte.getClasificacion() != Clasificacion.TRANSPORTE) {
            System.out.println("ERROR: el transporte ingresado no está registrado como medio de transporte en nuestro sistema.");
            return null;
        }

        if (hospedaje.getClasificacion() != Clasificacion.HOSPEDAJE) {
            System.out.println("ERROR: el hospedaje ingresado no está registrado como hospedaje en nuestro sistema.");
            return null;
        }

        if (excursion.getClasificacion() != Clasificacion.EXCURSION) {
            System.out.println("ERROR: la excursión ingresada no está registrada como excursión en nuestro sistema.");
            return null;
        }

        return new Paquete(id, destino, transporte, hospedaje, excursion);
    }

    public void addExcursion(Proveedor excursion) {
        if(excursion.getClasificacion() != Clasificacion.EXCURSION){
            System.out.println("ERROR: la excursión ingresada no está registrada como excursión en nuestro sistema.");
        } else {
            excursiones.add(excursion);
        }
    }

    public Integer getPaqueteId() {
        return PaqueteId;
    }

    public void setPaqueteId(Integer paqueteId) {
        this.PaqueteId = paqueteId;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Proveedor getTransporte() {
        return transporte;
    }

    public void setTransporte(Proveedor transporte) {
        this.transporte = transporte;
    }

    public Proveedor getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(Proveedor hospedaje) {
        this.hospedaje = hospedaje;
    }

    public ArrayList<Proveedor> getExcursiones() {
        return excursiones;
    }

    public String toString(){
        String acumulador = "";
        acumulador += "PAQUETE ID: " + getPaqueteId() + " DESTINO: " + getDestino() + "\n" +
                    getTransporte().toString() + getHospedaje().toString();

        for (Proveedor elemento: excursiones) {
            acumulador += elemento.toString();
        }

        return acumulador;
    }
}
