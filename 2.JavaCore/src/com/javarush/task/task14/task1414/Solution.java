package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        do {
            Movie movie = MovieFactory.getMovie(bufferedReader.readLine());
            if (movie != null) {
                System.out.println(movie.getClass().getSimpleName());
            } else {
                break;
            }
        } while (true);
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }

}
