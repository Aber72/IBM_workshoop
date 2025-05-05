
package ibm_project.stringpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {

    public static void main(String[] args) {
        
       
        ExecutorService executor = Executors.newFixedThreadPool(4);

       
        for (int i = 0; i < 10; i++) {
            
            executor.submit(new Task(i));
        }

       
        executor.shutdown();
    }
}

class Task implements Runnable {
    private int id;

    public Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Task " + id + " is being executed by thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
