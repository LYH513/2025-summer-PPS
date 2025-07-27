package week6;

public class A115 {
    public int maxNumberOfBalloons(String text) {
        int[] counts = new int[26];
        for (char c : text.toCharArray()) {
            counts[c - 'a']++;
        }
        counts['l' - 'a'] /= 2;
        counts['o' - 'a'] /= 2;

        return Math.min(
                Math.min(
                        Math.min(counts['b' - 'a'], counts['a' - 'a']),
                        Math.min(counts['l' - 'a'], counts['o' - 'a'])
                ),
                counts['n' - 'a']
        );
    }
}
