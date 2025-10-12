/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kecepatancahaya;

/**
 *
 * @author LENOVO
 */
public class KecepatanCahaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Kecepatan cahaya dalam km/s
        final double KECEPATAN_CAHAYA = 300000; 
        
        // Jarak dalam km
        double jarakBumiKeBulan = 384400; 
        double jarakBumiKeMatahari = 152100000; // 152.1 juta km

        // Hitung waktu tempuh Bumi ke Bulan (dalam detik)
        double waktuBulan = jarakBumiKeBulan / KECEPATAN_CAHAYA;
        
        // Hitung waktu tempuh Bumi ke Matahari (dalam detik)
        double waktuMatahari = jarakBumiKeMatahari / KECEPATAN_CAHAYA;

        System.out.println("Kecepatan Cahaya: " + KECEPATAN_CAHAYA + " km/s");
        System.out.println("==============================================");
        
        System.out.println("Jarak Bumi ke Bulan: " + jarakBumiKeBulan + " km");
        System.out.println("Waktu tempuh cahaya (Bumi ke Bulan): " + waktuBulan + " detik");
        
        System.out.println("----------------------------------------------");
        
        System.out.println("Jarak Bumi ke Matahari: " + jarakBumiKeMatahari + " km");
        System.out.println("Waktu tempuh cahaya (Bumi ke Matahari): " + waktuMatahari + " detik");
        
        // Konversi ke menit untuk Matahari agar lebih mudah dibaca
        double waktuMatahariMenit = waktuMatahari / 60.0;
        System.out.println("Waktu tempuh cahaya (Bumi ke Matahari): " + waktuMatahariMenit + " menit");
    }
    
}
