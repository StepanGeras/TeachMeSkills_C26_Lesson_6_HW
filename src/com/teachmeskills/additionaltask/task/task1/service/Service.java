package com.teachmeskills.additionaltask.task.task1.service;

public class Service {

    public double money;
    public int years;

    public Service (double deposit, int years){
        this.money = deposit;
        this.years = years;
    }

    public void total (double money, int years){

        for (int i = 0; i < years; i++) {
            money = money * 1.1;
        }

        System.out.println("In " + years + " years your contribution will increase to " + money);

    }

}
