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
            Contacto encontrado = null;
            for (Contacto contact : contactos) {
                if (nombre.equalsIgnoreCase(contact.getNombre())) {
                    encontrado = contact;
                    break;
                } else System.out.println("Contacto no encontrado");
            }
            if (encontrado == null) {
                throw new ContactoNoEncontradoException("Contacto no encontrado");
            }
            System.out.println("El contacto encontrado es: " + encontrado.getNombre()
                    + ", con email: " + encontrado.getEmail() + ", y teléfono: "
                    + encontrado.getTelefono());
        } catch (ContactoNoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void eliminarContacto(String nombre) {
        try {
            boolean eliminado = false;
            for (Contacto contact : contactos) {
                if (nombre.equalsIgnoreCase(contact.getNombre())) {
                    contactos.remove(contact);
                    eliminado = true;
                    break;
                }
            }
            if(!eliminado){
                throw new ContactoNoEncontradoException("No se pudo eliminar: contacto no encontrado");
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
