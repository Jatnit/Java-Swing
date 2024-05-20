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
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ngày: ");
        int ngay = sc.nextInt();

        System.out.print("Nhập tháng: ");
        int thang = sc.nextInt();

        System.out.print("Nhập năm: ");
        int nam = sc.nextInt();

        boolean hopLe = kiemTraNgayHopLe(ngay, thang, nam);

        if (hopLe) {
            System.out.println("Ngày hợp lệ!");
        } else {
            System.out.println("Ngày không hợp lệ!");
        }
    }

    private static boolean kiemTraNgayHopLe(int ngay, int thang, int nam) {
        if (nam <= 0) {
            return false;
        }

        if (thang < 1 || thang > 12) {
            return false;
        }

        int soNgayTrongThang = tinhSoNgayTrongThang(thang, nam);
        if (ngay < 1 || ngay > soNgayTrongThang) {
            return false;
        }

        return true;
    }

    private static int tinhSoNgayTrongThang(int thang, int nam) {
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (laNamNhuan(nam)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }

    private static boolean laNamNhuan(int nam) {
        return (nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0;
    }
}
