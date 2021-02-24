/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Soal_4 {
    static int Luas_segitiga(int sisi, int alas, int tinggi) {
        int luas = alas*sisi*tinggi*1/2;
        System.out.print("Nilai sisi   : " + sisi);
        System.out.print("\nNilai alas   : " + alas);
        System.out.print("\nNilai tinggi : " + tinggi);
        return luas;
    }
    static int Luas_persegipanjang(int p, int l) {
        int luas = p*l;
        System.out.print("Nilai panjang   : " + p);
        System.out.print("\nNilai tinggi    : " + l);
        return luas;
    }
    static double Luas_lingkaran(double r) {
        double luas = 3.14*r*r;
        System.out.print("Nilai jari - jari   : " + r);
        return luas;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        String pilih;
        System.out.print("Masukkan pilihan menu perhitungan luas : ");
        pilihan = sc.nextInt();
        
        switch(pilihan) {
            case 1 :
                System.out.println("Perhitungan Luas Segitiga");
                System.out.println("Luas Segitiga adalah : " + Luas_segitiga(5, 6, 7) + " cm");
                break;
            case 2 :
                System.out.println("Perhitungan Luas Persegi Panjang");
                System.out.println("\nLuas Persegi Panjang adalah : " + Luas_persegipanjang(12, 8) + " cm");
                break;
            case 3 :
                System.out.println("Perhitungan Luas Lingkaran");
                System.out.println("\nLuas Lingkaran adalah : " + Luas_lingkaran(21) + " cm");
                break;
            default:
                System.out.println("Maaf pilihan yang anda masukkan tidak terdaftar");
        }
    }
}
