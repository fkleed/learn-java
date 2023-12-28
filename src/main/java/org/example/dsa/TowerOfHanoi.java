package org.example.dsa;

import org.w3c.dom.ls.LSOutput;

public class TowerOfHanoi {

    public static void  towerOfHanoi(
            int n,
            char fromRod,
            char toRod,
            char auxRod
    ) {
        if (n ==0) {
            return;
        }

        towerOfHanoi(n - 1, fromRod, auxRod, toRod);

        System.out.println(
                "Move disk " + n + " from rod "
                + fromRod + " to rod "
                + toRod
        );

        towerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {

        towerOfHanoi(
                4,
                'A',
                'C',
                'B'
        );
    }
}
