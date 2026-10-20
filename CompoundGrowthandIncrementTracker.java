/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.compoundgrowthandincrementtracker;

/**
 *
 * @author elyssa ferrer
 */
public class CompoundGrowthandIncrementTracker {
    public static void main(String[] args) {

        double initialbal = 3000;

        initialbal += 300;
        System.out.println(initialbal);

        initialbal *= 1.50;
        System.out.println(initialbal);

        initialbal += 300;
        System.out.println(initialbal);

        int count = 5;

        System.out.println("Postfix: " + count++);
        System.out.println("After postfix: " + count);

        System.out.println("Prefix: " + ++count);
        System.out.println("After prefix: " + count);

    }
}
