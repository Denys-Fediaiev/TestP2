package com.ew;

import java.util.Scanner;

public class class2 {
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        Scanner scan = new Scanner(System.in);
        System.out.println("введите номер строки, куда вы хотите поставить вашего коня ");
        int stroka = scan.nextInt();
        System.out.println("введите номер столбца, куда вы хотите поставить вашего коня ");
        int stolb = scan.nextInt();
        board[stroka][stolb] = 1;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(" " + board[i][j] + " ");
            }
            System.out.println();
        }
        Scanner scan1 = new Scanner(System.in);
        System.out.println("введите номер строки, куда вы хотите сдвинуть вашего коня ");
        int newstroka = scan1.nextInt();
        System.out.println("введите номер столбца, куда вы хотите сдвинуть вашего коня  ");
        int newstolb = scan1.nextInt();
        if (newstroka == stroka + 2 && newstolb == stolb + 1) {
            if (newstroka != stroka + 1 && newstolb != stolb + 2) {
                System.out.println("конь двигается");
            }
        } else if (newstroka == stroka + 1 && newstolb == stolb + 2) {
            if (newstroka != stroka + 2 && newstolb != stolb + 1) {
                System.out.println("конь двигается");
            } else System.out.println("Так ходить нельзя!");
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    System.out.print(" " + board[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
