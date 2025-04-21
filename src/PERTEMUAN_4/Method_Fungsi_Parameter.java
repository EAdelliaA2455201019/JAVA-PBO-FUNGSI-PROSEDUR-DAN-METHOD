/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_4;

/**
 *
 * @author WINDOWS 10
 */
public class Method_Fungsi_Parameter {
  
    double hitungLuasSegitiga(double alas, double tinggi) {
        double luas = 0.5 * alas * tinggi;
        return luas;
    }

    public static void main(String[] args) {
        Method_Fungsi_Parameter contoh = new Method_Fungsi_Parameter();
        double luas = contoh.hitungLuasSegitiga(18, 8); // Menyimpan hasil perhitungan
        System.out.println("Jika diketahui segitiga dengan alas = 18, dan tingginya adalah = 8");
        System.out.println("Maka, Luas Segitiga = " + luas); // Menampilkan hasil
    }
}
