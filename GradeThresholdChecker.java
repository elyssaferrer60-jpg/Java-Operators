/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradethresholdchecker;

/**
 *
 * @author elyssa ferrer
 */
public class GradeThresholdChecker {
    public static void main(String[] args) {
        
        int grade = 95;
        int absences = 10;
        
        boolean passed = ((grade >= 75 && absences <= 5)|| grade >= 95);
        
        if (passed) {
        System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }
}