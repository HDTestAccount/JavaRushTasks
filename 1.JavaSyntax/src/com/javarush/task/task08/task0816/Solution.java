package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Calendar cld = new GregorianCalendar();
        cld.setTime(dateFormat.parse("MAY 1 2012"));
        Map<String, Date> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Сталлоне" + i, cld.getTime());
            cld.add(Calendar.MONTH, 1);
        }
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {

        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();
        Calendar cld = new GregorianCalendar();
        cld = Calendar.getInstance();

        while (iter.hasNext()) {
            Date date = iter.next().getValue();
            cld.setTime(date);
            int mounth = cld.get(Calendar.MONTH);
            if (mounth > 4 && mounth < 8) {
                iter.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
