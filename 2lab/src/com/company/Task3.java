package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    private String maintext;

    public Task3(){}

    public void ConsoleInPut(){
        Scanner in = new Scanner(System.in);
        this.maintext = in.nextLine();
    }

    public void inst(){
        Pattern pattern = Pattern.compile("[*].+[*]");
        Matcher matcher = pattern.matcher(maintext);
        if(matcher.find()){
            System.out.println(true);
        }
        else{
            System.out.print(false);
        }
    }

    public void outst(){
        Pattern pattern = Pattern.compile("[*].+[*]");
        Matcher matcher = pattern.matcher(maintext);
        String clear = matcher.replaceAll("");
        System.out.println(clear);
    }
}