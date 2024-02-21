package com.ohgiraffers.calculator;

import java.util.Scanner;

public class Calculator {

    public String inputSymbol() {

        Scanner sc = new Scanner(System.in);
        System.out.print("사칙연산 기호를 입력하세요 ('+', '-', '*', '/', '%'");
        String calSymbol = sc.next();

        if (!(calSymbol == "+" || calSymbol == "-" || calSymbol == "*" || calSymbol == "/" || calSymbol == "%")) {

            System.out.println("잘못된 기호를 입력하셨습니다.");
        }

        return calSymbol;
    }

}
