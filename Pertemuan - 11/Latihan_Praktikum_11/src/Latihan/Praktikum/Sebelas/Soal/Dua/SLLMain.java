/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Sebelas.Soal.Dua;

/**
 *
 * @author user
 */
public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();
        s.addFirst('a');
        s.print();
        s.addLast('e');
        s.print();
        s.insertAfter('a', 'b');
        s.print();
        s.insertAt(2, 'c');
        s.print();
        s.insertBefore('e', 'd');
        s.print();
    }
}
