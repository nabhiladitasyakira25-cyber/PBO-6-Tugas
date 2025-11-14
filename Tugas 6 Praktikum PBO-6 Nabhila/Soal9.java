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
public class Soal9 {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};

        // Cara 1: for biasa
        System.out.println("Cara 1 Memakai for");
        for (int i = 0; i < age.length; i++)
            System.out.println(age[i]);

        // Cara 2: for-each
        System.out.println("Cara 2 Memakai for-each");
        for (int x : age)
            System.out.println(x);
    }
}
    
