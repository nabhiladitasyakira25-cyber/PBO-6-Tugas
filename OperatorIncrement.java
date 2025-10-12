/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operatorincrement;

/**
 *
 * @author LENOVO
 */
public class OperatorIncrement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 10;

        System.out.println("Nilai awal a: " + a);
        System.out.println("Nilai awal b: " + b);
        System.out.println("-------------------------");

        // 1. Ilustrasi Post-increment (a++)
        // a digunakan dulu (tetap 10) di baris ini, baru kemudian a ditambah 1.
        System.out.println("Post-increment (a++): " + (a++)); 
        System.out.println("Nilai a setelah operasi: " + a); // Output: 11

        System.out.println("-------------------------");

        // 2. Ilustrasi Pre-increment (++b)
        // b ditambah 1 dulu (menjadi 11), baru kemudian digunakan di baris ini.
        System.out.println("Pre-increment (++b): " + (++b)); 
        System.out.println("Nilai b setelah operasi: " + b); // Output: 11
    }
    
}
