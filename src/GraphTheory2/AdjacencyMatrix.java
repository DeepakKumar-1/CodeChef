package GraphTheory2;

import java.util.Arrays;
import java.util.Scanner;

public class AdjacencyMatrix {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int v = sc.nextInt();
        int [][]adjMatrix = new int[v][v];
        for(int i=0; i<e; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            adjMatrix[v1][v2] = 1;
            adjMatrix[v2][v1] = 1;
        }
        // display Graph
        for(int []row : adjMatrix){
            System.out.println(Arrays.toString(row));
        }

    }
}
