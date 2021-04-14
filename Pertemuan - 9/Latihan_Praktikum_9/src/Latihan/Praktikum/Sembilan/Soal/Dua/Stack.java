/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Sembilan.Soal.Dua;

/**
 *
 * @author user
 */
public class Stack {
    int size;
    int top;
    Struk data[];
    
    public Stack(int size){
        this.size = size;
        data = new Struk[size];
        top = -1;
    }
    
    public boolean IsEmpty(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean IsFull(){
        if (top == size - 1){
            return true;
        } else {
            return false;
        }
    }
    
    public void push(Struk dt){
        if (!IsFull()){
            top++;
            data[top] = dt;
        }else {
            System.out.println("Isi stack penuh!");
        }
    }
    
    public void pop(){
        if(!IsEmpty()){
            Struk x = data[top];
            top--;
            System.out.println("Data yang keluar : " + x.nomorTransaksi + " " + 
                    x.tglPembelian + " " + x.jmlBarang + " " + x.totalHarga +
                    " ");
        } else {
            System.out.println("Stack masih kosong");
        }
    }
    
    public void peek(){
        System.out.println("Elemen teratas : " + data[top].nomorTransaksi + " " +
                data[top].tglPembelian + " " + data[top].jmlBarang + " "
                + data[top].totalHarga + " ");
    }
    
    public void print(){
        System.out.println("Isi Stack : ");
        for(int i = top; i >= 0; i--){
            System.out.println(data[i].nomorTransaksi+ " " + data[i].tglPembelian + 
                    " " + data[i].jmlBarang + " " + data[i].totalHarga + 
                    " ");
        }
        System.out.println("");
    }
    
    public void clear(){
        if(!IsEmpty()){
            for(int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}
