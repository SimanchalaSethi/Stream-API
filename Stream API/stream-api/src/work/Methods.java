package work;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {
        // filter(Predicate)
           //boolean value function
           // e -> {return true/ false}

        //map (function)
          /*
             each element operation

           */
        List<String> names = List.of("Jintu", "Sunil", "Abhiram", "Swami", "Shikhar");
        List<String> newName = names.stream().filter(e -> e.startsWith("S")).collect(Collectors.toList());
        System.out.println(newName);

        List<Integer> numbers = List.of(2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> newNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(newNumbers);
        names.stream().forEach(e -> {
            System.out.println(e);
        });
        newName.stream().forEach(System.out::println);
        //sorted
        numbers.stream().sorted().forEach(System.out::println);

        Integer minValue = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println(minValue);

        Integer maxValue = numbers.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(maxValue);


    }
}
