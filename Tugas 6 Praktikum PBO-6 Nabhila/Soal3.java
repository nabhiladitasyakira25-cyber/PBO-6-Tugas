/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6pbo;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // a. Input jumlah elemen
        System.out.print("Masukkan jumlah elemen array: ");
        int n = in.nextInt();
        int[] data = new int[n];

        // b. Input nilai elemen
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + i + ": ");
            data[i] = in.nextInt();
        }

        // c. Cari max & min
        int max = data[0];
        int min = data[0];
        int idxMax = 0;
        int idxMin = 0;

        for (int i = 0; i < n; i++) {
            if (data[i] > max) {
                max = data[i];
                idxMax = i;
            }
            if (data[i] < min) {
                min = data[i];
                idxMin = i;
            }
        }

        System.out.println("\nNilai terbesar = " + max + " (indeks " + idxMax + ")");
        System.out.println("Nilai terkecil = " + min + " (indeks " + idxMin + ")");

        // d. Jumlah & rata-rata
        int total = 0;
        for (int x : data) total += x;

        System.out.println("Jumlah semua elemen = " + total);
        System.out.println("Rata-rata = " + (double) total / n);

        // e. Jumlah elemen indeks ganjil
        int jumlahGanjil = 0;
        for (int i = 1; i < n; i += 2)
            jumlahGanjil += data[i];

        System.out.println("Jumlah elemen berindeks ganjil = " + jumlahGanjil);

        // f. Jumlah elemen indeks genap
        int jumlahGenap = 0;
        for (int i = 0; i < n; i += 2)
            jumlahGenap += data[i];

        System.out.println("Jumlah elemen berindeks genap = " + jumlahGenap);

        // g. Cek ganjil-genap hasil total
        if (total % 2 == 0) System.out.println("Total adalah GENAP");
        else System.out.println("Total adalah GANJIL");

        // h. Urutkan array
        Arrays.sort(data);
        System.out.println("Array setelah diurutkan: " + Arrays.toString(data));
    }
    
}
