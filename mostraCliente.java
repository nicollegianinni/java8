import java.util.function.*;


// classe abstrata
public class mostraCliente implements Consumer<Cliente>{
    public void accept (Cliente c) {
        System.out.println(c.getNome());
        System.out.println(c.getSenha());
    }
}


