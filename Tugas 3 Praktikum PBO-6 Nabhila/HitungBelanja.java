/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungbelanja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class HitungBelanja {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException { 
        
        // Persiapan untuk Input
        BufferedReader inputData = new BufferedReader(new InputStreamReader(System.in));
        
        String nama;
        double totalBelanja, diskonPersen, diskonNominal, totalBayar, bayar, kembalian;

        // --- Input Data ---
        
        System.out.print("Masukkan Nama Pelanggan: ");
        nama = inputData.readLine(); 
        
        System.out.print("Masukkan Total Belanja: ");
        totalBelanja = Double.parseDouble(inputData.readLine()); 
        
        System.out.print("Masukkan Diskon (%): ");
        diskonPersen = Double.parseDouble(inputData.readLine());
        
        // --- Perhitungan ---
        
        diskonNominal = totalBelanja * (diskonPersen / 100);
        totalBayar = totalBelanja - diskonNominal;
        
        System.out.print("Masukkan Jumlah Bayar: ");
        bayar = Double.parseDouble(inputData.readLine());

        kembalian = bayar - totalBayar;
            
        // --- Output Hasil ---
        
        System.out.println("\n=== Struk Pembelanjaan ===");
        System.out.println("Nama           : " + nama);
        System.out.println("Total Belanja  : Rp " + totalBelanja);
        System.out.println("Diskon (%)     : " + diskonPersen + " %");
        System.out.println("Diskon Nominal : Rp " + diskonNominal);
        System.out.println("Total (Bayar)  : Rp " + totalBayar);
        System.out.println("Bayar          : Rp " + bayar);
        System.out.println("Kembalian      : Rp " + kembalian);
        System.out.println("==========================");
    }
}
