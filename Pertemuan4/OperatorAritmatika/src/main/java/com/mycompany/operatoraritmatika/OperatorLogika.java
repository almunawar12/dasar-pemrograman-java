/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operatoraritmatika;

/**
 *
 * @author Lenovo
 */
public class OperatorLogika {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c;
//        AND
        c = a&& b;
        System.out.println("true && false = " + c);
        
//        OR
        c = a || b;
        System.out.println("true || false = " + c);
        
//        NOT
        System.out.println("negasi, !true = " + !a);
    }
    
}
