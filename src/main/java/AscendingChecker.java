package main.java;

public class AscendingChecker implements Runnable {
    private final String[] texts;

    public AscendingChecker(String[] texts) {
        this.texts = texts;
    }

    @Override
    public void run() {
        for (String text : texts) {
            if (isAscending(text)) {
                BeautyCounters.countByLength(text);
            }
        }
    }

    private boolean isAscending(String text) {
        char[] chars = text.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] < chars[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
