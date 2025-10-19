/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungtotalbuah;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class HitungTotalBuah {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
        // Inisialisasi BufferedReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Deklarasi variabel
        int manggaDibeli, jambuDibeliPerTetangga, jumlahTetangga, manggaBusuk;
        int totalJambu, totalManggaBersih, totalBuahKeseluruhan;

        System.out.println("=== Perhitungan Total Buah ===");

        manggaDibeli = 70;
        jumlahTetangga = 4;
        jambuDibeliPerTetangga = 30;
        manggaBusuk = 15;
        
        System.out.println("Buah Mangga Dibeli (pcs)      : " + manggaDibeli);
        System.out.println("Jumlah Tetangga               : " + jumlahTetangga);
        System.out.println("Jambu Diberikan/Tetangga (pcs): " + jambuDibeliPerTetangga);
        System.out.println("Mangga Busuk (pcs)            : " + manggaBusuk);
        System.out.println("------------------------------");

        // Perhitungan Buah
        
        // 1. Hitung total buah Jambu yang dibeli:
        totalJambu = jumlahTetangga * jambuDibeliPerTetangga;
        
        // 2. Hitung jumlah Mangga yang bersih (layak):
        totalManggaBersih = manggaDibeli - manggaBusuk;
        
        // 3. Hitung total buah keseluruhan:
        totalBuahKeseluruhan = totalManggaBersih + totalJambu;

        // Output Hasil
        System.out.println("Total Buah Jambu Dibelikan: " + totalJambu + " pcs");
        System.out.println("Total Buah Mangga Bersih  : " + totalManggaBersih + " pcs");
        System.out.println("------------------------------");
        System.out.println("TOTAL BUAH KESELURUHAN    : " + totalBuahKeseluruhan + " pcs");
    }
}