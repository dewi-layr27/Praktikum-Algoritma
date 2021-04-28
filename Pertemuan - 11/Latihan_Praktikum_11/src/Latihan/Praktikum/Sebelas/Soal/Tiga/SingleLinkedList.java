/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Sebelas.Soal.Tiga;

/**
 *
 * @author user
 */
public class SingleLinkedList {
     Node head;
     Node tail;
     
     public boolean IsEmpty(){
        return head == null;
    }
     
     public void print(){
        if (!IsEmpty()){
            Node tmp = head;
            System.out.println("Isi Linked List : ");
            while (tmp != null){
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }
     
    public void addFirst(String nilai){
        Node baru = new Node(nilai, null);
        baru.setNext(head);
        head=baru;
    }
    
    public void addLast(String value){
        Node baru=new Node(value, null);
        Node tmp = head;
        if(head == null){addFirst(value);}
        else{
        while(tmp.getNext()!=null){
        tmp=tmp.getNext();
        }
        tmp.setNext(baru);
        }
    }
    
    public String getFirst(){
        return head.getData();
    }
    
    public String removeFirst(){
        Node tmp = head;
        head = head.getNext();
        return tmp.getData();
    }
    
    public String getLast(){
        Node tmp = head;
        while(tmp.getNext()!=null)
        {tmp=tmp.getNext();}
        return tmp.getData();
    }
    
    public String removeLast(){
        Node tmp = head;
        String x;
        if(head == null){
            return "";
        } else if(head.getNext().equals(null)){
            return removeFirst();
        }
        else{
            while(tmp.getNext().getNext()!=null){
                tmp=tmp.getNext();
            }
            x = tmp.getNext().getData();
            tmp.setNext(null);
            return x;
        }
    }
    
    public int search(String value){
        Node tmp = head;
        int i=0;
        while(tmp!=null){
            if(tmp.getData().equals(value)){
                return i;
            }else { 
            tmp = tmp.getNext();
            i++;
            }
        }
        return -1;
    }
    
    public void insertAfter(String key, String input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do {
            if (temp.data.equals(key)){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) tail = ndInput;
            }
            temp = temp.next;
        } while (temp != null);
    }
    
    public void insertBefore(String key, String input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        while (temp != null){
            if ((temp.data.equals(key))&&(temp == head)){
 		this.addFirst(input);
 		break;
            } else if (temp.next.data.equals(key)){
 		ndInput.next = temp.next;
 		temp.next = ndInput;
 		break;
            }
            temp = temp.next;
 	}
    }
    
     public void insertAt(int index, String input){
        if (index < 0){
            System.out.println("Indeks salah");
        } else if (index == 0){
            addFirst(input);
        } else {
            Node temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if(temp.next.next == null) tail = temp.next;
        }
    }
}