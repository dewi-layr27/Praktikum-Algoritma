/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Soal;

/**
 *
 * @author user
 */
public class mainTransaksi {
    public static void main(String[] args) {
        Data b = new Data();
        DataTransaksi a = new DataTransaksi();
        
        
        Rekening a1 = new Rekening ("160309273084", "bin Adul Salam", "bin Adul Salam", "14582643263", "ligula.Nullam@tacitisociosqu.edu");
        Rekening a2 = new Rekening ("169712042416", "Al Hafeezy", "Mohammad", "16834168323", "ut.pellentesque@luctusutpellentesque.com");
        Rekening a3 = new Rekening ("161007278862", "bin Azzarudin", "Ehsan", "6505379", "Proin.eget@velitegestaslacinia.ca");
        Rekening a4 = new Rekening ("161807297229", "Fadhullah", "Jeanne Roselia", "8638209", "Pellentesque.ut.ipsum@neque.ca");
        Rekening a5 = new Rekening ("169503136823", "Nohara", "Shinnosuke", "5926919", "tellus.justo.sit@commodoauctor.net");
        Rekening a6 = new Rekening ("168507083528", "Nohara", "Hiroshi", "11153397678", "dictum@nec.edu");
        Rekening a7 = new Rekening ("160802059329", "Nohara", "Misae", "18917032664", "vel@ullamcorpermagna.co.uk");
        Rekening a8 = new Rekening ("160806282695", "Nohara", "Himawari", "14582643263", "Aliquam.gravida@vestibulumMauris.net");
        Rekening a9 = new Rekening ("161309092979", "Nobi", "Nobita", "8171766", "interdum.Curabitur.dictum@rutrumurna.edu");
        Rekening a10 = new Rekening ("168902128688", "Takeshi", "Goda", "16754004501", "et.ultrices@a.co.uk”");
        Rekening a11 = new Rekening ("161410089963", "Kudo", "Shinichi", "5279085", "ut@aultriciesadipiscing.ca");
        Rekening a12 = new Rekening ("165112227763", "Ai", "Haibara", "15644194285", "Proin.velit@Duisac.net");
        Rekening a13 = new Rekening ("167206230943", "Mouri", "Ran", "9776690", "ac@nibhAliquamornare.com");
        Rekening a14 = new Rekening ("167711267372", "Mouri", "Kogoro", "3535137", "cubilia.Curae.Phasellus@Duis.com");
        
        Transaksi b1 = new Transaksi(898214, 494048, 3587, "2021-03-09 07:54:42");
        Transaksi b2 = new Transaksi(770592, 3494048 ,444267,"2020-08-11 13:36:56");
        Transaksi b3 = new Transaksi(685302, 451002, 376442, "2020-05-23 07:34:53");
        Transaksi b4 = new Transaksi(297103, 396116, 779589, "2021-07-03 01:09:49");
        Transaksi b5 = new Transaksi(66190, 259150, 619774, "2021-09-09 03:57:30");
        Transaksi b6 = new Transaksi(234301, 278309, 547922, "2021-08-24 13:18:39");
        Transaksi b7 = new Transaksi(243306, 243306, 250283, "2021-03-12 03:40:16");
        Transaksi b8 = new Transaksi(371045, 991242, 602034, "2021-08-06 11:48:59");
        Transaksi b9 = new Transaksi(395170, 317058, 472273, "2021-05-02 10:53:31");
        Transaksi b10 = new Transaksi(395170, 97058, 472273, "2021-05-02 10:53:31");
        Transaksi b11 = new Transaksi(862731, 561908, 109431, "2021-07-31 08:11:00");
        Transaksi b12 = new Transaksi(556798, 31387, 725426, "2021-03-27 06:18:20");
        Transaksi b13 = new Transaksi(873982, 896213, 846142, "2021-07-18 04:06:30");
        Transaksi b14 = new Transaksi(774247, 739406, 775848, "2020-12-21 05:57:59");
        

        b.TambahData(a1);
        b.TambahData(a2);
        b.TambahData(a3);
        b.TambahData(a4);
        b.TambahData(a5);
        b.TambahData(a6);
        b.TambahData(a7);
        b.TambahData(a8);
        b.TambahData(a9);
        b.TambahData(a10);
        b.TambahData(a11);
        b.TambahData(a12);
        b.TambahData(a13);
        b.TambahData(a14);

        a.TambahData(b1);
        a.TambahData(b2);
        a.TambahData(b3);
        a.TambahData(b4);
        a.TambahData(b5);
        a.TambahData(b6);
        a.TambahData(b7);
        a.TambahData(b8);
        a.TambahData(b9);
        a.TambahData(b10);
        a.TambahData(b11);
        a.TambahData(b12);
        a.TambahData(b13);
        a.TambahData(b14);

        b.selectionSort();
        b.tampilAll();
        a.selectionSort();
        a.tampilAll();
    }
}
