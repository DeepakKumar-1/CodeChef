package com.company.DPRevision;

public class RodCutting {
    // Recursive Approach
    public static int rodCutting(int []price, int n){
        // Base Case
        if(n == 0){
            return 0;
        }
        int q = Integer.MIN_VALUE;
        for(int i=1; i<n; i++){
            q = Math.max(q, price[i] + rodCutting(price, n-i));
        }
        return q;
    }
    public static void main(String []args){

    }
}
