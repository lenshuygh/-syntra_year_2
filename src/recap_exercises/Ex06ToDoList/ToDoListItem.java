package recap_exercises.Ex06ToDoList;

public class ToDoListItem {
    private int id;
    private String itemDescription;
    private Priority priority;

    public ToDoListItem(int id, String itemDescription, Priority priority) {
        this.id = id;
        this.itemDescription = itemDescription;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return id + " - " + itemDescription + " - (" + priority + ')';
    }
}
