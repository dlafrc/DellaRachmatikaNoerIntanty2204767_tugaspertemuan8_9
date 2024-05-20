/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no_2;

/**
 *
 * @author DELLA
 */

public class Student extends Person {
    public static final String MAHASISWABARU = "mahasiswa baru";
    public static final String MAHASISWATAHUNKEDUA = "mahasiswa tahun kedua";
    public static final String JUNIOR = "junior";
    public static final String SENIOR = "senior";

    private String status;

    public Student(String nama, String alamat, String nomorTelepon, String email, String status) {
        super(nama, alamat, nomorTelepon, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Class: Student, Nama: " + nama;
    }
}
