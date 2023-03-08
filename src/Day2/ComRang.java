/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day2;

import Day1.MonAn;

/**
 *
 * @author ThuyVT
 */
public class ComRang extends MonAn{
    private int theLoai; // 1- Com Rang duong chau, 2 - Com rang dua bo

    public ComRang() {
    }

    public ComRang(int theLoai, String ten, int gia, int soLuong) {
        super(ten, gia, soLuong);
        this.theLoai = theLoai;
    }

    @Override
    public String toString() {
        String mota = this.theLoai == 1 ? "Com rang duong chau" : "Com rang dua bo";
        return "ComRang{" + "theLoai=" + mota + '}';
    }
    
    
}
