package Model;

import java.util.ArrayList;
public class Schedule {
    private ArrayList<Task> taskList;
    public Schedule() {
        this.taskList = new ArrayList<>();
    }

    public void addTask(Task task) {
        this.taskList.add(task);
    }

    @Override
    public String toString() {
        System.out.println("Tasks:\n");
        String printString = "";
        for (Task t : this.taskList) {
            printString += t + "\n";

        }
        return printString;
    }
}