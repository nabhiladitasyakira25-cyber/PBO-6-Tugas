/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6pbo;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Soal4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = in.nextInt();
        in.nextLine();

        String[] nama = new String[n];
        int[] nilai = new int[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nama: ");
            nama[i] = in.nextLine();
            System.out.print("Nilai: ");
            nilai[i] = in.nextInt(); in.nextLine();
            status[i] = (nilai[i] > 50) ? "Lulus" : "Tidak Lulus";
        }

        System.out.println("\nDaftar Nilai Mahasiswa");
        System.out.println("No\tNama\tNilai\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "\t" + nama[i] + "\t" + nilai[i] + "\t" + status[i]);
            }
        
    }
    
}
