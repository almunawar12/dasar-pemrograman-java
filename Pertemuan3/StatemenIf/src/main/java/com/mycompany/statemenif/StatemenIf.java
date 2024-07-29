/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.statemenif;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class StatemenIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int grade = scanner.nextInt();
        
        switch (grade) {
            case 90 :
                System.out.println("Excellent!");
                break;
            case 80:
                System.out.println("Mantaps!");
                break;
            case 70:
                System.out.println("Well done");
                break;
            case 60 :
                System.out.println("You passed");
            case 50:
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        
        System.out.println("Your grade is " + grade);
    }
}
