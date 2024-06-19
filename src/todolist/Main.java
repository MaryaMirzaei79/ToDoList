package todolist;

import java.util.Scanner;

import static todolist.service.TaksService.*;

public class Main {
    public static void main(String[] arg) {
        System.out.println("This is a todolist program");
        Scanner scanner = new Scanner(System.in);

        boolean programIsUp = true;
        while (programIsUp) {

            System.out.println("Select your request from the list and act according on it"
                    + "\nType ADD for adding a new task"
                    + "\nType REMOVE for deleting a task"
                    + "\nType UPDATE for marking a task as completed"
                    + "\nType SHOW TASKS for showing the taskList"
                    + "\nType EXIT for closing the program"
                    + "\nType your option: ");
            String input = scanner.nextLine();

            switch (input) {

                case "ADD":
                    add_tasks(scanner);
                    show_tasks();
                    break;
                case "REMOVE":
                    delete_tasks(scanner);
                    show_tasks();
                    break;
                case "UPDATE":
                    update_tasks(scanner);
                    show_tasks();
                    break;
                case "SHOW TASKS":
                    show_tasks();
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
