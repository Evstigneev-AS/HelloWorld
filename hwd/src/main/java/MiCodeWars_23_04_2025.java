public class MiCodeWars_23_04_2025 {
    public static void main(String[] args) {
        String smash = smash(new String[]{"hello", "world", "this", "is", "great"});
        System.out.println("hello world this is great" + "=" + smash);
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        Object[] haystack3 = {1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,"needle",1,2,3,4,5,5,6,5,4,32,3,45,54};
        String needle = findNeedle(haystack1);
        String needle1= findNeedle(haystack3);
        System.out.println(needle+"="+"found the needle at position 3");
        System.out.println(needle1+"="+"found the needle at position 30");
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
    public static String findNeedle(Object[] haystack) {
        int id=0;
        try {
        for (Object o : haystack) {
            if (o==null){
                id=id+1;
                continue;
            }
            if(o.equals("needle")){
               return  "found the needle at position "+id;
            }
            id=id+1;
        }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return " ";
    }
}
//Kata 8
//https://www.codewars.com/kata/56676e8fabd2d1ff3000000c/train/java