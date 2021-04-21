/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Sepuluh.Soal.Dua;

/**
 *
 * @author user
 */
public class Queue {
    public int max;
    public int size;
    public int front;
    public int rear;
    Mahasiswa[] Q;
    
    public Queue(int max){
        this.max = max;
        Create();
    }
    
    public void Create(){
        Q = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }
    
    public boolean IsEmpty(){
        if (size == 0){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean IsFull(){
        if (size == max){
            return true;
        } else {
            return false;
        }
    }
    
    public void peek(){
        if (!IsEmpty()){
            System.out.println("Elemen terdepan : " + Q[front].nama + " " + Q[front].nim 
                + " " + Q[front].absen + " " + Q[front].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void peekRear(){
        if (!IsEmpty()){
            System.out.println("Elemen terdepan : " + Q[rear].nama + " " + Q[rear].nim 
                + " " + Q[rear].absen + " " + Q[rear].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void print(){
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear){
                System.out.println("Elemen terdepan : " + Q[i].nama + " " + Q[i].nim
                + " " + Q[i].absen + " " + Q[i].ipk);
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }
    
    public void clear(){
        if(!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void Enqueue(Mahasiswa data){
        if (IsFull()){
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()){
                front = rear = 0;
            } else {
                if ( rear == max - 1){
                    rear = 0;
                } else {
                   rear++; 
                }
            }
            Q[rear] = data;
            size++;
        }
    }
    
    
    public Mahasiswa Dequeue(){
        Mahasiswa data = new Mahasiswa("", "", 0, 0);
        if (IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            data = Q[front];
            size--;
            if (IsEmpty()){
                front = rear = 0;
            } else {
                if (front == max - 1){
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return data;
    }
    
   public int FindSeqSearch(String cari){
        int posisi = -1;
        for(int j = 0; j < Q.length; j++){
            if (Q[j].nim.equals(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public void PeekPosition(String x, int pos){
        if (pos != -1){
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else{
            System.out.println("Data "+ x +" tidak ditemukan");
        }
    }
    public void PeekAt(String x, int pos){
        if(pos != -1){
            System.out.println("Nama\t : " + Q[pos].nama);
            System.out.println("Nama\t : " + x);
            System.out.println("Absen\t : " +Q[pos].absen);
            System.out.println("IPK\t : " +Q[pos].ipk);
        } else{
            System.out.println("Data "+ x +" tidak ditemukan");
        }
    }
}
