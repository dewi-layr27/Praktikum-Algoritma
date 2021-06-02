/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Praktikum2;

/**
 *
 * @author user
 */
public class BinaryTreeArray {
    public static void main(String[] args) {
        BinaryTree b = new BinaryTree();
        int arr[] = {1,2,3,4,5,6,7,8,9};
        b.root = b.add(arr, b.root, 0);
        
        System.out.println("Pre Order");
        b.printPreorder(b.root);
        System.out.println("");
        System.out.println("In Order");
        b.printInorder(b.root);
        System.out.println("");
        System.out.println("Post Order");
        b.printPostorder(b.root);
        System.out.println("");
    }
}
