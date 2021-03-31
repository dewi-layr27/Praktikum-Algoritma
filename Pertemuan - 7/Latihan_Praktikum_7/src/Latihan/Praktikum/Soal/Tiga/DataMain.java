/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Soal.Tiga;
import java.util.Scanner;

/**
 *
 * @author user
 */
class DataMain { // DataMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data2D berkas = new Data2D();
        berkas.initKasus3x5();

        PencarianData detektif = new PencarianData(berkas.data);
        
        detektif.tampilSemuaData();
        
        System.out.println("------------------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.print  ("Masukkan data yang dicari : ");
        int target = sc.nextInt(); sc.nextLine();
        System.out.println("------------------------------------------------------");
        System.out.println("Menggunakan Sequential Search");
        
        detektif.findSeq(target);
        detektif.tampilHasilFindTerakhir();
    }
}
