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
    public void testAdd_tasks() {
        String input = "T1Test\n";
        Scanner scanner = new Scanner(input);
        TaksService.add_tasks(scanner);
        assertEquals(1, TaksService.tasks.size());
        assertEquals("T1Test", TaksService.tasks.get(0).getTaskName());
        assertFalse(TaksService.tasks.get(0).isTaskStatus());
    }


    @Test
    public void testDelete_tasks() {
        String input1 = "T1";
        Scanner scanner1 = new Scanner(input1);
        TaksService.add_tasks(scanner1);
        String input2 = "1\n";
        Scanner scanner2 = new Scanner(input2);
        TaksService.delete_tasks(scanner2);
        assertEquals(0, TaksService.tasks.size());
    }


    @Test
    public void testShow_tasks() {
        String input1 = "T1";
        Scanner scanner1 = new Scanner(input1);
        TaksService.add_tasks(scanner1);
        String input2 = "T2";
        Scanner scanner2 = new Scanner(input2);
        TaksService.add_tasks(scanner2);
        TaksService.show_tasks();
    }

    @Test
    public void testUpdate_tasks() {
        String input1 = "T1";
        Scanner scanner1 = new Scanner(input1);
        TaksService.add_tasks(scanner1);
        String input2 = "1\nT11\ntrue\n";
        Scanner scanner2 = new Scanner(input2);
        TaksService.update_tasks(scanner2);
        assertEquals("T11", TaksService.tasks.get(0).getTaskName());
        assertTrue(TaksService.tasks.get(0).isTaskStatus());
    }

    @Test
    public void testIvnalid_add_tasks() {
        String input = "\n";
        Scanner scanner = new Scanner(input);
        TaksService.add_tasks(scanner);
        assertEquals(0, TaksService.tasks.size());
    }

    @Test
    public void testInvalid_delete_tasks() {
        String input = "1\n"; //deleting from empty list
        Scanner scanner = new Scanner(input);
        TaksService.delete_tasks(scanner);
        assertEquals(0, TaksService.tasks.size());
    }

    @Test
    public void testUpdate_invalid_tasks() {
        String input = "1\nT100\ntrue\n"; //updating non-existing task
        Scanner scanner = new Scanner(input);
        TaksService.update_tasks(scanner);
        assertEquals(0, TaksService.tasks.size());
    }
}
