package com.yubraj.problems.unionFind;

import java.util.Arrays;

/**
 * Created by yubraj on 12/19/16.
 */
public class UF {

    private int[] id;

    public UF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q){
        return id[p] == id[q];
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];
        show();
        for (int i = 0; i < id.length; i++) {
            System.out.println("id["+i+"] : "+id[i]+" ,"+ pid);
            if(id[i] == pid) {
                System.out.println("\t id["+i+"] : "+id[i]+" ,"+ pid);
                id[i] = qid;
            }
        }
        show();
        System.out.println("-------------------------------------------");
    }

    public void show(){
        System.out.println(Arrays.toString(id));
    }
}
