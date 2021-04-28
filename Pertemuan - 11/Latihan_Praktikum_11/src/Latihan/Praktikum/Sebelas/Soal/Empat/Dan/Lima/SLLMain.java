/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Sebelas.Soal.Empat.Dan.Lima;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author user
 */

public class SLLMain {
   String nama, alamat, no;
   QueueLinkedList data = new QueueLinkedList();
   Scanner input = new Scanner(System.in);
   int pilih;
   
    public static void main (String[] args) throws Exception {
        System.out.println("       == Program Linked List Nasabah ==      ");
        System.out.println("------------------------------------------------");
        Scanner input = new Scanner(System.in);
        
        int pilih;
        SLLMain list  = new SLLMain(); 
        SLLMain.menu ();
        pilih = input.nextInt();
        list.pilihmenu(pilih);  
        
    }

    public static void menu() {
        System.out.println();
        System.out.println("================================================");
        System.out.println("                    MAIN MENU                   ");
        System.out.println("================================================");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari ");
        System.out.println("4. Print");
        System.out.println("5. Keluar");
        System.out.println("================================================");
        System.out.print("Pilih menu : ");
    }

    void pilihmenu(int menu) throws Exception {
        switch (menu) {
        case 1:
            submenu1();
             break;
        case 2:
            submenu2();
            break;
        case 3:
             submenu3();          
             break;
        case 4: 
            System.out.println();
             data.print();
             break;
        default:
             System.out.println("Anda keluar dari program !");       
              
        }
    }
   
   void submenu1() throws Exception {
            System.out.println("=========================================="); 
            System.out.println("                 Menu Tambah              ");
            System.out.println("==========================================");
            System.out.println("1. Tambah (First)");
            System.out.println("2. Tambah (Index)");
            System.out.println("3. Tambah (Last)");
            System.out.println("4. Keluar");
            System.out.println("=========================================");
            System.out.print("Pilih submenu :  ");
            int submenu1 = input.nextInt();
            input.nextLine();
            
                switch(submenu1)   {
                case 1 : 
                    System.out.print("Masukkan Nama\t\t: ");
                    nama = input.next();
                    System.out.print("Masukkan Alamat\t\t: ");
                    alamat = input.next();
                    System.out.print("Masukkan No.Rekening\t: ");
                    no = input.next();
                    data.addFirst(nama, alamat, no);
                    System.out.println();
                    data.print();
                    break;
                    
                case 2 :  
                    System.out.print("Masukkan Index  : ");
                    int index = input.nextInt();
                    System.out.print("Masukkan Nama\t\t: ");
                    nama = input.next();
                    System.out.print("Masukkan Alamat\t\t: ");
                    alamat = input.next();
                    System.out.print("Masukkan No.Rekening\t: ");
                    no = input.next();
                
         {
             try {
                 data.add(nama, alamat, no, index);
             } catch (Exception ex) {
                 Logger.getLogger(SLLMain.class.getName()).log(Level.SEVERE, null, ex);
             }
         }
                       System.out.println("");
                       data.print();
                       break;
                       
                   case 3 :
                       System.out.print("Masukkan Nama\t\t: ");
                       nama = input.next();
                       input.nextLine();
                       System.out.print("Masukkan Alamat\t\t: ");
                       alamat = input.next();
                       System.out.print("Masukkan No.Rekening\t: ");
                       no = input.next();                   
                       data.addLast(nama, alamat, no);
                       System.out.println();
                       data.print();
                       break;

                   default :
                       System.out.println("Terimakasih !");
               }
       menu();
       pilih = input.nextInt();
       pilihmenu(pilih);
    }
   
    void submenu2() throws Exception {
               System.out.println("=========================================="); 
               System.out.println("                Menu Hapus                ");
               System.out.println("==========================================");
               System.out.println("1. Hapus (Index)");
               System.out.println("2. Hapus (Key)");
               System.out.println("3. Clear");
               System.out.println("4. Print");
               System.out.println("5. Keluar");
               System.out.println("==========================================");

               System.out.print("Pilih submenu yang diinginkan : ");
               int submenu2 = input.nextInt();
               System.out.println();
                 
                switch(submenu2){
                    case 1 : 
                       System.out.print("Masukkan index : ");
                       int index = input.nextInt();
                {
                    try {
                        data.remove(index);
                    } catch (Exception ex) {
                        Logger.getLogger(SLLMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                       break;                     
                    case 2 :
                       System.out.print("Masukkan nama yang dihapus : ");
                       nama = input.next();
                {
                    try {
                        data.RemoveByValue(nama);
                    } catch (Exception ex) {
                        Logger.getLogger(SLLMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                       break;                   
                   case 3 :
                       data.clear();
                       break;  
                   
                   case 4 :
                       System.out.println("");
                       data.print();
                       break;
                        
                   default :
                       System.out.println("Terimakasih !");
               }
       menu();
       pilih = input.nextInt();
       pilihmenu(pilih);
    }
    
    void submenu3() throws Exception {
               System.out.println("=========================================="); 
               System.out.println("                 Menu Cari                ");
               System.out.println("==========================================");
               System.out.println("1. Cari (Index)");
               System.out.println("2. Cari (Key)");
               System.out.println("3. Print");
               System.out.println("4. Keluar");   
               System.out.println("==========================================");
               System.out.print("Pilih menu : ");
               int submenu3 = input.nextInt();
               
               switch(submenu3)   {
                    case 1 : 
                    System.out.println("Cari (Index)");
                    System.out.print("Masukkan Index : ");
                    int index = input.nextInt();
                    data.cariIndex(index);
                    break;    
                    case 2 :
                       System.out.print("Masukkan nama yang dicari: ");
                       nama = input.next();
                       data.cariKey(nama);
                    break; 
                    case 3 :
                       data.print();
                    break;    
                       
                    default :
                       System.out.println("Terimakasih !");
               }
               
       menu();
       pilih = input.nextInt();
       pilihmenu(pilih);
    }
}
