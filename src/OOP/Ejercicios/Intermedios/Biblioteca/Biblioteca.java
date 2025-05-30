package OOP.Ejercicios.Intermedios.Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private static Biblioteca instancia = null;
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    //singleton
    /*
    Se verifica si ya se ha creado una instancia de la Biblioteca.
    Si no existe, se crea una nueva; de lo contrario, se devuelve la instancia existente.
    Esto garantiza que siempre haya una sola instancia de Biblioteca.
    */
    public static Biblioteca getInstance() {
        if (instancia == null) {
            instancia = new Biblioteca();
        }
        return instancia;
    }

    //agregar libros
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    //mostrar libros
    public void mostrarLibro() {
        for (Libro libro : libros) {
            System.out.println(new StringBuilder()
                    .append("Titulo: ").append(libro.getTitulo())
                    .append("Autor: ").append(libro.getAutor())
                    .append("ISBN: ").append(libro.getISBN())
                    .append("Año de publicacion: ").append(libro.getAnoPublicacion())
                    .append("Cantidad: ").append(libro.getCantidad())
                    .append("Genero: ").append(libro.getGenero())
                    .append("Estado: ").append(libro.getEstado()));
        }
    }

    //buscar libros
    public Libro buscarLibroPorTitulo(String titulo) {
        try {
            for (Libro libro : libros) {
                if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                    System.out.println(new StringBuilder()
                            .append("Titulo: ").append(libro.getTitulo())
                            .append("Autor: ").append(libro.getAutor())
                            .append("ISBN: ").append(libro.getISBN())
                            .append("Año de publicacion: ").append(libro.getAnoPublicacion())
                            .append("Cantidad: ").append(libro.getCantidad())
                            .append("Genero: ").append(libro.getGenero())
                            .append("Estado: ").append(libro.getEstado())
                            .toString());
                    return libro;
                }
            }
            return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    //prestar libro
    public void prestarLibro(Libro libro) {
        try {
            libro.prestar();
            System.out.println(new StringBuilder().
                    append("El libro ").
                    append(libro.getTitulo()).
                    append(" ha sido prestado"));
        } catch (PrestamoException e) {
            System.out.println(e.getMessage());
        }
    }

    //devolver libro
    public void devolverLibro(Libro libro) {
        libro.devolver();
        System.out.println(new StringBuilder().
                append("El libro ").
                append(libro.getTitulo()).
                append(" ha sido devuelto"));
    }


}
