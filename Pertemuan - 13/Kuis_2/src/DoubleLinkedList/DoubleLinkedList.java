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
public class DoubleLinkedList {
    Node head;
    Node tail;
    int size;
    
    public DoubleLinkedList(){
        head = null;
        size = 0;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void addFirst(String nim, String nama, String jurusan, String prodi, double ipk){
        if(isEmpty()){
            head = new Node(null, nim, nama, jurusan, prodi, ipk, null);
        } else {
            Node newNode = new Node(null, nim, nama, jurusan, prodi, ipk, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(String nim, String nama, String jurusan, String prodi, double ipk){
        if(isEmpty()){
            addFirst(nim, nama, jurusan, prodi, ipk);
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            Node newNode = new Node(current, nim, nama, jurusan, prodi, ipk, null);
            current.next  = newNode;
            size++;
        }
    }
    
    public void add(String nim, String nama, String jurusan, String prodi, double ipk, int index) throws Exception {
        if(isEmpty()){
            addFirst(nim, nama, jurusan, prodi, ipk);
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
                Node newNode = new Node(null, nim, nama, jurusan, prodi, ipk, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, nim, nama, jurusan, prodi, ipk, current);
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
            while (tmp != null){
                System.out.println("NIM\t : " + tmp.nim);
                System.out.println("Nama\t : " + tmp.nama);
                System.out.println("Jurusan\t : " + tmp.jurusan);
                System.out.println("Prodi\t : " + tmp.prodi);
                System.out.println("IPK\t : " + tmp.ipk);
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
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
    }
    
    public String getFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List Kosong");
        }
        return head.nim + head.nama + head.jurusan + head.prodi + head.ipk;
    }
    
    public String getLast() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List Kosong");
        }
        Node tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.nim+tmp.nama+tmp.jurusan+tmp.prodi+tmp.ipk;
    }
    
    public String get(int index) throws Exception{
        if(isEmpty() || index >= size){
            throw new Exception("Nilai indeks di luar batas");
        }
        Node tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.nim+tmp.nama+tmp.jurusan+tmp.prodi+tmp.ipk;
    }
    
    public void Searching (String cari) throws Exception {
        Node tmp = head;
            int index = 0;
            boolean ditemukan = false;
            if (isEmpty()) {
                System.out.println("LinkedLists kosong");
            } else {
                while (tmp.next != null) {
                    tmp = tmp.next;
                    index++;
                    if (head.nim == null ? cari == null : head.nim.equals(cari)) {
                        ditemukan = true;
                        break;
                        
                    } else if (tmp.nim == null ? cari == null : tmp.nim.equals(cari)) {
                        ditemukan = true;
                        index++;
                        break;
                    }
                }
            }
            if (ditemukan) {
                System.out.println("Data " + cari + " ditemukan pada indeks ke-" + (index-1));
            } else {
                throw new Exception("Data tidak ditemukan!");
            }
    }
            
    public void printList( Node start) {
    Node temp = start;
    System.out.println();
    while (temp != null)
    {
        System.out.println("NIM\t : " + temp.nim);
        System.out.println("Nama\t : " + temp.nama);
        System.out.println("Jurusan\t : " + temp.jurusan);
        System.out.println("Prodi\t : " + temp.prodi);
        System.out.println("IPK\t : " + temp.ipk);
        System.out.println("");
        temp = temp.next;
    }
        System.out.println("");
}
    
    public Node bubbleSort( Node start) {
        int swapped, i;
        Node ptr1;
        Node lptr = null;

        // Checking for empty list
        if (start == null)
            return null;

        do
        {
            swapped = 0;
            ptr1 = start;

            while (ptr1.next != lptr)
            {
                if (ptr1.ipk > ptr1.next.ipk)
                {
                    double t = ptr1.ipk;
                    ptr1.ipk = ptr1.next.ipk;
                    ptr1.next.ipk = t;
                    swapped = 1;
                }
                ptr1 = ptr1.next;
            }
            lptr = ptr1;
        }
        while (swapped != 0);
            return start;
    }
}