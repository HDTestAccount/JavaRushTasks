package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> cityList = new ArrayList<>();
        List<String> familyList = new ArrayList<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }


            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }
            cityList.add(city);
            familyList.add(family);
        }

        // Read the house number
        String houseNumber = reader.readLine();

        if (!houseNumber.isEmpty()) {
            int cityIndex = cityList.indexOf(houseNumber);
            System.out.println(familyList.get(cityIndex
            ));
        }
    }
}
