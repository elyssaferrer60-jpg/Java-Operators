/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.precedencepuzzlesolver;

/**
 *
 * @author elyssa ferrer
 */
public class PrecedencePuzzleSolver {
    public static void main(String[] args) {

        // Expression 1
        int a = 6;
        int b = 4;

        // PREDICTED RESULT: true
        System.out.println((a++ + 2 > b * 2) && (++b > 4));
        
        // Expression 2
        int x = 5;

        // PREDICTED RESULT: true
        System.out.println((++x * 2 == 12) || (x-- > 4 && x + 1 == 6));
       
        // Expression 3
        int p = 8;
        int q = 3;

        // PREDICTED RESULT: true
        System.out.println((p-- - q * 2 >= 2) && (++q < p));

    }
}