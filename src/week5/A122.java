package week5;

public class A122 {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        String doubled = s + s;
        return doubled.contains(goal);
    }
}
