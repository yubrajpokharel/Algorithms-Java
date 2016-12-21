package com.yubraj.problems.unionFind;

/**
 * Created by yubraj on 12/20/16.
 */
public class MainTest {
    public static void main(String[] args) {
//        UF uf = new UF(10);
//        uf.union(2, 5);
//        uf.union(2, 6);
//        System.out.println(uf.connected(2, 5));

//        System.out.println("*********************************************");
//        System.out.println("*********************** UF 2 *****************");
//        System.out.println("*********************************************");

//        UF2 uf2 = new UF2(10);
//        uf2.union(2, 5);
//        uf2.union(2, 6);
//        uf2.union(6, 7);
//        System.out.println(uf.connected(6, 5));

        WeightedQuickUnionUF weightedQuickUnionUF = new WeightedQuickUnionUF(10);
        weightedQuickUnionUF.union(2, 3);
        weightedQuickUnionUF.union(5, 6);
        weightedQuickUnionUF.union(6, 7);
        weightedQuickUnionUF.union(3, 5);
        System.out.println(weightedQuickUnionUF.connected(2, 6));
    }
}
