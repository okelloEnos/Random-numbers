package com.okelloSoftwarez;

import  java.util.Scanner;
public class AdditionQuiz {
    public static  void main (String []args){

        for(int n=0;n <5;n++) {

            int firstNum = (int) (System.currentTimeMillis() % 10);
            int secNum = (int) (System.currentTimeMillis() / 7 % 10);

            System.out.print("What is  :" + firstNum + " + " + secNum + " = ");

            Scanner input = new Scanner(System.in);
            int answer = input.nextInt();

            System.out.println(firstNum + " + " + secNum + " = " + answer + " is " + (firstNum + secNum == answer));
        }
    }
}
