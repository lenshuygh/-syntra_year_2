package recap_exercises.Ex06ToDoList;

import java.util.*;

public class Ex06ToDoList {
    private static Map<Integer, String> toDoItemsHashMap = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        fillMap();
        new Ex06ToDoList();
    }

    public Ex06ToDoList() {
        while (true) {
            evaluateEnteredChoice(getMenuInput());
        }
    }

    private static void fillMap() {
        toDoItemsHashMap.put(1, "item 1");
        toDoItemsHashMap.put(2, "item 2");
        toDoItemsHashMap.put(3, "item 3");
        toDoItemsHashMap.put(4, "item 4");
    }

    private void evaluateEnteredChoice(String choice) {
        int itemNumber = getDigitFromChoice(choice);
        if (itemNumber != -1) {
            choice = choice.split(" ")[0];
        }
        switch (choice) {
            case "LIST":
                displayToDoItemsHashMap();
                break;
            case "ADD":
                addToDoItem();
                break;
            case "REMOVE":
                removeToDoItem(itemNumber);
                break;
            case "EDIT":
                editToDoItem(itemNumber);
                break;
            case "HELP":
                break;
            case "EXIT":
                System.exit(0);
            default:
                return;
        }
    }


    private int getDigitFromChoice(String choice) {
        if (choice.split(" ").length > 1) {
            return Integer.valueOf(choice.split(" ")[1]);
        }
        return -1;
    }

    private void displayToDoItemsHashMap() {
        System.out.println("---- TODO LIST ------");
        toDoItemsHashMap.forEach((k, v) -> System.out.println(k + " - " + v));
        System.out.println("---------------------");
    }

    private void addToDoItem() {
        OptionalInt nextKey = toDoItemsHashMap.keySet().stream().mapToInt(i -> i).max();
        System.out.print("Enter the todo item to add: ");
        if (nextKey.isPresent()) {
            toDoItemsHashMap.put(nextKey.getAsInt() + 1, scanner.nextLine());
        } else {
            toDoItemsHashMap.put(1, scanner.nextLine());
        }
    }

    private void removeToDoItem(int itemNumber) {
        System.out.println(("itemNumber -> " + itemNumber));
        if (toDoItemsHashMap.containsKey(itemNumber)) {
            toDoItemsHashMap.remove(itemNumber);
        }
    }

    private void editToDoItem(int itemNumber) {
        if (toDoItemsHashMap.containsKey(itemNumber)) {
            displayItem(itemNumber);
            System.out.print("Enter new to do item: ");
            replaceToDoItem(itemNumber, scanner.nextLine());
        }

    }

    private void displayItem(int itemNumber) {
        System.out.println(itemNumber + " - " + toDoItemsHashMap.get(itemNumber));
    }

    private void replaceToDoItem(int itemNumber, String newToDoItem) {
        toDoItemsHashMap.replace(itemNumber, newToDoItem);
    }

    private String getMenuInput() {
        displayTodoMenu();
        return getTodoMenuChoice();
    }

    private void displayTodoMenu() {
        System.out.println("● list");
        System.out.println("● add");
        System.out.println("● remove <number>");
        System.out.println("● edit <number>");
        System.out.println("● help");
        System.out.println("● exit");
    }

    private String getTodoMenuChoice() {
        System.out.print("Enter choice: ");
        return scanner.nextLine().toUpperCase();
    }
}
