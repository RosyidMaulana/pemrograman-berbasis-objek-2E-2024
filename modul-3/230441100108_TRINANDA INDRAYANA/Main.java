
import com.sun.tools.javac.Main;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean tambahIkanLagi = true;

        while (tambahIkanLagi) {
            System.out.print("Masukkan nama ikan yang akan dipancing: ");
            String namaIkan = scanner.nextLine();
            System.out.print("Masukkan ciri-ciri ikan: ");
            String ciriCiriIkan = scanner.nextLine();
            System.out.print("Masukkan warna ikan: ");
            String warnaIkan = scanner.nextLine();


            System.out.print("Apakah Anda ingin memancing ikan lagi? (ya/tidak): ");
            String pilihan = scanner.nextLine();
            tambahIkanLagi = pilihan.equalsIgnoreCase("ya");
        }

        scanner.close();
    }

