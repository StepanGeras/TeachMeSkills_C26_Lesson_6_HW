package com.teachmeskills.additionaltask.task.task2.run;

import com.teachmeskills.additionaltask.task.task2.service.FillTheArray;
import com.teachmeskills.additionaltask.task.task2.service.Turn;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        FillTheArray fill = new FillTheArray();
        Turn turnArray = new Turn();
        System.out.println("Enter array size ");
        int size = scan.nextInt();
        System.out.println("Enter how many elements to rotate the array ");
        int turn = scan.nextInt();

        int[] numberArray = new int[size];

        fill.fillArray(numberArray);

        turnArray.turn(numberArray, turn);

    }

}
