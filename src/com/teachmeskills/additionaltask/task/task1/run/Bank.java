package com.teachmeskills.additionaltask.task.task1.run;

import com.teachmeskills.additionaltask.task.task1.service.Service;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your deposit amount? ");
        double deposit = scan.nextDouble();
        System.out.println("For how long do we make a deposit? ");
        int years = scan.nextInt();

        Service serv = new Service(deposit, years);

        serv.total(deposit, years);

    }

}
