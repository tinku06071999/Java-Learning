import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOps {

    public static void main(String[]args){

        //Intermediate operations transform a stream into another stream
        //They are lazy, meaning they don't execute until a terminal operation is invoked;

// 1. filter() -->
        List<String>list = Arrays.asList("Akshay", "Goru", "Prashant","Shashank","Tinku");

        // now let's suppose we have to fins the name of a friend which starts with letter 'A';
        Stream<String> name = list.stream().filter(x -> x.startsWith("A"));
        // no filter happened at this point,
        // filter or intermediate ops happen only when we use terminal op
//        System.out.println(name.collect(Collectors.toList())); // Here we are using startsWith() method as terminal ops so here intermediate ops will perform

//2. Map() -->
        Stream<String> stringStream = list.stream().map(x -> x.toUpperCase()); // only intermidiate ops

        // let's store above result in list to perform the termonal ops
        stringStream.collect(Collectors.toList());

//3. Sorted() --> to sort the stream

        Stream<String> sortedStream = list.stream().map(String::toUpperCase).sorted(); // default sorting
//        System.out.println(sortedStream.collect(Collectors.toList()));

        Stream<String> sortedStream1 = list.stream().map(String::toUpperCase).sorted((a,b) -> a.length() - b.length()); // custom sorting
//        System.out.println(sortedStream1.collect(Collectors.toList()));

//4. distinct() --> to remove duplicate or to find distinct elements

        List<Integer> list1 = Arrays.asList(1,2,3,1,2,4,5,6,7);

//        System.out.println(list1.stream().distinct().collect(Collectors.toList()));


//5. limit() --> limit the data
//        System.out.println(Stream.iterate(1, x -> x + 1).limit(10).count());

//6. skip() -->
//        System.out.println(Stream.iterate(1, x -> x + 1).skip(10).limit(50).collect(Collectors.toList()));

//7. peek() --> Performs an action on each element as it is consumed

//        Stream.iterate(1, x -> x + 1).skip(10).limit(100).peek(System.out::println).count();

//8. flatMap()
        // flatten nested structures(e.g. lists within lists) sp that they can be processed a single sequence of elements
        // handle streams of collection, lists, or arrays where each element is itself a collection
        // transform amd flatten elements at the same time

        List<List<String>>listOfLists = Arrays.asList(
                                        Arrays.asList("apple", "banana"),
                                        Arrays.asList("orange", "kiwi"),
                                        Arrays.asList("pear", "grape")
                                      );
        // if we want to get element from this
        System.out.println(listOfLists.get(1).get(1)); // kiwi
        // but what if you don't the nested way we just want to flat our 2 - d array
        // in that situation we use flatMap()

//        System.out.println(listOfLists.stream().flatMap(x -> x.stream()).map(String :: toUpperCase).toList());


List<String> senteces = Arrays.asList(
                              "Hello world",
                               "Java streams are powerful",
                                "flat map is useful"
                            );
// to all the string in a single list we can use flatMap()
        System.out.println(senteces.
                stream().
                flatMap(sentece -> Arrays.stream(sentece.split(" "))).
                map(String::toUpperCase).toList());

    }
}
