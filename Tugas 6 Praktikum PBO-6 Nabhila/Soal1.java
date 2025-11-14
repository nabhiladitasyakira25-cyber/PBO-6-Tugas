/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6pbo;

/**
 *
 * @author LENOVO
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 1. Deklarasi dan alokasi memori
        int[] angka1 = new int[5];
        System.out.println("Sintaks 1: int[] angka1 = new int[5];");

        // 2. Deklarasi + inisialisasi nilai langsung
        int[] angka2 = {10, 20, 30};
        System.out.println("Sintaks 2: int[] angka2 = {10, 20, 30};");

        // 3. Deklarasi + alokasi + inisialisasi
        int[] angka3 = new int[]{1, 2, 3, 4};
        System.out.println("Sintaks 3: int[] angka3 = new int[]{1, 2, 3, 4};");
    }
    
}
