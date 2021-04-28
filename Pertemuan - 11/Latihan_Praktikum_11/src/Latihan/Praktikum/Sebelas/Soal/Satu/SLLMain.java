/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Sebelas.Soal.Satu;

/**
 *
 * @author user
 */
public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();
        s.print();
        s.addFirst(890);
        s.print();
        s.addLast(760);
        s.print();
        s.addFirst(700);
        s.print();
        s.insertAfter(700, 999);
        s.print();
        s.insertAt(3, 833);
        s.print();
        s.insertBefore(999, 887);
        s.print();
    }
}
