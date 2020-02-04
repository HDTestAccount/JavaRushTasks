package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static java.util.Locale.US;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Date thisDate;
        SimpleDateFormat inpDate = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outpDate = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        String dateString;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dateString = br.readLine();
        thisDate = inpDate.parse(dateString);
        dateString = outpDate.format(thisDate);
        System.out.println(dateString.toUpperCase());
    }
}
