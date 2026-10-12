import java.util.Comparator;

public class IntegerComarator implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b){
        return b - a; // for descending order
    }
}

// concept
// a-b > 0  -> a is greater then b. so if we want the decsencding order
// a-b = 0; -> eqaul ( a==b)
// a-b < 0  -> it means b is greater the a so it is used for assecding order
