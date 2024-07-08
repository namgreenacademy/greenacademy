package com.green.backend.service;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.Scanner;

public class TinhThueService {
    public static void tinhthue() {
        String hoTen ;
        double tongThuNhap;
        int soNguoiPhuThuoc ;

        double soThuePhaiChiu = 0;

        //Input
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Nhap ho va ten: ");
        hoTen = sc.nextLine() ;
        System.out.print("Nhap thu nhap: ");
        tongThuNhap = sc.nextDouble() ;
        System.out.print("Nhap so nguoi phu thuoc: ");
        soNguoiPhuThuoc = sc.nextInt() ;

        soThuePhaiChiu = (tongThuNhap-4000000-(soNguoiPhuThuoc)*1600000) ;
//        if (soThuePhaiChiu <= 60) {
//            soThuePhaiChiu = 0.05 * soThuePhaiChiu;
//        } else if (soThuePhaiChiu <= 120) {
//            soThuePhaiChiu = 0.1 * soThuePhaiChiu;
//        } else if (soThuePhaiChiu <= 216) {
//            soThuePhaiChiu = 0.15 * soThuePhaiChiu;
//        } else if (soThuePhaiChiu <= 384) {
//            soThuePhaiChiu = 0.2 * soThuePhaiChiu;
//        } else if (soThuePhaiChiu <= 624) {
//            soThuePhaiChiu = 0.25 * soThuePhaiChiu;
//        } else if (soThuePhaiChiu <= 960) {
//            soThuePhaiChiu = 0.3 * soThuePhaiChiu;
//        } else {
//            soThuePhaiChiu = 0.35 * soThuePhaiChiu;
//        }

        soThuePhaiChiu = (soThuePhaiChiu <= 60) ?  0.05 * soThuePhaiChiu :
                (soThuePhaiChiu <= 120) ? 0.1 * soThuePhaiChiu :
                        (soThuePhaiChiu <= 216) ? 0.15 * soThuePhaiChiu :
                                (soThuePhaiChiu <= 384) ? 0.2 * soThuePhaiChiu :
                                        (soThuePhaiChiu <= 624) ? 0.25 * soThuePhaiChiu :
                                                (soThuePhaiChiu <= 960) ? 0.3 * soThuePhaiChiu :
                                                        0.35 * soThuePhaiChiu;


        System.out.println(soThuePhaiChiu);
    }
}
