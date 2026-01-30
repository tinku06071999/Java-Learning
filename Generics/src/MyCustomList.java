import java.util.ArrayList;

public class MyCustomList <T> {
    ArrayList<T> list = new ArrayList<>();

    public void add(T element){
        list.add(element);
    }
    public void remove(T element){
        list.remove(element);
    }
    public T get(int index){
        T data ;
        data = list.get(index);
        return data;

    }
}
