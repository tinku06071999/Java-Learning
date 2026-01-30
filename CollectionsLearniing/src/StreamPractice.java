import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice {

    public static void main(String[] args) {

//Q.1 Write a Java program to calculate the average of a list of integers using streams.

//        List<Integer>list = Arrays.asList(1,2,3,5,6,7,8);
//        double avg =  list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
//        System.out.println(avg);

//Q.2 Write a Java program to convert a list of strings to uppercase or lowercase using streams.

//        List<String> list = Arrays.asList("Akshay","Pintu","Prashant","Gourav","Shanki");
//        Stream<String> toUppercaseList = list.stream().map(x -> x.toUpperCase());
//        System.out.println(toUppercaseList.collect(Collectors.toList()));

//Q.3 Write a Java program to calculate the sum of all even, odd numbers in a list using streams.

//        List<Integer>list = Arrays.asList(1,2,3,5,6,7,8);
//
//        int evenSum = list.stream().filter(x -> x % 2 == 0).mapToInt(x->x.intValue()).sum();
//        System.out.println(evenSum);
//        int oddSum = list.stream().filter(x -> x % 2 != 0).mapToInt(x -> x.intValue()).sum();
//        System.out.println(oddSum);

//Q.4 Write a Java program to remove all duplicate elements from a list using streams.

//        List<Integer> list = Arrays.asList(1,2,1,3,2,4,5,4,6,5);
//
//        Stream<Integer>integerStream = list.stream().distinct();
//        System.out.println(integerStream.collect(Collectors.toList()));

//Q.5 Write a Java program to count the number of strings in a list that start with a specific letter using streams.

//        List<String> list = Arrays.asList("Akshay","Pintu","Prashant","Gourav","Shanki");
//        Stream<String>listOfStartsWith = list.stream().filter(x -> x.startsWith("P"));
//        System.out.println(listOfStartsWith.collect(Collectors.toList()));

        // after above operation if we want to count the number of person whose name startwith given letter
        //then we again have to create stream we cant use the created stream for that
        //beacuse that streamis laready used means intermediate and terminla operations already performed on that streams so we have to create a separate stream for that

//        long count = listOfStartsWith.count(); // give exception stream has been already operated

        // so let's create a difffrent stream to count the number

//        long countStartswith = list.stream().filter(x -> x.startsWith("P")).count();
//        System.out.println(countStartswith);
//

//Q.6 Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.

//        List<String> list = Arrays.asList("Akshay","Pintu","Prashant","Gourav","Shanki");
//
//        Stream<String>sortedInAZ = list.stream().sorted();
//        System.out.println(sortedInAZ.collect(Collectors.toList()));
//        Stream<String>sortedInZA = list.stream().sorted();
//        System.out.println(sortedInZA.collect(Collectors.toList()).reversed());

//Q.7 Write a Java program to find the maximum and minimum values in a list of integers using streams.

//        List<Integer>list = Arrays.asList(1,2,3,5,6,7,8);
//
//        Optional<Integer> maxi = list.stream().max((a, b) -> a > b ? a : b);
//        Optional<Integer> mini = list.stream().min((a,b) -> a > b ? b : a);
//
//        System.out.printf("Maximum: " + maxi + "\n" + "Minimum:" + mini +"\n");

//Q.8 Write a Java program to find the second smallest and largest elements in a list of integers using streams.

        List<Integer> list = Arrays.asList(1, 2, 3, 5, 6, 7, 8);

       Stream<Integer> secondSmallest = list.stream().sorted().limit(2);
//        System.out.println(secondSmallest.min((a,b) -> a > b ? b : a));
       Integer secondLargest = list.stream().sorted(Comparator.reverseOrder()).limit(2).min(Integer::compareTo).orElse(null);

//        System.out.println(secondLargest);



// Example : Collecting name by length

        List<String>names = Arrays.asList("Anna", "Bob","Alexander","Brian","Alice");
        System.out.println(names
                .stream()
                .collect(Collectors
                        .groupingBy(x -> x.length())));

// counting word occurrences
        String sentence = "hello world hello java world";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));
// partitioning odd and even numbers
        List<Integer> l2 = Arrays.asList(1,2,3,4,5,6);
        System.out.println(l2.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0, Collectors.toList())));

// summing values in a Map
        HashMap<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 30);
        System.out.println(items.values().stream().reduce(Integer::sum));
        System.out.println(items.values().stream().collect(Collectors.summingInt(Integer::intValue)));

// create a map from stream elements
        List<String>fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(fruits
                .stream()
                .collect(Collectors
                        .toMap(x -> x.toUpperCase(), x -> x.length())));



// Example
        List<String>words2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
//        System.out.println(words2
//                .stream()
//                .collect(Collectors
//                        .toMap(x ->x.toUpperCase(), x -> x.length() ))); // exception of duplicate key
//
        // to avoid exception we have to use merging in map
        System.out.println(words2
                .stream()
                .collect(Collectors
                        .toMap(k -> k, v -> 1, (x,y)-> x+ y )));
                              // k is key and v is value, we intially set v is 1 for all the elements present after that the merger function or how to merger
                              // defination will merger
                              // (x, Y) -> x + y is merger and it is work like it will return the sum


    }

}
