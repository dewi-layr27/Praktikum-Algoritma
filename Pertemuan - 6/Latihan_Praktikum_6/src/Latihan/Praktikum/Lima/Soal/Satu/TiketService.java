/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Lima.Soal.Satu;

/**
 *
 * @author user
 */
public class TiketService {
    Tiket[] tikets = new Tiket[30];
    int idx;
    
    void TambahTiket(Tiket h){
        if(idx < tikets.length){
            tikets[idx] = h;
            idx++;
        }else{
            System.out.println("Team sudah penuh!");
        }
    }
    
    void tampilAll(){
        for(Tiket t : tikets){
           t.tampilAll();
           System.out.println("-------------------------------------");
       }
    }
    
    void bubbleSort(){
        for(int i = 0; i < tikets.length-1; i++){
            for(int j = 1; j < tikets.length - 1; j++){
                if(tikets[j].harga > tikets[j-1].harga){
                    Tiket tmp = tikets[j];
                    tikets[j] = tikets[j-1];
                    tikets[j-1] = tmp;
                }
                }
            }
        }
    
    void selectionSort(){
        for(int i = 0; i < tikets.length-1; i++){
            int idxMax = i;
            for(int j = i+1; j < tikets.length; j++){
                if(tikets[j].harga > tikets[idxMax].harga){
                    idxMax = j;
                }
            }
            Tiket tmp = tikets[idxMax];
            tikets[idxMax] = tikets[i];
            tikets[i] = tmp;
        }
    }
}
