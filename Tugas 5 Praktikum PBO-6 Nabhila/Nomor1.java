/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor1;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Nomor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int angka, terbesar, terkecil;

        System.out.println("Masukkan 10 bilangan: ");

        // input bilangan pertama
        System.out.print("Bilangan ke-1 : ");
        angka = input.nextInt();
        terbesar = angka;
        terkecil = angka;

        // input bilangan ke-2 sampai ke-10
        for (int i = 2; i <= 10; i++) {
            System.out.print("Bilangan ke-" + i + " : ");
            angka = input.nextInt();

            if (angka > terbesar) {
                terbesar = angka;
            }
            if (angka < terkecil) {
                terkecil = angka;
            }
        }

        System.out.println("\nBilangan terbesar : " + terbesar);
        System.out.println("Bilangan terkecil : " + terkecil);
                
    }
    
}
