package main.java.beautyfulnickname.checker;

public class SameLetterChecker implements BeautifulNicknameChecker {
    @Override
    public boolean isBeautiful(String word) {
        char first = word.charAt(0);
        for (char c : word.toCharArray()) {
            if (c != first) return false;
        }
        return true;
    }
}
