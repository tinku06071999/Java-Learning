import java.sql.SQLOutput;
import java.util.Scanner;

public class GenericsRunner {
    public static void main(String [] args){
//       MyCustomList <String> list = new MyCustomList <>();
//        list.add("element 1");
//        list.add("element 2");
//        String value = list.get(0);
//        System.out.println(value);
//        MyCustomList <Integer> list2 = new MyCustomList<>();
//        list2.add(1);
//        list2.add(6);
//        System.out.println(list);
//        System.out.println(list2);
//        System.out.println(list2.get(1));

        System.out.println("Enter the data type you want to play with:");
        Scanner sc = new Scanner(System.in);
        String dataTye = sc.nextLine();
        try {
            GenericsPractice <dataTye> list = new GenericsPractice<>();
        }catch (Exception e){
             throw new IllegalArgumentException("Something went wrong !")
        }
    }
}
