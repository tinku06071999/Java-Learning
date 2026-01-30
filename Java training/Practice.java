import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Practice {

    public boolean isVowel(char c){
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('A','a','E','e','I','i','O','o','U','u'));
        if(vowels.contains(c)) return true;
        return false;
    }
    public void nextAlphabate(String str){
       int len = str.length();
       for(int i=0;i<len;i++){
           if(!isVowel(str.charAt(i))){
               str.replace()
           }
       }
    }
}
