package com.mycompany.operatoraritmatika;

import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args) {
        int angka1;
        int angka2;
        int hasil;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        
        // Operasi pengurangan
        hasil = angka1 - angka2;
        System.out.println("Hasil = " + hasil);
        
        keyboard.close();
    }
}
