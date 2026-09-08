import java.util.concurrent.*;

public class Conccarenccy {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<Integer> task1 = () -> {
            Thread.sleep(1000);
            return 42;
        };

        Callable<Integer> task2 = () -> {
            Thread.sleep(500);
            return 99;
        };

        Callable<Integer> task3 = () -> {
            Thread.sleep(700);
            return 7;
        };

        Future<Integer> f1 = executor.submit(task1);
        Future<Integer> f2 = executor.submit(task2);
        Future<Integer> f3 = executor.submit(task3);

        System.out.println("Task1 result: " + f1.get());
        System.out.println("Task2 result: " + f2.get());
        System.out.println("Task3 result: " + f3.get());

        executor.shutdown();
    }
}
