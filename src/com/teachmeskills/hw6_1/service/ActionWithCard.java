package com.teachmeskills.hw6_1.service;

import com.teachmeskills.hw6_1.card.CreditCard;

import java.util.Scanner;

public class ActionWithCard {

    Scanner scan = new Scanner(System.in);

    public void putOnCard(CreditCard amountOnAccount){
        System.out.print("How much to refill?: ");
        int add = scan.nextInt();
        amountOnAccount.amountOnAccount += add;
    }

    public void withdrawOnCard(CreditCard amountOnAccountClient){

        System.out.print("How much to withdraw?: ");
        int add = scan.nextInt();
        amountOnAccountClient.amountOnAccount -= add;
    }

    public void informationOutput(int numberAccount, int amountOnAccount) {

        System.out.println("Account number: " + numberAccount + "\n" + "Account balance: " + amountOnAccount);

    }

}
