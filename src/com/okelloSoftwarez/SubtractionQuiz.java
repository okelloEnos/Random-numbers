package com.okelloSoftwarez;

import java.util.Scanner;
public class SubtractionQuiz {
    public static void main(String[]args){


        for (int n = 0; n < 5; n++){

        // random numbers
        int firstNum = (int)(Math.random()*10);
        int secNum = (int)(Math.random()*10);

        if (firstNum < secNum){
            int temp = firstNum;
            firstNum = secNum;
            secNum = temp;
        }

        System.out.print("What is : "+firstNum+" - "+secNum+" = ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (firstNum-secNum ==answer){
            System.out.println("Kudos correct answer");
        }else {
            System.out.println("Naaaah Wrong answer");
            System.out.println("The answer for " + firstNum + " - " + secNum + " should be = " + (firstNum - secNum));
          }
        System.out.println();
        System.out.println();
        }
    }
}
