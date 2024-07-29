/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.looping;

/**
 *
 * @author Lenovo
 */
public class While {

    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 20) {
                continue;
            }
            System.out.print(x
            );
            System.out.print("\n");
        }
    }
}
