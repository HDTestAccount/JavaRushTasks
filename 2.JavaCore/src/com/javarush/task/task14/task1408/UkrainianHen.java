package com.javarush.task.task14.task1408;

class UkrainianHen extends Hen {


    int getCountOfEggsPerMonth() {
        return 1;
    }


    @Override
    String getDescription() {
        String henDescription = super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return henDescription;
    }
}
