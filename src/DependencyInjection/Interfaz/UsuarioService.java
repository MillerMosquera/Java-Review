package DependencyInjection.Interfaz;

public class UsuarioService {

    private Notificador notificador;
    public UsuarioService(Notificador notificador){
        this.notificador = notificador;
    }

    //Other methods
}
