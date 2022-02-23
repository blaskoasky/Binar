package com.blaskoasky;

public class Volume {

    public void pilihanVolume() {

        var mainMenu = new MainMenu();
        var scan = mainMenu.scan;

        System.out.println("\n------------------------------------------");
        System.out.println("Pilih Bidang yang akan dihitung");
        System.out.println("------------------------------------------");
        System.out.println("1. Kubus");
        System.out.println("2. Bola");
        System.out.println("3. Kerucut");
        System.out.println("4. Balok");
        System.out.println("0. Kembali ke Menu Utama");
        System.out.println("------------------------------------------");

        System.out.print("Masukkan Pilihan: ");
        var pilihan = scan.nextInt();

        switch (pilihan) {
            case 1:
                mainMenu.headerPilih("Kubus");

                System.out.print("Masukkan Sisi: ");
                var sisiKubus = scan.nextInt();

                mainMenu.processing();

                System.out.println("\nVolume dari Kubus adalah " + rumusKubus(sisiKubus));
                System.out.println("****************************************");
                mainMenu.pressAnyKeyToContinue();
                break;
            case 2:
                mainMenu.headerPilih("Bola");

                System.out.print("Masukkan Jari-jari Bola: ");
                var jariJariBola = scan.nextInt();

                mainMenu.processing();

                System.out.println("\nVolume dari Bola adalah " + rumusBola(jariJariBola));
                System.out.println("****************************************");
                mainMenu.pressAnyKeyToContinue();
                break;
            case 3:
                mainMenu.headerPilih("Kerucut");

                System.out.print("Masukkan jari-jari Kerucut: ");
                var jariJariKerucut = scan.nextInt();
                System.out.print("Masukkan tinggi Kerucut: ");
                var tinggi = scan.nextInt();

                mainMenu.processing();

                System.out.println("\nVolume dari Kerucut adalah " + rumusKerucut(jariJariKerucut, tinggi));
                System.out.println("****************************************");
                mainMenu.pressAnyKeyToContinue();
                break;
            case 4:
                mainMenu.headerPilih("Balok");

                System.out.print("Masukkan Panjang: ");
                var p = scan.nextInt();
                System.out.print("Masukkan Lebar: ");
                var l = scan.nextInt();
                System.out.print("Masukkan Tinggi: ");
                var t = scan.nextInt();

                mainMenu.processing();

                System.out.println("\nVolume dari Balok adalah " + rumusBalok(p, l, t));
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

    private static int rumusKubus(int s) {
        // s^3
        return s * s * s;
    }

    private static double rumusBola(int r) {
        // V = ⁴⁄₃πr³.
        var patPerTiga = 1.33333333333;
        var phi = 3.1415926535;
        var hasil = (patPerTiga * phi * r * r * r);
        return Math.round(hasil * 100.0) / 100.0;
    }

    private static double rumusKerucut(int r, int t) {
        // ⅓ × π × r × r × t
        var perTiga = 0.33333333333;
        var phi = 3.1415926535;
        var hasil = perTiga * phi * r * r * t;
        return Math.round(hasil * 100.0) / 100.0;
    }

    private static int rumusBalok(int p, int a, int t) {
        // P * L * T
        return p * a * t;
    }
}
