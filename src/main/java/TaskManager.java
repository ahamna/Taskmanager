import java.util.ArrayList;

public class TaskManager {

    ArrayList<Task> taskList = new ArrayList<Task>();

    public void addTask(Task task){
        taskList.add(task);
    }

    public void showAllTasks(){
        for(int i=0; i<taskList.size();i++){
            System.out.println("Index: "+i+" "+taskList.get(i).getTaskName());
        }
    }

    public void markTaskComplete(Integer taskNumber) {


        Task task = taskList.get(taskNumber);
        task.setComplete(true);

    }
}
