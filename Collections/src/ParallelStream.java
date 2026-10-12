import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class ParallelStream {

    public static void main(String[] args){
        // P/l stream is a type of stream that enables parallel processing
       // Allowing multiple threads to process parts of the stream simultaneously
       // this can significantly improve the performance for large data set
       // Workload is distributed across multiple threads;

//example --> calculating time difference b/w finding factorial with stream and parallelStream  method

        long startTime = System.currentTimeMillis();
        List<Integer>list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> factorialList = list.stream().map(ParallelStream :: factorial).toList();
        long endTime = System.currentTimeMillis();

        System.out.println("Time taken with sequential stream: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        factorialList = list.parallelStream().map(ParallelStream :: factorial).toList();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with parallel stream: " + (endTime - startTime) + " ms");





    }

    private static long factorial(int n){
        long result = 1;
        for(int i = 2; i<= n ; i++){
            result *= i;
        }
        return result;
    }
}
