package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new t1());
        threads.add(new t2());
        threads.add(new t3());
        threads.add(new t4());
        threads.add(new t5());
    }

    public static void main(String[] args) {
    }

    public static class t1 extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class t2 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        }
    }

    public static class t3 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public static class t4 extends Thread implements Message {
        private boolean stop = false;

        @Override
        public void showWarning() {
            stop = true;
        }

        @Override
        public void run() {
            while (!stop) {

            }
        }
    }

    public static class t5 extends Thread {
        @Override
        public void run() {
            String inpString;
            int summ = 0;
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                inpString = br.readLine();
                while (!inpString.equals("N")) {
                    summ += Integer.parseInt(inpString);
                    inpString = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(summ);
        }
    }

}