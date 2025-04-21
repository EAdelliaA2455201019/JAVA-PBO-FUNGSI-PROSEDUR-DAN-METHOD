/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_4;

/**
 *
 * @author WINDOWS 10
 */
public class Method_Fungsi {
    
        int alas    = 18;
        int tinggi  = 8;
        
    public double hitungLuasSegitiga() {
        double luas = 0.5 * alas * tinggi;
        System.out.println("Jika Diketahui segitiga dengan alas = " + alas + ", dan tingginya adalah = " + tinggi);
        return luas;
    }

    public static void main(String[] args) {
        
        Method_Fungsi contoh = new Method_Fungsi ();
        System.out.println("Maka, Luas Segitiga = " + contoh.hitungLuasSegitiga());
    }
}
