/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Duabelas.Soal.Tiga;

/**
 *
 * @author user
 * @param <T>
 */
public class Node <T>{
    String data1;
    String data2;
    Node prev, next;
    
    public Node (Node prev, String data1, String data2, Node next){
        this.data1 = data1;
        this.data2 = data2;
        this.prev = prev;
        this.next = next;
    }
}
