/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6pbo;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class Soal6 {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int nilai;

        System.out.println("Masukkan bilangan (input -1 untuk selesai):");
        while (true) {
            nilai = in.nextInt();
            if (nilai == -1) break;
            list.add(nilai);
        }

        if (list.isEmpty()) {
            System.out.println("Tidak ada data!");
        } else {
            int total = 0;
            for (int x : list) total += x;
            System.out.println("Rata-rata = " + (double) total / list.size());
        }

    }
    
}
