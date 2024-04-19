import com.google.gson.Gson;
import okhttp3.*;

import java.io.IOException;
import java.util.Scanner;

public class Application {

    static boolean inputAllowed = true;
    static String input = "";

    static TaskManager  taskManager = new TaskManager();
    public static void main1(String args[]){

        while(inputAllowed){
            System.out.println("Enter EXIT to Quit Application\nEnter ADD to add new Task \nEnter SHOW to show all tasks");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
            switch (input)
            {
                case "EXIT" -> {inputAllowed = false; return;}
                case "ADD" -> {
                    System.out.println("Enter task name");
                    String taskName = scanner.nextLine();
                    Task task = new Task(taskName, false);
                    taskManager.addTask(task);
                }
                case "SHOW" -> {
                    taskManager.showAllTasks();
                }
                case "COMPLETE" ->{
                    System.out.println("Enter task numner to Mark Complete");
                    taskManager.showAllTasks();
                    Integer taskNumber = scanner.nextInt();
                    taskManager.markTaskComplete(taskNumber);
                }
            }



        }

    }

    public static void main(String args[]){
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://swapi.dev/api/planets/6/")
                .build();
        Call call= okHttpClient.newCall(request);
        Gson gson = new Gson();
        try {
            Response response = call.execute();
            Planet planet =  gson.fromJson(response.body().charStream(), Planet.class);
            System.out.println(planet);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
