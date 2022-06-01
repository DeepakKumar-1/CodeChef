package GraphTheory2;
import java.util.*;

public class GetPathRevision {
    public static ArrayList<Integer> getPath(int [][]adjMatrix, int source, int destination){
        Queue<Integer> queue = new LinkedList<>();
        boolean []visited = new boolean[adjMatrix.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        visited[source] = true;
        queue.add(source);
        map.put(source, -1);
        boolean isPathFound = false;
        while(!queue.isEmpty()){
            int currentVertex = queue.poll();
            for(int i=0; i<adjMatrix.length; i++){
                if(adjMatrix[currentVertex][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                    map.put(i, currentVertex);
                    if(i == destination){
                        isPathFound = true;
                        break;
                    }
                }
            }
        }
        if(isPathFound){
            ArrayList<Integer> path = new ArrayList<>();
            int currentVertex = destination;
            while(currentVertex != -1){
                path.add(currentVertex);
                int parent = map.get(currentVertex);
                currentVertex = parent;
            }
            return path;
        }else{
            return null;
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        int [][]adjMatrix = new int[n][n];
        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }
        // Display the Graph
        for(int []row : adjMatrix){
            System.out.println(Arrays.toString(row));
        }
        int source = sc.nextInt();
        int destination = sc.nextInt();
        System.out.println(getPath(adjMatrix, source, destination));
    }
}
