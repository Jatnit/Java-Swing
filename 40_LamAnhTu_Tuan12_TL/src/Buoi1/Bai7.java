/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai7 {
    public static void main(String[] args) {
        int month, year = 0;

        // Nhập giá trị của month
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tháng: ");
        month = scanner.nextInt();

        // Kiểm tra xem month có phải là tháng 2 hay không
        if (month == 2) {
            // Yêu cầu nhập thêm năm
            System.out.print("Nhập năm: ");
            year = scanner.nextInt();
        }

        // Tính số ngày trong tháng
        int soNgay = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                soNgay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                soNgay = 30;
                break;
            case 2:
                if (laNamNhuan(year)) {
                    soNgay = 29;
                } else {
                    soNgay = 28;
                }
                break;
            default:
                System.out.println("Tháng nhập không hợp lệ");
                return;
        }

        // In kết quả ra màn hình
        System.out.println(month + " có " + soNgay + " ngày");
    }
    public static boolean laNamNhuan(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
