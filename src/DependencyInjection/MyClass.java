package DependencyInjection;

import java.util.logging.Logger;

public class MyClass {

    /*La inyección de dependencia (DI) es el concepto en el que los objetos
    obtienen otros objetos requeridos desde el exterior.
     */

    private Logger logger;

    public MyClass(Logger logger){
        this.logger = logger;
        //Escribir información del logger
        logger.info("This is a log message.");
    }
}
