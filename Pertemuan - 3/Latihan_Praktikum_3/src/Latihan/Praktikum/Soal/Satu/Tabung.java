/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Soal.Satu;

/**
 *
 * @author user
 */
public class Tabung {
    public int jari;
    public int tinggi;

    
    public Tabung(int r, int t) {
        jari = r;
        tinggi = t;
    }
    
    public double hitungVolume() {
        return 3.14*jari*jari*tinggi;
    }
    
    public double luasPermukaan() {
        return 2*3.14*jari*(jari + tinggi);
    }
}
