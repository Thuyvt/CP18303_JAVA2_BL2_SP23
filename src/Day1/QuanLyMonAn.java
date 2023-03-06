/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class QuanLyMonAn {
    Scanner sc = new Scanner(System.in);
    
    public void nhap(List<MonAn> list) {
        int nhapTiep = 1;
        do {            
            String mon = getInput("ten: ");
            int gia = Integer.parseInt(getInput("gia: "));
            int soLuong = Integer.parseInt(getInput("so luong: "));
//        MonAn ma = new MonAn(mon, gia, soLuong);
            list.add(new MonAn(mon, gia, soLuong));
            nhapTiep = Integer.parseInt(getInput("tiep 1- co/ 2- khong:"));
        } while (nhapTiep == 1);
    }
    
    public String getInput(String message) {
        System.out.println("Nhap " + message);
        return sc.nextLine();
    }
    
    // Xuat du lieu
    public void xuat(List<MonAn> list) {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else  {
            for (MonAn ma : list) {
                System.out.println(ma.toString() + ma.getGiaMon());
            }
        }
    }
    // tinh tong tien phai tra
    public void tinhTong(List<MonAn> list) {
        int tong = 0;
        for (MonAn ma: list) {
            tong += ma.getTong();
        }
        System.out.println("Tong tien phai tra la " + tong);
    }
    // tim mon co tong lon nhat
    public void timMax(List<MonAn> list) {
        if (list.isEmpty()) {
            System.out.println("Danh sach trong");
        } else {
            MonAn max = list.get(0);
            for (MonAn ma : list) {
                if (ma.getTong() > max.getTong()) {
                    max = ma;
                }
            }
            System.out.println("Mon an co tong tien lon nhat la;");
            System.out.println(max.toString());
        }
    }
    
    // Sap xep gia mon giam dan
    public void sapXep(List<MonAn> list) {
        // C1: Collection
        Collections.sort(list, Comparator.comparing(MonAn::getTong).reversed());
        xuat(list);
        // C2: lamda expression
        list.sort((a1, a2) -> a2.getTong() - a1.getTong());
        xuat(list);
    }
}
