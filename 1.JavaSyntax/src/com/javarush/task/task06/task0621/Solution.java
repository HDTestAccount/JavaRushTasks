package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//GrandParrent
        String gPaName = reader.readLine();
        Cat catGPa = new Cat(gPaName);
        String gMaName = reader.readLine();
        Cat catGMa = new Cat(gMaName);

//Parrent
        String paName = reader.readLine();
        Cat catPa = new Cat(paName, null, catGPa);
        String maName = reader.readLine();
        Cat catMa = new Cat(maName, catGMa, null);

        //Childrens
        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMa, catPa);
        String douName = reader.readLine();
        Cat catDou = new Cat(douName, catMa, catPa);

        System.out.println(catGPa);
        System.out.println(catGMa);
        System.out.println(catPa);
        System.out.println(catMa);
        System.out.println(catSon);
        System.out.println(catDou);
    }

    public static class Cat {
        private String name;
        private Cat ma, pa;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat ma, Cat pa) {
            this(name);
            this.ma = ma;
            this.pa = pa;
        }

        @Override
        public String toString() {
            String info = "The cat's name is " + name;
            if (ma != null)
                info += ", mother is " + ma.name;
            else
                info += ", no mother";
            if (pa != null)
                info += ", father is " + pa.name;
            else
                info += ", no father";
            return info;
        }
    }

}
