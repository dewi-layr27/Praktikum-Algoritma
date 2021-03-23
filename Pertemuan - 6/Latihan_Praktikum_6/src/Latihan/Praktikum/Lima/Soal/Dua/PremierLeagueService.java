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
public class PremierLeagueService {
    PremierLeague leagues[] = new PremierLeague[20];
    int idx;
    
    public void tambah(PremierLeague t){
        if(idx < leagues.length){
            leagues[idx] = t;
            idx++;
        }else{
            System.out.println("Team sudah penuh!");
        }
    }
   public void tampilAll(){
       for(PremierLeague t : leagues){
           t.tampilAll();
           System.out.println("-------------------------------------");
       }
    }
   public void insertionSort(){
       for(int i = 1; i < leagues.length; i++){
           PremierLeague temp = leagues[i];
           int j = i;
           while (j > 0 && leagues[j-1].points > temp.points){
               leagues[j] = leagues [j - 1];
               j--;
           }
           leagues[j] = temp;
       }
   } 
}
