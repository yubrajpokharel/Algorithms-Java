package com.yubraj.problems.unionFind;

import java.util.Arrays;

/**
 * Created by yubraj on 12/20/16.
 */
public class UF2 {
    private int[] id;
    public UF2(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q){
        return root(p) == root(q);
    }

    public int root(int n){
        while (n != id[n]) {
            System.out.println("\t => " + n +" -> "+id[n]);
            n = id[n];
        }
        return n;
    }

    public void union(int p, int q){
        show();
        System.out.println("Connecting "+p+" , "+q);
        int pid = root(p);
        int qid = root(q);
        id[pid] = qid;
        show();
        System.out.println("---------------------------------------------");
    }

    public void show(){
        System.out.println(Arrays.toString(id));
    }
}
