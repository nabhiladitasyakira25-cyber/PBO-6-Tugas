/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungpendapatansalesman;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class HitungPendapatanSalesman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Hitung Pendapatan Salesman ===");
        System.out.print("Masukkan total penjualan hari ini (Rp): ");
        double penjualan = input.nextDouble();

        double jasa;
        double komisi;
        double totalPendapatan;
        double persenKomisi;

        // Menentukan jasa, komisi, dan persentase komisi
        if (penjualan <= 2000000) {
            jasa = 100000;
            persenKomisi = 10;
            komisi = 0.10 * penjualan;
        } else if (penjualan > 2000000 && penjualan <= 5000000) {
            jasa = 200000;
            persenKomisi = 15;
            komisi = 0.15 * penjualan;
        } else if (penjualan > 5000000) {
            jasa = 300000;
            persenKomisi = 20;
            komisi = 0.20 * penjualan;
        } else {
            System.out.println("Input tidak valid!");
            return;
        }

        // Hitung total pendapatan
        totalPendapatan = jasa + komisi;

        // Tampilkan hasil
        System.out.println("\n=== RINCIAN PENDAPATAN SALESMAN ===");
        System.out.println("Total Penjualan     : Rp " + penjualan);
        System.out.println("Uang Jasa           : Rp " + jasa);
        System.out.println("Persentase Komisi   : " + persenKomisi + " %");
        System.out.println("Uang Komisi         : Rp " + komisi);
        System.out.println("-------------------------------------------");
        System.out.println("Total Pendapatan    : Rp " + totalPendapatan);
    }
}