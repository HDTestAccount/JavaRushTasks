package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human gf1 = new Human("дед1", true, 90);
        Human gf2 = new Human("дед2", true, 90);
        Human gm1 = new Human("баба1", false, 90);
        Human gm2 = new Human("баба2", false, 90);
        Human fa = new Human("папа", true, 40, gf1, gm1);
        Human ma = new Human("мама", false, 40, gf2, gm2);

        Human soon = new Human("сын", true, 5, fa, ma);
        Human dough1 = new Human("дочь1", false, 10, fa, ma);
        Human dough2 = new Human("дочь2", false, 15, fa, ma);
        System.out.println(gf1.toString());
        System.out.println(gf2.toString());
        System.out.println(gm1.toString());
        System.out.println(gm2.toString());
        System.out.println(fa.toString());
        System.out.println(ma.toString());
        System.out.println(soon.toString());
        System.out.println(dough1.toString());
        System.out.println(dough2.toString());
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this(name, sex, age);
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
//            Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}