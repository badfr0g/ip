package duke.dukeTask;

public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "[\u2718]" : "[ ]"); //return tick or X symbols
    }

    public String toString(){
        return getStatusIcon() + description;
    }

    public void markAsDone() {
        isDone = true;
    }
}
