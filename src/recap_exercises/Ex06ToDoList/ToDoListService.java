package recap_exercises.Ex06ToDoList;

public interface ToDoListService {
    void getAllItems();

    void addSingleItem();

    void removeSingleItem(int todoIdToRemove);

    void replaceSingleItem(int todoIdToReplace);
}
