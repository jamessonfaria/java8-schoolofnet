package br.com.jamesson.aula05_optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        Person person1 = new Person("Carlos");
        Person person2 = new Person("Maria");
        Person person3 = new Person("João");
        Person person4 = null;

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        // se executar essa linha teremos o nullpointer
        //people.forEach(p -> System.out.println(p.getName()));

        System.out.println("-------------------");

        // Usando o Optional
        Optional<Person> op = Optional.of(person1);
        op.ifPresent(p -> System.out.println(p.getName()));

        System.out.println("-------------------");

        List<Optional<Person>> optionals = new ArrayList<>();
        optionals.add(Optional.of(person1));
        optionals.add(Optional.of(person2));
        optionals.add(Optional.of(person3));
        optionals.add(Optional.ofNullable(person4));

        optionals.stream()
                .filter(p -> p.isPresent())
                .forEach(p -> System.out.println(p.get().getName()));

    }

}
