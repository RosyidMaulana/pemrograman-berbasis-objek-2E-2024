
package com.mycompany.praktikum;
import java.util.Scanner;

class Mahasiswa {
    
    String nama;
    String nim;
    String alamat;
// met
//pa
    public void inputData() {
        // new ob
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();

        System.out.print("Masukkan Alamat: ");
        alamat = input.nextLine();
    }

    public void displayData() {
        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Alamat: " + alamat);
    }
}


public class PRAKTIKUM2 {
    public static void main(String[] args) {
        
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.inputData();
        
        mhs.displayData();
    }
}

