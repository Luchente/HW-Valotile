package main.java.beautyfulnickname;

import main.java.beautyfulnickname.checker.AscendingOrderChecker;
import main.java.beautyfulnickname.checker.PalindromeCheker;
import main.java.beautyfulnickname.checker.SameLetterChecker;
import main.java.beautyfulnickname.generator.NicknameGenerator;
import main.java.beautyfulnickname.processor.BeautifulNicknameProcessor;
import main.java.beautyfulnickname.util.Counter;

public class Main {
    public static void main(String[] args) {

        // Генерация 100_000 случайных слов длиной 3-5 из символов 'a', 'b', 'c'
        String[] words = NicknameGenerator.generateDataset(100_000, "abc");

        // Общий потокобезопасный счётчик
        Counter counter = new Counter();

        // Создание трёх потоков для каждого критерия "красоты"
        Thread palindromeThread = new BeautifulNicknameProcessor(words, new PalindromeCheker(), counter);
        Thread sameLetterThread = new BeautifulNicknameProcessor(words, new SameLetterChecker(), counter);
        Thread ascendingOrderThread = new BeautifulNicknameProcessor(words, new AscendingOrderChecker(), counter);

        // Запуск всех потоков
        palindromeThread.start();
        sameLetterThread.start();
        ascendingOrderThread.start();

        // Ожидание завершения потоков
        try {
            palindromeThread.join();
            sameLetterThread.join();
            ascendingOrderThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Вывод результатов
        System.out.printf("Красивых слов с длиной 3: %d шт%n", counter.getCount(3));
        System.out.printf("Красивых слов с длиной 4: %d шт%n", counter.getCount(4));
        System.out.printf("Красивых слов с длиной 5: %d шт%n", counter.getCount(5));
    }
}