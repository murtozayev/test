public class Main {
    public static void main(String[] args) {
        String s = "Hello World";
        String trimmed = s.trim();
        String[] strs = trimmed.split(" ");
        Integer lastWord = strs[strs.length - 1].length();
    }
}