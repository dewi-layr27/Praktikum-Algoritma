/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Lima.Soal.Dua;

/**
 *
 * @author user
 */
public class MainPemilihan {
    static java.util.Scanner kbd = new java.util.Scanner(System.in);
    
    
    public static void main(String[] args) {
        Pemilihan[] kandidat = new Pemilihan[4];
        int qtySuara = 0;
        int nomorPilihMayoritas = -1;
        

        kandidat[0] = new Pemilihan("1. Haris");
        kandidat[1] = new Pemilihan("2. Dian");
        kandidat[2] = new Pemilihan("3. Rani");
        kandidat[3] = new Pemilihan("4. Bisma");
        
        for (Pemilihan kandidat_ : kandidat)
            System.out.println(kandidat_.nama);
        System.out.println();
        
        // 
        __penghitungan:
        while (true) {
            boolean isNomorPilihValid;
            int nomorPilih;
            
            System.out.print("Suara ke-" + (qtySuara + 1) + " memilih kandidat no.: ");
            nomorPilih = kbd.nextInt(); kbd.nextLine();
            
            if (nomorPilih == 0) break __penghitungan;
            
            isNomorPilihValid = (nomorPilih >= 1) && (nomorPilih <= kandidat.length);
            if (isNomorPilihValid) {
                qtySuara++;
                kandidat[nomorPilih - 1].Follower++;
            } else System.out.println("\n>>>  Salah nomor pilih  <<<\n");
        }
        
        System.out.println("\nTotal suara: " + qtySuara);
        System.out.println();
        for (Pemilihan kandidat_ : kandidat)
            System.out.println(kandidat_.nama + " (" + kandidat_.Follower + " suara)");
        System.out.println();
        
        for (int i = 0; i < kandidat.length; i++)
            if (kandidat[i].Follower > qtySuara / 2) {
                nomorPilihMayoritas = i;
                break;
            }
        
        System.out.println(
            (nomorPilihMayoritas >= 0) 
                ? "Mayoritas: " + kandidat[nomorPilihMayoritas].nama + " (" + kandidat[nomorPilihMayoritas].Follower + " suara)"
                : "No-mayoritas"
        );
        System.out.println();
        
        Pemilihan kandidatMayoritas = null;
        
        for (Pemilihan kandidat_ : kandidat) 
            if (kandidat_.Follower > qtySuara / 2) {
                kandidatMayoritas = kandidat_;
                break;
            }
        
        System.out.println(
            (kandidatMayoritas != null) 
                ? "Mayoritas: " + kandidatMayoritas.nama + " (" + kandidatMayoritas.Follower + " suara)"
                : "No-mayoritas"
        );

    }
}
