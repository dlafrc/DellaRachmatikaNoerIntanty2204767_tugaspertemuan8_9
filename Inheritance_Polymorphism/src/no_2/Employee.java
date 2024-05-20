/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no_2;

/**
 *
 * @author DELLA
 */
public class Employee extends Person {
    protected String kantor;
    protected double gaji;
    protected MyDate tanggalBekerja;

    public Employee(String nama, String alamat, String nomorTelepon, String email, String kantor, double gaji, MyDate tanggalBekerja) {
        super(nama, alamat, nomorTelepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalBekerja = tanggalBekerja;
    }

    @Override
    public String toString() {
        return "Class: Employee, Nama: " + nama;
    }
}
