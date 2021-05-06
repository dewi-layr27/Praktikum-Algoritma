/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DoubleLinkedList;

/**
 *
 * @author user
 */
public class Node {
    String nim;
    String nama;
    String jurusan;
    String prodi;
    double ipk;
    Node prev, next;
    
    Node(Node prev, String nim, String nama, String jurusan, String prodi, double ipk, Node next){
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.prodi = prodi;
        this.ipk = ipk;
        this.prev = prev;
        this.next = next;
    }
}
