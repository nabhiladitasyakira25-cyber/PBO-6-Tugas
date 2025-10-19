/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungwaktucetaknovel;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class HitungWaktuCetakNovel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Konstanta waktu dideklarasikan sebagai variabel int biasa
        int DETIK_PER_MENIT = 60;
        int DETIK_PER_JAM = 3600;
        int DETIK_PER_HARI = 86400; // 24 * 3600

        // Variabel perhitungan (Semua menggunakan int)
        int jumlahNovel, tebalPerNovel;
        int totalLembar; 
        int totalWaktuDetik;
        
        // Hasil konversi
        int hari, jam, menit, detik;
        int sisaDetik; // Variabel pembantu untuk sisa detik

        System.out.println("=== Hitung Waktu Cetak Novel ===");
        System.out.print("Masukkan Banyaknya Novel yang akan dicetak: ");
        jumlahNovel = input.nextInt();
        
        System.out.print("Masukkan Tebalnya Lembar per Novel: ");
        tebalPerNovel = input.nextInt();
        
        // Input tidak di-close sesuai permintaan

        // 1. Hitung Total Lembar (Risiko Integer Overflow jika hasil > 2.147.483.647)
        totalLembar = jumlahNovel * tebalPerNovel;
        
        // Peringatan Overflow
        if (jumlahNovel > 0 && tebalPerNovel > 0 && totalLembar / tebalPerNovel != jumlahNovel) {
            System.out.println("\n[PERINGATAN] Terjadi integer overflow. Hasil mungkin tidak akurat.");
        }

        // 2. Hitung Total Waktu (Detik)
        // Kecepatan = 1 lembar/detik, maka Total Waktu (detik) = Total Lembar
        totalWaktuDetik = totalLembar; 

        // 3. Konversi Total Waktu (Detik) ke Hari, Jam, Menit, Detik
        
        sisaDetik = totalWaktuDetik;

        // Hitung Hari
        hari = sisaDetik / DETIK_PER_HARI;
        sisaDetik = sisaDetik % DETIK_PER_HARI;
        
        // Hitung Jam
        jam = sisaDetik / DETIK_PER_JAM;
        sisaDetik = sisaDetik % DETIK_PER_JAM;
        
        // Hitung Menit
        menit = sisaDetik / DETIK_PER_MENIT;
        
        // Detik sisa akhir
        detik = sisaDetik % DETIK_PER_MENIT; 

        // Output Hasil
        System.out.println("\n--- Hasil Perhitungan Waktu Cetak ---");
        System.out.println("Total Lembar yang dicetak: " + totalLembar + " lembar");
        System.out.println("Total Waktu (Detik): " + totalWaktuDetik + " detik");
        System.out.println("=====================================");
        System.out.println("Waktu yang diperlukan:");
        System.out.println("Hari   : " + hari);
        System.out.println("Jam    : " + jam);
        System.out.println("Menit  : " + menit);
        System.out.println("Detik  : " + detik);
    }
}
