/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no_2;

/**
 *
 * @author DELLA
 */

public class MyDate {
    private int hari;
    private int bulan;
    private int tahun;

    public MyDate() {
        this.hari = 1;
        this.bulan = 1;
        this.tahun = 2000;
    }

    public MyDate(int hari, int bulan, int tahun) {
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
    }
    
    public int getDay() {
        return hari;
    }
    
    public int getMonth() {
        return bulan;
    }
    
    public int getYear() {
        return tahun;
    }
}
