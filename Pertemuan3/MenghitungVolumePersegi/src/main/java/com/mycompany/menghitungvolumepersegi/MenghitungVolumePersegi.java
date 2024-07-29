/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.menghitungvolumepersegi;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MenghitungVolumePersegi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi : ");
        double sisi = input.nextDouble();

        double volume = sisi * sisi * sisi;

        System.out.println("Volume persegi adalah: " + volume);
    }
}
