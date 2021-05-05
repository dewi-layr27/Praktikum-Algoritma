/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Duabelas.Soal.Satu;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList d = new DoubleLinkedList();
        
        System.out.println("======================================================");
        System.out.println("PROGRAM PENGOLAHAN ANGKA DENGAN DOUBLY LINKE LIST");
        System.out.println("======================================================");
        System.out.println("1. Tambah Head");
        System.out.println("2. Tambah Tail");
        System.out.println("3. Tambah Data");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari");
        System.out.println("9. Urut Data");
        System.out.println("10. Keluar");
        System.out.println("======================================================");
        int pilih;
        do {
            System.out.print("Masukkan pilihan anda : ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih) {
                case 1 :
                    System.out.print("Masukkan data : ");
                    int data = sc.nextInt();
                    d.addFirst(data);
                    System.out.println("");
                    break;
                case 2 :
                    System.out.print("Masukkan data : ");
                    int dt = sc.nextInt();
                    d.addLast(dt);
                    System.out.println("");
                    break;
                case 3 :
                    System.out.print("Masukkan data : ");
                    int D = sc.nextInt();
                    System.out.print("Masukkan index : ");
                    int i = sc.nextInt();
                    d.add(D, i);
                    break;
                case 4 :
                    d.removeFirst();
                    System.out.println("Data telah dihapus");
                    d.print();
                    break;
                case 5 :
                    d.removeLast();
                    System.out.println("Data telah dihapus");
                    d.print();
                    break;
                case 6 :
                    System.out.print("Masukkan indeks data yang akan dihapus : ");
                    int idx = sc.nextInt();
                    d.remove(idx);
                    System.out.println("Data ke - " +idx+" telah dihapus");
                    d.print();
                    break;
                case 7 :
                    d.print();
                    break;
                case 8 :
                    System.out.print("Masukkan data yang dicari : ");
                    int v = sc.nextInt();
                    d.sequentialSearch(v);
                    break;
                case 9 :
                    System.out.println("Sebelum diurutkan..");
                    d.printlist(d.head);
                    System.out.println("");
                    d.sorting(d.head);
                    System.out.println("Setelah diurutkan...");
                    d.printlist(d.head);
                    System.out.println("");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5
                || pilih == 6 || pilih == 7 || pilih == 8 || pilih == 9);
    }
}
