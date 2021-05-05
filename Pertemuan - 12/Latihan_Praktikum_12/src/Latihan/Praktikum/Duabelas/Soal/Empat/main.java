/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Duabelas.Soal.Empat;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList d = new DoubleLinkedList();
        
        System.out.println("===================================");
        System.out.println("SISTEM PENGOLAHAN DATA MAHASISWA");
        System.out.println("===================================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari NIM");
        System.out.println("9. Urut Data IPK-DESC");
        System.out.println("10. Keluar");
        System.out.println("===================================");
        int pilih;
        do {
            System.out.print("Masukkan pilihan anda : ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih) {
                case 1 :
                    System.out.println("Masukkan Data Mahasiswa Posisi Awal");
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("IPK : ");
                    double ipk = sc.nextDouble();
                    System.out.println("");
                    d.addFirst(nim, nama, ipk);
                    break;
                case 2 :
                    System.out.println("Masukkan Data Mahasiswa Posisi Akhit");
                    System.out.print("NIM : ");
                    String nm = sc.nextLine();
                    System.out.print("Nama : ");
                    String n = sc.nextLine();
                    System.out.print("IPK : ");
                    double i = sc.nextDouble();
                    System.out.println("");
                    d.addLast(nm, n, i);
                    break;
                case 3 :
                    System.out.println("Masukkan Data Mahasiswa");
                    System.out.print("NIM : ");
                    String N = sc.nextLine();
                    System.out.print("Nama : ");
                    String Nm = sc.nextLine();
                    System.out.print("IPK : ");
                    double ip = sc.nextDouble();
                    System.out.print("Masukkan indeks : ");
                    int id = sc.nextInt();
                    System.out.println("");
                    d.add(N, Nm, ip, id);
                    break;
                case 4 :
                    d.removeFirst();
                    System.out.println("Data pertama telah dihapus");
                    break;
                case 5 :
                    d.removeLast();
                    System.out.println("Data terakhir telah dihapus");
                    break;
                case 6 :
                    System.out.print("Masukkan indeks data yang akan dihapus : ");
                    int idx = sc.nextInt();
                    d.remove(idx);
                    System.out.println("Data ke - " +idx+" telah dihapus");
                    break;
                case 7 :
                    d.print();
                    System.out.println("");
                    break;
                case 8 :
                    System.out.print("Masukkan nim yang dicari: ");
                    String NIM = sc.nextLine();
                    d.Searching(NIM);
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
