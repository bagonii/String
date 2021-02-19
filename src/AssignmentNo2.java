import java.util.regex.*;

public class AssignmentNo2 {
    public static void main(String[] args) {
        String strArray = "Climb mountains not so the world can see you, but so you can see the world.";
        countWordsInSentence(strArray);
        System.out.println("Found word 'the' in the sentence:\t" + countSpecifiedWord(strArray, "\\b the\\b") + " times");
        System.out.println("Words with the letter 'S/s':\t" + consistsOfSpecifiedLetter(strArray, "[Ss]"));
        System.out.println("Words repeated in the sentence multiple times:");
        multipleWords(strArray);
        System.out.println(strArray.replaceAll("\\byou\\b", "You"));
    }

    public static void countWordsInSentence(String str) {
        String[] split = str.split(" ");
        System.out.println("Words in the sentence:\t" + split.length);
    }

    public static int countSpecifiedWord(String str, String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        int count = 0;
        while (m.find()) {
            count++;
        }
        return count;
    }

    public static int consistsOfSpecifiedLetter(String str, String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        int count = 0;
        while (m.find()) {
            count++;
        }
        return count;
    }

    public static void multipleWords(String str) {
        int counter;
        String[] split = str.split(" ");
        for (int i = 0; i < split.length; i++) {
            counter = 1;
            for (int j = i + 1; j < split.length; j++) {
                if (split[i].equals(split[j])) {
                    counter++;
                    split[j] = "0";
                }
            }
            if (counter > 1 && !split[i].equals("0"))
                System.out.println(split[i]);
        }
    }
}
