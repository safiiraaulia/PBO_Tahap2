/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku;

import java.util.Scanner;
/**
 *
 * @author LENOVO
 */

class Admin {
    private String laporan;

    public Admin() {
        this.laporan = "";
    }
    
    

    public void kelolaAnggota() {
        // Implementasi logika kelola anggota
        System.out.println("Mengelola Anggota...");
    }

    public void kelolaBuku() {
        // Implementasi logika kelola buku
        System.out.println("Mengelola Buku...");
    }

    public void buatLaporan() {
        // Implementasi logika membuat laporan
        System.out.println("Membuat Laporan...");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan laporan: ");
        laporan = scanner.nextLine();

        System.out.println("Laporan berhasil dibuat.");
    }

    public String getLaporan() {
        return laporan;
    }

    public void setLaporan(String laporan) {
        this.laporan = laporan;
    }
    
}

//class Main{
//    public static void main(String[] args) {
//        Admin admin = new Admin();
//
//        // Panggil method untuk mengelola anggota
//        admin.kelolaAnggota();
//
//        // Panggil method untuk mengelola buku
//        admin.kelolaBuku();
//
//        // Panggil method untuk membuat laporan
//        admin.buatLaporan();
//
//        // Tampilkan laporan yang telah dibuat
//        System.out.println("Laporan: " + admin.getLaporan());
//    }
//}