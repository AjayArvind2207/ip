package Panna;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 * Represents a deadline subtask. Each deadline subtask consists of a
 * String input for the task and a LocalDate value which represents the deadline.
 */
public class Deadline extends Task{
    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM dd yyyy");

    /**
     * Constructor method for Deadline.
     * @param input
     * @param dt
     */
    public Deadline(String input, LocalDate dt) {
        super(input, dt);

    }


    /**
     * This method gives the output specific to each Deadline object
     * @return String representation of Deadline object
     */
    @Override
    public String toString() {
        return super.toString() + " (By: " + this.getDeadline().format(df) + ")";
    }
}
