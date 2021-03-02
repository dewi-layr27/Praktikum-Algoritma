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
import java.util.Scanner;
public class BangunRuang {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, m, o;
        
        System.out.print("Masukkan jumlah Kubus  : ");
        n = sc.nextInt();
        Kubus[] kArray = new Kubus[n];
        System.out.println("");
    
    for(int i = 0; i < kArray.length; i++){
        kArray[i] = new Kubus(0);
        System.out.println("Kubus ke - "+(i+1));
        System.out.print("Masukkan nilai sisi kubus ke - " +(i+1)+ " : ");
        kArray[i].sisi = sc.nextInt();
        System.out.println("Volume kubus ke - " +(i+1)+ " adalah " + kArray[i].hitungVolume() + " cm3");
        System.out.println("Luas Permukaan kubus ke - " +(i+1)+ " adalah " + kArray[i].luasPermukaan() +" cm3");
        System.out.println("");
    }
    
        System.out.print("Masukkan jumlah Bola   : ");
        m = sc.nextInt();
        Bola[] blArray = new Bola[m];
        System.out.println("");
        
    for(int i = 0; i < blArray.length; i++){
        blArray[i] = new Bola(0);
        System.out.println("Bola ke - "+(i+1));
        System.out.print("Masukkan nilai jari - jari bola ke - " +(i+1)+ " : ");
        blArray[i].jari_jari = sc.nextInt();
        System.out.println("Volume balok ke - " +(i+1)+ " adalah " + blArray[i].hitungVolume() + " cm3");
        System.out.println("Luas Permukaan balok ke - " +(i+1)+ " adalah " + blArray[i].luasPermukaan() +" cm3");
        System.out.println("");
    }
    
        System.out.print("Masukkan jumlah Tabung : ");
        o = sc.nextInt();
        Tabung[] tbArray = new Tabung[o];
        System.out.println("");
        
    for(int i = 0; i < tbArray.length; i++){
        tbArray[i] = new Tabung(0, 0);
        System.out.println("Tabung ke - "+(i+1));
        System.out.print("Masukkan nilai jari - jari tabung ke - " +(i+1)+ " : ");
        tbArray[i].jari = sc.nextInt();
        System.out.print("Masukkan nilai tinggi tabung ke - " +(i+1)+ " : ");
        tbArray[i].tinggi = sc.nextInt();
        System.out.println("Volume tabung ke - " +(i+1)+ " adalah " + tbArray[i].hitungVolume() + " cm3");
        System.out.println("Luas Permukaan tabung ke - " +(i+1)+ " adalah " + tbArray[i].luasPermukaan() +" cm3");
        System.out.println("");
    }
    }
}