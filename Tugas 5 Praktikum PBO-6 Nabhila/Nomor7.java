/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor7;

/**
 *
 * @author LENOVO
 */
public class Nomor7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int i = 1;
        System.out.println("Menggunakan i++ :");
        i = 1;
        while (i <= 5) {
            System.out.println(i++);
        }

        System.out.println("\nMenggunakan ++i :");
        i = 1;
        while (i <= 5) {
            System.out.println(++i);
        }
    }
}