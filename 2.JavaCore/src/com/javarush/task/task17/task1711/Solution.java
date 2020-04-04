package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    private static SimpleDateFormat sdfOutput = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
    private static SimpleDateFormat sdfInput = new SimpleDateFormat("d/MM/y");

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    createUser(args);
                    break;
                }
            case "-u":
                synchronized (allPeople) {
                    updateUser(args);
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    deleteUser(args);
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    infoOfUser(args);
                    break;
                }
        }
    }

    public static void createUser(String[] args) throws ParseException {
        int position = 0;
        while (position + 1 < args.length) {
            if (args[position + 2].equals("м")) {
                allPeople.add(Person.createMale(args[position+1], sdfInput.parse(args[position + 3])));
            } else {
                allPeople.add(Person.createFemale(args[position+1], sdfInput.parse(args[position + 3])));
            }
            position += 3;
            System.out.println(allPeople.size() - 1);
        }

    }

    public static void updateUser(String[] args) throws ParseException {
        int position = 0;
        while (position + 1 < args.length) {
            Person person = allPeople.get(Integer.parseInt(args[position + 1]));
            person.setName(args[position + 2]);
            person.setSex((args[position + 3].equals("м") ? Sex.MALE : Sex.FEMALE));
            person.setBirthDate(sdfInput.parse(args[position + 4]));
            position += 4;
        }
    }

    public static void deleteUser(String[] arg) {
        int position = 0;
        while (++position != arg.length) {
            Person person = allPeople.get(Integer.parseInt(arg[position]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }
    }

    public static void infoOfUser(String[] arg) {
        int position = 0;
        while (++position != arg.length) {
            Person person = allPeople.get(Integer.parseInt(arg[position]));
            StringBuilder result = new StringBuilder();
            result.append(person.getName()).append(" ").append(person.getSex() == Sex.MALE ? "м" : "ж").append(" ").append(sdfOutput.format(person.getBirthDate()));
            System.out.println(result);
        }
    }
}
