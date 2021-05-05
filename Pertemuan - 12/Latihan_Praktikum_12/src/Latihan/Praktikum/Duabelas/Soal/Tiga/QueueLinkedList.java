/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Duabelas.Soal.Tiga;

/**
 *
 * @author user
 */
public class QueueLinkedList {
    DoubleLinkedList d = new DoubleLinkedList();
    Node front;
    Node rear;
    
    public QueueLinkedList(){
        front = rear = null;
    }
    
    public boolean isEmpty() {
	return d.isEmpty();
    }

    public void removeFirst() throws Exception{
       d.removeFirst();
    }
    
    public void print(){
        d.print();
    }
    
    public void addFirst(String data1, String data2){
        d.addFirst(data1, data2);
    }
}
