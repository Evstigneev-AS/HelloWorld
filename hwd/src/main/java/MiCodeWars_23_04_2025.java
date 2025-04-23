public class MiCodeWars_23_04_2025 {
    public static void main(String[] args) {
        String smash = smash(new String[]{"hello", "world", "this", "is", "great"});
        System.out.println("hello world this is great" + "=" + smash);
    }

    public static String smash(String... words) {
        // TODO Write your code below this comment please
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            stringBuilder.append(words[i]);
            if (i != words.length - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
//Kata 8