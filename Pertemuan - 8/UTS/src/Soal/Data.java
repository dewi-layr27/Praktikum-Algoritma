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
public class Data {
    Rekening[] rek = new Rekening[14];
    int idx;
    
    void TambahData(Rekening a){
        if(idx < rek.length){
            rek[idx] = a;
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }
    
    void tampilAll(){
        for(Rekening a : rek){
           a.tampil();
           System.out.println("-------------------------------------");
       }
    }
    
    void selectionSort(){
        for(int i = 0; i < rek.length-1; i++){
            int idxMax = i;
            for(int j = i+1; j < rek.length; j++){
                if(rek[j].namaDepan.contentEquals(rek[j].namaDepan)){
                    idxMax = j;
                }
            }
            Rekening tmp = rek[idxMax];
            rek[idxMax] = rek[i];
            rek[i] = tmp;
        }
    }
}
