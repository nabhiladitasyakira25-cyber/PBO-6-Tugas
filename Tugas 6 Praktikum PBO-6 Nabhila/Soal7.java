/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas6pbo;
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread sedang berjalan...");
    }
}


/**
 *
 * @author LENOVO
 */
public class Soal7 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
