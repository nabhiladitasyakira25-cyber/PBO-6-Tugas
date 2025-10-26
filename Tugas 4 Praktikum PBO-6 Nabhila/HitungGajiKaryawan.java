/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitunggajikaryawan;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class HitungGajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();

        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Kode Golongan (1-4): ");
        int golongan = input.nextInt();

        int jumlahAnak = 0;
        double gajiPokok;
        double tunjanganPasangan = 0;
        double tunjanganAnak = 0;
        double gajiBersih;
        String statusPernikahan;

        // Tentukan gaji pokok dan status berdasarkan golongan
        switch (golongan) {
            case 1:
                gajiPokok = 1200000;
                statusPernikahan = "Menikah";
                break;

            case 2:
                gajiPokok = 1500000;
                statusPernikahan = "Belum menikah";
                break;

            case 3:
                gajiPokok = 1750000;
                statusPernikahan = "Cerai";
                break;

            case 4:
                gajiPokok = 2000000;
                statusPernikahan = "Menikah & punya anak";
                System.out.print("Masukkan Jumlah Anak: ");
                jumlahAnak = input.nextInt();
                break;

            default:
                System.out.println("Kode golongan tidak valid!");
                input.close();
                return;
        }

        // Hitung tunjangan pasangan (10% dari gaji pokok)
        if (golongan == 1 || golongan == 4) {
            tunjanganPasangan = 0.10 * gajiPokok;
        }

        // Hitung tunjangan anak (5% gaji pokok × jumlah anak)
        if (golongan == 4 && jumlahAnak > 0) {
            tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;
        }

        gajiBersih = gajiPokok + tunjanganPasangan + tunjanganAnak;

        // Tampilkan hasil
        System.out.println("\n===== DATA KARYAWAN =====");
        System.out.println("NIK                 : " + nik);
        System.out.println("Nama                : " + nama);
        System.out.println("Golongan            : " + golongan);
        System.out.println("Status Pernikahan   : " + statusPernikahan);
        System.out.println("Jumlah Anak         : " + jumlahAnak);
        System.out.println("---------------------------------");
        System.out.println("Gaji Pokok          : Rp" + gajiPokok);
        System.out.println("Tunjangan Pasangan  : Rp" + tunjanganPasangan);
        System.out.println("Tunjangan Anak      : Rp" + tunjanganAnak);
        System.out.println("---------------------------------");
        System.out.println("Gaji Bersih         : Rp" + gajiBersih);
        System.out.println("================================");

    }
}