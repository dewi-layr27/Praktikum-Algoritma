/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Duabelas.Soal.Tiga;

/**
 *
 * @author user
 */
public class DoubleLinkedList {
    Node head;
    Node tail;
    Node sorted;
    int size;
    int idx;
    
    public DoubleLinkedList(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(String data1, String data2){
        if(isEmpty()){
            head = new Node(null, data1, data2, null);
        } else {
            Node newNode = new Node(null, data1, data2, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(String data1, String data2){
        if(isEmpty()){
            addFirst(data1, data2);
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, data1, data2, null);
            current.next  = newNode;
            size++;
        }
    }
    
    public void add(String data1, String data2, int index) throws Exception {
        if(isEmpty()){
            addFirst(data1, data2);
        } else if (index < 0 || index > size){
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while(i < index){
                current = current.next;
                i++;
            }
            if(current.prev == null){
                Node newNode = new Node(null, data1, data2, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, data1, data2, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    public int size(){
        return size;
    }
    
    public void clear(){
        head = null;
        size = 0;
    }
    
    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            System.out.println("+++++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++++++");
            while (tmp != null){
                System.out.println(tmp.data1 + "\t");
                System.out.println(tmp.data2 + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
            System.out.println("Sisa antrian : " +size);
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }
    
    public void removeFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (size == 1){
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
            System.out.println(head.data2+" telah selesai di vaksin");
        }
    }
    
    public void removeLast() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked List masih kosong, tidak dapat dihapus");
        } else if (head.next == null){
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
        System.out.println(head.data2+" telah selesai di vaksin");
    }
    
    public void remove(int index) throws Exception {
        if(isEmpty() || index >= size){
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0){
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }
            if (current.next == null){
                current.prev.next = null;
            } else if (current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
        System.out.println(head.data2+" telah selesai di vaksin");
    }
    
    public String getFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List Kosong");
        }
        return head.data1+head.data2;
    }
    
    public String getLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List Kosong");
        }
        Node tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data1+tmp.data2;
    }
    
    public String get(int index) throws Exception{
        if(isEmpty() || index >= size){
            throw new Exception("Nilai indeks di luar batas");
        }
        Node tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.data1+tmp.data2;
    }
    
//    public String sequentialSearch(String value){
//        Node tmp = head;
//        int i=0;
//        while(tmp!=null){
//            if(tmp.get() == value){
//                return i;
//            }else { 
//            tmp = tmp.getNext();
//            i++;
//            }
//        }
//        return -1;
//    }
//    
////    public void insertionSort(Node headref){ 
////        sorted = null; 
////        Node current = headref; 
////        while (current != null)  
////        { 
////      
////            Node prev = current.prev; 
////            sortedInsert(current); 
////            current = prev; 
////        } 
////        head = sorted; 
////    } 
////    
////    public void sortedInsert(Node newnode)  { 
////        if (sorted == null || sorted.data <= newnode.data)  
////        { 
////            newnode.prev = sorted; 
////            sorted = newnode; 
////        } 
////        else
////        { 
////            Node current = sorted; 
////            while (current.next != null && current.next.data < newnode.data)  
////            { 
////                current = current.next; 
////            } 
////            newnode.next = current.next; 
////            current.next = newnode; 
////        } 
////    } 
////   
//    public void printlist(Node head) { 
//        while (head != null)  
//        { 
//            System.out.print(head.data + " "); 
//            head = head.next; 
//        } 
//    }
//    
//    public void sorting(Node p1) {   
//        int temp;
//        if(head!=null) {
//        p1=head;
//        while(p1.next != null){
//            Node p2=p1;
//            Node min=p1;
//            while(p2!= null) {
//                if(p2.data > min.data)
//                {
//                    min=p2;
//                }
//                p2 = p2.next;
//            }
//            if(p1.data < min.data) {
//                temp=p1.data;
//                p1.data=min.data;
//                min.data=temp;
//            }
//            p1=p1.next;
//        }
//    }
//    else{
//    System.out.println("ntData Kosongn");
}