package com.ohgiraffers.calculator;

import java.util.Scanner;

public class Calculator {

    Scanner sc = new Scanner(System.in);


    public int calculator(int[] arrNum, char symbol) {

        int result = 0;

        switch (symbol) {

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











}
