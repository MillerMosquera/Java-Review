package OOP.Ejercicios.Basicos.Contacto;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    private static final List<Contacto> contactos = new ArrayList<>();

    public static void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public static void buscarContacto(String nombre) {
        try {
            for (Contacto contact : contactos) {
                if (nombre.equalsIgnoreCase(contact.getNombre())) {
                    System.out.println("El contacto encontrado es: "
                            + contact.getNombre() + ", con email: " + contact.getEmail()
                            + ", y teléfono: "
                            + contact.getTelefono());
                    break;
                } else System.out.println("Contacto no encontrado");
            }
        } catch (ContactoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void eliminarContacto(String nombre) {
        try {
            for (Contacto contact : contactos) {
                if (nombre.equalsIgnoreCase(contact.getNombre())) {
                    contactos.remove(contact);
                    System.out.println("Contacto eliminado");
                    break;
                }
            }
        } catch (ContactoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void mostrarContacto() {
        for (Contacto contact : contactos) {
            contact.mostrarContacto();
        }
    }


}
