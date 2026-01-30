import javax.sound.sampled.Line;
import javax.swing.*;
import java.util.*;

public class Practice {
    public static void main(String [] args){
//        ArrayList<Integer> list = new ArrayList<>();
//        int len = 0;
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the length of the array : " + "\n");
//        len = sc.nextInt();
//        System.out.print("Enter number in array including negatives and positives: " + "\n");
//        for(int i =0; i<len;i++){
//            int num = sc.nextInt();
//            list.add(num);
//        }
//        System.out.println(list);
//        if(negativeDominance(list)){
//            System.out.println("The array List has the negative dominance");
//        }else{
//            System.out.println("The array List has the positive dominance");
//        }
        LinkedList<Integer>list = new LinkedList<>();
        System.out.println("Enter the size of the linked list");
        int size = sc.nextInt();

        for(int i=0;i<size;i++){
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println("The reverse order of the linked list is :");
        traverseLinkedListReverse(list);

    }
    public static char missingChar(String str){
        char ans = '0';
        int tempChar = (int) str.charAt(0);
        int len = str.length();

        System.out.println(str);
        for(int i = 0 ; i<len; i++){
            int temp = (char)str.charAt(i);
            if(temp != tempChar){
                ans = (char) (tempChar);
                return ans;
            }
            tempChar++;
        }
        return ans;
    }

    public static boolean negativeDominance(ArrayList<Integer> numbers){
        int  negatives = 0;
        int  positives = 0;
        int len = numbers.toArray().length;
        for(int i =0;i<len;i++){
            int num = numbers.get(i);
            if(num < 0){
                negatives++;
            }else if(num > 0){
                positives++;
            }
        }
        return negatives>positives;
    }

    public static LinkedList<Integer> replace(LinkedList<Integer> list, int num){
        if(list == null)return null;
        list.set(1, num);
        return  list;
    }
    public static void traverseLinkedListReverse(LinkedList<Integer> list) {
//        ArrayList<Integer>list2 = new ArrayList<>(list);
        int len = list.size();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < len; i++) {
            int num = list.get(i);
            st.push(num);
        }
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
    public static void add(LinkedList<Integer>list, int num){
        list.add(num);
    }
}
