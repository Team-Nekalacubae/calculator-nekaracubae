package com.ohgiraffers.calculator;

import java.util.Scanner;

public class Calculator {

    public int[] inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("계산하실 정수 두 개를 입력하세요. ");
        System.out.print("첫 번째 정수 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int num2 = sc.nextInt();
        int[] arrNum = {num1, num2};
        return arrNum;
    }
}
