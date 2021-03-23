/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Lima.Soal.Satu;
import java.text.DecimalFormat; 
import java.text.DecimalFormatSymbols; 
/**
 *
 * @author user
 */
public class Tiket {
    public String maskapai, asal, tujuan;
    public int harga;
    DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
    DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
    
    
    Tiket(String m, int h, String a, String t){
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }
    void tampilAll(){
        formatRp.setCurrencySymbol("Rp "); //untuk set simbol Rupiah
        formatRp.setMonetaryDecimalSeparator(','); //untuk set penulisan koma dalam rupiah
        formatRp.setGroupingSeparator('.'); // untuk set tanda titik diantara ribuan, puluhan ribu, ratusan ribu dst
        kursIndonesia.setDecimalFormatSymbols(formatRp); //untuk set format Rupiah dalam mata uang Indonesia
        
        System.out.println("Nama Maskapai : "+maskapai);
        System.out.println("Harga         : "+kursIndonesia.format(harga));
        System.out.println("Asal          : "+asal);
        System.out.println("Tujuan        : "+tujuan);
    }
}
