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
public class Main {
    public static void main(String[] args) {
        MonAn phoBo = new PhoBo();
        System.out.println(phoBo.toString());
        IService qlph = new QuanLyPhoBo();
        qlph.nhap();
        qlph.xuat();
        qlph.tim();
        
        MonAn comRang = new ComRang(2, "Com", 3999, 2);
        System.out.println(comRang.toString());
        IService qlcr = new QuanLyComRang();
        qlcr.nhap();
        qlcr.xuat();
        qlcr.tim();
    }
}
