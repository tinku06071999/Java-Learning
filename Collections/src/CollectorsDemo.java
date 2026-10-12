import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args){
        // collectors is a utility class
        // provide a set of methods to create common collectors
//1. to make a list
        List<String> names = Arrays.asList("Alice","Bob","Charlie");
        List<String> res = names.stream()
                        .filter(name -> name.startsWith("A"))
                        .collect(Collectors.toList());
        System.out.println(res);

// toset() --> to make a set or avoid duplicates
// toCollection --> convert in any type of collection
      // example converting in ArrayDeque
        ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));

// joining() --> concatenate stream elements in a single stream.

       String concatedNames =  names.stream().map(String :: toUpperCase).collect(Collectors.joining(","));
//        System.out.println(concatedNames);
// summarizing Data
        // Generate statistical summary (Count, sum, min, max, average)

        List<Integer> numbers = Arrays.asList(2,3,5,7,11);

        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x -> x));
//        System.out.println("Count: " + stats.getCount());
//        System.out.println("Sum: " + stats.getSum());
//        System.out.println("Min: " + stats.getMin());
//        System.out.println("Average: " + stats.getAverage());
//        System.out.println("Max: " + stats.getMax());

// calculating average only // same for other

        double avg = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println(avg);


// Grouping elements
    List<String>words = Arrays.asList("hello", "world", "java", "streams", "Collecting");
        System.out.println(words.stream().collect(Collectors.groupingBy(x -> x.length())));
        // performing operations on groups
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", ")))); // separating each group with , delimiter
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()))); // Counting each group with

// Partitioning elements
        // partitions elements into two groups (true and false) based on a predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));
// mapping anc collecting
        // Applies a mapping before collecting

        System.out.println(words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));
    }
}
