/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.text.DecimalFormat; 
import java.text.DecimalFormatSymbols; 
public class Soal_2 {
    public static void main(String[] args) {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursIndonesia.setDecimalFormatSymbols(formatRp);
        int hitung = 0; 
        double saldo = 1000000;
        
           for (int i = 0; saldo <= 1500000; i++) {
               hitung++;
               System.out.println("Bulan ke - " + (i + 1) + " saldo anda sebesar " + kursIndonesia.format(saldo));
               saldo = saldo + (saldo*2/100);
           }
           System.out.println("Pada Bulan ke - " + hitung);
    }
}
