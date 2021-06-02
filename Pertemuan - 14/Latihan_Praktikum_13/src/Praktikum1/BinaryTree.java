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
public class BinaryTree {
    Node root;
    int jumlah, leaf;
    
    public BinaryTree(){
        root = null;
    }
    
    boolean isEmpty(){
        return root == null;
    }
    
    // Insert akar tree
    void insert(int data) { 
       root = insertRec(root, data); 
    } 
    
    Node insertRec(Node root, int data) { 
   
        /* If the tree is empty, return a new node */
        if (root == null) { 
            root = new Node(data); 
            return root; 
        } 
   
        /* Untuk menaruh leaf apakah di kiri atau kanan */
        if (data < root.data) 
            root.left = insertRec(root.left, data); 
        else if (data > root.data) 
            root.right = insertRec(root.right, data); 
   
        /* return the (unchanged) node pointer  */
        return root; 
    } 
    
    Node getSuccessor(Node del){
        Node successor = del.right;
        Node successorParent = del;
        while(successor.left != null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor != del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }
    
    void delete(int data){
        if(isEmpty()){
            System.out.println("Tree Kosong!");
            return;
        }
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current != null){
            if(current.data == data){
                break;
            } else if(data < current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if(data > current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if(current == null){
            System.out.println("Tidak dapat mencari data");
            return;
        } else {
            if(current.left == null && current.right == null){
                if(current == root){
                    root = null;
                } else {
                    if(isLeftChild){
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if(current.left == null){
                if(current == root){
                    root = current.right;
                } else {
                    if(isLeftChild){
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if(current.right == null){
                if(current == root){
                    root = current.left;
                } else {
                    if(isLeftChild){
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node successor = getSuccessor(current);
                if(current == root){
                    root = successor;
                } else {
                    if(isLeftChild){
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
    
static int findMin(Node node)
{
    if (node == null)
        return Integer.MAX_VALUE;
  
    int res = node.data;
    int lres = findMin(node.left);
    int rres = findMin(node.right);
  
    if (lres < res)
        res = lres;
    if (rres < res)
        res = rres;
    return res;
}

 static int findMax(Node node)
    {
        if (node == null)
            return Integer.MIN_VALUE;
  
        int res = node.data;
        int lres = findMax(node.left);
        int rres = findMax(node.right);
  
        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }
    
    boolean find(int data){
        boolean hasil = false;
        Node current = root;
        while(current != null){
            if(current.data == data){
                hasil = true;
                break;
            } else if(data < current.data){
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return hasil;
    }
    
    void traversePreOrder(Node node){
        if (node != null){
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    
    void traversePostOrder(Node node){
        if (node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    
    void traverseInOrder(Node node){
        if (node != null){
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }
    
    public static void printLeaf(Node node){
        if(node == null){
            return;
        }
        
        if(node.isLeaf()) {
            System.out.println("Data yang ada pada Leaf : " + node.data);
        }
        
        printLeaf(node.left);
        printLeaf(node.right);
    }
    
    int getLeafCount(){
        return getLeafCount(root);
    }
    
    int getLeafCount(Node node){
        if (node == null){
            return 0;
        } else if(node.left == null && node.right == null){
            return 1;
        } else {
            return getLeafCount(node.left) + getLeafCount(node.right);
        }
    }
}
