/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no_2;

/**
 *
 * @author DELLA
 */

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Della Rachmatika", "Seoul", "08723723723", "dlarr@gmail.com");

        Student student = new Student("Jake Webber", "Cihaurbeuti", "08128888888", "Jeber98@gmail.com", Student.SENIOR);

        MyDate hireDate = new MyDate(26, 3, 2024);
        Employee employee = new Employee("Roan Chappell", "Gerlong Tengah", "08788887777", "chappell@gmail.com", "Ruang 104", 60000, hireDate);

        Faculty faculty = new Faculty("Tara Yummy", "Cibaduyut", "08999999999", "yummy80@gmail.com", "Ruang 302", 90000, hireDate, 10, "Professor");

        Staff staff = new Staff("Johnnie Guilbert", "Ciliwung", "08222222222", "johnniemo@gmail.com", "Ruang 503", 50000, hireDate, "Manager");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }   
}
