package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean ok = true;
        while (ok) {
            Scanner in = new Scanner(System.in);
            int n;
            System.out.println("1. Задание 1\n2. Задание 2\n3. Задание 3\n4. Выход");
            n = in.nextInt();
            switch (n) {
                case 1:
                    boolean OK = true;
                    Task1 text = new Task1();
                    text.setText();
                    while (OK) {
                        System.out.println("Текущий текст: " + text.getText());
                        System.out.println("1.Найти сумму всех чисел(десятичная система)\n2.Изменить текст\n3.Увеличить каждую цифру на 1\n4.Определить сколько чисел N-ичной системы\n5.Сформировать строку из 16-ричных чисел\n6.Выход");
                        n = in.nextInt();
                        switch (n) {
                            case 1:
                                text.changeText();
                                break;
                            case 2:
                                text = new Task1();
                                text.setText();
                                break;
                            case 3:
                                text.summone();
                                break;
                            case 4:
                                System.out.print("Введите систему счисления которая вам интересна: ");
                                n = in.nextInt();
                                text.numSistem(n);
                                break;
                            case 5:
                                System.out.println(text.newtext());
                                break;
                            case 6:
                                OK = false;
                                break;
                        }
                    }
                    break;
                case 2:
                    boolean OK1 = true;
                    Task2 text1 = new Task2();
                    text1.setText();
                    while (OK1){
                        System.out.println("Текущий текст: " + text1.getText());
                        System.out.println("1.Увеличить каждую цифру на 1\n2.Изменить текст\n3.Найти сумму всех чисел 8 cc\n4.Заменить 10 сс на 16 сс\n5.Выход");
                        n = in.nextInt();
                        switch (n){
                            case 1:
                                text1.summone();
                                break;
                            case 2:
                                text1.setText();
                                break;
                            case 3:
                                System.out.println( text1.summ());
                                break;
                            case 4:
                                System.out.println( text1.change());
                                break;
                            case 5:
                                OK1 = false;
                                break;
                        }
                    }
                    break;
                case 3:
                    Task3 regeh = new Task3();
                    System.out.println("Введите входной текст с клавиатуры:");
                    regeh.ConsoleInPut();
                    System.out.println("\nЗадание 3.1 - ограниченен ли текст символом * (если ограниен - true; если нет - false):");
                    regeh.inst();
                    System.out.println("\nЗадание 3.2 - Удалить из текста все подстроки удовлетворяющие заданию 3.1:");
                    regeh.outst();
                    break;
                case 4:
                    ok = false;
                    break;
            }
        }
    }
}