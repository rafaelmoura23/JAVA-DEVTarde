public class Task {
    // atributos
    private String description;
    private boolean done;

    // construtor(somente String description)
    public Task(String description) {
        this.description = description;
        this.done = false;

    }

    // set and Gets
    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
