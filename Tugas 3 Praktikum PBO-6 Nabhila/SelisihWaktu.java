/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selisihwaktu;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class SelisihWaktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Deklarasi variabel
        int jam1, menit1, detik1, totalDetik1;
        int jam2, menit2, detik2, totalDetik2;
        int selisihDetik, selisihJam, selisihMenit, selisihDetikSisa;

        System.out.println("=== Hitung Selisih Waktu ===");

        // Input Waktu Pertama
        System.out.println("\n--- Waktu Pertama (W1) ---");
        System.out.print("Jam (JJ): ");
        jam1 = input.nextInt();
        System.out.print("Menit (MM): ");
        menit1 = input.nextInt();
        System.out.print("Detik (DD): ");
        detik1 = input.nextInt();
        
        // Input Waktu Kedua
        System.out.println("\n--- Waktu Kedua (W2) ---");
        System.out.print("Jam (JJ): ");
        jam2 = input.nextInt();
        System.out.print("Menit (MM): ");
        menit2 = input.nextInt();
        System.out.print("Detik (DD): ");
        detik2 = input.nextInt();

        // 1. Konversi ke Total Detik
        totalDetik1 = (jam1 * 3600) + (menit1 * 60) + detik1;
        totalDetik2 = (jam2 * 3600) + (menit2 * 60) + detik2;
        
        // Asumsi W2 > W1
        if (totalDetik2 < totalDetik1) {
            System.out.println("\n[PERINGATAN] Waktu Kedua lebih kecil dari Waktu Pertama. Selisih akan negatif.");
        }
        
        // 2. Hitung Selisih Total Detik
        selisihDetik = Math.abs(totalDetik2 - totalDetik1);

        // 3. Konversi Selisih Detik Kembali ke Jam, Menit, Detik
        selisihJam = selisihDetik / 3600;
        
        // Sisa detik setelah dihitung jam
        selisihDetikSisa = selisihDetik % 3600; 
        
        selisihMenit = selisihDetikSisa / 60;
        
        // Sisa detik akhir
        selisihDetikSisa = selisihDetikSisa % 60; 

        // Output Hasil
        System.out.println("\n--- Hasil Selisih Waktu ---");
        System.out.println("Waktu 1 (Total Detik): " + totalDetik1 + " s");
        System.out.println("Waktu 2 (Total Detik): " + totalDetik2 + " s");
        System.out.println("=================================");
        System.out.println("Selisih Total Detik: " + selisihDetik + " s");
        System.out.println("Selisih Waktu: " + selisihJam + " jam, " 
                           + selisihMenit + " menit, " 
                           + selisihDetikSisa + " detik");
        
        input.close();
    }
}
    
