/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no_2;

/**
 *
 * @author DELLA
 */

public class Faculty extends Employee {
    private int waktuBekerja;
    private String posisi;

    public Faculty(String nama, String alamat, String nomorTelepon, String email, String kantor, double gaji, MyDate tanggalBekerja, int kantorHours, String posisi) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji, tanggalBekerja);
        this.waktuBekerja = waktuBekerja;
        this.posisi = posisi;
    }

    @Override
    public String toString() {
        return "Class: Faculty, Nama: " + nama;
    }
}
