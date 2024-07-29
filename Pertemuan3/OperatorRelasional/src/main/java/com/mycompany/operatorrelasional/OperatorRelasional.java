/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operatorrelasional;

/**
 *
 * @author Lenovo
 */
public class OperatorRelasional {

    public static void main(String[] args) {
        int nilaiA = 10;
        int nilaiB = 4;
        boolean hasil;
        
        hasil = nilaiA > nilaiB;
        System.out.println("apakah A lebih besar dari B? " + hasil);
        
        hasil = nilaiA < nilaiB;
        System.out.println("apakah A lebih kecil dari B? " + hasil);
        
        hasil = nilaiA >= nilaiB;
        System.out.println("apakah A lebih besar samadengan B? " + hasil);

        // apakah A lebih kecil samadengan B?
        hasil = nilaiA <= nilaiB;
        System.out.println("apakah A lebih kecil samadengan B? " + hasil);

        hasil = nilaiA == nilaiB;
        System.out.println("apakah nilai A sama dengan B? " + hasil);

        hasil = nilaiA != nilaiB;
        System.out.println("apakah nilai A tidak samadengan B? " + hasil);
    }
}
