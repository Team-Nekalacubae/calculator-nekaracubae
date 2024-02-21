package com.ohgiraffers.calculator;

import java.util.Scanner;

public class Calculator {


    public Char inputSymbol() {

        Scanner sc = new Scanner(System.in);
        System.out.print("사칙연산 기호를 입력하세요 ('+', '-', '*', '/', '%'");
        Char calSymbol = sc.next();

        if (!(calSymbol == '+' || calSymbol == '-' || calSymbol == '*' || calSymbol == '/' || calSymbol == '%')) {

            System.out.println("잘못된 기호를 입력하셨습니다.");
        }

        Char calSymbol;


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

//                if (arrNum[1] == 0) {



//                }
                break;

            case '%' :
                result = arrNum[0] + arrNum[1];
                break;
        }

            return result;


    }


    public void print (int[] arrNum, String calSybol, int result ) {
        System.out.println("계산중...");
        System.out.println(arrNum[0] + " " + calSybol + " " + arrNum[1] + " = " + result);
    }

}
