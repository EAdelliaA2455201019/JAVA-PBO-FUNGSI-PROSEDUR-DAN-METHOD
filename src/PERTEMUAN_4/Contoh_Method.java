/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PERTEMUAN_4;

/**
 *
 * @author WINDOWS 10
 */
public class Contoh_Method {

    public static void main(String[] args) {
        // Membuat Objek dari Class Contoh_Method
        Contoh_Method contoh = new Contoh_Method();

        // Memanggil Method Prosedur
        contoh.luasLingkaranProsedur();

        // Memanggil Method Fungsi
        contoh.luasLingkaranFungsi();
    }

    // Cara Pertama Membuat Method
    // Method Prosedur
    // Ditandai dengan Void
    public void luasLingkaranProsedur() {
        double jari2 = 10;
        double phi   = 3.14;
        double luas  = phi * jari2 * jari2;
        System.out.println("Luas Lingkaran Pakai Method Prosedur = " + luas);
    }

    // Cara Kedua
    // Membuat Method Fungsi
    // Ditandai dengan "return" dan diawali dengan tipe data
    public double luasLingkaranFungsi() {
        double jari2 = 10;
        double phi   = 3.14;
        double luas  = phi * jari2 * jari2;
        System.out.println("Luas Lingkaran Pakai Method Fungsi = " + luas);
        return luas;
    }
}