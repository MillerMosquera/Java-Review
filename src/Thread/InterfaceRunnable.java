package Thread;

import Thread.runnable.ViajeTarea;

public class InterfaceRunnable {
    public static void main(String[] args) {

        new Thread(new ViajeTarea("Isla de Pascua")).start();
        new Thread(new ViajeTarea("Robinson Crusoe")).start();
        new Thread(new ViajeTarea("Juan Fernande")).start();
        new Thread(new ViajeTarea("Isla de Chiloe")).start();

    }
}
