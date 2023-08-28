package ej6;

public class Libro {

    // atributos
   private String titulo;
   private String autor;
   private int num_paginas;
   private int num_ejemplares;
   private int num_ejemplares_prestados;

    //getters y setters
    public Libro(String titulo, String autor, int num_paginas, int num_ejemplares){
        this.titulo = titulo;
        this.autor = autor;
        this.num_paginas = num_paginas;
        this.num_ejemplares = num_ejemplares;
        num_ejemplares_prestados = 0;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getNum_paginas(){
        return num_paginas;
    }

    public int getNum_ejemplares_prestados(){
        return num_ejemplares_prestados;
    }

    public void descripcion(){
        System.out.println(
                "El libro '" + titulo
                + "' creado por el autor "
                + autor + " tiene "
                + num_paginas + " paginas, quedan "
                + (num_ejemplares - num_ejemplares_prestados) + " disponibles y se prestaron "
                + num_ejemplares_prestados);
    }

    public boolean puedePrestar(){
        return (num_ejemplares - num_ejemplares_prestados) > 1;
    }

    public void prestado(){
        num_ejemplares_prestados++;
    }
}