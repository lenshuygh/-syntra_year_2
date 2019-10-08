package recap_exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex06ToDoList {
    private static Map<Integer, String> toDoItemsHashMap = new HashMap<>();

    public static void main(String[] args) {
        fillMap();
        Scanner scanner = new Scanner(System.in);
        new Ex06ToDoList(scanner);
    }

    private static void fillMap() {
        toDoItemsHashMap.put(1, "item 1");
        toDoItemsHashMap.put(2, "item 2");
        toDoItemsHashMap.put(3, "item 3");
        toDoItemsHashMap.put(4, "item 4");
    }

    public Ex06ToDoList(Scanner scanner) {
        evaluateEnteredChoice(getMenuInput(scanner));
    }

    private void evaluateEnteredChoice(String choice) {
        int itemNumber = getDigitFromChoice(choice);
        switch (choice) {
            case "LIST":
                displayToDoItemsHashMap();
                break;
            case "ADD":
                break;
            case "REMOVE":
                break;
            case "EDIT":
                break;
            case "HELP":
                break;
            case "EXIT":
                return;
            default:
                return;
        }
    }

    private void displayToDoItemsHashMap() {
        toDoItemsHashMap.forEach((k, v) -> System.out.println(k + " - " + v));
    }

    private int getDigitFromChoice(String choice) {
        if (choice.split(" ").length > 1) {
            return Integer.valueOf(choice.split(" ")[1]);
        }
        return -1;
    }

    private String getMenuInput(Scanner scanner) {
        displayTodoMenu();
        return getTodoMenuChoice(scanner);
    }

    private void displayTodoMenu() {
        System.out.println("● list");
        System.out.println("● add");
        System.out.println("● remove <number>");
        System.out.println("● edit <number>");
        System.out.println("● help");
        System.out.println("● exit");
    }

    private String getTodoMenuChoice(Scanner scanner) {
        System.out.println("Enter choice: ");
        return scanner.nextLine().toUpperCase();
    }
}
