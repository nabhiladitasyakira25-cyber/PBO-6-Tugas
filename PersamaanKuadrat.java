/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persamaankuadrat;

/**
 *
 * @author LENOVO
 */
public class PersamaanKuadrat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Nilai a, b, c yang diminta
        double a = 2;
        double b = 10;
        double c = 5;
        
        // Menghitung Diskriminan: D = b² - 4ac
        double diskriminan = (b * b) - (4 * a * c);
        
        System.out.println("Persamaan Kuadrat: " + a + "x² + " + b + "x + " + c + " = 0");
        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);
        System.out.println("Nilai c: " + c);
        System.out.println("Diskriminan (b² - 4ac): " + diskriminan);
        
        /* * Catatan: Untuk mencari akar-akar (x1 dan x2),
         * akan dilanjutkan dengan rumus kuadrat: x = (-b ± √D) / 2a
         */
         
    }
   
}
