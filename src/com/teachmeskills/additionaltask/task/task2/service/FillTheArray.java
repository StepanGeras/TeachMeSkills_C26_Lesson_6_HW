package com.teachmeskills.additionaltask.task.task2.service;

import java.util.Arrays;

public class FillTheArray {

    public void fillArray (int numberArray[]){

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i + 1;
        }

        System.out.println("The array looks like this " + Arrays.toString(numberArray));
    }

}
