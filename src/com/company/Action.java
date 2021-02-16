package com.company;

import java.util.Scanner;

public class Action {

    public static void putMoney(){

        while(true){
            Scanner sc = new Scanner(System.in);
            int sum = sc.nextInt();
            if (sum<30){
                System.out.println("Your sum is not enough to buy something");
            }
            else{
                break;
            }
        }

        System.out.println("What do you want to do: ");
        System.out.println();
        System.out.println();
        System.out.println("a - put some more money");
        System.out.println("w - to buy something");
        System.out.println("q - to quit the Automate");
    }



    public static void chooseAction(){


        Scanner sc = new Scanner(System.in);
        String sign = sc.nextLine();

        switch(sign){
            case "a":
                System.out.println("How much money do you want to put???");
                break;
            case "w":
                System.out.println("You can buy something depending on your sum. Choose the product:");
                System.out.println("Chocolate - [60]");
                System.out.println("Chips - [35]");
                System.out.println("Mineral water - [30]");
                System.out.println("Cola, Sprite, Fanta - [30]");
                System.out.println("Popcorn - [35]");
                break;
            case "q":
                System.out.println("You can quit the system");
                break;
            default:
                System.out.println("You entered the wrong operation. Try one more time!!!");
        }
    }
}
