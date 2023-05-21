import java.util.Arrays;
import java.util.List;
import java.lang.*;

public class test {

    public static void main(String[] args) {

        //novos objetos
        Cliente c1 = new Cliente("Nicolle", true, "123");
        Cliente c2 = new Cliente("Cassio", true, "456");
        Cliente c3 = new Cliente("Maria", true, "789");


        //criacao de uma lista definida


        List<Cliente> clientes = Arrays.asList(c1, c2, c3);
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNome());
            System.out.println(cliente.getSenha());
        }
    }
}
