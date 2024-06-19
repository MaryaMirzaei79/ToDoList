package my_test;

import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("input the needed data and watch printing of them");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your input :");
        String name = myObj.nextLine();
        int time = myObj.nextInt();
        double score = myObj.nextDouble();
        boolean isCritical = myObj.nextBoolean();

        System.out.println("" + name);
        System.out.println("" + time);
        System.out.println("" + score);
        System.out.println("" + isCritical);

        //---- Arraylist

        String[] stringArray = {"cxzd", "ewe", "poi", "dfsf", "mhbj"};
        // for-each  (in arrays)
        for (String mnb : stringArray) {
            System.out.println(mnb);
        }
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);


        //----short hand if...else
        int z = 20;
        String result = (z < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        z = z ^ 2;
        System.out.println(z);
        z = z >> 2;
        System.out.println(z);
        z = z << 2;
        System.out.println(z);
        z = z | 2;
        System.out.println(z);

        //----create a random number
        double randNum = Math.random();  // 0 to 1
        System.out.println(randNum);
        int randomNum = (int) (Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);


        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}
