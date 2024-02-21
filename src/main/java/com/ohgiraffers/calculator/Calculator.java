package com.ohgiraffers.calculator;

public class Calculator {


    public void print (int[] arrNum, String calSybol, int total ) {
        System.out.println("계산중...");
        System.out.println(arrNum[0] + " " + calSybol + " " + arrNum[1] + " = " + total);
    }
}
