package DependencyInjection.Setter;

public class ClienteService {

    //Inyección de dependencia mediante métodos de configuración setter en una clase
    private ClienteRepository clienteRepository;

    public ClienteService(){
        //Logic
    }

    public void setClienteRepository(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }
}
