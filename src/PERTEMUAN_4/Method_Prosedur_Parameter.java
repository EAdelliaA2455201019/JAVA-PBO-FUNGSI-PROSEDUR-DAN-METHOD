/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN_4;

/**
 *
 * @author WINDOWS 10
 */
public class Method_Prosedur_Parameter {
    
    void hitungLuasSegitiga(double alas, double tinggi) {
        double luas = 0.5 * alas * tinggi;
        System.out.println("Jika diketahui segitiga dengan alas = " + alas + ", dan tingginya adalah = " + tinggi);
        System.out.println("Maka, Luas Segitiga = " + luas);
    }

    public static void main(String[] args) {
        Method_Prosedur_Parameter contoh = new Method_Prosedur_Parameter();
        contoh.hitungLuasSegitiga(18, 8); 
    }
}