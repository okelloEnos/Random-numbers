package com.okelloSoftwarez;

import java.util.Scanner;
public class Lottery {
    public static  void main(String[]args){

        // Generate a two digit random number
        int lottery = (int)(Math.random()*100);

        // prompt a player for his lottery number
        System.out.print("enter your lottery pick number(2 digit): ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        // acquire the digits from lottery generated number
        int lottery1 = lottery/10;
        int lottery2 = lottery%10;

        // acquire players digit
        int guess1 = guess/10;
        int guess2 = guess%10;

        System.out.println("The lottery Number is : "+lottery);

        // Decision making on winning
        if (lottery == guess){
            System.out.println("Kudos Exact match : You win 10,000");
        }else if (lottery1 == guess2 && lottery2 == guess1){
            System.out.println("Kudos all digits match : You won 3,000");

        }else if (lottery1 == guess1 || lottery1 == guess2 || lottery2 == guess1 || lottery2 == guess2){
            System.out.println("Kudos you have a single : You won 1,000");
        }else {
            System.out.println("Naaaah You  miss your only shot");
        }

    }
}
