/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Lima.Soal.Dua;

/**
 *
 * @author user
 */
public class MainLeague {
    public static void main(String[] args) {
        PremierLeagueService list = new PremierLeagueService();
            PremierLeague t1 = new PremierLeague("Liverpool", 29, 45, 82);
            PremierLeague t2 = new PremierLeague("Manchester City", 27, 39, 57);
            PremierLeague t3 = new PremierLeague("Leicester City", 28, 26, 50);
            PremierLeague t4 = new PremierLeague("Chelsea", 29, 9, 48);
            PremierLeague t5 = new PremierLeague("Wolverhampton Wanderers", 29, 7, 43);
            PremierLeague t6 = new PremierLeague("Sheffield United", 28, 5, 43);
            PremierLeague t7 = new PremierLeague("Manchester United", 28, 12, 42);
            PremierLeague t8 = new PremierLeague("Tottenham Hotspur", 29, 7, 41);
            PremierLeague t9 = new PremierLeague("Arsenal", 28, 4, 40);
            PremierLeague t10 = new PremierLeague("Burnley", 29, -6, 39);
            PremierLeague t11 = new PremierLeague("Crystal Palace", 29, -6, 39);
            PremierLeague t12 = new PremierLeague("Everton", 29, -6, 37);
            PremierLeague t13 = new PremierLeague("Newcastle United", 29, -16, 35);
            PremierLeague t14 = new PremierLeague("Southampton", 29, -17, 34);
            PremierLeague t15 = new PremierLeague("Brighton & Hove Albion", 29, -8, 29);
            PremierLeague t16 = new PremierLeague("West Ham United", 29, -15, 27);
            PremierLeague t17 = new PremierLeague("Watford", 29, -17, 27);
            PremierLeague t18 = new PremierLeague("AFC Bournemouth", 29, -18, 27);
            PremierLeague t19 = new PremierLeague("Aston Villa", 27, -18, 25);
            PremierLeague t20 = new PremierLeague("Norwich City", 29, -27, 21);
            
            list.tambah(t1);
            list.tambah(t2);
            list.tambah(t3);
            list.tambah(t4);
            list.tambah(t5);
            list.tambah(t6);
            list.tambah(t7);
            list.tambah(t8);
            list.tambah(t9);
            list.tambah(t10);
            list.tambah(t11);
            list.tambah(t12);
            list.tambah(t13);
            list.tambah(t14);
            list.tambah(t15);
            list.tambah(t16);
            list.tambah(t17);
            list.tambah(t18);
            list.tambah(t19);
            list.tambah(t20);
            
            System.out.println("Data Team Sebelum Sorting Poin");
            list.tampilAll();
            
            System.out.println("Data Team Setelah Sorting Poin");
            list.insertionSort();
            list.tampilAll();
    }
}
