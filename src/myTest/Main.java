package myTest;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.println("input the needed data and watch printing of them");
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your input :");
         String name = myObj.nextLine();
         int time = myObj.nextInt();
         double score = myObj.nextDouble();
         boolean isCritical = myObj.nextBoolean();


        System.out.println(""+name);
        System.out.println(""+time);
        System.out.println(""+score);
        System.out.println(""+isCritical);

    }
}
