import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class StreamDemo {

    public static void main(String [] args){

        // Streams

        // Java 8 --> minimal code functional programming
        // Java --> Lambda expression, Streams, Date & Time API

        // lambda expression
        //lambda expression is an anonymous function(no name, no return type, no access modifier)

//        MathOperation sum =(a, b) -> {
//            return a + b;   // if there is only one line in it we can skip the return keyword
//
//        }
        MathOperation minus = (a, b) -> a - b;
        int res = minus.operate(5,7);
//        System.out.println(res);
// Predicate --> Functional interface ( boolean valued fn)
        // used to hold the boolean condition

        Predicate<Integer>isEven = x -> x % 2 == 0;
        //other to write is we have to write a function the we have to check by if else condition so it is better to use predicate.
//        System.out.println(isEven.test(4));

        Predicate<String> isWordStartWith= x -> x.toLowerCase().startsWith("a");
//        System.out.println(isWordStartWith.test("Akshay"));

        Predicate<String> isWordEndWith = x -> x.toLowerCase().endsWith("t");

//
        // combining predicates

        Predicate<String> and = isWordStartWith.and(isWordEndWith);
//        System.out.println(and.test("Akshit"));

// Function

// Predicate only store the condition or do checking
// but function can do some work also

        Function<Integer, Integer> doubleIt = x -> x * 2;
//        System.out.println(doubleIt.apply(3));


// Consumers --> only takes nothing give

        Consumer<Integer> print = x -> System.out.println(x);
//        print.accept(51);

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);

        Consumer<List<Integer>> printList = x ->{
            for(int i : x){
                System.out.println(i);
            }
        };
//        printList.accept(list);


// Supplier --> only give nothing take

        Supplier<String> helloWorld = () -> "Hello World";
//        System.out.println(helloWorld.get());


// We learn four things Predicate -> Function -> Consumer -> Supplier
// Now lets them combining

        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

    // as we see we can only take one input in predicate, consumer, function (in fn one is input one is o/p)
    // so there are method to take two arguments
    // BiPredicate, BiConsumer, BiFunction

        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        BiConsumer<Integer, Integer> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        BiFunction<Integer, Integer, String> printSumEven =(x, y) ->{
           if(isSumEven.test(x,y) ){
               return "Even Sum !";
           }
           return "Not Even";
        };

        System.out.println(printSumEven.apply(4,4));

    }
}

interface  MathOperation{
    int operate(int a, int b);
}
