/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Soal.Empat;

/**
 *
 * @author user
 */
public class PencarianData {
    Data listDT[]= new Data[10];
    int idx;
    
    void selectionSort(){
        for(int i = 0; i < listDT.length-1; i++){
            int idxMin = i;
            for(int j = i + 1; j < listDT.length; j++){
                if(listDT[j].data < listDT[idxMin].data){
                    idxMin = j;
                }
            }
            Data tmp = listDT[idxMin];
            listDT[idxMin] = listDT[i];
            listDT[i] = tmp;
        }
    }
    
    void tambah(Data d){
        if(idx < listDT.length){
            listDT[idx] = d;
            idx++;
        } else{
            System.out.println("Data sudah penuh!");
        }
    }
    
    void tampil(){
        for(Data d : listDT){
            d.Tampil();
        }
    }
    
    public int FindBinSearch(int cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right) / 2;
            if(cari == listDT[mid].data){
                return (mid);
            } else if (listDT[mid].data > cari){
                return FindBinSearch(cari, left, mid - 1);
            } else {
                return FindBinSearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    
    public int cariTerbesar(){
        return listDT[9].data;
    }
    
    public int jumlahTerbesar(){
        int count=0;
        for(Data d : listDT){
            if(d.data == listDT[9].data){
                count++;
            }
        }
        return count;
    }
    
    public void Tampilposisi(int x, int pos){
        if (pos != -1){
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else{
            System.out.println("Data "+ x +" tidak ditemukan");
        }
    }
    public void TampilData(int x, int pos){
        if(pos != -1){
            System.out.println("Data : " + x);
            System.out.println("Posisi Data : " + listDT[pos].data);
        } else{
            System.out.println("Data "+ x +" tidak ditemukan");
        }
    }
}

