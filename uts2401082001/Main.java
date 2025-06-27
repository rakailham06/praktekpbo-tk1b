/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2401082001;
//Andyta Ilham Rakadiredja 2401082001 TK1B

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int kendaraanRoda2 = 0;
        int pilihanKendaraan = 0;
        int tipeSepeda = 0;
        int tipeMobil = 0;
        char ulang = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Nama: Andyta Ilham Rakadiredja");
        System.out.println("NIM: 2401082001");
        System.out.println("Kelas: TK 1B");

        do {
            System.out.println("\n=====Program Kendaraan=====");
            Kendaraan kendaraan = new Kendaraan();
            Mobil mobil = new Mobil();
            Taksi taksi = new Taksi();
            Truk truk = new Truk();
            Sepeda sepeda = new Sepeda();
            SepedaListrik sepedaListrik = new SepedaListrik();

            System.out.print("Masukkan warna kendaraan: ");
            kendaraan.setWarna(in.nextLine());

            System.out.print("Masukkan jumlah roda kendaraan: ");
            kendaraan.setJmlRoda(in.nextInt());
            in.nextLine(); // Membersihkan buffer

            // Kendaraan Roda 2
            if (kendaraan.getJmlRoda() == 2) {
                System.out.println("\n=====List Kendaraan Beroda 2=====");
                System.out.println("1. Sepeda");
                System.out.print("Pilih kendaraan yang diinginkan: ");
                pilihanKendaraan = in.nextInt();
                in.nextLine(); // Membersihkan buffer

                if (pilihanKendaraan == 1) {
                    System.out.print("Masukkan jumlah sadel sepeda: ");
                    sepeda.setJmlSadel(in.nextInt());
                    System.out.print("Masukkan jumlah gir sepeda: ");
                    sepeda.setJmlGir(in.nextInt());
                    in.nextLine();

                    System.out.println("\n=====List Sepeda=====");
                    System.out.println("1. Sepeda Listrik");
                    System.out.print("Pilih tipe sepeda yang diinginkan: ");
                    tipeSepeda = in.nextInt();
                    in.nextLine();

                    if (tipeSepeda == 1) {
                        System.out.print("Masukkan kecepatan maksimum sepeda (Km/h): ");
                        sepedaListrik.setKecepatanMaks(in.nextInt());
                        System.out.print("Masukkan jarak tempuh sepeda (Km): ");
                        sepedaListrik.setJarakTempuh(in.nextInt());
                        in.nextLine();
                    } else {
                        System.out.println("Pilihan tipe sepeda tidak valid.");
                    }
                } else {
                    System.out.println("Pilihan kendaraan tidak valid.");
                }

                // Kendaraan Roda 4
            } else if (kendaraan.getJmlRoda() == 4) {
                System.out.println("\n=====List Kendaraan Beroda 4=====");
                System.out.println("1. Mobil");
                System.out.print("Pilih kendaraan yang diinginkan: ");
                pilihanKendaraan = in.nextInt();
                in.nextLine();

                if (pilihanKendaraan == 1) {
                    System.out.print("Masukkan bahan bakar mobil: ");
                    mobil.setBahanBakar(in.nextLine());
                    System.out.print("Masukkan kapasitas mesin mobil (cc): ");
                    mobil.setKapasitasMesin(in.nextInt());
                    in.nextLine();

                    System.out.println("\n=====List Tipe Mobil=====");
                    System.out.println("1. Truk");
                    System.out.println("2. Taksi");
                    System.out.print("Pilih tipe Mobil yang diinginkan: ");
                    tipeMobil = in.nextInt();
                    in.nextLine();

                    switch (tipeMobil) {
                        case 1: // Truk
                            System.out.print("Masukkan muatan maks truk (kg): ");
                            truk.setMuatanMaks(in.nextLine());
                            break;
                        case 2: // Taksi
                            System.out.print("Masukkan tarif awal taksi: ");
                            taksi.setTarifAwal(in.nextInt());
                            System.out.print("Masukkan tarif/km taksi: ");
                            taksi.setTarifPerKm(in.nextInt());
                            in.nextLine();
                            break;
                        default:
                            System.out.println("Pilihan tipe mobil tidak valid.");
                            break;
                    }
                } else {
                    System.out.println("Pilihan kendaraan tidak valid.");
                }
            } else {
                System.out.println("Program hanya mendukung kendaraan roda 2 atau 4.");
            }

            // ================= BAGIAN OUTPUT =================
            System.out.println("\n--- Detil Kendaraan ---");
            System.out.println("Jumlah Roda: " + kendaraan.getJmlRoda());
            System.out.println("Warna: " + kendaraan.getWarna());

            if (kendaraan.getJmlRoda() == 2) {
                if (pilihanKendaraan == 1) {
                    System.out.println("Jenis Kendaraan: Sepeda");
                    System.out.println("Jumlah Sadel: " + sepeda.getJmlSadel());
                    System.out.println("Jumlah Gir: " + sepeda.getJmlGir());
                    if (tipeSepeda == 1) {
                        System.out.println("Tipe Sepeda: Sepeda Listrik");
                        System.out.println("Kecepatan Maksimum: " + sepedaListrik.getKecepatanMaks() + " Km/h");
                        System.out.println("Jarak Tempuh: " + sepedaListrik.getJarakTempuh() + " Km");
                    }
                }
            } else if (kendaraan.getJmlRoda() == 4) {
                if (pilihanKendaraan == 1) {
                    System.out.println("Jenis Kendaraan: Mobil");
                    System.out.println("Bahan Bakar: " + mobil.getBahanBakar());
                    System.out.println("Kapasitas Mesin: " + mobil.getKapasitasMesin() + " cc");

                    switch (tipeMobil) {
                        case 1: // Truk
                            System.out.println("Tipe Mobil: Truk");
                            System.out.println("Muatan Maksimum: " + truk.getMuatanMaks() + " kg");
                            break;
                        case 2: // Taksi
                            System.out.println("Tipe Mobil: Taksi");
                            System.out.println("Tarif Awal: Rp" + taksi.getTarifAwal());
                            System.out.println("Tarif Per Km: Rp" + taksi.getTarifPerKm());
                            break;
                    }
                }
            }

            System.out.print("\nApakah ingin mengulang program? (y/n): ");
            ulang = in.next().charAt(0);
            in.nextLine();
        } while (ulang == 'y' || ulang == 'Y');

        in.close();
        System.out.println("Program Selesai. Terima kasih!");
    }
}
