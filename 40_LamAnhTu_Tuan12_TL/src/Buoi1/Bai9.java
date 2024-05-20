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
public class Bai9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chỉ số điện cũ: ");
        int soDienCu = sc.nextInt();

        System.out.print("Nhập chỉ số điện mới: ");
        int soDienMoi = sc.nextInt();

        if (soDienCu >= soDienMoi) {
            System.out.println("Chỉ số điện cũ phải nhỏ hơn hoặc bằng chỉ số điện mới!");
            return;
        }

        // Tính số điện tiêu thụ
        int soDienTieuThu = soDienMoi - soDienCu;

        // Tính tiền điện theo từng bậc
        int tienDien = 0;

        if (soDienTieuThu > -1 && soDienTieuThu < 51) {
            tienDien = 1480 * soDienTieuThu;
        } else if (soDienTieuThu < 101)
        {
            tienDien = 50 * 1480 + (soDienTieuThu - 50) * 1533;
        } else if (soDienTieuThu < 201) {
            tienDien = 50 * 1480 + 50 * 1533 + (soDienTieuThu - 100) * 1786;
        } else if (soDienTieuThu < 301) {
            tienDien = 50 * 1480 + 50 * 1533 + 100 * 1786 + (soDienTieuThu - 200) * 2242;
        } else {
            tienDien = 50 * 1480 + 50 * 1533 + 100 * 1786 + 100 * 2242 + (soDienTieuThu - 300) * 2503;
        }

        // In ra kết quả
        System.out.println("Số điện tiêu thụ: " + soDienTieuThu + " kWh");
        System.out.println("Tiền điện phải trả: " + tienDien + " VNĐ");
    }
}
