import ru.netology.pyas.worker.OnTaskDoneListener;
import ru.netology.pyas.worker.OnTaskErrorListener;
import ru.netology.pyas.worker.Worker;

public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener doneListener = System.out::println;
        OnTaskErrorListener errorListener = message -> System.out.println("Error: " + message);

        Worker worker = new Worker(doneListener, errorListener);
        worker.doJob();
    }

}