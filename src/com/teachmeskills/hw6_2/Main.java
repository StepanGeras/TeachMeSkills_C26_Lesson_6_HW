package com.teachmeskills.hw6_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        StudentInput stIn = new StudentInput();
        System.out.println("Enter number of students: ");
        int n = scan.nextInt();
        Student[] stepOne = new Student[n];

        stIn.StInp(stepOne);

        stIn.StOut(stepOne);

    }

}
