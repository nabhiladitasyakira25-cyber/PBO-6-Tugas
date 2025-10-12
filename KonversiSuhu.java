/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;

/**
 *
 * @author LENOVO
 */
public class KonversiSuhu {
    // Nilai Suhu Awal yang diminta
    final static double C = 10; // Celcius
    final static double F = 15; // Fahrenheit
    final static double R = 5;  // Reamur


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--- Nilai Awal ---");
        System.out.println("Celcius (C): " + C);
        System.out.println("Fahrenheit (F): " + F);
        System.out.println("Reamur (R): " + R);
        System.out.println("==================\n");

        // a. Celcius ke Fahrenheit dan sebaliknya
        double cToF = (C * 9/5) + 32;
        double fToC = (F - 32) * 5/9;
        
        System.out.println("a. Celcius ke Fahrenheit dan sebaliknya");
        System.out.println(C + "°C  = " + cToF + "°F");
        System.out.println(F + "°F = " + fToC + "°C");
        System.out.println("------------------\n");
        
        // b. Celcius ke Reamur dan sebaliknya
        double cToR = C * 4/5;
        double rToC = R * 5/4;
        
        System.out.println("b. Celcius ke Reamur dan sebaliknya");
        System.out.println(C + "°C  = " + cToR + "°R");
        System.out.println(R + "°R = " + rToC + "°C");
        System.out.println("------------------\n");
        
        // c. Fahrenheit ke Reamur dan sebaliknya
        double fToR = (F - 32) * 4/9;
        double rToF = (R * 9/4) + 32;
        
        System.out.println("c. Fahrenheit ke Reamur dan sebaliknya");
        System.out.println(F + "°F = " + fToR + "°R");
        System.out.println(R + "°R = " + rToF + "°F");
        
    }
    
}
