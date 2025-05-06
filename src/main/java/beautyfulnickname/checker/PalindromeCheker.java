package main.java.beautyfulnickname.checker;

public class PalindromeCheker implements BeautifulNicknameChecker {
    @Override
    public boolean isBeautiful(String word) {
        return new StringBuilder(word).reverse().toString().equals(word);
    }
}
