/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitunggaji;
import java.util.Scanner;


/**
 *
 * @author LENOVO
 */
public class HitungGaji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi variabel
        String nik, nama, alamat, jabatan;
        double gajiPokok, tunjanganJabatan, tunjanganIstri, tunjanganAnak;
        double totalGaji, pajakPenghasilan, gajiBersih;

        // Menggunakan Scanner untuk input (atau bisa juga di-hardcode)
        Scanner input = new Scanner(System.in);
        
        // Input Data (Sesuai contoh soal, bisa di-hardcode atau di-input user)
        nik = "240117001";
        nama = "John Doe";
        alamat = "Jl. Lorem Ipsum, Kecamatan Cianjur, Jawa Barat";
        jabatan = "Manajer";
        gajiPokok = 2000000;    // P1
        tunjanganJabatan = 300000; // P2
        tunjanganIstri = 200000;   // P3
        tunjanganAnak = 150000;    // P4
        
        // Output Data Awal
        System.out.println("=== Data Pegawai ===");
        System.out.println("Nomor Induk Karyawan : " + nik);
        System.out.println("Nama Karyawan        : " + nama);
        System.out.println("Alamat               : " + alamat);
        System.out.println("Jabatan              : " + jabatan);
        System.out.println("Gaji Pokok (P1)      : " + gajiPokok);
        System.out.println("Tunjangan Jabatan (P2): " + tunjanganJabatan);
        System.out.println("Tunjangan Istri (P3) : " + tunjanganIstri);
        System.out.println("Tunjangan Anak (P4)  : " + tunjanganAnak);
        System.out.println("====================");

        // Perhitungan
        // Total Gaji = P1 + P2 + P3 + P4
        totalGaji = gajiPokok + tunjanganJabatan + tunjanganIstri + tunjanganAnak;

        // Pajak Penghasilan = 10% * (P1 + P2 + P3)
        // Catatan: Sesuai soal, pajak hanya dari P1, P2, P3. P4 tidak kena pajak.
        pajakPenghasilan = 0.10 * (gajiPokok + tunjanganJabatan + tunjanganIstri);

        // Gaji Bersih = Total Gaji - Pajak Penghasilan
        gajiBersih = totalGaji - pajakPenghasilan;

        // Output Hasil
        System.out.println("Total Gaji           : " + totalGaji);
        System.out.println("Pajak Penghasilan    : " + pajakPenghasilan);
        System.out.println("Gaji Bersih          : " + gajiBersih);
    }
}
  
