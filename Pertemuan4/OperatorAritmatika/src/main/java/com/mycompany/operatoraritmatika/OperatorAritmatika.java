/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operatoraritmatika;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class OperatorAritmatika {

    public static void main(String[] args) {
        int angka1;
        int angka2;
        int hasil;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input angka-1: ");
        angka1 = scanner.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = scanner.nextInt();

        // penjumlahan
        hasil = angka1 + angka2;
        System.out.println("Hasil Penjumlahan = " + hasil);
        
        // pengurangan
        hasil = angka1 - angka2;
        System.out.println("Hasil Pengurangan = " + hasil);

        // perkalian
        hasil = angka1 * angka2;
        System.out.println("Hasil Perkalian = " + hasil);

        // Pembagian
        hasil = angka1 / angka2;
        System.out.println("Hasil Pembagian = " + hasil);

        // Sisa Bagi
        hasil = angka1 % angka2;
        System.out.println("Hasil Sisa Bagi = " + hasil);
    }
}
