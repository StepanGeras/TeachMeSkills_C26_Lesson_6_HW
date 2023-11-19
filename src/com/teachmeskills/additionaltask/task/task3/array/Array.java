package com.teachmeskills.additionaltask.task.task3.array;

import com.teachmeskills.additionaltask.task.task3.twosum.TwoSum;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        int min = 0;
        int max = 10;
        Scanner scan = new Scanner(System.in);
        TwoSum twoSum = new TwoSum();
        System.out.println("Enter the size array ");
        int size = scan.nextInt();
        int [] numberArray = new int[size];

        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = (int) (min + Math.random() * max);
        }

        System.out.println(Arrays.toString(numberArray));

        System.out.println("Enter number");
        int sum = scan.nextInt();

        twoSum.twosum(numberArray, sum);

    }

}
