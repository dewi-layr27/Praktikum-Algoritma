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
public class Bola {
    public int jari_jari;
    
    public Bola(int r) {
        jari_jari = r;
    }
    
    public double hitungVolume() {
        return 4/3*3.14*jari_jari*jari_jari*jari_jari;
    }
    
    public double luasPermukaan() {
        return 4*3.14*jari_jari*jari_jari;
    }
}
