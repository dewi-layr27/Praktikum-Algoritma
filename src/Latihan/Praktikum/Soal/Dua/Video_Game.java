/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Soal.Dua;

/**
 *
 * @author user
 */
public class Video_Game {
    int id;
    String nama;
    String ng;
    int pinjam;
    int hs;
    
    void Tampil() {
        System.out.println("ID Member        : " + id);
        System.out.println("Nama Member      : " + nama);
        System.out.println("Nama Game        : " + ng);
        System.out.println("Lama Pinjam      : " + pinjam);
        System.out.println("Harga Sewa       : " + hs);
    }
    
    int Pinjam(int n) {
        pinjam = n;
        return pinjam;
    }
    
    int HargaSewa(int n) {
        hs = pinjam * n;
        System.out.println("Total harga sewa : " + hs);
        return hs;
    }
    
    public static void main(String[] args) {
        Video_Game vg1 = new Video_Game();
        vg1.id = 1001;
        vg1.nama = "Anton";
        vg1.ng = "Counter Strike";
        vg1.pinjam = 4;
        vg1.hs = 25000;
        
        vg1.Tampil();
        vg1.Pinjam(4);
        vg1.HargaSewa(25000);
    }
}
