/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Duabelas.Soal.Tiga;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList q = new QueueLinkedList();
        
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++++");
        int pilih;
        do {
            System.out.print("Masukkan pilihan anda : ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih) {
                case 1 :
                    System.out.print("Masukkan No. Antrian : ");
                    String data1 = sc.nextLine();
                    System.out.print("Masukkan Nama Pasien : ");
                    String data2 = sc.nextLine();
                    q.addFirst(data1, data2);
                    System.out.println("");
                    break;
                case 2 :
                    q.removeFirst();
                    break;
                case 3 :
                    q.print();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3);
    }
}
