/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubahstring;

/**
 *
 * @author LENOVO
 */
public class UbahString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String originalString = "Saya Belajar Java";
        
        System.out.println("String awal: " + originalString);
        
        // Mengubah string menjadi huruf kecil (lowercase)
        String lowerCaseString = originalString.toLowerCase();
        System.out.println("Huruf Kecil : " + lowerCaseString);
        
        // Mengubah string menjadi huruf besar (uppercase)
        String upperCaseString = originalString.toUpperCase();
        System.out.println("Huruf Besar : " + upperCaseString);
        
    }
    
}
