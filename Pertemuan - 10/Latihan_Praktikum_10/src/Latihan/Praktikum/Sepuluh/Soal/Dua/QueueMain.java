/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Sepuluh.Soal.Dua;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class QueueMain {
    public static void menu(){
        System.out.println("Pilih Menu : ");
       System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Antrian belakang");
        System.out.println("5. Cek Semua Antrian");
        System.out.println("6. Cek Posisi & Data Pada Posisi Antrian");
        System.out.println("7. Hapus Antrian");
        System.out.println("----------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas Queue : ");
        int n = sc.nextInt();
        Queue jml = new Queue(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch(pilih){
                case 1 :
                    System.out.print("Nama : ");
                    String nama = sc.next();
                    System.out.print("NIM : ");
                    String nim = sc.next();
                    System.out.print("Absen : ");
                    int absen = sc.nextInt();
                    System.out.print("IPK : ");
                    double ipk = sc.nextDouble();
                    Mahasiswa m = new Mahasiswa(nim, nama, absen, ipk);
                    sc.nextLine();
                    jml.Enqueue(m);
                    break;
                case 2 :
                    Mahasiswa data = jml.Dequeue();
                    if(!"".equals(data.nama) && !"".equals(data.nim) && data.absen !=0 && data.ipk != 0){
                        System.out.println("Antrian yang keluar : " + data.nama + " " + data.nim + " "
                        + data.absen + " " + data.ipk + " ");
                        break;
                    }
                case 3 :
                    jml.peek();
                    break;
                case 4 :
                    jml.peekRear();
                    break;
                case 5 :
                    jml.print();
                    break;
                case 6 :
                    System.out.print("Masukkan data yang dicari : ");
                    String cari = sc.next();
                    int posisi = jml.FindSeqSearch(cari);
                    jml.PeekAt(cari, posisi);
                    jml.PeekPosition(cari, posisi);
                    break;
                case 7 :
                    jml.clear();
                    break;
            } 
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
