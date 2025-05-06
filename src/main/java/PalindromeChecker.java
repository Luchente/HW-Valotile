package main.java;

public class PalindromeChecker implements Runnable {
    private final String[] texts;

    public PalindromeChecker(String[] texts) {
        this.texts = texts;
    }

    @Override
    public void run() {
        for (String text : texts) {
            if (isPalindrome(text)) {
                BeautyCounters.countByLength(text);
            }
        }
    }

    private boolean isPalindrome(String text) {
        return new StringBuilder(text).reverse().toString().equals(text);
    }
}
