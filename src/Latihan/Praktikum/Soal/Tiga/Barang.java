/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Soal.Tiga;

/**
 *
 * @author user
 */
public class Barang {
    String nama;
    int hargaSatuan, jumlah, total;
    
    void Tampil() {
        System.out.println("Nama Barang = " + nama);
        System.out.println("Harga Satuan = " + hargaSatuan);
        System.out.println("Jumlah Barang yang dibeli = " + jumlah);
    }
    
    void hitungHargaTotal() {
        total = jumlah*hargaSatuan;
        System.out.println("Harga Total : " + total);
    }
    
    void hitungDiskon() {
        if (total > 100000) {
            total = total *10/100;
            System.out.println("Diskon : " + total);
        }
        else if (total > 50000) {
            total = total * 5/100;
            System.out.println("Diskon : " + total);
        }
        else {
            total = 0;
            System.out.println("Anda tidak mendapatkan diskon");
        }
    }
    
    void hitungHargaBayar() {
        if (total > 100000) {
            total = total - total*10/100;
            System.out.println("Bayar : " + total);
        }
        else if (total > 50000) {
            total = total - total*5/100;
            System.out.println("Bayar : " + total);
        }
        else {
            total = total - 0;
            System.out.println("Bayar : " + total);
        }
    }
    public static void main(String[] args) {
        Barang b1 = new Barang();
        b1.nama = "Printer";
        b1.jumlah = 3;
        b1.hargaSatuan = 750000;
        
        b1.Tampil();
        b1.hitungHargaTotal();
        b1.hitungDiskon();
        b1.hitungHargaBayar();
    }
}
