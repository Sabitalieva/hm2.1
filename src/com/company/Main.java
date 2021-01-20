package com.company;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        System.out.println(isGoOutside(generateRandomAge(),10));
        System.out.println(isGoOutside(generateRandomAge(),-10));
        System.out.println(isGoOutside(generateRandomAge(),0));
        System.out.println(isGoOutside(generateRandomAge(),20));
        System.out.println(isGoOutside(generateRandomAge(),17));
        System.out.println(generateRandomAge());
    }
    public static int generateRandomAge() {
        Random r = new Random();
        int rand = r.nextInt(60);
        return rand;


   }

    public static String isGoOutside(int age, int temp) {
        if (age > 20 && age < 45 && temp > -20 && temp < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temp > 0 && temp < 28) {
            return "Можно идти гулять";
        }else if(age > 45 && temp > -10 && temp < 25){
            return "Можно идти гулять";
        }else {
            return "Оставайся дома";
        }



    }

}
//ДЗ:
//Создать возвращаемый метод который будет принимать 2 входящих параметра - возраст человека и температуру на улице, и возвращать результат в виде строки.
//Алгоритм метода должен работать следующим образом:
//если возраст человека от 20 до 45 лет и температура на улице от -20 до 30 градусов, то возвращаемый результат - “Можно идти гулять”;
//eсли же человеку меньше 20 лет и температура на улице в диапазоне от 0 до 28 градусов, то результат снова -  “Можно идти гулять”;
//а если человеку больше 45 лет, то результат “Можно идти гулять” формируется только тогда когда на улице температура в диапазоне от -10 до 25 градусов;
//В остальных случаях метод должен возвращать результат - “Оставайтесь дома”;
//В методе main вызвать написанный метод 5 раз с различными входными данными (аргументами) и распечатать результат в консоль.
//ДЗ на сообразительность:
//Написать метод в котором генерируется случайный возраст public static int generateRandomAge(){........}
//При вызове метода, который формирует результат “можно ли идти гулять” использовать генерирование случайного возраста с помощью метода “generateRandomAge”