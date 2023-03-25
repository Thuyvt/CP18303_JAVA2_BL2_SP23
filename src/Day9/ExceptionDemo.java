/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day9;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ThuyVT
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số:");
            int so = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập điểm:");
            double diem = Double.parseDouble(sc.nextLine());
        } catch (InputMismatchException mist) {
            System.out.println("Số phải là số nguyên");
        } catch (NumberFormatException num) {
            System.out.println("Điểm phải là số thực");
        } catch (Exception e) {
            System.out.println("Nhập sai định dạng");
        } finally {
            System.out.println("Hết bài");
        }
    }
}
