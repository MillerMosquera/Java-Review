package OOP.Ejercicios.Basicos.Contacto;

public class Contacto {

    private String nombre;
    private int telefono;
    private String email;

    public Contacto(String nombre, int telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public void mostrarContacto() {
        System.out.println("Contacto: " + nombre +
                "\nEmail: " + email +
                "\nTeléfono: " + telefono +
                "\n-----------------------");
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", email='" + email + '\'' +
                '}';
    }

}
