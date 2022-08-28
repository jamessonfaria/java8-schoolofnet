package br.com.jamesson.aula03_functional_interface;

@FunctionalInterface
public interface MyInterface {

    void print(String s);

    default void body (String s){
        System.out.println(s);
    }

}
