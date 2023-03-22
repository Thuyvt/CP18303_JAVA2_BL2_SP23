/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day5;

/**
 *
 * @author ThuyVT
 */
public class LapTop implements Comparable<LapTop>{
    private String ten;
    private String hang;
    private double gia;
    private int oCung; // 1 - SSD, 2- HDD
    private boolean trangThai;

    public LapTop() {
    }

    public LapTop(String ten, String hang, double gia, int oCung, boolean trangThai) {
        this.ten = ten;
        this.hang = hang;
        this.gia = gia;
        this.oCung = oCung;
        this.trangThai = trangThai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getoCung() {
        return oCung;
    }

    public void setoCung(int oCung) {
        this.oCung = oCung;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public int compareTo(LapTop o) {
//        return this.ten.compareTo(o.getTen());
        return o.getTen().compareTo(this.ten);//Sắp xếp giảm dần theo tem
    }
}
