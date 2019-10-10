package recap_exercises.Ex06ToDoListMVC.service;

public interface ToDoListService {
    void getAllItems();

    void addSingleItem();

    void removeSingleItem(int todoIdToRemove);

    void replaceSingleItem(int todoIdToReplace);
}
