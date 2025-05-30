package OOP.Ejercicios.Intermedios.Biblioteca;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Libro implements IPrestable{

    private String titulo;
    private String autor;
    private String ISBN;
    private int anoPublicacion;
    private int cantidad; //Cantidad de ejemplares disponibles
    private String genero;
    private EstadoLibro estado;
    public Libro(String titulo, String autor, String ISBN, int anoPublicacion, int cantidad, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.anoPublicacion = anoPublicacion;
        this.cantidad = cantidad;
        this.genero = genero;
        this.estado = EstadoLibro.DISPONIBLE;

    }
    @Override
    public void prestar() throws PrestamoException{
        if(estado != EstadoLibro.DISPONIBLE){
            System.out.println("Libro no disponible");
        }
        estado = EstadoLibro.PRESTADO;
    }
    @Override
    public void devolver() {
        estado = EstadoLibro.DISPONIBLE;
    }

    public boolean estadoDisponible(){
        return estado == EstadoLibro.DISPONIBLE;
    }
}
