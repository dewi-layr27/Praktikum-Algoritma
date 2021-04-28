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
public class Node {
    String data;
    Node next;
    
    public Node(String value, Node berikutnya){
        data = value;
        next = berikutnya;
    }
    public void setNext(Node simpul){
        next=simpul;
    }
    public Node getNext(){
        return next;
    }
    public String getData(){
        return data;
    }
}
