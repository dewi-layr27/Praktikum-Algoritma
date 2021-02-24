/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
//import java.util.Scanner;
import java.text.DecimalFormat; 
import java.text.DecimalFormatSymbols; 
public class Soal_1 {
    public static void main(String[] args) {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        int tarif = 4500;
        String[] customer = {"Ani", "Budi", "Bina", "Citra"};
        int  berat[] ={4, 15, 6, 11};
        int pendapatan = 0, biaya = 0;
        
        for(int i = 0; i < customer.length; i++) {
            System.out.println("Nama Pelanggan                    : " + customer[i]);
            for(int j = 0; j < berat.length; j++) {
                if (berat[i] >= 10) {
                    System.out.println("Berat Pakaian yang akan dilaundry : " + berat[i] + " kg");
                    biaya = berat[i] * tarif - berat[i]*tarif*5/100;
                    pendapatan += biaya;
                    System.out.println("Biaya Laundry                     : " +kursIndonesia.format(biaya));
                } else {
                    System.out.println("Berat Pakaian yang akan dilaundry : " + berat[i] + " kg");
                    biaya = berat[i]*tarif;
                    pendapatan += biaya;
                    System.out.println("Biaya Laundry                     : " +kursIndonesia.format(biaya));
                }
                break;
            }
            System.out.println();
        }
        System.out.println("Pendapatan Laundry Smile hari ini : " + kursIndonesia.format(pendapatan));
    }
}
