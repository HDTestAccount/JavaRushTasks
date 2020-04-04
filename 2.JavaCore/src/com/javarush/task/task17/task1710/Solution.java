package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    private static SimpleDateFormat sdfOutput = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
    private static SimpleDateFormat sdfInput = new SimpleDateFormat("dd/M/yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]) {
            case "-c":
                createUser(args);
                break;
            case "-u":
                updateUser(args);
                break;
            case "-d":
                deleteUser(args[1]);
                break;
            case "-i":
                infoOfUser(args[1]);
                break;
        }
        //start here - начни тут
    }

    public static void createUser(String[] args) throws ParseException {
        if (args[2].equals("м")) {
            allPeople.add(Person.createMale(args[1], sdfInput.parse(args[3])));
        } else {
            allPeople.add(Person.createFemale(args[1], sdfInput.parse(args[3])));
        }
        System.out.println(allPeople.size() - 1);
    }

    public static void updateUser(String[] args) throws ParseException {
        Person person = allPeople.get(Integer.parseInt(args[1]));
        person.setName(args[2]);
        person.setSex((args[3].equals("m") ? Sex.MALE : Sex.FEMALE));
        person.setBirthDate(sdfInput.parse(args[4]));
    }

    public static void deleteUser(String arg) {
        Person person = allPeople.get(Integer.parseInt(arg));
        person.setName(null);
        person.setSex(null);
        person.setBirthDate(null);
    }

    public static void infoOfUser(String arg) {
        Person person = allPeople.get(Integer.parseInt(arg));
        StringBuilder result = new StringBuilder();
        result.append(person.getName()).append(" ").append(person.getSex() == Sex.MALE ? "м" : "ж").append(" ").append(sdfOutput.format(person.getBirthDate()));
        System.out.println(result);
    }
}
