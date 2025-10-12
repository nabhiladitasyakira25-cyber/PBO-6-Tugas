/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;

/**
 *
 * @author LENOVO
 */
public class Segitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Sisi siku-siku (alas dan tinggi) yang diminta
        double a = 6; // Alas (a)
        double b = 8; // Tinggi (b)
        
        // Soal 5: Hitung Luas Segitiga
        // Luas = 1/2 * alas * tinggi
        double luas = 0.5 * a * b;
        System.out.println("--- Soal 5: Luas Segitiga Siku-Siku ---");
        System.out.println("Sisi a (alas): " + a);
        System.out.println("Sisi b (tinggi): " + b);
        System.out.println("Luas Segitiga: " + luas);
        
        System.out.println("---------------------------------------");
        
        // Soal 6: Hitung nilai c (Hipotenusa) dan Keliling
        // Rumus Pythagoras: c = akar(a² + b²)
        double cKuadrat = (a * a) + (b * b);
        double c = Math.sqrt(cKuadrat); // Menggunakan Math.sqrt() untuk akar kuadrat
        
        // Keliling = a + b + c
        double keliling = a + b + c;
        
        System.out.println("--- Soal 6: Hipotenusa dan Keliling ---");
        System.out.println("Nilai c (Hipotenusa): " + c);
        System.out.println("Keliling Segitiga: " + keliling);
    }
    
}
