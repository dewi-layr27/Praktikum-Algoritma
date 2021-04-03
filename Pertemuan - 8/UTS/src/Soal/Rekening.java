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
public class Rekening {
    public String noRekening;
    public String namaDepan;
    public String namaBelakang;
    public String Phone;
    public String Email;
    
    Rekening(String a, String b, String c, String d, String e){
        noRekening = a;
        namaDepan = b;
        namaBelakang = c;
        Phone = d;
        Email = e;
    }
    void tampil(){
        System.out.println("noRekening : "+noRekening);
        System.out.println("Nama : "+namaDepan);
        System.out.println("Nama Ibu : "+namaBelakang);
        System.out.println("No Telpon : "+Phone);
        System.out.println("Email : "+Email);
        
    }
}
