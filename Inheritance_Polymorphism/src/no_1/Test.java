/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no_1;

import java.util.Scanner;

/**
 *
 * @author DELLA
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan sisi1: ");
        double side1 = input.nextDouble();
        System.out.print("Masukkan sisi2: ");
        double side2 = input.nextDouble();
        System.out.print("Masukkan sisi3: ");
        double side3 = input.nextDouble();
        System.out.print("Masukkan warna: ");
        String warna = input.next();
        System.out.print("Apakah segitiga terisi (true/false): ");
        boolean filled = input.nextBoolean();
        
        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setWarna(warna);
        segitiga.setFilled(filled);
        
        System.out.println("Luas segitiga: " + segitiga.getArea());
        System.out.println("Keliling segitiga: " + segitiga.getPerimeter());
        System.out.println("Warna segitiga: " + segitiga.getWarna());
        System.out.println("Apakah segitiga terisi: " + segitiga.isFilled());
        System.out.println(segitiga.toString());

        input.close();
    }
}
