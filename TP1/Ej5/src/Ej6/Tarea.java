package Ej5;

import java.time.LocalDate;

public class Tarea {

    private String prioridad;
    private String estado;
    private String descripcion;
    private LocalDate fechaLimite;

    public Tarea(String prioridad, String estado, String descripcion, LocalDate fechaLimite){
        setPrioridad(prioridad);
        setEstado(estado);
        setDescripcion(descripcion);
        setFechaLimite(fechaLimite);
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public boolean isVencida(){
        LocalDate horaActual = LocalDate.now();
        return horaActual.isAfter(getFechaLimite());
    }

    public boolean isCompleta(){
        return estado.equals("completa");
    }

    public String getTarea(){
        String devolucion = "";

        if (isVencida()){
            devolucion += "(Vencida) ";
        }

        devolucion += getDescripcion() + " Fecha limite: " + getFechaLimite().toString() + " Estado: " + getEstado();

        return devolucion;
    }
}
