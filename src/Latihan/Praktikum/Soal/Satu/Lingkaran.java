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
public class Lingkaran {
    double phi, r;
    
    double hitungLuas() {
        double luas = phi * r * r;
        return luas;
    }
    
    double hitungKeliling() {
        double keliling = 2 *phi * r + r;
        return keliling;
    }
    public static void main(String[] args) {
        Lingkaran nilai = new Lingkaran();
        
        nilai.phi = 3.14;
        nilai.r = 21;
        
        nilai.hitungLuas();
        System.out.println("Luas Lingkaran     : " + nilai.hitungLuas() + " cm");
        
        nilai.hitungKeliling();
        System.out.println("Keliling Lingkaran : " + nilai.hitungKeliling() + " cm");
    }
}

