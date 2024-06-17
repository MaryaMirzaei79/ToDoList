package todolist;

import todolist.model.Task;

import java.util.ArrayList;
import java.util.Scanner;

import static todolist.service.Service.*;

public class Main {
    ArrayList<Task> tasksList = new ArrayList<>();
    static Task myTask = new Task();

    public static void main(String[] arg) {
        System.out.println("This is a todolist program");
        Scanner scanner = new Scanner(System.in);

        boolean programIsUp = true;
        while (programIsUp) {

            System.out.println("Select your request from the list and act according on it");
            System.out.println("Type ADD for adding a new task");
            System.out.println("Type REMOVE for deleting a task");
            System.out.println("Type UPDATE for marking a task as completed");
            System.out.println("Type SHOW TASKS for showing the taskList");
            System.out.println("Type EXIT for closing the program");
            System.out.println("Type your option: ");

            String input = scanner.nextLine();

            switch (input) {

                case "ADD":
                    add(scanner);
                    showTaskList();
                    break;
                case "REMOVE":
                    delete(scanner);
                    showTaskList();
                    break;
                case "UPDATE":
                    update(scanner);
                    showTaskList();
                    break;
                case "SHOW TASKS":
                    showTaskList();
                    break;
                case "EXIT":
                    programIsUp = false;
                    System.out.println("The program is not up");
                    break;
                    default:
                System.out.println("you should select a valid choice");


            }
        }
        scanner.close();


    }
}
