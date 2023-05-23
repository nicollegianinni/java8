package excript.com;

public class Runnable {

    // Classe anonima Runnable em construção

    public static void main(String[] args) {
        System.out.println("======inicio do teste======");

        //implementação da classe anonima Runnable
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println(" Estudando a expressao lambda 1 !");
            }
        };
    }
}

//implementação da classe anonima Runnable com lambda
//Runnable r2 = () -> System.out.println("Estudando a expressao lambda 2");
//        r1.run();
//        r2.run();




