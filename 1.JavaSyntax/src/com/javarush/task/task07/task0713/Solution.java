package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int listLength = 20;
        ArrayList<Integer> strings = new ArrayList<>();
        ArrayList<Integer> strings3 = new ArrayList<>();
        ArrayList<Integer> strings2 = new ArrayList<>();
        ArrayList<Integer> stringsOther = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //input list
        for (int i = 0; i < listLength; i++) {
            strings.add(Integer.parseInt(br.readLine()));
        }

        //sort list

        for (int tmpVal : strings) {
            if (tmpVal % 3 == 0) {
                strings3.add(tmpVal);
            }
            if (tmpVal % 2 == 0) {
                strings2.add(tmpVal);
            }
            if (tmpVal % 3 != 0 && tmpVal % 2 != 0) {
                stringsOther.add(tmpVal);
            }
        }

        printList(strings3);
        printList(strings2);
        printList(stringsOther);


    }

    public static void printList(ArrayList<Integer> list) {
        for (int tmpVal : list) {
            System.out.println(tmpVal);
        }
    }
}
