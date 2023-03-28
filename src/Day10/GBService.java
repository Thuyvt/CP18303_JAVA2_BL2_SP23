/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
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
}
