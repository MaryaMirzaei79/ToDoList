package myTest;

import java.util.Collection;
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


        //         ---- Arraylist

        int intArray[] = new int[10];
        String stringArray[] = new String[10];
        char charArray[] = new char[10];
        Object objectArray[] = new Objects[10];
        Object object = new Object();
        Collection collectionArray[] = new Collection[10];


        intArray[0] = 0;
        stringArray[0] = "a";
        charArray[0] = 'a';

    }
}
