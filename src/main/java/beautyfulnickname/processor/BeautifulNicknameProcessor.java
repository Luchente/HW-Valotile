package main.java.beautyfulnickname.processor;

import main.java.beautyfulnickname.checker.BeautifulNicknameChecker;
import main.java.beautyfulnickname.util.Counter;

public class BeautifulNicknameProcessor extends Thread {

    private final String[] texts;
    private final BeautifulNicknameChecker checker;
    private final Counter counter;

    public BeautifulNicknameProcessor (String[] texts, BeautifulNicknameChecker checker, Counter counter) {
        this.texts = texts;
        this.checker = checker;
        this.counter = counter;
    }

    @Override
    public void run() {
        for (String word : texts) {
            if (checker.isBeautiful(word)) {
                counter.increment(word.length());
            }
        }
    }
}
