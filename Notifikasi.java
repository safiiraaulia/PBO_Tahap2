/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buku;

/**
 *
 * @author LENOVO
 */
public class Notifikasi{
    private String batas_waktu;
    private String info_terbaru;

    public String getBatas_waktu() {
        return batas_waktu;
    }

    public String getInfo_terbaru() {
        return info_terbaru;
    }

    public void setBatas_waktu(String batas_waktu) {
        this.batas_waktu = batas_waktu;
    }

    public void setInfo_terbaru(String info_terbaru) {
        this.info_terbaru = info_terbaru;
    }
    public void kirimNotifikasi() {
        System.out.println("Notifikasi dikirim dengan batas waktu: " + batas_waktu );
        System.out.println( "Info: " + info_terbaru);

    }
}
