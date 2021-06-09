/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Empatbelas.Soal.Empat.B;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class graphMain {
    public static void main(String[] args) {
        int e, count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        String v[] = new String[5];
        graphArray graph;
        try {
            v[0] = "Malang";
            v[1] = "Surabaya";
            v[2] = "Gresik";
            v[3] = "Bandung";
            v[4] = "Semarang";
            
            System.out.print("Masukkan jumlah edges : ");
            e = sc.nextInt();

            graph = new graphArray(v.length);

            System.out.print("Masukkan edges: <to> <from>");
            while (count <= e) {
                to = sc.nextInt();
                from = sc.nextInt();

                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D sebagai representasi graph sbb: ");
            System.out.print("\t");
            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + "|");
            }
            System.out.println();

            for (int i = 0; i < v.length; i++) {
                System.out.print(v[i] + "\t");
                for (int j = 1; j <= v.length; j++) {
                    System.out.print(graph.getEdge(i, j) + "\t ");
                }
                System.out.println();
            }
        } catch (Exception E) {
            System.out.println("Error. Silahkan cek kembali\n" + E.getMessage());
        }
        sc.close();
    }
}

