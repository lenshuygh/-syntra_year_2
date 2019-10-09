package recap_exercises.Ex06ToDoList;

import java.util.Scanner;

public class ToDoListServiceImpl implements ToDoListService {
    private static Scanner scanner;

    public ToDoListServiceImpl() {
        scanner = new Scanner(System.in);
    }

    public ToDoListServiceImpl getToDoServiceImpl(){
        return this;
    }

    @Override
    public void getAllItems() {
        if(ToDoListSet.getToDoListSet().isEmpty()){
            ToDoListSet.getToDoListSet().forEach(System.out::println);
        }
        System.out.println("You have no todo's!");
    }

    @Override
    public void addSingleItem() {
        System.out.print("Enter a Todo description: ");
        String description = scanner.nextLine();
        //System.out.print("Enter a priority");
        Priority priority = Priority.NORMAL;
        if(!ToDoListSet.isDescriptionPresent(description)) {
            ToDoListSet.addToDoItem(description,priority);
        }
    }

    @Override
    public void removeSingleItem(int todoIdToRemove) {
        if(ToDoListSet.isIdPresent(todoIdToRemove)){
            ToDoListSet.removeToDoItemById(todoIdToRemove);
        }
        getAllItems();
    }

    @Override
    public void replaceSingleItem(int todoIdToReplace) {
        if(ToDoListSet.isIdPresent(todoIdToReplace)){
            System.out.print("Enter new description: ");
            String description = scanner.nextLine();
            ToDoListSet.replaceItem(todoIdToReplace,description,Priority.NORMAL);
        }
    }
}
