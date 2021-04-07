/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Lima.Soal.Satu;

/**
 *
 * @author user
 */
public class NilaiAlgoritma {
    public int jumlah;
    public String namaMhs;
    public int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
    public double totalJumlah;
    public double total[];
    
    NilaiAlgoritma(int jumlah){
        this.jumlah = jumlah;
        this.total = new double[jumlah];
        this.namaMhs = "";
        this.nilaiTugas = 0;
        this.nilaiKuis = 0;
        this.nilaiUTS = 0;
        this.nilaiUAS = 0;
    }
    
    public double hitungTotalNilai(){
     return (0.3* nilaiTugas) + (0.2*nilaiKuis) + (0.2*nilaiUTS) + (0.3*nilaiUAS) ;
    }
    
    public double nilaiRata(double arr[], int jumlah){
        for(int i = 0; i < jumlah; i++){
            totalJumlah = totalJumlah + arr[i];
        }
        return totalJumlah/jumlah;
    }
}
