package com.green.backend.service;

import java.util.Scanner;

public class Inhinh {
    public static void inhinh(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1 ; j <= i ; j++)
                System.out.print(j);
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1 ; j <= i ; j++)
                System.out.print(i);
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = i ; j >= 1  ; j--)
                System.out.print(j);
            System.out.println();
        }

        int a = 1 ;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1 ; j <= i  ; j++) {
                System.out.print(a);
                a += 1 ;
            }
            System.out.println();
        }


        for (int i = 1; i <= 5; i++) {
            int b = 1 ;
            for (int j = 1 ; j <= 5  ; j++)
                if (j > 5-i)
                {  System.out.print(b); b+= 1 ;}
                else
                    System.out.print(" ");
            System.out.println();
        }
        System.out.println("--------------------");
        for (int i = 5; i >= 1; i--) {
            for (int j = i ; j >= 1  ; j--)
                {System.out.print(j);}
            System.out.println();
        }

        for (int i = 5; i >= 1; i--) {
            int d = 1 ;
            for (int j = 1 ; j <= 5  ; j++)
            if (j > 5-i )
                 {System.out.print(d); d+= 1 ;}
            else
                System.out.print(" ");
            System.out.println();
        }


//        Scanner sc = new Scanner(System.in) ;
//        System.out.print("Nhap n bằng: ");
//        int n = sc.nextInt() ;
//        for (int i = 1; i <= 2 * n - 1; i++) {
//            int index = 1;
//            for (int j = 1; j <= 2 * n - 1; j++) {
//                if (Math.abs(n - i) + Math.abs(n - j) < n) {
//                    System.out.print(index);
//                    if (j < n) {
//                        index++;
//                    } else {
//                        index--;
//                    }
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        for (int i = 1 ; i<= 3 ; i++ ){
            for (int j = 1 ; j<= 5 ; j++ )
            {
                if (i== 1 && j == 3)
                    System.out.print("0");
                else
                if (i == 2) {
                    if (j == 3) System.out.print("|");
                    else
                    if (j == 2 ) System.out.print("/");
                    else
                    if (j == 4 ) System.out.print("\\");
                    else
                        System.out.print(" ");
                }
                else
                if (i == 3) {
                    if (j == 2 ) System.out.print("/");
                    else
                    if (j == 4 ) System.out.print("\\");
                    else
                        System.out.print(" ");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
