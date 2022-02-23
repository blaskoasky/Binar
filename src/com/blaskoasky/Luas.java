package com.blaskoasky;

public class Luas {

    public void pilihanLuas() {

        var mainMenu = new MainMenu();
        var scan = mainMenu.scan;

        System.out.println("\n------------------------------------------");
        System.out.println("Pilih Bidang yang akan dihitung");
        System.out.println("------------------------------------------");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.println("4. Persegi Panjang");
        System.out.println("0. Kembali ke Menu Utama");
        System.out.println("------------------------------------------");

        System.out.print("Masukkan Pilihan: ");
        var pilihan = scan.nextInt();

        switch (pilihan) {
            case 1:
                mainMenu.headerPilih("Persegi");

                System.out.print("Masukkan Panjang Sisi: ");
                var sisiPersegi = scan.nextInt();

                mainMenu.processing();

                System.out.println("\nLuas dari Persegi adalah " + rumusLuasPersegi(sisiPersegi));
                System.out.println("****************************************");
                mainMenu.pressAnyKeyToContinue();
                break;
            case 2:
                mainMenu.headerPilih("Lingkaran");

                System.out.print("Masukkan Jari-jari Lingkaran: ");
                var jariJari = scan.nextInt();

                mainMenu.processing();

                System.out.println("\nLuas dari Lingkaran adalah " + rumusLuasLingkaran(jariJari));
                System.out.println("****************************************");
                mainMenu.pressAnyKeyToContinue();
                break;
            case 3:
                mainMenu.headerPilih("Segitiga");

                System.out.print("Masukkan alas Segitiga: ");
                var alas = scan.nextInt();
                System.out.print("Masukkan tinggi Segitiga: ");
                var tinggi = scan.nextInt();

                mainMenu.processing();

                System.out.println("\nLuas dari Segitiga adalah " + rumusLuasSegitiga(alas, tinggi));
                System.out.println("****************************************");
                mainMenu.pressAnyKeyToContinue();
                break;
            case 4:
                mainMenu.headerPilih("Persegi Panjang");

                System.out.print("Masukkan Panjang: ");
                var p = scan.nextInt();
                System.out.print("Masukkan Lebar: ");
                var l = scan.nextInt();

                mainMenu.processing();

                System.out.println("\nLuas dari Persegi Panjang adalah " + rumusLuasPersegiPanjang(p, l));
                System.out.println("****************************************");
                mainMenu.pressAnyKeyToContinue();
                break;
            case 0:
                System.out.println("Kembali ke menu utama");
                mainMenu.switchMenu();
                break;
            default:
                System.out.println("Pilih angka yang ada dimenu");
                mainMenu.switchMenu();
                break;
        }
        scan.close();
    }

    private static int rumusLuasPersegi(int s) {
        return s * s;
    }

    private static double rumusLuasLingkaran(int r) {
        var pi = 3.1415926535;
        return (pi * r * r);
    }

    private static double rumusLuasSegitiga(int a, int t) {
        var separo = 0.5;
        return separo * a * t;
    }

    private static int rumusLuasPersegiPanjang(int p, int a) {
        return p * a;
    }
}
