/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Duabelas.Soal.Dua;

/**
 *
 * @author user
 */
public class StackLinkedList {
    DoubleLinkedList data = new DoubleLinkedList();
    int i=0;
    int size;
    int top;

    public void push(String Value){//masukan data
        data.addLast(Value);
        i++;
    }

    public void pop() throws Exception{//mengambil data,a turunkan dulu,baru diambil(return)
        i--;
        data.removeLast();
    }

    public String peek() throws Exception{
        return data.getLast();
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
    
    public String getFirst() throws Exception{
        return data.getFirst();
    }
    
    public String getLast() throws Exception{
        return data.getLast();
    }
    
    public String get(int index) throws Exception{
        return data.get(index);
    }

    public void clear(){
        data=new DoubleLinkedList();
        i=0;
    }
    
    public void print(){
        data.print();
    }
    
    public void add(String dt, int idx) throws Exception{
        data.add(dt, idx);
    }
    
    public void addFirst(String Value){
        data.addFirst(Value);
    }
    
    public void addLast(String Value){
        data.addLast(Value);
    }
    
    public void remove(int idx) throws Exception{
        data.remove(idx);
    }
    
    public void removeFirst() throws Exception{
        data.removeFirst();
    }
    
    public void removeLast() throws Exception{
        data.removeLast();
    }
}
