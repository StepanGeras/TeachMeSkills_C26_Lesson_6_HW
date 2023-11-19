package com.teachmeskills.hw6_2;

import java.util.Scanner;

public class StudentInput {

    public void StInp(Student... stepOne){

        Scanner scan = new Scanner(System.in);

        int count = 1;

        for (int i = 0; i < stepOne.length; i++) {

            System.out.println("Name " + count);
            String name = scan.nextLine();

            System.out.println("Surname " + count);
            String surname = scan.nextLine();

            System.out.println("Number group " + count);
            String numberGroup = scan.nextLine();

            stepOne[i] = new Student(name, surname, numberGroup);
            count++;

        }
    }

    public void StOut(Student... stepOne){

        for (Student i: stepOne) {
            System.out.println("Name " + i.name + "\n" +
                    "Surname " + i.surname + "\n" +
                    "Number group " + i.numberGroup);
        }

    }
}
