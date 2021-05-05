/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Duabelas.Soal.Empat;

/**
 *
 * @author user
 */
public class Node {
    String nim;
    String nama;
    double ipk;
    Node prev, next;
    
    Node(Node prev, String nim, String nama, double ipk, Node next){
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.prev = prev;
        this.next = next;
    }
    
    public String get(){
        return nim+nama+ipk;
    }
    
    public Node getNext(){
        return next;
    }
}
