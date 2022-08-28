package br.com.jamesson.aula02_method_reference;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> strs = Arrays.asList("Leonan", "SON", "Java 8", "Leonidas");

        // Java 7
        Person.say("");

        System.out.println("--------------------");

        // Java 8
        strs.forEach(str -> {
            Person.say(str);
        });

        // Java 8 chamando Metodo Reference
        strs.forEach(Person::say);

    }

}
