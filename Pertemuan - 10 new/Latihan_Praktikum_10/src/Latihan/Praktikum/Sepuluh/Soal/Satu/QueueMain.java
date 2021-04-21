/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Sepuluh.Soal.Satu;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class QueueMain {
    public static void menu(){
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek Data");
        System.out.println("-----------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas Queue : ");
        int n = sc.nextInt();
        Queue Q = new Queue(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch(pilih){
                case 1 :
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2 :
                    int dataKeluar = Q.Dequeue();
                    if(dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan : " + dataKeluar);
                        break;
                    }
                case 3 :
                    Q.print();
                    break;
                case 4 :
                    Q.peek();
                    break;
                case 5 :
                    Q.clear();
                case 6 :
                    System.out.print("Masukkan data yang dicari : ");
                    int data = sc.nextInt();
                    int posisi = Q.peekPosition(data);
                    System.out.println("Data " + data + " ada di posisi ke-" + posisi);
                    break;
                case 7 :
                    System.out.print("Masukkan posisi data yang dicari : ");
                    int position = sc.nextInt();
                    int Data = Q.peekAt(position);
                    System.out.println("Posisi data " + position + " berisi data " + Data);
                    break;
            } 
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}
