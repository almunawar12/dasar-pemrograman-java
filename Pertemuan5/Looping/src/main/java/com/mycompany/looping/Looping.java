/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.looping;

/**
 *
 * @author Lenovo
 */
public class Looping {

    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.print(x
            );
            System.out.print("\n");
        }
    }

}
