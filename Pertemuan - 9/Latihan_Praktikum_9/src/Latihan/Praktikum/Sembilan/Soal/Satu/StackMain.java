/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Sembilan.Soal.Satu;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack(25);
        System.out.print("Masukkan kalimat : ");
        String kal = sc.nextLine();
        System.out.println("Hasil :");
        for (int i = 0; i < kal.length(); i++) {
          stk.push(kal.charAt(i));
        } 
        stk.print();
    }
}
