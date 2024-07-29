/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loopin;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Looping {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi piramida: ");
        int tinggi = scanner.nextInt();
        
        for (int i = 1; i <= tinggi; i++) {
            // Membuat spasi di awal setiap baris untuk membentuk piramida
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            
            // Membuat bintang untuk setiap baris
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            // Pindah ke baris baru setelah selesai membuat bintang pada baris saat ini
            System.out.println();
        }
    }
}