package recap_exercises.Ex06ToDoList;

import java.util.Scanner;

public class ToDoListApp {
    private static Scanner scanner;
    private static ToDoListServiceImpl toDoListService;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        toDoListService = new ToDoListServiceImpl();
        new ToDoListApp();
    }

    public ToDoListApp() {
        while (true) {
            displayMainToDoListMenu();
            getMenuChoice();
        }
    }

    private void getMenuChoice() {
        String choice = scanner.nextLine().toUpperCase();
        int itemNumber = getDigitFromChoice(choice);
        if (itemNumber != -1) {
            choice = choice.split(" ")[0];
        }
        switch (choice) {
            case "LIST":
                toDoListService.getAllItems();
                break;
            case "ADD":
                toDoListService.addSingleItem();
                break;
            case "REMOVE":
                toDoListService.removeSingleItem(itemNumber);
                break;
            case "EDIT":
                toDoListService.replaceSingleItem(itemNumber);
                break;
            case "HELP":
                break;
            case "EXIT":
                System.exit(0);
                scanner.close();
        }
    }

    private void displayMainToDoListMenu() {
        System.out.println("● list");
        System.out.println("● add");
        System.out.println("● remove <number>");
        System.out.println("● edit <number>");
        System.out.println("● help");
        System.out.println("● exit");
        System.out.println("-----------------");
        System.out.print("Enter the action: ");
    }

    private int getDigitFromChoice(String choice) {
        if (choice.split(" ").length > 1) {
            return Integer.valueOf(choice.split(" ")[1]);
        }
        return -1;
    }
}
