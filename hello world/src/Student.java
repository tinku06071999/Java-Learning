import java.util.ArrayList;
import java.util.Collections;

public class Student {
    private String name;
    private ArrayList<Integer> marks = new ArrayList<>();

    public Student(String name, int... marks){
        this.name = name;
        for(int mark : marks){
            this.marks.add(mark);
        }
    }
    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name = name;
    }
    public ArrayList<Integer> getMarks(){
        return marks;
    }
    public void addMark(int mark){
        marks.add(mark);
    }
    public int getNumberOfMarks(){
        return  marks.size();
    }
    public int getTotalSumOfMarks(){
        int sum = 0;
        int size = getNumberOfMarks();
        for(int i =0; i< size; i++){

            sum += marks.get(i);
        }
        return sum;
    }
    public int getMaximumMark(){
        return Collections.max(marks);
    }
    public int getMinimumMark(){
        return Collections.min(marks);
    }
    public double getAveragemarks(){
        int sum = getTotalSumOfMarks();
        int size = getNumberOfMarks();
        double ans = (double) sum / size;
        return ans;
    }
}
