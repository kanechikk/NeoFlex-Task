package com.company;

import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Выберите необходимую операцию: ");
        System.out.println("1 - Конвертация из 10-ой в 16-ю\n2 - Конвертация из 10-ой в 2-ю\n3 - Конвертация из 2-ой в 10-ю");
        int operation = in.nextInt();

        int value = 0;

        System.out.println("Введите число (от 0 до 10 000): ");
        if(operation == 3)
            value = Integer.parseInt(in.next(), 2);
        else
            value = in.nextInt();

        while( 0 > value | value > 10000){
            System.out.println("Число выходит за пределы допустимых значений.");
            if(operation == 3)
                value = Integer.parseInt(in.next(), 2);
            else
                value = in.nextInt();
        }

        System.out.println("Конвертированное число: ");
        switch (operation){
            case 1:
                System.out.println(Integer.toHexString(value));
                break;
            case 2:
                System.out.println(Integer.toBinaryString(value));
                break;
            case 3:
                System.out.println(value);
                break;
        }
    }
}

