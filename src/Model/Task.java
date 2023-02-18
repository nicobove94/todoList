package Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Task {
    private LocalDateTime startTime;
    private LocalDateTime startDate;
    private String name;

    public Task(LocalDateTime startTime, String name) {
        this.startTime = startTime;
        this.name = name;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getName() {
        return name;
    }

    public void setTime(LocalDateTime time) {
        this.startTime = time;
    }
}