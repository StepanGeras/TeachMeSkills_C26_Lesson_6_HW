package com.teachmeskills.hw6_1.run;

import com.teachmeskills.hw6_1.card.CreditCard;
import com.teachmeskills.hw6_1.service.MenuMod;

import java.util.Scanner;


/**
 * Задача 1
 * Создать класс CreditCard c полями номер счета, текущая сумма на счету.
 * Создайте один конструктор с двумя параметрами.
 * Добавьте метод, который позволяет начислять сумму на кредитную карточку. Метод принимает на вход сумму и добавляет эту сумму к текущей.
 * Подуймайте, как стоит задать входные и выходные параметры метода.
 * Добавьте метод, который позволяет снимать с карточки некоторую сумму. Метод принимает на вход сумму и отнимает эту сумму от текущей.
 * Подуймайте, как стоит задать входные и выходные параметры метода.
 * Добавьте метод, который выводит текущую информацию о карточке.
 * Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма.
 * Тестовый сценарий для проверки:
 * Положите деньги на первые две карточки и снимите с третьей.
 * Выведите на экран текущее состояние всех трех карточек.
 */

public class Run {

    public static void main(String[] args) {

        CreditCard client1 = new CreditCard(12345, 500);
        CreditCard client2 = new CreditCard(67890, 1000);
        CreditCard client3 = new CreditCard(24680, 200);

        MenuMod menu = new MenuMod();
        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("Select client:" + "\n" +
                    "1. Client 1" + "\n" +
                    "2. Client 2" + "\n" +
                    "3. Client 3" + "\n" +
                    "4. Exit");

            int number = scan.nextInt();

            if (number == 1) {

                menu.menuMod(client1, client1);

            } else if (number == 2) {

                menu.menuMod(client2, client2);

            } else if (number == 3) {

                menu.menuMod(client3, client3);

            } else {
                break;
            }

        }


    }

}
