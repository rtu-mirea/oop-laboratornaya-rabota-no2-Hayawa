package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Task1 {
    private String text;
    private String[][] temp1;

    Scanner in = new Scanner(System.in);
    void Task1(){
        text = "";
    }
    public void setText() {
        boolean OK = true;
        System.out.println("Введите текст из чисел(числа разделяются ТОЛЬКО точкой).После числа через запятую пишется система счисления");
        while (OK) {
            text = in.nextLine();
            if(text.charAt((text.length()-1)) != '.')
                text += ".";
            OK = false;
            for (int i = 0; i < text.length(); i++) {
                if ((text.charAt(i) >= 48 && text.charAt(i) <= 57 || text.charAt(i)>=65 && text.charAt(i)<=70) || (text.charAt(i)>=97 && text.charAt(i)<=102) || text.charAt(i) == 46 || text.charAt(i) == 44);
                else {
                    System.out.println("Вы неправильно ввели текст.");
                    OK = true;
                    break;
                }
            }
        }
        String x[] = text.split("\\.");
        temp1 =new String[x.length][2];
        for(int i= 0; i<x.length;i++){
            String z[] = x[i].split(",");
            if (z.length>2 || z[0]=="0" && z[1]=="0" || z[0] == "0" ){
                System.out.print("Ошибка ввода.");
                break;
            }
            temp1[i][0] = z[0];
            temp1[i][1] = z[1];
        }
    }
    public String getText() {
        return text;
    }
    public void changeText(){
        int summ = 0;
        double t1 = 0, t2 = 0;
        for(int i = 0; i<temp1.length;i++){
            t2 = 0;
            t1 = Integer.parseInt(temp1[i][1]);
            for(int y = 0; y< temp1[i][0].length();y++){
                if(t1<=10)
                    t2 +=Character.getNumericValue(temp1[i][0].charAt(y))*Math.pow(t1,temp1[i][0].length() - y-1);
                else if (t1>=11 && (temp1[i][0].charAt(y)>=65 && temp1[i][0].charAt(y)<=70) || (temp1[i][0].charAt(y)>=97 && temp1[i][0].charAt(y)<=102))
                {
                    switch (temp1[i][0].charAt(y))
                    {
                        case 'A'|'a':
                            t2 +=10*Math.pow(t1,temp1[i][0].length() - y-1);
                            break;
                        case 'B'|'b':
                            if(t1>10)
                                t2 +=11*Math.pow(t1,temp1[i][0].length() - y-1);
                            break;
                        case 'C'|'c':
                            if(t1>11)
                                t2 +=12*Math.pow(t1,temp1[i][0].length() - y-1);
                            break;
                        case 'D'|'d':
                            if(t1>12)
                                t2 +=13*Math.pow(t1,temp1[i][0].length() - y-1);
                            break;
                        case 'E'|'e':
                            if(t1>13)
                                t2 +=14*Math.pow(t1,temp1[i][0].length() - y-1);
                            break;
                        case 'F'|'f':
                            if(t1>14)
                                t2 +=15*Math.pow(t1,temp1[i][0].length() - y-1);
                            break;

                    }
                }
                else
                    t2 +=Character.getNumericValue(temp1[i][0].charAt(y))*Math.pow(t1,temp1[i][0].length() - y-1);
            }
            summ+=t2;

        }
        System.out.println("Сумма всех чисел = " + summ);
    }
    public void numSistem(int n){
        int res = 0;
        for(int i = 0; i<temp1.length;i++){
            if(Integer.parseInt(temp1[i][1]) == n){
                res++;
            }
        }
        if(res != 0)
            System.out.println("Колличество чисел " + n + " системы = " + res);
        else
            System.out.println("Чисел " + n + " системы нет.");
    }
    public String newtext(){
        String res = "";
        for(int i = 0; i<temp1.length;i++){
            if(Integer.parseInt(temp1[i][1]) == 16)
                res += temp1[i][0] + " ";
        }
        return res;
    }
    public void summone(){
        for(int i = 0; i<temp1.length;i++) {
            int t2 = Integer.parseInt(temp1[i][1]);
            if (t2 <= 10) {
                int t1 = Integer.parseInt(temp1[i][0]);

                String temp = "";
                while (t1 != 0) {
                    if (t1 % 10 < t2 - 1) {
                        temp = String.valueOf(t1 % 10 + 1) + temp;
                        t1 /= 10;
                    } else {
                        temp = String.valueOf(t1 % 10) + temp;
                        t1 /= 10;
                    }
                }
                temp1[i][0] = temp;
                text = "";
                for (int x = 0; x < temp1.length; x++) {
                    text += temp1[x][0] + "," + temp1[x][1] + ".";
                }
            }
            else {
                System.out.println("Система счисления выше 10!");
            }
        }
    }
}