/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.menu;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih menu:");
        System.out.println("1. Ayam Bakar");
        System.out.println("2. Ayam geprek");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan Anda: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Ayam Bakar Rp. 15,000");
                break;
            case 2:
                System.out.println("Ayam gepek Rp. 10,000");
                break;
            case 3:
                System.out.println("Terima Kasih Sampai jumpa!");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();

    }
}
