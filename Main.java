/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        
        Buku buku1 = new Buku("Hujan", "Tere Liye", "9786020324784");
        Buku buku2 = new Buku("Pulang", "Tere Liye", "9786020822129");
        
        System.out.println("\n==================INFORMASI BUKU==================\n");

        buku1.informasiBuku();
        buku1.cekKetersediaan();
        System.out.println(); 
        buku2.informasiBuku();
        buku2.cekKetersediaan();

        System.out.println("\n===============CATATAN PEMINJAMAN BUKU===================\n");

        AnggotaPerpustakaan anggota1 = new AnggotaPerpustakaan("Safira Aulia", 123456, "Jl. Mataram No.8");
        String tanggal = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        TransaksiPeminjaman transaksi1 = new TransaksiPeminjaman("Safira Aulia", "28-11-2023",  3, anggota1, buku1);

        transaksi1.catatPeminjaman();
        
        System.out.println("\n=============CATATAN PENGEMBALIAN BUKU================\n");

        TransaksiPengembalian pengembalian1 = new TransaksiPengembalian("1-12-2023", anggota1, buku1);
        pengembalian1.catatPengembalian();

        System.out.println("\n================RIWAYAT PEMINJAMAN===================\n");

        anggota1.lihatRiwayatPeminjaman();

        System.out.println("\n================NOTIFIKASI====================\n");
        
        Notifikasi notifikasi = new Notifikasi() {
        };

        notifikasi.setBatas_waktu("31-11-2023");
        notifikasi.setInfo_terbaru("Peminjaman buku Anda segera berakhir.");

        notifikasi.kirimNotifikasi();
        System.out.println("\n==================LAPORAN==================\n");

        Admin admin = new Admin();

        admin.kelolaAnggota();

        admin.kelolaBuku();

        admin.buatLaporan();

        System.out.println("Laporan: " + admin.getLaporan());
    }
}
