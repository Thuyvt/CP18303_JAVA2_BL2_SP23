/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ThuyVT
 */
public class LapTopService {

    // Kiểm tra string bao gồm các ký tự a - z và số 0 - 9
    public boolean isString(String str) {
        if (str.matches("[a-z A-Z 0-9]+")) {
            return true;
        }
        return false;
    }

    // Kiểm tra string có phải là số hay không
    public boolean isSoNguyen(String str) {
//        if (str.matches("[0-9]+")) {
        if (str.matches("\\d+")) {
            return true;
        }
        return false;
    }
    // Kiểm tra số thực
       public boolean isSoThuc(String str) {
//        if (str.matches("[0-9]+")) {
        if (str.matches("^\\d+(\\.\\d+)?")) {
            return true;
        }
        return false;
    }
    // Tìm kiếm
    public List<LapTop> timBangTen(List<LapTop> dsGoc, String str) {
        List<LapTop> dsTimDuoc = new ArrayList<>();
        for (LapTop lt : dsGoc) {
            if(lt.getTen().toLowerCase().contains(str.toLowerCase())) {
                dsTimDuoc.add(lt);
            }
        }
        return dsTimDuoc;
    } 
    // Sắp xếp
    public void sapXep(List<LapTop> ds) {
        // Sắp xếp theo giá tăng dần
//        ds.sort(Comparator.comparing(LapTop::getGia));
        // Sắp xếp theo giá giảm dần
        ds.sort(Comparator.comparing(LapTop::getGia).reversed());
    }
}
