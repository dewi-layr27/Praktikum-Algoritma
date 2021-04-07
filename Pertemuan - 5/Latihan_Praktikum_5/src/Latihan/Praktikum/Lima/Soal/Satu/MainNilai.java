/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Lima.Soal.Satu;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class MainNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int jl = sc.nextInt();
        
        NilaiAlgoritma na[] = new NilaiAlgoritma[jl];
        NilaiAlgoritma dt = new NilaiAlgoritma(jl);
                
        for(int i = 0; i < jl; i++){
            na[i] = new NilaiAlgoritma(jl);
            System.out.print("Nama Mahasiswa : ");
            na[i].namaMhs = sc.next();
            System.out.print("Nilai Tugas : ");
            na[i].nilaiTugas = sc.nextInt();
            System.out.print("Nilai Kuis : ");
            na[i].nilaiKuis = sc.nextInt();
            System.out.print("Nilai UTS : ");
            na[i].nilaiUTS = sc.nextInt();
            System.out.print("Nilai UAS : ");
            na[i].nilaiUAS = sc.nextInt();
            System.out.println("");
        }
        
        for(int i = 0; i < jl; i++){
            System.out.println("Total nilai mahasiswa ke - "+(i+1)+" adalah "+na[i].hitungTotalNilai());
        }
        
        for(int i = 0; i < dt.jumlah; i++){
            System.out.print("Masukkan total nilai mahasiswa ke - "+(i+1)+" : ");
            dt.total[i]= sc.nextDouble();
        }
        System.out.println("Rata - rata nilai mahasiswa adalah " +dt.nilaiRata(dt.total, dt.jumlah));
}
}
