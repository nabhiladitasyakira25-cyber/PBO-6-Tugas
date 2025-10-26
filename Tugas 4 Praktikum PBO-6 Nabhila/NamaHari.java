/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namahari;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class NamaHari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kode hari (1-7): ");
        int kodeHari = input.nextInt();
        String namaHari;

        switch (kodeHari) {
            case 1:
                namaHari = "Senin";
                break;
            case 2:
                namaHari = "Selasa";
                break;
            case 3:
                namaHari = "Rabu";
                break;
            case 4:
                namaHari = "Kamis";
                break;
            case 5:
                namaHari = "Jumat";
                break;
            case 6:
                namaHari = "Sabtu";
                break;
            case 7:
                namaHari = "Minggu";
                break;
            default:
                namaHari = "Kode hari tidak valid. Masukkan angka antara 1 sampai 7.";
                break;
        }

        System.out.println("Nama hari untuk kode " + kodeHari + " adalah: " + namaHari);

    }
}