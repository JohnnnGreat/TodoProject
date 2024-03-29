package main;

import javax.swing.text.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Todo> todoList = new ArrayList<>();


    public static void main(String[] args) {
        ViewOptions();
    }

    static public void ViewOptions() {
        System.out.println("================CHOOSE AN OPTION=================");
        System.out.println("\t 1. Add a Todo \n\t 2. View all Todos \n\t 3. Delete a Todo");

        int option = scanner.nextInt();

        switch (option) {
            case 1:
                addTodo();
                break;
            case 2:
                viewTodos();
                break;
            case 3:
                deleteTodos();
                break;
            default:
                ViewOptions();
        }

    }

    ;

    static void addTodo() {
        scanner.nextLine();

        System.out.println("Enter your next todo \n");

        String todoString = scanner.nextLine();

        Todo todo = new Todo();
        todo.setTodo(todoString);

        todoList.add(todo);
        ViewOptions();
    }

    static void viewTodos() {
       /* for(Todo object: todoList){
            System.out.println(object);
        }*/

        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(i + ". " + todoList.get(i));
        }

        ViewOptions();
    }

    ;

    static void deleteTodos() {

        if(todoList.isEmpty()){
            System.out.println("Add a todo before delete");
            ViewOptions();
            return;
        }
        System.out.println("Enter Index of todo to delete");

        int indexToDelete = scanner.nextInt();


        if (indexToDelete >= 0) {
            if (indexToDelete < todoList.size()) {
                todoList.remove(indexToDelete);
                viewTodos();
            } else {
                System.out.println("Index is out of bound");
            }
            ;
        } else {
            System.out.println("index can not be less than zero");
        }
        ;
        ViewOptions();
    }

    ;
};