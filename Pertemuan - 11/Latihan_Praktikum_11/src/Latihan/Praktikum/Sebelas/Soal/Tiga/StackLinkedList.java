/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Sebelas.Soal.Tiga;

/**
 *
 * @author user
 */
public class StackLinkedList {
    SingleLinkedList data=new SingleLinkedList();
    int i=0;
    int size;
    int top;
    String[] dt;
    
    public StackLinkedList(int size){
        this.size = size;
        dt = new String[size];
        top = -1;
    }

    public void push(String Value){//masukan data
        data.addLast(Value);
        i++;
    }

    public String pop(){//mengambil data,a turunkan dulu,baru diambil(return)
        i--;
        return data.removeLast();
    }

    public String peek(){
        return data.getLast();
    }

    public int search(String Value) {
        return data.search(Value);
    }

    public Boolean isEmpty(){
        if (i==0){
            return true;
        }
        return false;
    }

    public int getSize(){
        return i;
    }

    public void clear(){
        data=new SingleLinkedList();
        i=0;
    }
    
    public void print(){
        data.print();
    }
    
    public void addFirst(String Value){
        data.addFirst(Value);
    }
    
    public void addLast(String Value){
        data.addLast(Value);
    }
    
    public void insertBefore(String key, String value){
        data.insertBefore(key, value);
    }
    
    public void insertAfter(String key, String value){
        data.insertAfter(key, value);
    }
    
    public void insertAt(int key, String value){
        data.insertAt(key, value);
    }
    
    public String removeFirst(){
        return data.removeFirst();
    }
    
    public String removeLast(){
        return data.removeLast();
    }
}

