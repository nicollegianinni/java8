import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class test {

    public static void main(String[] args) {

        //novos objetos criados e inseridas informações pelo metodo construtor
        Cliente c1 = new Cliente("Nicolle", true, "123");
        Cliente c2 = new Cliente("Cassio", true, "456");
        Cliente c3 = new Cliente("Maria", true, "789");

        // PARA TESTAR A AUTENTICAÇÃO DA SENHA
        c1.autenticaSenha("235");
        c2.autenticaSenha("456");


        // CRIAÇÃO DE LISTA METODO TRADICIONAL
//       List<Cliente> clientes = Arrays.asList(c1, c2, c3);
//        for (Cliente cliente : clientes) {
//            System.out.println(cliente.getNome());
//            System.out.println(cliente.getSenha());
//        }


        //MOTODO DEFAULT ITERABLE -> FOR EACH
//        List<Cliente> clientes = Arrays.asList(c1, c2, c3);
//        mostraCliente mc = new mostraCliente();
//        clientes.forEach(mc);

        // METODO CLASSE ANONIMA: nao precisa criar a classe "mostraCliente"
//        List<Cliente> clientes = Arrays.asList(c1, c2, c3);
//        Consumer<Cliente> consumer = new Consumer<Cliente>() {
//            public void accept(Cliente c) {
//                System.out.println(c.getNome());
//                System.out.println(c.getSenha());
//            }
//        };
//        clientes.forEach(consumer);

        // METODO LAMBDA :
//        List<Cliente> clientes = Arrays.asList(c1, c2, c3);
//        Consumer<Cliente> consumidor = c -> System.out.println(c.getNome());
//        clientes.forEach(consumidor);

        // METODO LAMBDA REDUZIDO (usa se com uma interface funcional):
        List<Cliente> clientes = Arrays.asList(c1, c2, c3);
        clientes.forEach ( c -> System.out.println(c.getNome()));

        //METODO RUN ( nao precisa de argumento )
        Runnable r = () -> System.out.println("ola mundo!");
        new Thread(r).start();

    }
}
