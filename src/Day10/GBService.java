/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThuyVT
 */
public class GBService {
    public String ghiFile(String path, List<GiuongBenh> danhSach) {
        try {
            // B1: tạo luồng ghi file co bản
            FileOutputStream fos = new FileOutputStream(path);
            // B2: tạo luồng ghi file cho đối tượng thông qua fos
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // writeObject() lưu thông tin đối tượng
            oos.writeObject(danhSach);
            // đóng luồng ghi file
            oos.close();
            fos.close();
            
            return "Ghi file thành công";
        } catch (Exception e) {
            e.printStackTrace();
            return "Ghi file thất bại";
        }
    }
    public String docFile(String path, List<GiuongBenh> danhSach) {
        try {
            // Mở luồng đọc file cơ bản
            FileInputStream fis = new FileInputStream(path);
            // Mở luồng đọc file dạng đối tượng
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            List<GiuongBenh> listTuFile = (List<GiuongBenh>) ois.readObject();
            danhSach = new ArrayList<>(); // tạo mới 1 danh sách ko có phần tử
            danhSach.addAll(listTuFile); // thêm dữ liệu đọc từ file vào danh sách
            System.out.println("danhSach mới:" + danhSach.size());
            // đóng luồng
            ois.close();
            fis.close();
            return "Đọc file thành công";
            
        } catch (Exception e) {
            e.printStackTrace();
            return "Đọc file thất bại";
        }
    }
}
