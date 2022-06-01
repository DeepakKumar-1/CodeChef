package com.company.CodeChef;

import java.util.Scanner;

public class TriangleSum {
    /* package codechef; // don't place package name! */

        private static int findMaxSum(int [][]triangle, int row, int col){
            // Base case :
            if(row >= triangle.length || col >= triangle[row].length){
                return 0;
            }

            int justDown = triangle[row][col] + findMaxSum(triangle, row+1, col);
            int justRightDown = triangle[row][col] + findMaxSum(triangle, row+1, col+1);
            return Math.max(justDown, justRightDown);
        }

        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc = new Scanner(System.in);
            int tc = sc.nextInt();
            while(tc-- > 0){
                int n = sc.nextInt();
                int [][]triangle = new int[n][n];
                for(int i=0; i<triangle.length; i++){
                    for(int j=0; j<=i; j++){
                        triangle[i][j] = sc.nextInt();
                    }
                }
                int ans = findMaxSum(triangle, 0, 0);
                System.out.println(ans);
            }
        }


}
