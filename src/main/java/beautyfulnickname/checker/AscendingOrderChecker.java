package main.java.beautyfulnickname.checker;

public class AscendingOrderChecker implements BeautifulNicknameChecker {
    @Override
    public boolean isBeautiful(String word) {
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) < word.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }
}
