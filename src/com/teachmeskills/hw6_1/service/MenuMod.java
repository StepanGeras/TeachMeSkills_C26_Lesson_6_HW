package com.teachmeskills.hw6_1.service;

import com.teachmeskills.hw6_1.card.CreditCard;

import java.util.Scanner;

public class MenuMod {

    public void menuMod(CreditCard numberAccount, CreditCard sum) {

        Scanner scan = new Scanner(System.in);
        ActionWithCard service = new ActionWithCard();


        while (true) {

            System.out.println("""
                    Enter the number 1, 2, 3, 4 or 5:
                    1. Client data
                    2. To put money into the account
                    3. Withdraw money from the account
                    4. Return
                    5. Exit
                    """);

            int number = scan.nextInt();

            if (number == 1) {

                service.informationOutput(numberAccount.accountNumber, sum.amountOnAccount);

            } else if (number == 2) {

                service.putOnCard(sum);

            } else if (number == 3) {

                service.withdrawOnCard(sum);

            } else if (number == 5) {

                return;

            } else {

                return;

            }

        }

    }


}


