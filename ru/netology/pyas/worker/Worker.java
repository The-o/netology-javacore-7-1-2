package ru.netology.pyas.worker;

public class Worker {

    private OnTaskDoneListener taskDoneListener;
    private OnTaskErrorListener taskErrorListener;

    public Worker(OnTaskDoneListener taskDoneListener, OnTaskErrorListener taskErrorListener) {
        this.taskDoneListener = taskDoneListener;
        this.taskErrorListener = taskErrorListener;
    }

    public void doJob() {
        for (int i = 1; i <= 35; ++i) {
            System.out.println("Task " + i + " is starting");

            if (i == 33) {
                taskErrorListener.onError("Task " + i + " failed");
                continue;
            }

            taskDoneListener.onDone("Task " + i + " is done");
        }
    }
}
