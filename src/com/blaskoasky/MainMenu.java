package com.blaskoasky;

import java.util.Scanner;

public class MainMenu {

    Scanner scan = new Scanner(System.in);

    public void switchMenu() {

        var luas = new Luas();
        var volume = new Volume();

        switch (mainMenu()) {
            case 1:
                luas.pilihanLuas();
                break;
            case 2:
                volume.pilihanVolume();
                break;
            case 0:
                System.out.println("\nKeluar Kalkulator...");
                return;
            default:
                System.out.println("Pilih angka yang ada dimenu");
                mainMenu();
                break;
        }
        scan.close();
    }

    public int mainMenu() {
        System.out.println("------------------------------------------");
        System.out.println("Kalkulator Penghitung Luas dan Volume");
        System.out.println("------------------------------------------");
        System.out.println("Menu: ");
        System.out.println("1. Hitung Luas");
        System.out.println("2. Hitung Volume");
        System.out.println("0. Tutup Aplikasi");
        System.out.println("------------------------------------------");

        System.out.print("Masukkan Pilihan: ");
        var pilih = scan.nextInt();
        return pilih;
    }

    public void headerPilih(String pilihan) {
        System.out.println("\n========================================");
        System.out.println("Memilih " + pilihan);
        System.out.println("========================================");
    }

    public void processing() {
        System.out.println("\nProcessing... ");
    }

    public void pressAnyKeyToContinue() {
        System.out.println("Tekan enter untuk kembali ke Menu Utama...");
        try {
            System.in.read();
            switchMenu();
        } catch (Exception e) {
        }
    }
}
