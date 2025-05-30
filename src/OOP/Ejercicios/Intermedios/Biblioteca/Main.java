package OOP.Ejercicios.Intermedios.Biblioteca;

public class Main {
    public static void main(String[] args) {

        // instanciar biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // instanciar libros y agregarlos a la biblioteca
        Libro libro1 = new Libro("Java for Beginners", "John Smith", "1234567890", 2020, 5, "Programming");
        Libro libro2 = new Libro("Design Patterns", "Gang of Four", "0987654321", 1994, 3, "Programming");
        Libro libro3 = new Libro("To Kill a Mockingbird", "Harper Lee", "5678901234", 1960, 7, "Fiction");
        Libro libro4 = new Libro("The Great Gatsby", "F. Scott Fitzgerald", "4321098765", 1925, 4, "Fiction");
        Libro libro5 = new Libro("Thinking, Fast and Slow", "Daniel Kahneman", "1112223334", 2011, 6, "Psychology");
        //Agregar Libro
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);
        //mostrar Libro
        biblioteca.mostrarLibro();
        //Buscar Libro por titulo
        biblioteca.buscarLibroPorTitulo("Java for Beginners");
        //prestar libro
        biblioteca.prestarLibro(libro1);
        //devolver libro
        biblioteca.devolverLibro(libro1);




    }
}
