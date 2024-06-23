package todolist.test;

import org.junit.Before;
import org.junit.Test;
import todolist.service.TaksService;

import java.util.Scanner;

import static org.junit.Assert.*;

public class TaskServiceTest {
    @Before
    public void setup() {
        TaksService.tasks.clear();
    }

    @Test
    public void testAddTasks() {
        String input = "T1Test\n";
        Scanner scanner = new Scanner(input);
        TaksService.addTasks(scanner);
        assertEquals(1, TaksService.tasks.size());
        assertEquals("T1Test", TaksService.tasks.get(0).getTaskName());
        assertFalse(TaksService.tasks.get(0).isTaskStatus());
    }


    @Test
    public void testDeleteTasks() {
        String input1 = "T1";
        Scanner scanner1 = new Scanner(input1);
        TaksService.addTasks(scanner1);
        String input2 = "1\n";
        Scanner scanner2 = new Scanner(input2);
        TaksService.deleteTasks(scanner2);
        assertEquals(0, TaksService.tasks.size());
    }


    @Test
    public void testShowTasks() {
        String input1 = "T1";
        Scanner scanner1 = new Scanner(input1);
        TaksService.addTasks(scanner1);
        String input2 = "T2";
        Scanner scanner2 = new Scanner(input2);
        TaksService.addTasks(scanner2);
        TaksService.showTasks();
    }

    @Test
    public void testUpdateTasks() {
        String input1 = "T1";
        Scanner scanner1 = new Scanner(input1);
        TaksService.addTasks(scanner1);
        String input2 = "1\nT11\ntrue\n";
        Scanner scanner2 = new Scanner(input2);
        TaksService.updateTasks(scanner2);
        assertEquals("T11", TaksService.tasks.get(0).getTaskName());
        assertTrue(TaksService.tasks.get(0).isTaskStatus());
    }

    @Test
    public void testIvnalidAddTasks() {
        String input = "\n";
        Scanner scanner = new Scanner(input);
        TaksService.addTasks(scanner);
        assertEquals(0, TaksService.tasks.size());
    }

    @Test
    public void testInvalidDeleteTasks() {
        String input = "1\n"; //deleting from empty list
        Scanner scanner = new Scanner(input);
        TaksService.deleteTasks(scanner);
        assertEquals(0, TaksService.tasks.size());
    }

    @Test
    public void testUpdateInvalidTasks() {
        String input = "1\nT100\ntrue\n"; //updating non-existing task
        Scanner scanner = new Scanner(input);
        TaksService.updateTasks(scanner);
        assertEquals(0, TaksService.tasks.size());
    }
}
