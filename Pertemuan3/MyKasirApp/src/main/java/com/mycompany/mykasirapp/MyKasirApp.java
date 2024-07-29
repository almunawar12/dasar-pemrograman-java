/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mykasirapp;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class MyKasirApp {
    
    static int jumlahBarang;
    static String namaBarang;
    static double hargaBarang;
    static double totalBelanja;
    static double diskon;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah barang
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        jumlahBarang = input.nextInt();

        totalBelanja = 0;

        // Input harga dan nama barang
        for (int i = 1; i <= jumlahBarang; i++) {
            System.out.print("Masukkan nama barang ke-" + i + ": ");
            namaBarang = input.next();

            System.out.print("Masukkan harga barang ke-" + i + ": ");
            hargaBarang = input.nextDouble();

            totalBelanja += hargaBarang;
        }

        // Diskon berdasarkan total belanja
        diskon = 0;
        if (totalBelanja >= 100) {
            diskon = 0.1 * totalBelanja; // Diskon 10% jika total belanja >= 100
        }

        // Total yang harus dibayar setelah diskon
        double totalPembayaran = totalBelanja - diskon;

        // Output struk belanjaan
        System.out.println("\n===== Struk Belanjaan =====");
        for (int i = 1; i <= jumlahBarang; i++) {
            System.out.println("Barang ke-" + i + ": " + namaBarang + " - Rp " + hargaBarang);
        }
        System.out.println("Total belanja: Rp " + totalBelanja);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Total yang harus dibayar: Rp " + totalPembayaran);

        // Metode pembayaran
        System.out.println("\nPilih metode pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. Kartu Kredit");
        System.out.println("3. E-Wallet");
        System.out.print("Masukkan pilihan: ");
        int metodePembayaran = input.nextInt();

        switch (metodePembayaran) {
            case 1:
                System.out.println("Pembayaran tunai, silahkan bayar sejumlah: Rp " + totalPembayaran);
                break;
            case 2:
                System.out.println("Pembayaran dengan kartu kredit, total: Rp " + totalPembayaran);
                break;
            case 3:
                System.out.println("Pembayaran dengan e-wallet, total: Rp " + totalPembayaran);
                break;
            default:
                System.out.println("Metode pembayaran tidak valid");
        }
        
        input.close();
    }
}
