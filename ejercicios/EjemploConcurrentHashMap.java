import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EjemploConcurrentHashMap {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                String key = "Key" + (i % 10);
                map.compute(key, (k, v) -> (v == null) ? 1 : v + 1);
            }
        };

        for (int i = 0; i < 3; i++) {
            executorService.submit(task);
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("Resultados finales:");
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}