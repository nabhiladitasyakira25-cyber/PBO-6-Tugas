/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luasbangundatar;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class LuasBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int pilihan;
        double luas;

        System.out.println("=== Program Menghitung Luas Bangun Datar ===");
        System.out.println("1. Persegi");
        System.out.println("2. Segitiga");
        System.out.println("3. Lingkaran");
        System.out.println("4. Trapesium");
        System.out.println("5. Layang-layang");
        System.out.print("Pilih bangun datar (1-5): ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                double sisi = input.nextDouble();
                luas = sisi * sisi;
                System.out.println("Luas Persegi = " + luas);
                break;

            case 2:
                System.out.print("Masukkan alas segitiga: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggi = input.nextDouble();
                luas = 0.5 * alas * tinggi;
                System.out.println("Luas Segitiga = " + luas);
                break;

            case 3:
                System.out.print("Masukkan jari-jari lingkaran: ");
                double r = input.nextDouble();
                luas = 3.14 * r * r;
                System.out.println("Luas Lingkaran = " + luas);
                break;

            case 4:
                System.out.print("Masukkan sisi atas trapesium: ");
                double a = input.nextDouble();
                System.out.print("Masukkan sisi bawah trapesium: ");
                double b = input.nextDouble();
                System.out.print("Masukkan tinggi trapesium: ");
                double t = input.nextDouble();
                luas = 0.5 * (a + b) * t;
                System.out.println("Luas Trapesium = " + luas);
                break;

            case 5:
                System.out.print("Masukkan diagonal 1 layang-layang: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2 layang-layang: ");
                double d2 = input.nextDouble();
                luas = 0.5 * d1 * d2;
                System.out.println("Luas Layang-layang = " + luas);
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }

    }
}
        
    
