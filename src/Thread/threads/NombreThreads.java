package Thread.threads;

public class NombreThreads extends Thread{

    public NombreThreads(String name) {
        super(name);
    }

    @Override
    public void run(){
        System.out.println("Se inicia el método run del hilo " + getName());

        for (int i = 0; i < 10;i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(getName());
        }
        System.out.println("finaliza el hilo");
    }
}
