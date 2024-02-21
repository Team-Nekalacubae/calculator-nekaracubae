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
        System.out.print("사칙연산 기호를 입력하세요 ('+', '-', '*', '/', '%') ");
        char calSymbol = sc.nextLine().charAt(0);

        if (!(calSymbol == '+' || calSymbol == '-' || calSymbol == '*' || calSymbol == '/' || calSymbol == '%')) {

            System.out.println("잘못된 기호를 입력하셨습니다.");
        }

        return calSymbol;
    }

    Scanner sc = new Scanner(System.in);


    public void calculator(int[] arrNum, char calSymbol) {

        int result;

        switch (calSymbol) {

            case '+' :
                result = arrNum[0] + arrNum[1];
                System.out.println("계산중...");
                System.out.println(arrNum[0] + " " + calSymbol + " " + arrNum[1] + " = " + result);
                break;

            case '-' :
                result = arrNum[0] - arrNum[1];
                System.out.println("계산중...");
                System.out.println(arrNum[0] + " " + calSymbol + " " + arrNum[1] + " = " + result);
                break;

            case '*' :
                result = arrNum[0] * arrNum[1];
                System.out.println("계산중...");
                System.out.println(arrNum[0] + " " + calSymbol + " " + arrNum[1] + " = " + result);
                break;

            case '/' :

                try {
                    result = divideQuotient(arrNum[0], arrNum[1]);
                    System.out.println("계산중...");
                    System.out.println(arrNum[0] + " " + calSymbol + " " + arrNum[1] + " = " + result);
                } catch (IllegalArgumentException e) {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;

            case '%' :
                try {
                    result = divideRemainder(arrNum[0], arrNum[1]);
                    System.out.println("계산중...");
                    System.out.println(arrNum[0] + " " + calSymbol + " " + arrNum[1] + " = " + result);
                } catch (IllegalArgumentException e) {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + calSymbol);
        }


    }


    public void print (int[] arrNum, char calSymbol, int result ) {
        System.out.println("계산중...");
        System.out.println(arrNum[0] + " " + calSymbol + " " + arrNum[1] + " = " + result);
    }

    public static int divideQuotient(int num1, int num2) throws IllegalArgumentException {
        if (num2 == 0) {
            throw new IllegalArgumentException("0으로 나누기는 불가능 합니다.");
        }
        int divideResult = num1 / num2;
        return divideResult;
    }

    public static int divideRemainder(int num1, int num2) throws IllegalArgumentException {
        if (num2 == 0) {
            throw new IllegalArgumentException("0으로 나누기는 불가능 합니다.");
        }
        int divideResult = num1 % num2;
        return divideResult;
    }


}
