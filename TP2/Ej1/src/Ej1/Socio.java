package Ej1;

import java.time.LocalDate;

public class Socio {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private int dni;
    private String email;
    private String direccion;
    private String telefono;
    private Suscripcion suscripcion;
    private LocalDate fechaInscripcion;

    public Socio(String nombre, String apellido,
                 LocalDate fechaNacimiento, int dni,
                 String email, String direccion,
                 String telefono, Suscripcion suscripcion,
                 LocalDate fechaInscripcion) {

        setNombre(nombre);
        setApellido(apellido);
        setFechaNacimiento(fechaNacimiento);
        setDni(dni);
        setEmail(email);
        setDireccion(direccion);
        setTelefono(telefono);
        setSuscripcion(suscripcion);
        setFechaInscripcion(fechaInscripcion);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }


    public String toString() {
       String acumulador = getNombre() + " " + getApellido()
                + " Fecha Nacimiento: " + getFechaNacimiento()
                + " DNI: " + getDni()
                + " Email: " + getEmail()
                + " Direccion: " + getDireccion()
                + " Telefono: " + getTelefono()
                + " Suscripcion: " + getSuscripcion()
                + "\n";

        return acumulador;
    }
}
