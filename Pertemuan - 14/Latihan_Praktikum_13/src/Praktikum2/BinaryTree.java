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
public class BinaryTree {
    Node root;
    
    public BinaryTree(){
        root = null;
    }
    public Node add(int[] arr, Node root, int i){
        if(i < arr.length){
            Node temp = new Node(arr[i]);
            root = temp;
            
            root.left = add(arr, root.left, 2*i+1);
            
            root.right = add(arr, root.right, 2*i+2);
        }
        return root;
    }
    
 void printPreorder(Node node)
    {
        if (node == null)
            return;
 
        System.out.print(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    
 void printPostorder(Node node)
    {
        if (node == null)
            return;
 
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");
    }
    
void printInorder(Node node)
    {
        if (node == null)
            return;
 
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
}
