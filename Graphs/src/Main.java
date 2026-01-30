import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome! Lets do coding for the graph!");
        GraphTemplate gt = new GraphTemplate( 8,8);
        gt.createGraph();
//        gt.printGraph();
//        ArrayList<Integer>bfs = gt.BFS();
//        for(Integer it : bfs){
//            System.out.print(it + " ");
//        }
        ArrayList<Integer> dfs = new ArrayList<>();
        gt.DFS(0,dfs);
        for(Integer it: dfs){
            System.out.print(it + " ");
        }
    }
}