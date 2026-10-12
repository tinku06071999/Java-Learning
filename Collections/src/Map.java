import java.util.HashMap;

public class Map<S, I extends Number> {

    public static void main(String [] args){
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Alice",1);
        Person p2 = new Person("Bob",2);
        Person p3 = new Person("Alice",1);

        map.put(p1,"Engineer"); // Hashcode --> index1
        map.put(p2,"Designer"); // Hashcode --> index2
        map.put(p3,"Manager");  // Hashcode --> index3 // but here person is same but in Hashcode
                                                        // it will consider it as different to solve
                                //this problem we need our own customised equals and Hashcode method
        System.out.println(map.get(p1)); // Engineer
        System.out.println(map.size()); // 3
     // but in Pre-defined classes like String Integers this problem is not appear
    //example

    HashMap<String , Integer> student = new HashMap<>();
        student.put("Tinku",91); // Hashcode --> index1
        student.put("Akshay",97); // Hashcode --> index2
        student.put("Tinku",97); // Hashcode --> index3 --> equals() --> index1 --> replace

        System.out.println(student);
        System.out.println(student.size()); // 2



        // After creating our own customised hashcode and equals method in Person class
        map.put(p1,"Engineer"); // Hashcode --> index1
        map.put(p2,"Designer"); // Hashcode --> index2
        map.put(p3,"Manager");  // Hashcode --> index3 --> equals() --> index1 --> replace

        System.out.println(map.get(p1)); // Manager
        System.out.println(map.size()); // 2
    }
}
