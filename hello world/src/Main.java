import java.util.*;

public class Main {
    public static void main(String[] args) {

//       Student student = new Student("Tinku Verma", 95);
//       printStidetnDetails(student);

    }
    public static void printStidetnDetails(Student student){
        System.out.println("Press one of the number to get the result accprdingly: ");
        System.out.println("Press -> 1 : To get the Number of Marks");
        System.out.println("Press -> 2 : To get the Sum of Marks");
        System.out.println("Press -> 3 : To get the Maximum of Marks");
        System.out.println("Press -> 4 : To get the Minimum of Marks");
        System.out.println("Press -> 5 : To get the Average of Marks");
        System.out.println("Press -> 6 : To add mark");
        System.out.println("Press -> 7 : To get the marks");
        System.out.println("Press 0 -> To exit");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while( num != 0){
            switch (num){
                case 1 : int size= student.getNumberOfMarks();
                          System.out.println("Number of marks : "+size);
                          break;
                case 2 : int sum = student.getTotalSumOfMarks();
                            System.out.println("Total of marks : "+sum);
                            break;
                case 3 : int max = student.getMaximumMark();
                        System.out.println("Maximum of marks : "+max);
                        break;
                case 4 : int min = student.getMinimumMark();
                            System.out.println("Minimum of marks : "+min);
                            break;
                case 5 : double average = student.getAveragemarks();
                            System.out.println("Average of marks : "+average);
                            break;
                case 6 :
                         int mark = sc.nextInt();
                         student.addmark(mark);
                         System.out.println(mark + " added succesfully");
                         break;
                case 7 : ArrayList<Integer> marks = student.getmarks();
                    System.out.println("Student marks are : " + marks);
                    break;
                default : break;

            }
            num = sc.nextInt();
        }
    }
}