package com.teachmeskills.additionaltask.task.task3.twosum;

public class TwoSum {

    public void twosum (int numberArray[], int number) {

        for (int i = 0; i < numberArray.length; i++) {
            for (int j = i + 1; j < numberArray.length; j++) {
                if (numberArray[i] + numberArray[j] == number) {
                    System.out.println("index " + i + " = " + j);
                }
            }
        }

    }

}
