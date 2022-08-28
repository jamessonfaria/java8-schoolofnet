package br.com.jamesson.aula03_functional_interface;

public class Main {

    public static void main(String[] args) {

        // Java 7 ou inferior
        MyInterface myInterface = new MyInterface() {
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        };
        myInterface.print("Java 7 implementation - Functional Interface");

        // Java 8
        MyInterface myInterface1 = s -> {
            System.out.println(s);
        };
        myInterface1.print("Java 8 implementation - Functional Interface 1");

        // podemos melhorar mais ainda
        MyInterface myInterface2 = s -> System.out.println(s);
        myInterface2.print("Java 8 implementation - Functional Interface 2");

        // e melhorar ainda mais partindo para usar o metodo reference
        MyInterface myInterface3 = System.out::println;
        myInterface3.print("Java 8 implementation - Functional Interface 3");

    }

}
