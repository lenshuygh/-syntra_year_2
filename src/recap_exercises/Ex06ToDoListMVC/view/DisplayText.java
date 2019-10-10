package recap_exercises.Ex06ToDoListMVC.view;

import recap_exercises.Ex06ToDoListMVC.model.ToDoListItem;

public class DisplayText {
    public static void displayMainToDoListMenu() {
        System.out.println("● list");
        System.out.println("● add");
        System.out.println("● remove <number>");
        System.out.println("● edit <number>");
        System.out.println("● help");
        System.out.println("● exit");
        System.out.println("-----------------");
        System.out.print("Enter the action: ");
    }

    public static void displayItem(ToDoListItem toDoListItem){
        System.out.println(toDoListItem);
    }

    public static void displayNoItems(){
        System.out.println("You have no todo's!");
    }

    public static void askDescription(){
        System.out.print("Enter new description: ");
    }

    public static void askPriority(){
        System.out.print("Enter a priority: ");
    }

    public static void toDoIdNotFound() {
        System.out.println("Requested id not found.");
    }
}
