/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Soal_3 {
    public static void main(String[] args) {
        int awal;
        int akhir;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai awal                : ");
        awal = sc.nextInt();
        System.out.print("Masukkan nilai akhir               : ");
        akhir = sc.nextInt();
        System.out.println("Bilangan genap kecuali kelipatan 4 :");

        for(int i = awal; i <= akhir; i++) {
            if(i % 2 == 0) {
                if (i % 4 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
