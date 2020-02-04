package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {


    public static void main(String[] args) throws IOException, ParseException {
        Calendar calendar=new GregorianCalendar();
        Map<String, Integer> ttt = calendar.getDisplayNames(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
        List<String> list = new ArrayList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String date = br.readLine();
        list.add(date);
        SimpleDateFormat sdf = new SimpleDateFormat("MMM", Locale.ENGLISH);
        Calendar cal = Calendar.getInstance();
        cal.setTime(sdf.parse(date));

        int numOfDays = cal.get(Calendar.MONTH);
        System.out.printf("%s is the %d month", date, (numOfDays + 1));
    }
}
