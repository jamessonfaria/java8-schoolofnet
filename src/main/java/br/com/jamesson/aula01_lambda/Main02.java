package br.com.jamesson.aula01_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main02 {

    public static void main(String[] args) {

        List<String> strs = Arrays.asList("Leonan", "SON", "Java 8", "Leonidas");

        // Java 7
        for (String str : strs){
            System.out.println(str);
        }

        System.out.println("--------------------");

        // Java 8
        strs.forEach(str -> System.out.println(str));

        System.out.println("--------------------");

        // Java 8 com Stream
        List<String> result = strs.stream()
                .filter(str -> str.startsWith("L"))
                .collect(Collectors.toList());

        result.forEach(System.out::println);

    }

}
