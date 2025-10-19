/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gayasentripetal;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class GayaSentripetal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        // Deklarasi variabel
        double massa, kecepatan, jariJari, gayaSentripetal;

        System.out.println("=== Perhitungan Gaya Sentripetal ===");

        // Input data
        System.out.print("Masukkan massa benda (m) dalam kg: ");
        massa = input.nextDouble();

        System.out.print("Masukkan kecepatan linear (v) dalam m/s: ");
        kecepatan = input.nextDouble();

        System.out.print("Masukkan jari-jari lintasan (r) dalam meter: ");
        jariJari = input.nextDouble();

        // Perhitungan: Fc = (m * v^2) / r
        gayaSentripetal = (massa * kecepatan * kecepatan) / jariJari;

        // Output hasil
        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.println("Massa (m)              : " + massa + " kg");
        System.out.println("Kecepatan (v)          : " + kecepatan + " m/s");
        System.out.println("Jari-jari (r)          : " + jariJari + " m");
        System.out.println("Gaya Sentripetal (Fc)  : " + gayaSentripetal + " Newton");
    }
}
    
