import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {

    // terminal ops are used to get the result
    public static void main(String [] args){

        List<Integer> list = Arrays.asList(1,2,3);

// 1. collect() --> to collect

//        list.stream().skip(1).collect(Collectors.toList());

// 2. forEach
//        list.stream().forEach(x -> System.out.println(x));

// 3. reduce() --> Combines elements to produce a single result

        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
//        System.out.println(optionalInteger.get());
//4. count
// anyMatch() --> anyone is matched the given condition __
// allMatch() --> all matched the given condition         |
// nonMatch() --> non is matched the given condition  ___ |
        // all three methods will return boolean values

//        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
//        System.out.println(b); // true
//        boolean b1 = list.stream().allMatch(x -> x % 2 == 0);
//        System.out.println(b1); // false
//        boolean b2 = list.stream().noneMatch(x -> x % 2 == 0);
//        System.out.println(b2); // false;

// findFirst(), findAny()
//        System.out.println(list.stream().findFirst().get());
//        System.out.println(list.stream().findAny().get());

//Example summing values

        List<Integer> integers = Arrays.asList(1,2,3,4,5);
//        System.out.println(integers.stream().reduce(Integer::sum).get());

// Example counting Occurrences of a Character
        String sentence = "Hello world";

        // count the occurrence of 'l'

//        System.out.println(sentence.chars().filter(x -> x =='l').count());

// stateful operations --> in this a operation on a element depends on other element like in sorted() method
// and stateless operation --> no dependency like in map()

// toArray()
        Object[] array = Stream.of(1,2,3,4).toArray();

// min() / max()

        System.out.println("max : " + Stream.of(2,44,69).max(Comparator.naturalOrder()));









    }
}
