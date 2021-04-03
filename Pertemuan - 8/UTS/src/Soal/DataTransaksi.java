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
public class DataTransaksi {
    Transaksi tt[] = new Transaksi[14];
    int idx;
    
    void TambahData(Transaksi b){
        if(idx < tt.length){
            tt[idx] = b;
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }
    
    void tampilAll(){
        for(Transaksi b : tt){
           b.Tampil();
           System.out.println("-------------------------------------");
       }
    }
    
    void selectionSort(){
        for(int i = 0; i < tt.length-1; i++){
            int idxMax = i;
            for(int j = i+1; j < tt.length; j++){
                if(tt[j].saldo > tt[idxMax].saldo){
                    idxMax = j;
                }
            }
            Transaksi tmp = tt[idxMax];
            tt[idxMax] = tt[i];
            tt[i] = tmp;
        }
    }
}
