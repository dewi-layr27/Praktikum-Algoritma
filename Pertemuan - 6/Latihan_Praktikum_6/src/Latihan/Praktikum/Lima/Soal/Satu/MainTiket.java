/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Lima.Soal.Satu;

/**
 *
 * @author user
 */
public class MainTiket {
    public static void main(String[] args) {
        TiketService list = new TiketService();
        
        Tiket t1 = new Tiket ("Air Asia", 631000 , "Surabaya", "Denpasar"); 
        Tiket t2 = new Tiket ("Garuda Indonesia", 962000, "Semarang", "Jakarta");
        Tiket t3 = new Tiket ("Citilink", 817000, "Medan", "Yogyakarta");
        Tiket t4 = new Tiket ("Sriwijaya Air", 612000, "Jakarta", "Surabaya");
        Tiket t5 = new Tiket ("Lion Air", 5040000, "Semarang", "Banjarmasin");
        Tiket t6 = new Tiket ("Wings Air", 778000 , "Ambon", "Sorong"); 
        Tiket t7 = new Tiket ("Indonesia Air Asia", 1175000, "Singapura", "Jakarta");
        Tiket t8 = new Tiket ("Garuda Indonesia", 5731000, "Kuala Lumpur", "Surabaya");
        Tiket t9 = new Tiket ("Citilink", 893000, "Malang", "Jakarta");
        Tiket t10 = new Tiket ("Lion Air", 2523000, "Banjarmasin", "Medan");
        Tiket t11= new Tiket ("Air Asia", 950000 , "Bandung", "Surabaya"); 
        Tiket t12 = new Tiket ("Citilink", 2685000, "Banda Aceh", "Bandung");
        Tiket t13 = new Tiket ("Lion Air", 1409000, "Lampung", "Banjarmasin");
        Tiket t14 = new Tiket ("Nam Air", 974000, "Palembang", "Bangka Belitung");
        Tiket t15 = new Tiket ("Citilink", 2943000, "Malang", "Labuan Bajo");
        Tiket t16 = new Tiket ("Wings Abadi Airlines", 2992000 , "Pangkalanbuun", "Jakarta"); 
        Tiket t17 = new Tiket ("Lion Air", 1508000, "Surabaya", "Bandung");
        Tiket t18 = new Tiket ("Batik Air", 1663000, "Surabaya", "Labuan Bajo");
        Tiket t19 = new Tiket ("Wings Abadi Airlines", 1082000, "Semarang", "Surabaya");
        Tiket t20 = new Tiket ("Lion Air", 962000, "Semarang", "Yogyakarta");
        Tiket t21 = new Tiket ("Batik Air", 1583000 , "Yogyakarta", "Surakarta"); 
        Tiket t22 = new Tiket ("Citilink", 3963000, "Surakarta", "Malang");
        Tiket t23 = new Tiket ("Lion Air", 1641000, "Lampung", "Medan");
        Tiket t24 = new Tiket ("Citilink", 769000, "Medan", "Banda Aceh");
        Tiket t25 = new Tiket ("Batik Air", 3948000, "Medan", "Banjarmasin");
        Tiket t26 = new Tiket ("Lion Air", 1608000 , "Makassar", "Surabaya"); 
        Tiket t27 = new Tiket ("Citilink", 2558000, "Malang", "Makassar");
        Tiket t28 = new Tiket ("Batik Air", 1456000, "Malang", "Jakarta");
        Tiket t29 = new Tiket ("Citilink", 848000, "Jakarta", "Bandung");
        Tiket t30 = new Tiket ("Batik Air", 1915000, "Jakarta", "Labuan Bajo");
        
        list.TambahTiket(t1);
        list.TambahTiket(t2);
        list.TambahTiket(t3);
        list.TambahTiket(t4);
        list.TambahTiket(t5);
        list.TambahTiket(t6);
        list.TambahTiket(t7);
        list.TambahTiket(t8);
        list.TambahTiket(t9);
        list.TambahTiket(t10);
        list.TambahTiket(t11);
        list.TambahTiket(t12);
        list.TambahTiket(t13);
        list.TambahTiket(t14);
        list.TambahTiket(t15);
        list.TambahTiket(t16);
        list.TambahTiket(t17);
        list.TambahTiket(t18);
        list.TambahTiket(t19);
        list.TambahTiket(t20);
        list.TambahTiket(t21);
        list.TambahTiket(t22);
        list.TambahTiket(t23);
        list.TambahTiket(t24);
        list.TambahTiket(t25);
        list.TambahTiket(t26);
        list.TambahTiket(t27);
        list.TambahTiket(t28);
        list.TambahTiket(t29);
        list.TambahTiket(t30);
        
        System.out.println("              Harga Tiket Pesawat Sebelum Di Urutkan");
        System.out.println("====================================================================");
        list.tampilAll();
        
        System.out.println("Pengurutan Harga Tiket Pesawat Secara Desc Dengan Bubble Sort");
        System.out.println("====================================================================");
        list.bubbleSort();
        list.tampilAll();
        
        System.out.println("Pengurutan Harga Tiket Pesawat Secara Desc Dengan Selection Sort");
        System.out.println("====================================================================");
        list.selectionSort();
        list.tampilAll();
    }
}
