package com.javarush.task.task17.task1716;

/* 
Синхронизированные методы
*/

public class Solution {
    private double param = Math.random();
    private StringBuilder sb = new StringBuilder();

    //Вызывается тройка, а она уже синхронизирована, нафиг синхронайз
    private void method0() {
        Double d = method3();
    }

    //Вызывается 0 из которого 3, а она уже синхронизирована, нафиг синхронайз
    protected void method1(String param1) {
        Solution solution = new Solution();
        solution.method0();
    }

    //передается значение, нафиг синхронайз
    public void method2(int param1) {
        param1++;
    }

    synchronized double method3() {
        double random = Math.random();
        param += 40.7;
        return random + param;
    }

    synchronized private void method4() {
        sb.append(1).append(1).append(1).append(1);
    }

    //Ничего не возвращает, param2 не изменяет, нафиг синхронайз
    protected void method5(String param2) {
        new StringBuffer().append(param2).append(param2).append(param2);
    }

    public synchronized String method6(int param2) {
        System.out.println("Thinking....");
        method7(5e-2);
        sb = new StringBuilder("Got it!.");
        return sb.toString();
    }

    //Возвращает, переданное значение, общих переменных не меняет, нафиг синхронайз
    String method7(double param2) {
        return "" + param2;
    }

    public static void main(String[] args) {

    }

}
