package Ej12;

import java.time.LocalDate;

public class Tarea {
    private String prioridad;
    private String estado;
    private String descripcion;
    private LocalDate fechaLimite;
    private LocalDate fechaRecordatorio;

    public Tarea(String prioridad, String estado, String descripcion, LocalDate fechaLimite){
        setPrioridad(prioridad);
        setEstado(estado);
        setDescripcion(descripcion);
        setFechaLimite(fechaLimite);
        fechaRecordatorio = null;
    }

    public Tarea(String prioridad, String estado, String descripcion, LocalDate fechaLimite, LocalDate fechaRecordatorio){
        setPrioridad(prioridad);
        setEstado(estado);
        setDescripcion(descripcion);
        setFechaLimite(fechaLimite);
        setFechaRecordatorio(fechaRecordatorio);
    }

    public String getPrioridad() {
        return prioridad;
    }

    private LocalDate getFechaActual(){
        return LocalDate.now();
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public LocalDate getFechaRecordatorio(){
        return fechaRecordatorio;
    }

    private void setFechaRecordatorio(LocalDate fechaRecordatorio) {
        this.fechaRecordatorio = fechaRecordatorio;
    }

    public boolean isVencida(){
        return getFechaActual().isAfter(getFechaLimite());
    }

    public boolean isPorVencer(){
        return getFechaRecordatorio().isAfter(getFechaActual()) || getFechaRecordatorio().isEqual(getFechaActual());
    }

    public boolean isCompleta(){
        return estado.equals("completa");
    }

    public String getTarea(){
        String devolucion = "";

        if (isVencida()){
            devolucion += "(Vencida) ";
        } else if(isPorVencer()){
            devolucion += "(Por vencer) ";
            setPrioridad("Alta");
        }

        devolucion += getDescripcion() + "\nFecha limite: " + getFechaLimite().toString() + "\nPrioridad: " + getPrioridad() + "\nEstado: " + getEstado() + "\n";

        return devolucion;
    }
}
