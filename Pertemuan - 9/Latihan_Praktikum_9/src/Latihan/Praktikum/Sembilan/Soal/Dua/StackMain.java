/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Sembilan.Soal.Dua;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack(8);
        char pilih;
        do{
            System.out.print("Nomor Transaksi : ");
            String nmr = sc.nextLine();
            System.out.print("Tanggal Pembelian : ");
            String tgl = sc.nextLine();
            System.out.print("Jumlah barang yang dibeli : ");
            int jml = sc.nextInt();
            System.out.print("Total harga bayar : ");
            int total = sc.nextInt();
            
            Struk dt = new Struk(nmr, tgl, jml, total);
            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n) ? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            st.push(dt);
            System.out.println("");
        } while (pilih == 'y');
        
        st.print();
        st.pop();
        st.peek();
        st.pop();
        st.peek();
        st.pop();
        st.peek();
        st.pop();
        st.peek();
        st.pop();
        st.peek();
        st.print();
    }
}
