/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Duabelas.Soal.Dua;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        StackLinkedList s = new StackLinkedList();
        
        System.out.println("************************");
        System.out.println("Data Buku Perpustakaan");
        System.out.println("************************");
        System.out.println("");
        System.out.println("1. Entry Judul Buku");
        System.out.println("2. Ambil Buku Teratas");
        System.out.println("3. Cek Judul Buku Teratas");
        System.out.println("4. Info Semua Judul Buku");
        System.out.println("5. Keluar");
        System.out.println("");
        System.out.println("************************");
        int pilih;
        do {
            System.out.print("Masukkan pilihan anda : ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih){
                case 1 :
                    System.out.print("Masukkan Judul Buku : ");
                    String value = sc.nextLine();
                    s.push(value);
                    System.out.println("");
                    break;
                case 2 :
                    s.pop();
                    System.out.println("Buku pada tumpukan teratas telah diambil");
                    System.out.println("");
                    break;
                case 3 :
                    System.out.println("-------------------");
                    System.out.println("Cek Buku Teratas");
                    System.out.println("-------------------");
                    System.out.println(s.peek());
                    System.out.println("");
                    break;
                case 4 :
                    s.print();
                    System.out.println("");
                    break;
            }
        } while(pilih == 1 || pilih == 2 || pilih == 3 || pilih ==4);
    }
}
