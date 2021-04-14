/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Sembilan.Soal.Dua;

/**
 *
 * @author user
 */
public class Struk {
    String nomorTransaksi, tglPembelian;
    int jmlBarang, totalHarga;
    
    Struk(String nt, String tp, int jml, int ttl){
        nomorTransaksi = nt;
        tglPembelian = tp;
        jmlBarang = jml;
        totalHarga = ttl;
    }
}
