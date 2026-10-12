import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Thread {
    public static int amount = 0;

    public static void main(String[] args) throws ValidNUmber , NumberFormatException {
        Object n = -1;
        System.out.println("Enter a number to perform the corresponding operations: \n");
        System.out.printf("Press 1 : To Create a file. " + "\n"
                + "Press 2: To write into a file. " + "\n" +
                "Press 3 : To Read a file. " + "\n" +
                "Press 4 : To Delete a file. " + "\n" +
                "Press 0 : To exit !!!!!!!! \n");
        Scanner scanner = new Scanner(System.in);

        n = scanner.nextLine();
        int num = 0;
        try {
//            System.out.println("Before parseInt()");
            num = Integer.parseInt(n.toString());
//            System.out.println("after parseInt()");
            while (num > 0) {
                switch (num) {
                    case 1:
                        try {
                            System.out.println("Enter the file name You want to create");
                            Scanner scan1 = new Scanner(System.in);
                            String fileName = scan1.nextLine();
                            File myfile = new File(fileName);

                            if (myfile.createNewFile()) {
                                System.out.println("File Creation Successfully completed !!!");
                            } else {
                                System.out.println("File already exist!!!");
                            }

                        } catch (IOException e) {

                            System.out.println("Error : " + e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("Enter the file name in Which you want to write ");
                            Scanner scan2 = new Scanner(System.in);
                            String fileName = scan2.nextLine();
                            File myfile = new File(fileName);
                            FileWriter myWriter = new FileWriter(myfile);
                            System.out.println("Enter the text You want to write in this file");
                            Scanner scanMywrite = new Scanner(System.in);
                            String text = scanMywrite.nextLine();
                            myWriter.write(text);
                            System.out.println("Write operation in the desired file is done!!!");
                            myWriter.close();
                        } catch (IOException e) {
                            System.out.println("Error : " + e.getMessage());
                        }
                        break;
                    case 3:

                        try {
                            System.out.println("Enter the file Name you want to read ");
                            Scanner scan3 = new Scanner(System.in);
                            String fileName = scan3.nextLine();
                            read(fileName);
                            System.out.println("File read successfully done!!!");
                        } catch (FileNotFoundException e) {
                            System.out.println("Error : " + e.getMessage());
                        }
                        break;
                    case 4:

                        try {

                            System.out.println("Enter the file name which you want to delete");
                            Scanner scan4 = new Scanner(System.in);
                            String fileName = scan4.nextLine();
                            deleting(fileName);
                        } catch (FileNotFoundException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.println("See you again !!! Taddaa !!!");
                        break;
                    default:
//                        System.out.println("In default");
                        throw new ValidNUmber("Enter a valid Number Between 0 to 5");

                }
                num = Integer.parseInt(scanner.next());
            }
        }catch(NumberFormatException e){
            System.out.println("Please enter a valid number");
        }

    }
    // Reading file
    public static void read(String fileName) throws FileNotFoundException {
        File myFile = new File(fileName);
        Scanner myReader = new Scanner(myFile);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
        myReader.close();

    }
    // deleting file
    public static void deleting(String fileName) throws FileNotFoundException{
        File myfile = new File(fileName);
        if (myfile.delete() == true) {
            System.out.println("File Deleted !!!");
        }else  throw new FileNotFoundException("File not found!");
    }

}
class ValidNUmber extends Exception{
    public ValidNUmber(String message){
        super(message);
    }
}
