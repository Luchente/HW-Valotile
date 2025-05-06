package main.java.beautyfulnickname.generator;

import java.util.Random;

public class NicknameGenerator {

    private static final Random random = new Random();

    public static String generateText(String letters, int length) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < length; i++) {
            text.append(letters.charAt(random.nextInt(letters.length())));
        }
        return text.toString();
    }

    public static String[] generateDataset(int count, String letters) {
        String[] texts = new String[count];
        for (int i = 0; i < count; i++) {
            int length = 3 + random.nextInt(3); // 3, 4, 5
            texts[i] = generateText(letters, length);
        }
        return texts;
    }
}
