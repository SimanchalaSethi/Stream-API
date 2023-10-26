package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        // Stream API - collection process
        // collection / group of object

        // 1- blank
        Stream<Object> emptyStream = Stream.empty();
        //2-array, object, collection
        String names[] = {"Simanchala", "Uttam", "Ankit","Divya"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach( e -> {
            System.out.println(e);
        });
        
        //3 
        Stream<Object> streamBuilder = Stream.builder().build();

        // 4
        IntStream stream = Arrays.stream(new int[]{1, 232, 323, 1, 12, 1, 123, 5656, 4});
        stream.forEach(i -> {
            System.out.println(i);
        });
        // 5, List, Set
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(32);
        list2.add(26);
        list2.add(31);
        list2.add(78);
        Stream<Integer> stream2 = list2.stream();
        stream2.forEach(v -> {
            System.out.println(v);
        });
    }
}
