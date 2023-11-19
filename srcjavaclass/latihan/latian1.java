/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
import java.util.HashMap;


public class latian1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalHarga = 0; // Inisialisasi variabel totalHarga dengan nilai 0
        boolean isSelesai = false; // Inisialisasi variabel isSelesai dengan nilai false

        System.out.println("===========================");
        System.out.println("No  KodeBarang  NamaBarang  hargaBarang");
        System.out.println("===========================");
        
        HashMap<String, Integer> daftarBarang;
        daftarBarang = new HashMap<>();
        daftarBarang.put("Baju", 50000);
        daftarBarang.put("Celana", 70000);
        daftarBarang.put("Sepatu", 150000);

        for (String barang : daftarBarang.keySet()) {
            System.out.println(barang + " - " + daftarBarang.get(barang));
        }
        while (!isSelesai) {
            System.out.print("Masukkan barang yang dibeli (atau selesai untuk mengakhiri pembelian): ");
            String barang = scanner.nextLine();

            if (barang.equalsIgnoreCase("selesai")) {
                isSelesai = true;
                  } else if (daftarBarang.containsKey(barang)) {
                totalHarga += daftarBarang.get(barang);
                System.out.println("Harga " + barang + ": " + daftarBarang.get(barang));
            } else {
                System.out.println("Barang tidak ditemukan");
            }
        }

        System.out.println("Total harga: " + totalHarga);
        System.out.print("Masukkan total belanja: ");
        int totalBelanja = scanner.nextInt();

        
//diskon
        double diskon = 0;
        if (totalBelanja >= 100000) {
            diskon = 0.1 * totalBelanja;
        } else if (totalBelanja >= 50000) {
            diskon = 0.05 * totalBelanja;
        }
        double ppn = 0.1 * (totalBelanja - diskon);
        int totalBayar = (int)(totalBelanja - diskon + ppn);
        System.out.println("Total belanja: " + totalBelanja);
        System.out.println("Diskon: " + (int)diskon);
        System.out.println("Total bayar: " + totalBayar);
  

        if (totalBelanja >= 100000) {
            diskon = 0.1 * totalBelanja;
        } else if (totalBelanja >= 50000) {
            diskon = 0.05 * totalBelanja;
        }

        
        System.out.println("Total belanja: " + totalBelanja);
        System.out.println("Diskon: " + (int)diskon);
        System.out.println("PPN: " + (int)ppn);
        System.out.println("Total bayar: " + totalBayar);
        
        System.out.print("Masukkan total belanja: ");

        System.out.println("Pilih metode pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. Kredit");
        int metodePembayaran = scanner.nextInt();
         System.out.print("Masukkan total belanja: ");
            if (metodePembayaran == 1) {
            System.out.print("Masukkan jumlah uang: ");
            int jumlahUang = scanner.nextInt();
            int kembalian = jumlahUang - totalBelanja;
            System.out.println("Kembalian: " + kembalian);
        } else if (metodePembayaran == 2) {
            System.out.print("Masukkan jumlah cicilan (dalam bulan): ");
            int jumlahCicilan = scanner.nextInt();
            double bunga = 0.1 * totalBelanja;
            double totalHutang = totalBelanja + bunga;
            double cicilan = totalHutang / jumlahCicilan;
            System.out.println("Total hutang: " + totalHutang);
            System.out.println("Cicilan per bulan: " + cicilan);
        } else {
            System.out.println("Metode pembayaran tidak valid");
        }
    }
}