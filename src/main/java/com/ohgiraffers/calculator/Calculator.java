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


    public char inputSymbol() {

        Scanner sc = new Scanner(System.in);
        System.out.print("사칙연산 기호를 입력하세요 ('+', '-', '*', '/', '%'");
        char calSymbol = sc.nextLine().charAt(0);

        if (!(calSymbol == '+' || calSymbol == '-' || calSymbol == '*' || calSymbol == '/' || calSymbol == '%')) {

            System.out.println("잘못된 기호를 입력하셨습니다.");
        }

        return calSymbol;
    }

    Scanner sc = new Scanner(System.in);


    public int calculator(int[] arrNum, char calSymbol) {

        int result = 0;

        switch (calSymbol) {

            case '+' :
                result = arrNum[0] + arrNum[1];
                break;

            case '-' :
                result = arrNum[0] - arrNum[1];
                break;

            case '*' :
                result = arrNum[0] * arrNum[1];
                break;

            case '/' :
                result = arrNum[0] / arrNum[1];
                break;

            case '%' :
                result = arrNum[0] + arrNum[1];
                break;
        }

            return result;

    }


    public void print (int[] arrNum, char calSymbol, int result ) {
        System.out.println("계산중...");
        System.out.println(arrNum[0] + " " + calSymbol + " " + arrNum[1] + " = " + result);
    }


}
