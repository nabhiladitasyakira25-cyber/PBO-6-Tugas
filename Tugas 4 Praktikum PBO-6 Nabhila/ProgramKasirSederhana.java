/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programkasirsederhana;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ProgramKasirSederhana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Kasir Sederhana ===");

        // Input total belanja
        System.out.print("Masukkan total belanja (Rp): ");
        double totalBelanja = input.nextDouble();

        // Tanya apakah memiliki kartu member
        System.out.print("Apakah memiliki kartu member? (true/false): ");
        boolean isMember = input.nextBoolean();

        double diskon;
        double totalBayar;
        double uangBayar;
        double kembalian;

        // Menentukan besar diskon
        if (isMember) { // Jika punya kartu member
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            } else {
                diskon = 0;
            }
        } else { // Jika tidak punya kartu member
            if (totalBelanja > 100000) {
                diskon = 10000;
            } else {
                diskon = 0;
            }
        }

        // Hitung total yang harus dibayar
        totalBayar = totalBelanja - diskon;

        // Input uang pembayaran
        System.out.print("Masukkan jumlah uang yang dibayar (Rp): ");
        uangBayar = input.nextDouble();

        // Hitung kembalian
        kembalian = uangBayar - totalBayar;

        // Tampilkan hasil
        System.out.println("\n=== Struk Pembayaran ===");
        System.out.println("Status Member   : " + (isMember ? "Member" : "Bukan Member"));
        System.out.println("Total Belanja   : Rp" + totalBelanja);
        System.out.println("Diskon          : Rp" + diskon);
        System.out.println("Total Bayar     : Rp" + totalBayar);
        System.out.println("Uang Dibayar    : Rp" + uangBayar);
        System.out.println("Kembalian       : Rp" + kembalian);
        System.out.println("===========================");
        System.out.println("Terima kasih telah berbelanja!");
    }
}
    
