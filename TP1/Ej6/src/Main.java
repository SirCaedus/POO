import ej6.Biblioteca;

class Main {
    public static void main(String[] args) {
        System.out.println("Probando Sistema. Creando libros.");

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro("1984","George Orwell",294,10);
        biblioteca.agregarLibro("Un mundo feliz","Aldous Huxley",215,1);

        System.out.println("Libros creados. Leyendo descripcion.");
        biblioteca.buscarLibro("1984");
        biblioteca.buscarLibro("Un mundo feliz");

        System.out.println("Libro que tiene más paginas: ");
        biblioteca.compararLibros("1984","Un mundo feliz");

        System.out.println("Probando prestar libros.");
        biblioteca.prestarLibro("1984");
        biblioteca.prestarLibro("Un mundo feliz");

    }
}