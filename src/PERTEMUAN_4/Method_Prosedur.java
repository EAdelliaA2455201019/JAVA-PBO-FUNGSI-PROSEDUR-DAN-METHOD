/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_4;

/**
 *
 * @author WINDOWS 10
 */
public class Method_Prosedur {
    
    int alas = 18;
    int tinggi =8;

    // Method Prosedur Menghutung Luas Segitiga
    void hitungLuasSegitiga() {
        double luas = 0.5 * alas * tinggi;
        System.out.println("Jika diketahui alas = " + alas + ", dan tingginya adalah = " + tinggi);
        System.out.println("Maka, Luas Segitiga = " + luas);
    }

    public static void main(String[] args) {
        Method_Prosedur contoh = new Method_Prosedur();
        contoh.hitungLuasSegitiga();
    }
}

