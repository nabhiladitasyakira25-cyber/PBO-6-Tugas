/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genapganjil;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class GenapGanjil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 

        System.out.print("Masukkan sebuah bilangan bulat: ");
        int bilangan = input.nextInt();

        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan Genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan Ganjil.");
        }
        
    }
}
    
