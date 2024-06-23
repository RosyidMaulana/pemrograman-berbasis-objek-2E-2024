/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        ArrayList<Karyawan> karyawanList = new ArrayList<>();

        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("Masukkan data karyawan ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Usia: ");
            int usia = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Posisi: ");
            String posisi = scanner.nextLine();
            System.out.print("Jenis Karyawan (Tetap/Kontrak): ");
            String jenisKaryawan = scanner.nextLine();

            if (jenisKaryawan.equalsIgnoreCase("Tetap")) {
                System.out.print("Gaji Bulanan: ");
                double gajiBulanan = scanner.nextDouble();
                scanner.nextLine(); 
                karyawanList.add(new KaryawanTetap(nama, usia, posisi, gajiBulanan));
            } else if (jenisKaryawan.equalsIgnoreCase("Kontrak")) {
                System.out.print("Upah Per Jam: ");
                double upahPerJam = scanner.nextDouble();
                System.out.print("Jumlah Jam Kerja: ");
                int jumlahJamKerja = scanner.nextInt();
                scanner.nextLine();
                karyawanList.add(new KaryawanKontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja));
            }
        }

        System.out.println("\nData Semua Karyawan:");
        for (Karyawan karyawan : karyawanList) {
            karyawan.tampilkanData();
            System.out.println();
        }

        scanner.close();
    }
}