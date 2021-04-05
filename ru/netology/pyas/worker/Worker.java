package ru.netology.pyas.worker;

public class Worker {

    private OnTaskDoneListener taskDoneListener;

    public Worker(OnTaskDoneListener taskDoneListener) {
        this.taskDoneListener = taskDoneListener;
    }

    public void doJob() {
        for (int i = 1; i <= 25; ++i) {
            System.out.println("Task " + i + " is starting");
            taskDoneListener.onDone("Task " + i + " is done");
        }
    }
}
