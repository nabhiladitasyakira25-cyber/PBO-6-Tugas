/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor4;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Nomor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak angka : ");
        int n = input.nextInt();

        int total = 0;
        System.out.print("Angka ganjil : ");

        int hitung = 0, angka = 1;
        while (hitung < n) {
            System.out.print(angka + " ");
            total += angka;
            angka += 2;
            hitung++;
        }

        System.out.println("\nTotal penjumlahan : " + total);
    }
}
    