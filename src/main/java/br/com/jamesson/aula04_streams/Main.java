package br.com.jamesson.aula04_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,0,0,10,0,8);

        // filtrar diferente de zero
        List<Integer> filteredNumber = numbers.stream()
                .filter(number -> number != 0)
                .collect(Collectors.toList());

        filteredNumber.forEach(System.out::println);

        System.out.println("----------------------");

        List<String> texts = Arrays.asList("a", "b", "c", "", "", "", "e", "f", "g");

        // filtrar todas as strings nao vazias
        List<String> filteredText = texts.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());

        filteredText.forEach(System.out::println);

        System.out.println("----------------------");

        // exemplo usando random limitando apenas a dois valores usando stream
        Random hash = new Random();
        hash.doubles()
                .limit(2)
                .forEach(System.out::println);


        // usando paralelismo no stream
        texts.parallelStream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList())
                .forEach(System.out::println);


        // usando collectors como string
        String res = texts.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.joining(","));
        System.out.println(res);

    }

}
