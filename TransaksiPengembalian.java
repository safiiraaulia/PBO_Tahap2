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
public class TransaksiPengembalian {
    private String tanggal;
    private Buku buku;
    private AnggotaPerpustakaan anggota;

    public TransaksiPengembalian(String tanggal, AnggotaPerpustakaan anggota, Buku buku) {
        this.tanggal = tanggal;
        this.buku = buku;
        this.anggota = anggota;
    }

    
    public void catatPengembalian() {
        System.out.println("Catatan Pengembalian");
        System.out.println("Tanggal Pengembalian: " + tanggal);
        System.out.println("Anggota Perpustakaan: " + anggota.getNama() + " (Nomor Anggota: " + anggota.getNomorAnggota() + ")");
        System.out.println("Buku: " + buku.getJudul() + " (Pengarang: " + buku.getPengarang() + ")");
    }

    public String getTanggal() {
        return tanggal;
    }

    public Buku getBuku() {
        return buku;
    }

    public AnggotaPerpustakaan getAnggota() {
        return anggota;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public void setAnggota(AnggotaPerpustakaan anggota) {
        this.anggota = anggota;
    }
    
//class Main {
//    public static void main(String[] args) {
//        Buku buku1 = new Buku("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "978-0-7475-3269-6");
//        AnggotaPerpustakaan anggota1 = new AnggotaPerpustakaan("John Doe", 123456, "Jalan ABC No. 123");
//        
//        String tanggal = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//
//        TransaksiPengembalian pengembalian1 = new TransaksiPengembalian("1-12-2023", anggota1, buku1);
//        pengembalian1.catatPengembalian();
//    }
}

//}
