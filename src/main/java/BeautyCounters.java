package main.java;
import java.util.concurrent.atomic.AtomicInteger;

public class BeautyCounters {
    public static AtomicInteger count3 = new AtomicInteger();
    public static AtomicInteger count4 = new AtomicInteger();
    public static AtomicInteger count5 = new AtomicInteger();

    public static void countByLength(String word) {
        switch (word.length()) {
            case 3 -> count3.incrementAndGet();
            case 4 -> count4.incrementAndGet();
            case 5 -> count5.incrementAndGet();
        }
    }
}