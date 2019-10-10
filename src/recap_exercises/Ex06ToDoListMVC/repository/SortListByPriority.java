package recap_exercises.Ex06ToDoListMVC.repository;

import recap_exercises.Ex06ToDoListMVC.model.ToDoListItem;

import java.util.Comparator;

public class SortListByPriority implements Comparator<ToDoListItem> {
    @Override
    public int compare(ToDoListItem item1,ToDoListItem item2){
        return item2.getPriority().compareTo(item1.getPriority());
    }
}
