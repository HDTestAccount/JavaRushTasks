package com.javarush.task.task04.task0408;                                                  
                                                  
/*                                                   
Хорошо или плохо?                                                  
*/                                                  
                                                  
public class Solution {                                                  
    public static void main(String[] args) {                                                  
        compare(3);                                                  
        compare(6);                                                  
        compare(5);                                                  
    }                                                  
                                                  
    public static void compare(int a) {                                                  
        //напишите тут ваш код  
//"Число меньше 5" "Число больше 5" "Число равно 5",
String answer;
if (a<5){answer="Число меньше 5";}else if(a==5){answer="Число равно 5";}else{answer="Число больше 5";}                                                
   System.out.println(answer);
    }                                                  
}