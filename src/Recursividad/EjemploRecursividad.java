package Recursividad;

import java.util.stream.Stream;

public class EjemploRecursividad {
    public static void main(String[] args) {

        Componente pc = new Componente("Gabinete Pc");
        Componente poder = new Componente("Fuente de poder 700W");
        Componente placaMadre = new Componente("Main Board Asus sockets AMD");
        Componente CPU = new Componente("AMD Ryzen 7 3800X");
        Componente ventilador = new Componente("Cooler Master 120mm");
        Componente Disipador = new Componente("Disipador de calor");
        Componente gpu = new Componente("Nvidia RTX 2080 Super");
        Componente memoriaRam = new Componente("Kingston 16GB DDR4");
        Componente discoDuro = new Componente("SSD M.2 1TB");
        Componente tarjetaVideo = new Componente("Nvidia RTX 2080 Super");


        CPU.addComponent(ventilador)
                .addComponent(Disipador);

        placaMadre.addComponent(gpu)
                .addComponent(memoriaRam)
                .addComponent(discoDuro)
                .addComponent(tarjetaVideo)
                .addComponent(CPU)
                .addComponent(ventilador);

        pc.addComponent(poder)
                .addComponent(placaMadre)
                .addComponent(new Componente("Teclado"))
                .addComponent(new Componente("Mouse"));

        //metodoRecursivo(pc, 0);
        metodoRecursivoJava8(pc, 0).forEach(c -> System.out.println("\t".repeat(c.getNivel()) + c.getNombre()));

    }

    public static Stream<Componente> metodoRecursivoJava8(Componente c, int nivel) {
        c.setNivel(nivel);
        return Stream.concat(Stream.of(c),
                c.getHijos().stream().flatMap(hijo -> metodoRecursivoJava8(hijo, nivel + 1)));
    }

    public static void metodoRecursivo(Componente c, int nivel) {
        System.out.println("\t".repeat(nivel) + c.getNombre());
        if (!c.tieneHijos()) {
            for (Componente hijo : c.getHijos()) {
                metodoRecursivo(hijo, nivel + 1);
            }
        }
    }


}
