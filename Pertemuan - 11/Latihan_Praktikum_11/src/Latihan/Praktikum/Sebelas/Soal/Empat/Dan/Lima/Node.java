/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Sebelas.Soal.Empat.Dan.Lima;

/**
 *
 * @author user
 * @param <T>
 */
public class Node <T> {
    String data1;
    String data2;
    String data3;
    Node next;

    public Node (String nama, String alamat, String no, Node next) {
        data1 = nama;
        data2 = alamat;
        data3 = no;
        this.next=next;        
    }
}
