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
public class Soal2 {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        for(int i = 0; i < mobil.length; i++){
            if(mobil[i].equals("Suzuki")){
                mobil[i] = "Toyota";  // nilai diganti
                System.out.println("Nilai baru pada indeks tersebut: " + mobil[i]);
            }
        }
    }
    
}
