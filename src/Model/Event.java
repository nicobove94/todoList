package Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event extends Task {
    private long numHours;
    private String location;

    public Event(String eventName, long numHours, String location, LocalDateTime startTime) {
        super(startTime, eventName);
        this.numHours = numHours;
        this.location = location;
    }

    @Override
    public String toString() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalDateTime endTime = super.getStartTime().plusHours(this.numHours);

        String formattedDate = super.getStartTime().format(dateFormatter);
        String formattedStartTime = super.getStartTime().format(timeFormatter);
        String formattedEndTime = endTime.format(timeFormatter);

        return "Model.Event: " + super.getName() +
                "\nDate: " + formattedDate +
                "\nTime Frame: " + formattedStartTime + " - " + formattedEndTime + "\n";
    }
}