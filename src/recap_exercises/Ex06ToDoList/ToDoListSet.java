package recap_exercises.Ex06ToDoList;

import java.util.*;

public class ToDoListSet {

    private static Collection<ToDoListItem> toDoListItemCollection;
    static {
        if(Objects.isNull(toDoListItemCollection)){
            toDoListItemCollection = new HashSet<>();
        }
    }


    public static Collection<ToDoListItem> getToDoListSet() {
/*        if(Objects.isNull(toDoListItemCollection)){
            toDoListItemCollection = new HashSet<>();
        }*/
        return toDoListItemCollection;
    }

    public static boolean isDescriptionPresent(String description) {
        Optional<ToDoListItem> foundToDoListItem = toDoListItemCollection.stream().filter(s -> s.getItemDescription().equals(description)).findFirst();
        return foundToDoListItem.isPresent();
    }

    public static void addToDoItem(String description, Priority priority) {
        OptionalInt idOptionalInt = toDoListItemCollection.stream().mapToInt(ToDoListItem::getId).max();
        int id = 1;
        if (idOptionalInt.isPresent()) {
            id += idOptionalInt.getAsInt();
        }
        toDoListItemCollection.add(new ToDoListItem(id, description, priority));
    }

    public static boolean isIdPresent(int id) {
        return toDoListItemCollection.stream().anyMatch(s -> s.getId() == id);
    }

    public static void removeToDoItemById(int todoIdToRemove) {
        toDoListItemCollection.remove(getToDoItemById(todoIdToRemove));
    }

    public static ToDoListItem getToDoItemById(int toDoItemId) {
        Optional<ToDoListItem> foundToDoListItem = toDoListItemCollection.stream().filter(s -> s.getId() == toDoItemId).findFirst();
        return foundToDoListItem.get();
    }

    public static void replaceItem(int todoIdToReplace, String description, Priority priority) {
        toDoListItemCollection.remove(getToDoItemById(todoIdToReplace));
        toDoListItemCollection.add(new ToDoListItem(todoIdToReplace, description, priority));
    }
}
