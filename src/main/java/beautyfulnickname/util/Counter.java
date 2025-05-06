package main.java.beautyfulnickname.util;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    public final AtomicInteger count3 = new AtomicInteger();
    public final AtomicInteger count4 = new AtomicInteger();
    public final AtomicInteger count5 = new AtomicInteger();

    public void increment(int length) {
        switch (length) {
            case 3 -> count3.incrementAndGet();
            case 4 -> count4.incrementAndGet();
            case 5 -> count5.incrementAndGet();
        }
    }

    public int getCount(int length) {
        return switch (length) {
            case 3 -> count3.get();
            case 4 -> count4.get();
            case 5 -> count5.get();
            default -> 0;
        };
    }
}