package OOP.Ejercicios.Intermedios.Biblioteca;

import java.util.Date;

public class Prestamo {
    private Libro libro;
    private Date fechaDevolucion;

    public Prestamo(Libro libro, Date fechaDevolucion){
        this.libro = libro;
        this.fechaDevolucion = fechaDevolucion;
    }
}
