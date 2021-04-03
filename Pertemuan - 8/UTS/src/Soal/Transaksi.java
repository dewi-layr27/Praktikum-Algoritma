/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Soal;

/**
 *
 * @author user
 */
public class Transaksi {
    public double saldo;
    public double saldoAwal;
    public double saldoAkhir;
    public String tanggalTransaksi;
//    String;
    
    Transaksi(double a, double b, double c, String d){
        saldo = a;
        saldoAwal = b;
        saldoAkhir = c;
        tanggalTransaksi = d;
    }
    
    void Tampil(){
        System.out.println("Saldo : "+saldo);
        System.out.println("Saldo awal : "+saldoAwal);
        System.out.println("Saldo akhir : "+saldoAkhir);
        System.out.println("Tanggal Transaksi : "+tanggalTransaksi);
    }
}
