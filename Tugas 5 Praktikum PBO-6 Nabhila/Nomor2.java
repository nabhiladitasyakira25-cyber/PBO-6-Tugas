/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor2;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Nomor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan yang akan diinput: ");
        int n = input.nextInt();

        int total = 0;
        int angka;
        for (int i = 1; i <= n; i++) {
            System.out.print("Bilangan ke-" + i + " : ");
            angka = input.nextInt();
            total += angka;
        }

        double rata = (double) total / n;

        System.out.println("\nTotal jumlah bilangan : " + total);
        System.out.println("Rata-rata : " + rata);
    }
}
   
