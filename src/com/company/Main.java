package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String s = new String("Str 87 uyuy232");
        Matcher matcher = Pattern.compile("\\d+").matcher(s);
        matcher.find();
        int i = Integer.valueOf(matcher.group());

        System.out.println(i);

    }
}
