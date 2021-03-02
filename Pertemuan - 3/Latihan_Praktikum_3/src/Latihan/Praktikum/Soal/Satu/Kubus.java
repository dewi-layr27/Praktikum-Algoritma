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
public class Kubus {
    public int sisi;
    
    public Kubus(int s) {
        sisi = s;
    }
    
    public int hitungVolume() {
        return sisi*sisi*sisi;
    }
    
    public int luasPermukaan() {
        return 6*sisi*sisi;
    }
}
