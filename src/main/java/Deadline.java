/**
 * Represents a task that needs to be done before a specific date/time.
 *
 * @author felix-ong
 */
public class Deadline extends Task {
    /** Date/time of the deadline */
    protected String by;

    /**
     * Constructor of a Deadline Task.
     *
     * @param description
     */
    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    /**
     * Constructor of a Deadline Task.
     *
     * @param description
     */
    public Deadline(String description, String by, boolean isDone) {
        super(description);
        this.by = by;
        this.isDone = isDone;
    }

    /**
     * Returns a string representation of the task to be saved in.
     *
     * @return The string representation of the task.
     */
    @Override
    public String toSaveString() {
        return "D" + super.toSaveString() + String.format(",%s", this.by);
    }

    /**
     * Returns the string representation of a Deadline Task.
     *
     * @return The string representation of a Deadline Task.
     */
    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + this.by + ")";
    }
}
