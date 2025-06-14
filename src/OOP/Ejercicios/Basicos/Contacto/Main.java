package OOP.Ejercicios.Basicos.Contacto;

public class Main {
    public static void main(String[] args) {

        new Sistema();

        Sistema.agregarContacto(new Contacto("Miller", 432543678, "miller@gamil.com"));
        Sistema.agregarContacto(new Contacto("Sair", 987345238, "sair@gamil.com"));

        Sistema.mostrarContacto();
        Sistema.buscarContacto("Miller");
        Sistema.eliminarContacto("Sair");
        Sistema.mostrarContacto();


    }
}
