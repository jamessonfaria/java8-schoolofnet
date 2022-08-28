package br.com.jamesson.aula01_lambda;

public class Main {

    public static void main(String[] args) {

        // Java 7 ou inferior
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello school of net - Java 8");
            }
        };
        new Thread(run).start();

        // Java 8
        Runnable run1 = () -> System.out.println("Hello school of net - Java 8");
        new Thread(run1).start();

        new Thread(() -> System.out.println("Hello school of net - Java 8"));
    }

}
