package Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Assignment extends Task {
    private String course;

    public Assignment(String course, LocalDateTime dueDate, String assignmentName) {
        super(dueDate, assignmentName);
        this.course = course;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a");
        String formattedDateTime = super.getStartTime().format(formatter);
        return "Model.Assignment: " + super.getName() +
                "\nCourse: " + course +
                "\nDue date: " + formattedDateTime + "\n";
    }
}