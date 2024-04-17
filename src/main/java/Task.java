public class Task {
    String taskName;
    Boolean isComplete = false;

    public String getTaskName() {
        return taskName;
    }

    public Boolean getComplete() {
        return isComplete;
    }

    public void setComplete(Boolean complete) {
        isComplete = complete;
    }

    public Task(String taskName, Boolean isComplete) {
        this.taskName = taskName;
        this.isComplete = false;
    }

    public Task(){}
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}
