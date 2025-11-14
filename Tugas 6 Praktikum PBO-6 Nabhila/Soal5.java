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
public class Soal5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = in.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = in.nextInt();

        int[][] A = new int[baris][kolom];
        int[][] B = new int[baris][kolom];
        int[][] C = new int[baris][kolom];

        System.out.println("Input matriks A:");
        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++)
                A[i][j] = in.nextInt();

        System.out.println("Input matriks B:");
        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++)
                B[i][j] = in.nextInt();

        for (int i = 0; i < baris; i++)
            for (int j = 0; j < kolom; j++)
                C[i][j] = A[i][j] + B[i][j];

        System.out.println("\nHasil Penjumlahan:");
        for (int[] row : C) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
        
    }
    
}
