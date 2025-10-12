/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operasimatematika;

/**
 *
 * @author LENOVO
 */
public class OperasiMatematika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Nilai bilangan x dan y yang diminta
        int x = 22;
        int y = 33;
        
        // Operasi Penjumlahan
        int jumlah = x + y;
        
        // Operasi Pengurangan
        int kurang = x - y;
        
        // Operasi Perkalian
        int kali = x * y;
        
        // Operasi Pembagian (menggunakan double agar hasil desimal)
        double bagi = (double) x / y; 
        
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai y: " + y);
        System.out.println("=============================");
        System.out.println("Penjumlahan (x + y): " + jumlah);
        System.out.println("Pengurangan (x - y): " + kurang);
        System.out.println("Perkalian (x * y): " + kali);
        System.out.println("Pembagian (x / y): " + bagi);
    }
    
}
