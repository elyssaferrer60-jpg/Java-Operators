/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.four.functioncalculator;

/**
 *
 * @author elyssa ferrer
 */
public class FourFunctionCalculator {
public static void main(String[] args) {

        int num1 = 50;
        int num2 = 10;

        int plus = num1 + num2;
        int minus = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Addition: " + plus);
        System.out.println("Subtraction: " + minus);
        System.out.println("Multiplication: " + multiply);
        System.out.println("Division: " + divide);
        System.out.println("Modulus: " + remainder);

        // Division and remainder can behave differently
        // when negative operands are used.
    }
}
