/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day9;

import Day5.LapTop;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ThuyVT
 */
public class CollectionDemo {

    public static void main(String[] args) {
        // Không có index để làm việc
        // HashSet: loại bỏ các phần tử trùng lặp
        Set<String> hashSet = new HashSet<>();
        // add(): thêm phần tử
        hashSet.add("Java 1");
        hashSet.add("Java 1");
        hashSet.add("C");
        hashSet.add("Java 2");
        System.out.println("Các phần tử của hash set:");
        System.out.print(hashSet + "\n");
        // remove(): xóa phần tử bằng giá trị
        hashSet.remove("C");
        System.out.println("Các phần tử của hash set:");
        System.out.print(hashSet + "\n");
        // TreeSet: sắp xếp giá trị các phần tử
        Set<Double> treeSet = new TreeSet<>();
        treeSet.add(5.5);
        treeSet.add(9.5);
        treeSet.add(7.0);
        treeSet.add(7.0);
        treeSet.add(8.5);
        System.out.println("Các phần tử của tree set:");
//        System.out.println(tre);
        for (Double diem : treeSet) {
            System.out.println(diem + " ");
        }
        List<LapTop> list = new ArrayList<>();
        list.add(new LapTop("M2", "Mac", 33000, 1, false));
        list.add(new LapTop("M1", "Mac", 33000, 1, false));
        list.add(new LapTop("M3", "Mac", 33000, 1, false));
        list.add(new LapTop("M4", "Mac", 33000, 1, false));
        list.add(new LapTop("M4", "Mac", 33000, 1, false));
        Set<LapTop> setLt = new HashSet<>();
        setLt.addAll(list);
        // duyệt
        for (LapTop lt : setLt) {
            System.out.print(lt.getTen() + " ");
        }
        Set<LapTop> treeLt = new TreeSet<>();
        treeLt.addAll(list);
        System.out.println("\n Danh sách laptop theo tên tăng dần");
        for (LapTop lt : treeLt) {
            System.out.print(lt.getTen() + " ");
        }

        // Map: lưu tập hợp phần tử theo dạng key - value
        Map<String, String> hashMap = new HashMap<>();
        // put(): thêm phần tử 
        hashMap.put("MOB1023", "Java 2");
        hashMap.put("MOB1023", "Java 2");
        hashMap.put("MOB1014", "Java 1");
        hashMap.put("COM108", "Nhập môn");
        System.out.println("Các phần tử của map:" + hashMap);
        // get(key): lấy ra giá trị phần tử
        System.out.println("Môn MOB1023 là: " + hashMap.get("MOB1023"));
        // keySet(): lấy ra danh sách các key
        Set<String> keys = hashMap.keySet();
        System.out.println("Danh sách các value trong map là:");
        for (String key : keys) {
            System.out.print(hashMap.get(key) + " ");
        }
    }
}
