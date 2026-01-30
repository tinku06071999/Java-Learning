import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[]args){
        //Stream is a sequence of element that supports functional and declarative programming

        // how to use streams
        // source -> intermediate Operations -> terminal operation

        // example finding even number in a list
        // method-1 traditional method

//        List<Integer> list = Arrays.asList(1,2,3,4,5);
//        int evenCount = 0;
//        for(int i =0;i<list.size(); i++){
//            if(list.get(i) % 2 == 0){
//                evenCount++;
//            }
//        }
//        System.out.println(evenCount);

        // Method - 2 by using streams
//        System.out.println(list.stream().filter(x -> x % 2==0).count());

// creating stream
// method - 1 from collections

List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();
//Method - 2 from Arrays
        String[] array = {"a,","b","c"};
        Stream<String> stream1 = Arrays.stream(array);

//Method - 3 using Stream.of()
        Stream<String> stream2 = Stream.of("a","b");

//Method - 4 Infinite streams
//        Stream<Integer> generate = Stream.generate(() -> 1); // wiil give a infine list of 1's to control the no of 1's use limit
        // to control the no of 1's
        Stream<Integer> generate  = Stream.generate(() -> 1).limit(100);

        // another method of infinite stream

        Stream.iterate(1,x-> x+ 1); // generate number startting from 1 to going infinite

//        System.out.println(Stream.iterate(1,x-> x+ 1).limit(100).collect(Collectors.toList())); // generate number startting from 1 to going infinite);


    }
}
