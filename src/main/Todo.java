package main;

public class Todo {

    private String todo;
    private boolean isCompleted = false;


    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return "Todo: "+todo+ "\n"+"Completed "+isCompleted;
    }
}
