package com.green.backend.service;

import org.springframework.stereotype.Service;

import java.util.Scanner;

public class TuyenSinhService {
    public static  void tuyensinh () {
        float diemChuan, diem;
        int doiTuong;
        String khuVuc;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap diem chuan cua hoi dong: ");
            diemChuan = sc.nextFloat();
            System.out.print("Nhap diem 3 mon cua thi sinh: ");
            diem = sc.nextFloat();

            String c = sc.nextLine();
            System.out.print("Nhap khu vuc cua thi sinh (X neu khong thuoc khu vuc nao): ");
            khuVuc = sc.nextLine();

            float diemKhuVuc = 0;
            switch (khuVuc) {
                case "A":
                    diemKhuVuc = 2.0f;
                    break;
                case "B":
                    diemKhuVuc = 1f;
                    break;
                case "C":
                    diemKhuVuc = 0.5f;
                    break;
            }

            System.out.print("Nhap doi tuong cua thi sinh (0 neu khong thuoc doi tuong nao): ");
            doiTuong = sc.nextInt();

            float diemDoiTuong = 0;
            switch (doiTuong) {
                case 1:
                    diemDoiTuong = 2.5f;
                    break;
                case 2:
                    diemDoiTuong = 1.5f;
                    break;
                case 3:
                    diemDoiTuong = 1;
                    break;
            }


            String kq = ((diem + diemKhuVuc + (diemDoiTuong)) > diemChuan) ? "DO" : "TRUOT";
            System.out.println(kq);

            System.out.print("Nhap 0 de thoat:");
            int x = sc.nextInt();
            if (x == 0) break;

        }
    }
}
