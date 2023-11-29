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
}
