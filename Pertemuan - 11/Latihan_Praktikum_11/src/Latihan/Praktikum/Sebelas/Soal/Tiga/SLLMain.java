/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Sebelas.Soal.Tiga;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class SLLMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackLinkedList st = new StackLinkedList(8);
        
        System.out.println("Stack Link List");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Peek");
        System.out.println("4. IsEmpty");
        System.out.println("5. Get Size");
        System.out.println("6. Clear");
        System.out.println("7. Search");
        System.out.println("8. Add First");
        System.out.println("9. Add Last");
        System.out.println("10. Print");
        System.out.println("11. Insert Before");
        System.out.println("12. Insert After");
        System.out.println("13. Insert At");
        System.out.println("14. Remove First");
        System.out.println("15. Remove Last");
        System.out.println("0. Keluar");
        System.out.println("");
        int pilih;
        do {
            System.out.print("Masukkan pilihan anda : ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih) {
                case 1 :
                    System.out.print("Masukkan data : ");
                    String Value =  sc.nextLine();
                    st.push(Value);
                    System.out.println("");
                    break;
                case 2 :
                    System.out.println("Data "+st.pop()+" sudah diambil");
                    break;
                case 3 :
                    System.out.println("Data teratas : "+st.peek());
                case 4 :
                    if (st.isEmpty()) {
                        System.out.println("Data kosong");
                    } else {
                        System.out.println("Data terisi");
                    }
                    break;
                case 5 :
                    System.out.println("Isi Stack : "+st.getSize());
                    break;
                case 6 :
                    st.clear();
                    System.out.println("Semua data sudah dihapus");
                    break;
                case 7 :
                    System.out.print("Masukkan data yang akan dicari : ");
                    String value = sc.next();
                    if(st.search(value) == -1){
                        System.out.println("Data tidak ditemukan!");
                    } else {
                        System.out.println("Data "+value+" berada di indeks ke - "+st.search(value));
                    }
                    break;
                case 8 :
                    System.out.println("Masukkan data pertama : ");
                    String dt = sc.nextLine();
                    st.addFirst(dt);
                    st.push(dt);
                    break;
                case 9 :
                    System.out.println("Masukkan data terakhir : ");
                    String last = sc.nextLine();
                    st.addLast(last);
                    st.push(last);
                    break;
                case 10 :
                    st.print();
                    break;
                case 11 :
                    System.out.print("Masukkan key : ");
                    String key = sc.nextLine();
                    System.out.print("Masukkan value : ");
                    String v = sc.nextLine();
                    st.insertBefore(key, v);
                    break;
                case 12 :
                    System.out.print("Masukkan key : ");
                    String k = sc.nextLine();
                    System.out.print("Masukkan value : ");
                    String va = sc.nextLine();
                    st.insertAfter(k, va);
                    break;
                case 13 :
                    System.out.print("Masukkan indeks : ");
                    int ind = sc.nextInt();
                    System.out.print("Masukkan value : ");
                    String val = sc.nextLine();
                    st.insertAt(ind, val);
                    break;
                case 14 :
                    System.out.println("Data " + st.removeFirst() +" berhasil diremove");
                    break;
                case 15 :
                    System.out.println("Data " + st.removeLast() +" berhasil diremove");
                    break;
            }
        } while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 
                || pilih == 6 || pilih == 7 || pilih == 8 || pilih == 9 || pilih == 10
                || pilih == 11 || pilih == 12 || pilih == 13 || pilih == 14 || pilih == 15);
    }
}
