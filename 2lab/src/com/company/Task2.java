package com.company;

import java.util.Scanner;

public class Task2 {
    private StringBuffer temp;
    private String text;
    private String[][] temp1;

    Scanner in = new Scanner(System.in);
    void Task1(){
        text = "";
        temp = new StringBuffer();
    }

    public void setText() {
        boolean OK = true;
        System.out.println("Введите текст из чисел(числа разделяются ТОЛЬКО точкой).После числа через запятую пишется система счисления");
        while (OK) {
            text = in.nextLine();
            if(text.charAt(text.length()-1) != '.')
                text += ".";
            OK = false;
            for (int i = 0; i < text.length(); i++) {
                if ((text.charAt(i) >= 48 && text.charAt(i) <= 57 || text.charAt(i)>=65 && text.charAt(i)<=70) || (text.charAt(i)>=97 && text.charAt(i)<=102) || text.charAt(i) == 46 || text.charAt(i) == 44);
                else {
                    System.out.println("Вы неправильно ввели текст. Пожалуйста введите число ',' система счисления '.' следующее число если нужно");
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
                System.out.print("Ошибка ввода!");
                break;
            }
            temp1[i][0] = z[0];
            temp1[i][1] = z[1];
        }
        temp = new StringBuffer(text);
    }
    public String getText() {
        return temp.toString();
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
                this.temp = new StringBuffer(text);
            }
            else {
                System.out.println("Система счисления больше 10!");
                System.out.println("lol");
            }
        }
    }
    public String change() {
        int t1, t2,tmp = 0;
        StringBuffer res = new StringBuffer();
        StringBuffer trash = new StringBuffer();
        for (int i = 0; i < temp1.length; i++) {
            t2 = Integer.parseInt(temp1[i][1]);
            if (t2 == 10) {
                res = new StringBuffer();
                t1 = Integer.parseInt(temp1[i][0]);
                while (t1 >15) {
                    if(t1%16 < 10) {
                        tmp = t1 % 16;
                        t1 /= 16;
                        res.append(tmp);
                    }
                    else {
                        switch (t1%16){
                            case 10:
                                res.append("A");
                                t1 = t1%16;
                                break;
                            case 11:
                                res.append("B");
                                t1 =t1%16;
                                break;
                            case 12:
                                res.append("C");
                                t1 = t1%16;
                                break;
                            case 13:
                                res.append("D");
                                t1 = t1%16;
                                break;
                            case 14:
                                res.append("E");
                                t1 = t1%16;
                                break;
                            case 15:
                                res.append("F");
                                t1 = t1%16;
                                break;
                        }
                    }
                }
                if(t1 >=10) {
                    switch (t1) {
                        case 10:
                            res.append("A");
                            break;
                        case 11:
                            res.append("B");
                            break;
                        case 12:
                            res.append("C");
                            break;
                        case 13:
                            res.append("D");
                            break;
                        case 14:
                            res.append("E");
                            break;
                        case 15:
                            res.append("F");
                            break;
                    }
                }
                else{
                    res.append(t1);
                }
                res.reverse();
                t2 = 16;
                temp1[i][0] = res.toString();
                temp1[i][1] = String.valueOf(t2);

                trash.append(temp1[i][0] + "," + temp1[i][1] + ".");
            }
        }
        return trash.toString();
    }
    public String summ () {
        int summ = 0;
        double t1 = 0, t2 = 0;
        for (int i = 0; i < temp1.length; i++) {
            t2 = 0;
            t1 = Integer.parseInt(temp1[i][1]);
            for (int y = 0; y < temp1[i][0].length(); y++) {
                if (t1 == 8)
                    t2 += Character.getNumericValue(temp1[i][0].charAt(y)) * Math.pow(t1, temp1[i][0].length() - y - 1);
            }
            summ += t2;
        }
        temp.append(summ + ",8.");
        return temp.toString();
    }

}
