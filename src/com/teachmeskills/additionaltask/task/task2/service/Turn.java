package com.teachmeskills.additionaltask.task.task2.service;

import java.util.Arrays;

public class Turn {

    public void turn (int numberArray[], int turn){

        int[] turnNumberArray = new int[numberArray.length];

        for (int i = turn; i < numberArray.length; i++) {
            turnNumberArray[i] = numberArray[i - turn];
        }

        for (int i = 0; i < turn; i++) {
            turnNumberArray[i] = numberArray[numberArray.length - turn + i];
        }

        System.out.println("The array after rotation looks like this " + Arrays.toString(turnNumberArray));

    }

}
