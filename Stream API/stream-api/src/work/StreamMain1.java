package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
        // create a list and filter all even number from list
        List<Integer> list1 = List.of(2, 4, 14, 25, 21, 34, 44);
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(32);
        list2.add(26);
        list2.add(31);
        list2.add(78);

        List<Integer> list3 = Arrays.asList(21, 4, 342, 34, 52, 234, 23);

        //list1
        // without stream
        ArrayList<Integer> list1Even = new ArrayList<>();
        for (Integer i : list1) {
            if (i % 2 == 0) list1Even.add(i);
        }
        System.out.println(list1);
        System.out.println(list1Even);

        //using stream API
//        Stream<Integer> stream = list1.stream();
//        List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(newList);
        List<Integer> newList = list1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(newList);
        System.out.println(list1.stream().filter(i -> i > 20).collect(Collectors.toList()));
    }
}
