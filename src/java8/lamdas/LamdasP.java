package java8.lamdas;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class LamdasP {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,12,3,4,5,6,77,86,9);
        for(Integer number:numbers){
            System.out.println(number);
        }
        numbers.forEach(number-> System.out.println(numbers));

        numbers.forEach(System.out::println);


        List<String> numberStrings=numbers.stream()
                .filter(number->number>5)
                .map(String::valueOf)
                .collect(Collectors.toList());
        System.out.println(numberStrings);
    }
}
