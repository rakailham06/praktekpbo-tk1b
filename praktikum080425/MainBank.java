/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum080425;

/**
 *
 * @author rakad
 */
import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Data nasabah tetap
        Nasabah nasabah1 = new Nasabah("Ali", "123456");
        Tabungan tabungan1 = new Tabungan(5000);

        Nasabah nasabah2 = new Nasabah("Budi", "789012");
        Tabungan tabungan2 = new Tabungan(7000);

        // Menampilkan informasi setiap objek
        System.out.println(nasabah1.toString());
        System.out.println(tabungan1.toString());
        System.out.println(nasabah2.toString());
        System.out.println(tabungan2.toString());

        boolean running = true;
        while (running) {
            System.out.println("\nPilih operasi yang ingin dilakukan:");
            System.out.println("1. Menabung");
            System.out.println("2. Mengambil Uang");
            System.out.println("3. Transfer Uang");
            System.out.println("4. Tampilkan Saldo");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = in.nextInt();

            switch(pilihan) {
                case 1: // Menabung
                    System.out.print("Pilih objek (1 atau 2): ");
                    int objTabung = in.nextInt();
                    System.out.print("Masukkan jumlah yang ingin ditabung: ");
                    int jumlahMenabung = in.nextInt();
                    if (objTabung == 1) {
                        int saldoSebelum = tabungan1.getSaldo();
                        tabungan1.simpanUang(jumlahMenabung);
                        System.out.println("Saldo objek 1: " + saldoSebelum + " + " + jumlahMenabung + " = " + tabungan1.getSaldo());
                    } else if (objTabung == 2) {
                        int saldoSebelum = tabungan2.getSaldo();
                        tabungan2.simpanUang(jumlahMenabung);
                        System.out.println("Saldo objek 2: " + saldoSebelum + " + " + jumlahMenabung + " = " + tabungan2.getSaldo());
                    } else {
                        System.out.println("Objek tidak valid.");
                    }
                    break;
                case 2: // Mengambil uang
                    System.out.print("Pilih objek (1 atau 2): ");
                    int objAmbil = in.nextInt();
                    System.out.print("Masukkan jumlah yang ingin diambil: ");
                    int jumlahMengambil = in.nextInt();
                    if (objAmbil == 1) {
                        int saldoSebelum = tabungan1.getSaldo();
                        if (jumlahMengambil > saldoSebelum) {
                            System.out.println("Error: Saldo tidak mencukupi untuk mengambil " + jumlahMengambil);
                        } else {
                            tabungan1.ambilUang(jumlahMengambil);
                            System.out.println("Saldo objek 1: " + saldoSebelum + " - " + jumlahMengambil + " = " + tabungan1.getSaldo());
                        }
                    } else if (objAmbil == 2) {
                        int saldoSebelum = tabungan2.getSaldo();
                        if (jumlahMengambil > saldoSebelum) {
                            System.out.println("Error: Saldo tidak mencukupi untuk mengambil " + jumlahMengambil);
                        } else {
                            tabungan2.ambilUang(jumlahMengambil);
                            System.out.println("Saldo objek 2: " + saldoSebelum + " - " + jumlahMengambil + " = " + tabungan2.getSaldo());
                        }
                    } else {
                        System.out.println("Objek tidak valid.");
                    }
                    break;
                case 3: // Transfer uang
                    System.out.println("Masukkan no nasabah yang ingin mentransfer");
                    int objTransfer = in.nextInt();
                    if(objTransfer==2) {
                        System.out.print("Masukkan jumlah yang ingin ditransfer dari objek 2 ke objek 1: ");
                    } else if(objTransfer==1) {
                        System.out.print("Masukkan jumlah yang ingin ditransfer dari objek 1 ke objek 2: ");
                    } else{
                        System.out.println("Nasabah tidak ditemukan");
                    }
                    int jumlahTransfer = in.nextInt();
                    int saldoSebelum2 = tabungan2.getSaldo();
                    int saldoSebelum1 = tabungan1.getSaldo();
                    if (jumlahTransfer > saldoSebelum2) {
                        System.out.println("Error: Saldo objek 2 tidak mencukupi untuk transfer " + jumlahTransfer);
                    } else {
                        tabungan2.transfer(tabungan1, jumlahTransfer);
                        System.out.println("Saldo objek 2: " + saldoSebelum2 + " - " + jumlahTransfer + " = " + tabungan2.getSaldo());
                        System.out.println("Saldo objek 1: " + saldoSebelum1 + " + " + jumlahTransfer + " = " + tabungan1.getSaldo());
                    }
                    break;
                case 4: // Tampilkan saldo
                    System.out.println("Saldo objek 1: " + tabungan1.getSaldo());
                    System.out.println("Saldo objek 2: " + tabungan2.getSaldo());
                    break;
                case 5: // Keluar
                    running = false;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}