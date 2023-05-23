package michelli.Brito;

import java.util.Arrays;
import java.util.List;

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
//       List<michelli.Brito.Cliente> clientes = Arrays.asList(c1, c2, c3);
//        for (michelli.Brito.Cliente cliente : clientes) {
//            System.out.println(cliente.getNome());
//            System.out.println(cliente.getSenha());
//        }


        //MOTODO DEFAULT ITERABLE -> FOR EACH
//        List<michelli.Brito.Cliente> clientes = Arrays.asList(c1, c2, c3);
//        michelli.Brito.mostraCliente mc = new michelli.Brito.mostraCliente();
//        clientes.forEach(mc);

        // METODO CLASSE ANONIMA: nao precisa criar a classe "michelli.Brito.mostraCliente"
//        List<michelli.Brito.Cliente> clientes = Arrays.asList(c1, c2, c3);
//        Consumer<michelli.Brito.Cliente> consumer = new Consumer<michelli.Brito.Cliente>() {
//            public void accept(michelli.Brito.Cliente c) {
//                System.out.println(c.getNome());
//                System.out.println(c.getSenha());
//            }
//        };
//        clientes.forEach(consumer);

        // METODO LAMBDA :
//        List<michelli.Brito.Cliente> clientes = Arrays.asList(c1, c2, c3);
//        Consumer<michelli.Brito.Cliente> consumidor = c -> System.out.println(c.getNome());
//        clientes.forEach(consumidor);

        // METODO LAMBDA REDUZIDO (usa se com uma interface funcional):
        List<Cliente> clientes = Arrays.asList(c1, c2, c3);
        clientes.forEach ( c -> System.out.println(c.getNome()));

        //METODO RUN ( nao precisa de argumento )
        Runnable r = () -> System.out.println("ola mundo!");
        new Thread(r).start();

    }
}
