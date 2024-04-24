package lesson38;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lesson38 {
    public static void main(String[] args) {
//        Thread t1 = new Thread(new RunnableClass());
//        Thread t2 = new Thread(new RunnableClass());
//        Thread t3 = new Thread(new RunnableClass());
//        t1.start();
//        t2.start();
//        t3.start();
        System.out.println("======================================");

        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        new Thread(() -> {
            while (true) {
                if (!queue.isEmpty()){
                    String order = queue.poll();
                    System.out.println("Get oder '" + order + "' from queue.");
                    sleep(3 * 1000);
                    System.out.println("Order '" + order + "' complete.");
                } else {
                    sleep(3 * 1000);
                  }
            }
        }).start();
        while (true) {
            System.out.println("Add order: ");
            queue.add(scanner.next());
        }
    }

    static void sleep (long ms) {
        try {
            Thread.sleep(3 * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
