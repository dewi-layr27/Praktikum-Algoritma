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
public class Mahasiswa {
    public int nim;
    public String nama;
    public int umur;
    public double ipk;
    
    Mahasiswa(int ni, String n, int u, double i){
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }
    void tampil(){
        System.out.println("Nim : "+nim);
        System.out.println("Nama : "+nama);
        System.out.println("Umur : "+umur);
        System.out.println("IPK : "+ipk);
    }
}