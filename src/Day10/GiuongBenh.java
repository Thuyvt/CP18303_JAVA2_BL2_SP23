/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.io.Serializable;

/**
 *
 * @author ThuyVT
 */
public class GiuongBenh implements Serializable{

    private String tenBN;
    private int maBN;
    private String soPhong;
    private int soGiuong;
    private String tenBS;
    private String chucVu;
    private boolean vip;
    private String khoa;
    private double tien;
    private int soNgay;

    public GiuongBenh() {
    }

    public GiuongBenh(String tenBN, int maBN, String soPhong, int soGiuong, String tenBS, String chucVu, boolean vip, String khoa, double tien, int soNgay) {
        this.tenBN = tenBN;
        this.maBN = maBN;
        this.soPhong = soPhong;
        this.soGiuong = soGiuong;
        this.tenBS = tenBS;
        this.chucVu = chucVu;
        this.vip = vip;
        this.khoa = khoa;
        this.tien = tien;
        this.soNgay = soNgay;
    }

    public String getTenBN() {
        return tenBN;
    }

    public void setTenBN(String tenBN) {
        this.tenBN = tenBN;
    }

    public int getMaBN() {
        return maBN;
    }

    public void setMaBN(int maBN) {
        this.maBN = maBN;
    }

    public String getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(String soPhong) {
        this.soPhong = soPhong;
    }

    public int getSoGiuong() {
        return soGiuong;
    }

    public void setSoGiuong(int soGiuong) {
        this.soGiuong = soGiuong;
    }

    public String getTenBS() {
        return tenBS;
    }

    public void setTenBS(String tenBS) {
        this.tenBS = tenBS;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

    public int getSoNgay() {
        return soNgay;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }
    /**
 *  Tên bệnh nhân: String
 Mã bệnh nhân: int
 Số phòng: String
 Số giường: int
 Bác sĩ phụ trách: String
 Chức vụ: String
 Phòng vip: Boolean // true – vip, false – không vip
 Khoa: String (Khoa nội, khoa ngoại, khoa sản)
 Tiền: double
 Số ngày nằm viện: int
*/
    public void inThongTin() {
        System.out.printf("Tên bệnh nhân - %s, mã bệnh nhân - %s, số phòng - %s, số giường - %d,"
                + " bác sĩ - %s, chức vụ - %s, Phòng vip - %s, khoa - %s, tien - %f, số ngày nằm - %d",
                this.tenBN, this.maBN, this.soPhong, this.soGiuong, this.tenBS, this.chucVu,
                this.vip, this.khoa, this.tien, this.soNgay);
    }
    
    public double tinhTien() {
        return this.tien * this.soNgay;
    }
    
}
