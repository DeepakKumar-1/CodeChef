package GraphTheory2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class HasPath {
    public static boolean hasPath(int [][]adjMatrix, int source, int destination){
        Queue<Integer> queue = new LinkedList<>();
        boolean []visited = new boolean[adjMatrix.length];
        visited[source] = true;
        queue.add(source);
        while(!queue.isEmpty()){
            int currentVertex = queue.poll();
            for(int i=0; i<adjMatrix.length; i++){
                if(adjMatrix[currentVertex][i] == 1 && !visited[i]){
                    queue.add(i);
                    visited[i] = true;
                    if(i == destination){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // DFS Code for HasPath
    public static boolean hasPathDfs(int [][]adjMatrix, int source, int destination){
        boolean []visited = new boolean[adjMatrix.length];
        return hasPathDfs(adjMatrix, source, destination, visited);
    }
    private static boolean hasPathDfs(int [][]adjMatrix, int currentVertex, int destination, boolean []visited){
        visited[currentVertex] = true;
        if(currentVertex == destination){
//            System.out.println(currentVertex + " " + destination );
            return true;
        }
        for(int i=0; i<adjMatrix.length; i++){
            if(adjMatrix[currentVertex][i] == 1 && !visited[i]){
                if(hasPathDfs(adjMatrix, i, destination, visited)){
                    return true;
                }
            }
        }
        return false;
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
        int source = sc.nextInt();
        int destination = sc.nextInt();
        System.out.println(hasPath(adjMatrix, source, destination));
        System.out.println(hasPathDfs(adjMatrix, source, destination));
    }
}

