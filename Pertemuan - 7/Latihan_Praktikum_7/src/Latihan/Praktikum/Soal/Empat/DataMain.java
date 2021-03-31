/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Soal.Empat;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class DataMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PencarianData data = new PencarianData();
        int jumDt = 10;
        
        System.out.println("------------------------------------------------------");
        System.out.println("Masukkan data : ");
        for(int i = 0; i < jumDt; i++){
            System.out.print("Data ke - "+ i +" : ");
            int input = sc.nextInt();
            
            Data d = new Data(input);
            data.tambah(d);
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.selectionSort();
        data.tampil();
        
        System.out.println("------------------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan nilai Data yang dicari : ");
        System.out.print("Data : ");
        int cari = sc.nextInt();
        System.out.println("Menggunakan Binary Search");
        int posisi = data.FindBinSearch(cari, 0, 9);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
        System.out.println("Nilai data terbesar adalah " + data.cariTerbesar());
        System.out.println("Jumlah nilai data terbesar adalah " + data.jumlahTerbesar());
    }
}
