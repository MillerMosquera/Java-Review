package Thread;

import Thread.threads.NombreThreads;

public class ExtenderThreads {
    /*
    * Los threads (hilos) o también llamados subprocesos
    * es una característica de Java que permite la ejecución
    * simultánea de dos o más partes de un programa
    * para la máxima utilización de la CPU.
    * */
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThreads("Miller");
        hilo.start();
        //Thread.sleep(2);
        Thread hilo2 = new NombreThreads("María");
        hilo2.start();
        System.out.println(hilo.getState());
    }
}
