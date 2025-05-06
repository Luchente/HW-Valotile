package main.java;

public class SameLetterChecker implements Runnable {
    private final String[] texts;

    public SameLetterChecker(String[] texts) {
        this.texts = texts;
    }

    @Override
    public void run() {
        for (String text : texts) {
            if (text.chars().allMatch(c -> c == text.charAt(0))) {
                BeautyCounters.countByLength(text);
            }
        }
    }
}
