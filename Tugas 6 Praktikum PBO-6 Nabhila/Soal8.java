/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6pbo;
import java.util.Scanner;

class Worker extends Thread {
    int id;
    Worker(int id){ this.id = id; }

    public void run() {
        System.out.println("Thread ke-" + id + " berjalan...");
    }
}

/**
 *
 * @author LENOVO
 */
public class Soal8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah thread: ");
        int n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            new Worker(i).start();
        }
    
    }
}
