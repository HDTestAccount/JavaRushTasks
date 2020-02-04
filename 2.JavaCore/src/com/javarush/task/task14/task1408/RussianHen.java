package com.javarush.task.task14.task1408;

class RussianHen extends Hen {

    int getCountOfEggsPerMonth() {
        return 17;
    }


    @Override
    String getDescription() {
        String henDescription = super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
        return henDescription;
    }
}
