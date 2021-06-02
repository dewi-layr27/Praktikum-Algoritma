/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Praktikum1;

/**
 *
 * @author user
 */
public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        
        b.insert(6);
        b.insert(4);
        b.insert(8);
        b.insert(3);
        b.insert(5);
        
        b.traversePreOrder(b.root);
        System.out.println("");
        b.traverseInOrder(b.root);
        System.out.println("");
        b.traversePostOrder(b.root);
        System.out.println("");
        System.out.println("Nilai Minimum : " + b.findMin(b.root));
        System.out.println("Nilai Maksimum : " + b.findMax(b.root));
        b.printLeaf(b.root);
        System.out.println("Jumlah leaf : " + b.getLeafCount(b.root));
    }
}
