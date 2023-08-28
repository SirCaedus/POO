package ej6;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> biblioteca = new ArrayList<>();

    public int cantidadPrestamos(){
        int cantidad = 0;
        for (Libro libros : biblioteca){
            cantidad += libros.getNum_ejemplares_prestados();
        }

        return cantidad;
    }

    public void agregarLibro(String titulo, String autor, int num_paginas, int num_ejemplares){
        Libro libro = new Libro(titulo, autor, num_paginas, num_ejemplares);
        biblioteca.add(libro);
    }

    private Libro existeLibro(String titulo){
        for (Libro libros : biblioteca){
            if (titulo.equals(libros.getTitulo())){
                return libros;
            }
        }
        return null;
    }

    public void buscarLibro(String titulo){
        Libro libro = existeLibro(titulo);

        if (libro == null){
            System.out.println("Lo sentimos, ese libro no existe en la biblioteca.");
        } else {
            libro.descripcion();
        }
    }

    public void prestarLibro(String titulo){
        Libro libro = existeLibro(titulo);

        if (libro == null){
            System.out.println("Lo sentimos, ese libro no existe en la biblioteca.");
        } else {
            if (!libro.puedePrestar()){
                System.out.println("Lo sentimos, no hay suficientes ejemplares en la biblioteca para prestar este libro.");
            } else {
                libro.prestado();
                System.out.println("Libro prestado con éxito.");
            }
        }
    }

    public void compararLibros(String titulo1, String titulo2){
        Libro libro1 = existeLibro(titulo1);
        Libro libro2 = existeLibro(titulo2);

        if ((libro1 == null) || (libro2 == null)){
            System.out.println("Lo sentimos, uno de esos libros no existe en la biblioteca.");
        } else {
            int paginas1 = libro1.getNum_paginas();
            int paginas2 = libro2.getNum_paginas();

            if (paginas1 > paginas2){
                System.out.println("El libro " + titulo1 + " tiene mas paginas.");
            }

            if (paginas1 < paginas2){
                System.out.println("El libro " + titulo2 + " tiene mas paginas.");
            }

            if (paginas1 == paginas2){
                System.out.println("Los dos libros tienen la misma cantidad de paginas.");
            }
        }
    }


}
