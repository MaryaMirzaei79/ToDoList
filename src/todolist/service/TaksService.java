package todolist.service;

import todolist.model.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaksService {
    public static List<Task> tasks = new ArrayList<>();

    public static void add_tasks(Scanner scanner) {
//        System.out.println("Enter taskName,taskStatus");
        Task myTask = new Task();
        System.out.println("Enter taskName");
        String taskName = scanner.nextLine();
        myTask.setTaskName(taskName);
        myTask.setTaskStatus(false);
//        myTask.setTaskStatus(scanner.nextBoolean());
        if (!myTask.getTaskName().equals(null) && !myTask.getTaskName().equals("")) {
            tasks.add(myTask);
            System.out.println("task added");
        } else
            System.out.println("taskName is invalid");

    }

    public static void delete_tasks(Scanner scanner) {

        System.out.println("Type your task number: ");
        int index = scanner.nextInt();
        if (index <= 0 || index > tasks.size()) {
            System.out.println("invalid task number");
        } else {
            tasks.remove(index - 1);
            System.out.println("task deleted");
        }
    }

    public static void show_tasks() {
        System.out.println("your tasks: ");
        if (tasks.size() == 0)
            System.out.println("YOUR TASK LIST IS EMPTY");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + "." + tasks.get(i).getTaskName() + "," + tasks.get(i).isTaskStatus());

        }
    }

    public static void update_tasks(Scanner scanner) {
        System.out.println("Type your task number: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index <= 0 || index > tasks.size()) {
            System.out.println("invalid task number");
        } else {
            System.out.println("Type your new taskName");
            String taskName = scanner.nextLine();
            System.out.println("Type your taskStatus");
            tasks.get(index - 1).setTaskName(taskName);
            boolean status = scanner.nextBoolean();
            tasks.get(index - 1).setTaskStatus(status);
            System.out.println("task updated");
        }
    }

}
