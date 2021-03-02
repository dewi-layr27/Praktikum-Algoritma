/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Soal.Dua.dan.Tiga;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class TanahMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tanah[] tArray;
        long tanahLuasTerbesar = 0;

        System.out.print("Banyak tanah : ");
        int n = sc.nextInt(); sc.nextLine();
        tArray = new Tanah[n];
        
        for(int i = 0; i < tArray.length; i++){
            tArray[i] = new Tanah(0, 0);
            System.out.println("Tanah ke - " + (i + 1));
            System.out.print("Panjang : ");
            tArray[i].panjang = sc.nextInt(); sc.nextLine();
            System.out.print("Lebar   : ");
            tArray[i].lebar = sc.nextInt(); sc.nextLine();
            long tmpLuas = tArray[i].hitungLuas();
            System.out.println("Luas tanah " + tmpLuas + " m2");
            System.out.println();
            if (tmpLuas > tanahLuasTerbesar){
                tanahLuasTerbesar = tmpLuas;
            }
        }
        System.out.println("Tanah terluas " + tanahLuasTerbesar + " m2");
    }   
    }
