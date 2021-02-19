import java.util.Arrays;

public class AssignmentNo1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(strArray));
        countStartsEndsWith();
        countLength();
        countConsists();
        System.out.println("Histogram:");
        histogram();
    }

    public static String[] strArray = new String[]{"Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination"};

    public static void countStartsEndsWith() {
        int counter1 = 0;
        int counter2 = 0;
        for (String str : strArray) {
            if (str.charAt(0) == 'C') {
                counter1++;
            }
            if (str.charAt(str.length() - 1) == 'e') {
                counter2++;
            }
        }
        System.out.format("Words starting with 'C': %d \t Words ending with 'e': %d", counter1, counter2);
    }

    public static void countLength() {
        int counter = 0;
        for (String str : strArray)
            if (str.length() == 5) {
                counter++;
            }
        System.out.format("\nWords with length 5 letters: %d", counter);
    }

    public static void countConsists() {
        int counter = 0;
        boolean subString = false;
        for (String str : strArray) {
            if (str.contains("e")) {
                counter++;
            }
            if (str.contains("te")) {
                subString = true;
            }
        }
        System.out.format("\nWords consist of the character 'e': %d", counter);
        System.out.println("\nThere is word consisting of the subString 'te'? : " + subString);
    }

    public static void histogram() {
        int[] newArray = new int[14];
        for (int i = 0; i < newArray.length; i++) {
            int counter = 0;
            for (String str : strArray) {
                if (i == str.length()) {
                    counter++;
                }
            }
            newArray[i] = counter;
            if (counter != 0) {
                System.out.println(newArray[i] + " values are with length  " + i);
            }
        }
    }
}

