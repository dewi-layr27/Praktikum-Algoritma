/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DoubleLinkedList;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList d = new DoubleLinkedList();
        
        System.out.println("================================================");
        System.out.println("SISTEM PENGOLAHAN DATA MAHASISWA");
        System.out.println("================================================");
        System.out.println("1. Tambah Data Mahasiswa");
        System.out.println("2. Tambah Data Mahasiswa Awal");
        System.out.println("3. Tambah Data Mahasiswa Akhir");
        System.out.println("4. Hapus Data Mahasiswa");
        System.out.println("5. Hapus Data Mahasiswa Awal");
        System.out.println("6. Hapus Data Mahsiswa Akhir");
        System.out.println("7. Cetak Data Mahsaiswa");
        System.out.println("8. Temukan Data Mahsiswa urutan Pertama");
        System.out.println("9. Cari Data Mahasiswa melalui NIM");
        System.out.println("10. Urut Data Mahasiswa melalui IPK");
        System.out.println("11. Keluar");
        System.out.println("================================================");
        int pilih;
        do {
            System.out.print("Masukkan pilihan anda : ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih) {
                case 1 :
                    System.out.println("Masukkan Data Mahasiswa");
                    System.out.print("NIM : ");
                    String N = sc.nextLine();
                    System.out.print("Nama : ");
                    String Nm = sc.nextLine();
                    System.out.print("Jurusan : ");
                    String jr = sc.nextLine();
                    System.out.print("Prodi : ");
                    String pd = sc.nextLine();
                    System.out.print("IPK : ");
                    double ip = sc.nextDouble();
                    System.out.print("Masukkan indeks : ");
                    int id = sc.nextInt();
                    System.out.println("");
                    d.add(N, Nm, jr, pd, ip, id);
                    break;
                case 2 :
                    System.out.println("Masukkan Data Mahasiswa Posisi Awal");
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Jurusan : ");
                    String jurusan = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("IPK : ");
                    double ipk = sc.nextDouble();
                    System.out.println("");
                    d.addFirst(nim, nama, jurusan, prodi, ipk);
                    break;
                case 3 :
                    System.out.println("Masukkan Data Mahasiswa Posisi Akhir");
                    System.out.print("NIM : ");
                    String nm = sc.nextLine();
                    System.out.print("Nama : ");
                    String n = sc.nextLine();
                    System.out.print("Jurusan : ");
                    String j = sc.nextLine();
                    System.out.print("Prodi : ");
                    String p = sc.nextLine();
                    System.out.print("IPK : ");
                    double i = sc.nextDouble();
                    System.out.println("");
                    d.addLast(nm, n, j, p, i);
                    break;
                case 4 :
                    System.out.print("Masukkan indeks data yang akan dihapus : ");
                    int idx = sc.nextInt();
                    d.remove(idx);
                    System.out.println("Data ke - " +idx+" telah dihapus");
                    break;
                case 5 :
                    d.removeFirst();
                    System.out.println("Data pertama telah dihapus");
                    break;
                case 6 :
                    d.removeLast();
                    System.out.println("Data terakhir telah dihapus");
                    break;
                case 7 :
                    d.print();
                    System.out.println("");
                    break;
                case 8 :
                    System.out.println("Data pertama adalah " + d.getFirst());
                    break;
                case 9 :
                    System.out.print("Masukkan NIM yang dicari: ");
                    String NIM = sc.nextLine();
                    d.Searching(NIM);
                    break; 
                case 10 :
                    System.out.println("Sebelum diurutkan..");
                    d.printList(d.head);
                    System.out.println("");
                    d.bubbleSort(d.head);
                    System.out.println("Setelah di1urutkan...");
                    d.printList(d.head);
                    System.out.println("");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5
                || pilih == 6 || pilih == 7 || pilih == 8 || pilih == 9 || pilih == 10);
    }
}
