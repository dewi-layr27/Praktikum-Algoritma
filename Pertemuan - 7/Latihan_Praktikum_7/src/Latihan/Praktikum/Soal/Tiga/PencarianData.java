/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Latihan.Praktikum.Soal.Tiga;

/**
 *
 * @author user
 */
class PencarianData {
    int rows, cols;
    int[][] data;
    
    int ditemukanRow = -1;
    int ditemukanCol = -1;
    int requestData;
    
    PencarianData(int[][] data) {
        this.data = data;
        this.rows = data.length;
        this.cols = data[0].length; 
    }
    
    void tampilSemuaData() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------");
    }
    
    boolean findSeq(int requestData) {
        this.requestData = requestData;
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                if(data[r][c] == requestData){
                    this.ditemukanRow = r;
                    this.ditemukanCol = c;
                    return true;
                }
            }
        }
        return false;
    }
    
     void tampilHasilFindTerakhir() {
        System.out.println("Data   : " + this.requestData);
        System.out.print  ("Status : ");
        if (this.ditemukanRow != -1) {
            System.out.println("Ditemukan!");
            System.out.println("Index  : [" + this.ditemukanRow +
                "][" + this.ditemukanCol + "]");
        } else {
            System.out.println("Tidak ditemukan!");
        }
    }
}
