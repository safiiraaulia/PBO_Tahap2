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
public class TransaksiPeminjaman {
    private String nama;
    private String tanggal;
    private int durasi;
    private AnggotaPerpustakaan anggota;
    private Buku buku;

    public TransaksiPeminjaman(String nama, String tanggal, int durasi, AnggotaPerpustakaan anggota, Buku buku) {
        this.nama = nama;
        this.tanggal = tanggal;
        this.durasi = durasi;
        this.anggota = anggota;
        this.buku = buku;
    }

    
     public void catatPeminjaman() {
        System.out.println("Catatan Peminjaman");
         System.out.println("Nama Peminjam: " + nama);
        System.out.println("Tanggal Peminjaman: " + tanggal);
        System.out.println("Durasi Peminjaman (hari): " + durasi);
        System.out.println( "Nomor Anggota: "+ anggota.getNomorAnggota());
        System.out.println("Buku: " + buku.getJudul() + " (Pengarang: " + buku.getPengarang() + ")");
    }
     
//     @Override
//public String toString() {
//    return "====================================\n"
//            + "Nama Peminjam: " + getNama() + "\n"
//            + "Tanggal Peminjaman: " + getTanggal() + "\n"
//            + "Durasi Peminjaman (hari): " + getDurasi() + "\n"
//            + "Nomor Anggota: " + getAnggota().getNomorAnggota() + "\n"
//            + "Buku: " + getBuku().getJudul() + " (Pengarang: " + getBuku().getPengarang() + ")\n";
//}

    public String getNama() {
        return nama;
    }
     

    public String getTanggal() {
        return tanggal;
    }

    public int getDurasi() {
        return durasi;
    }

    public AnggotaPerpustakaan getAnggota() {
        return anggota;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
  
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public void setAnggota(AnggotaPerpustakaan anggota) {
        this.anggota = anggota;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }
    
//    public class Main {
//    public static void main(String[] args) {
//        Buku buku1 = new Buku("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "978-0-7475-3269-6");
//        AnggotaPerpustakaan anggota1 = new AnggotaPerpustakaan("Safira Aulia", 123456, "Jl. Mataram No.8");
//
//        // Mendefinisikan tanggal dan waktu untuk transaksi
//        String tanggal = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//        
//        TransaksiPeminjaman transaksi1 = new TransaksiPeminjaman("28-11-2023",  3, anggota1, buku1);
//
//        // Menampilkan catatan peminjaman
//        transaksi1.catatPeminjaman();
//    }
}
//}
