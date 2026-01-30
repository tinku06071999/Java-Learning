import java.util.*;

public class GraphTemplate {
    private int edges;
    private int nodes;
    private int[][]matrix;
    private List<List<Integer>> matrix2 ;
    private boolean vis[] = new boolean[nodes];
    public GraphTemplate(int edges, int nodes){
        this.edges = edges;
        this.nodes = nodes;
    }
    public void createGraph(){
        System.out.println("Enter the " + this.edges +" Edges" );
        Scanner sc = new Scanner(System.in);
        System.out.println(edges + " "+nodes);
        matrix2 = new ArrayList<>();
        for(int i=0;i<nodes;i++){
            matrix2.add(new ArrayList<>());
        }
        for(int i =0;i<=edges;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            matrix2.get(u).add(v);
//            matrix2.get(v).add(u);
        }
    }
    public void printGraph(){

        // traversing if we used array

//        for(int i=0;i<=edges;i++){
//            for(int j=0;j<nodes;j++){
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

        // traversing if we used the adjancy list
        for(int i =0;i<matrix2.size();i++){
            System.out.print(i + ": ");
            for(int j : matrix2.get(i)){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public ArrayList<Integer> BFS(){
        ArrayList<Integer>bfs = new ArrayList<>();
        boolean vis[] = new boolean[nodes];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;
        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);
            for(Integer it : matrix2.get(node)){
                if(vis[it] == false){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
    public void DFS(int node, ArrayList<Integer> dfs){
        this.vis[node] = true;
        dfs.add(node);
        for(Integer it : matrix2.get(node)){
            if(!vis[it]){
                DFS(it,dfs);
            }
        }
    }
}
