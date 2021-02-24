/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Soal.Empat;

/**
 *
 * @author user
 */
public class PacMan {
    int x, y, width, height;
    
    void Tampil(){
        System.out.println("Nilai x : " + x);
        System.out.println("Nilai y : " + y);
        System.out.println("Nilai width  : " + width);
        System.out.println("Nilai height : " + height);
    }
    
    void moveLeft(){
        if (x > 0 || x > width) {
            x = x - 1;
        }
    }
    
    void moveRight(){
        if (x > 0 || x > width) {
            x = x + 1;
        }
    }
    
    void moveUp(){
        if (y > 0 || y > height) {
            y = y - 1;
        }
    }
    
    void moveDown(){
        if (y > 0 || y > height) {
            y = y + 1;
        }
    }
    
    void printPosition(){
        if (x > 0 || x > width) {
            x = x - 1;
            System.out.println("Posisi PacMan setelah pindah ke kiri  (x)   : " + x);
        }
        if (x > 0 || x > width) {
            x = x + 1;
            System.out.println("Posisi PacMan setelah pindah ke kanan (x)   : " + x);
        }
        if (y > 0 || y > width) {
            y = y - 1;
            System.out.println("Posisi PacMan setelah pindah ke atas  (y)   : " + y);
        }
        if (y > 0 || y > width) {
            y = y + 1;
            System.out.println("Posisi PacMan setelah pindah ke bawah (y)   : " + y);
        }
    }
    public static void main(String[] args) {
        PacMan p1 = new PacMan();
        p1.x = 4;
        p1.y = 3;
        p1.width = 10;
        p1.height = 7;
        
        p1.Tampil();
        p1.moveLeft();
        p1.moveRight();
        p1.moveUp();
        p1.moveDown();
        p1.printPosition();
    }
}
