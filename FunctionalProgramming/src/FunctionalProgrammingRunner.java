import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String [] args){
       List<Integer> list = List.of(1,2,3,4,5,6);
       printWithFP(list);
    }
    public static void printWithFP(List<Integer> list){
        list.stream().forEach(
                element -> System.out.println("Element - " + element)
        );
    }
}
