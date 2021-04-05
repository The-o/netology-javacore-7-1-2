import ru.netology.pyas.worker.OnTaskDoneListener;
import ru.netology.pyas.worker.Worker;

public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;

        Worker worker = new Worker(listener);
        worker.doJob();
    }

}