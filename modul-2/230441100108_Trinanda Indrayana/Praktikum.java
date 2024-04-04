/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.praktikum;

class manusia {
    String nama;
    int umur;
    String alamat;
    
    void berjalan(){
        System.out.println("Berjalan santai");
    }
    void berlari(){
        System.out.println("Berlari cepat");
    }
}
//ko
public class Praktikum {
    public static void main(String[] args) {
        //new ob
        manusia orang = new manusia();
        orang.nama = "indra";
        orang.umur = 20;
        orang.alamat = "bojonegoro";
        
        System.out.println("Dia adalah " + orang.nama);
        System.out.println("Dia umur " + orang.umur);
        System.out.println("Dia berasal dari kota " + orang.alamat);
        
        System.out.print(orang.nama + " pergi ke sekolah dengan ");
        orang.berjalan();
        System.out.print(orang.nama + " juga hobi ");
        orang.berlari();
    }
}
