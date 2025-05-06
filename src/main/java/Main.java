package main.java;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] texts = NicknameGenerator.generateNicknames();

        Thread palindromeThread = new Thread(new PalindromeChecker(texts));
        Thread sameLetterThread = new Thread(new SameLetterChecker(texts));
        Thread ascendingThread = new Thread(new AscendingChecker(texts));

        palindromeThread.start();
        sameLetterThread.start();
        ascendingThread.start();

        palindromeThread.join();
        sameLetterThread.join();
        ascendingThread.join();

        System.out.println("Красивых слов с длиной 3: " + BeautyCounters.count3.get() + " шт");
        System.out.println("Красивых слов с длиной 4: " + BeautyCounters.count4.get() + " шт");
        System.out.println("Красивых слов с длиной 5: " + BeautyCounters.count5.get() + " шт");
    }
}

