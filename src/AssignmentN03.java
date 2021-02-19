import java.util.regex.*;

public class AssignmentN03 {

    public static void main(String[] args) {
        String name = "John";
        System.out.println(Pattern.matches("^[A-Z][a-z]+", name));
        String username = "s20Surname";
        System.out.println(Pattern.matches("[a-z][0-9]{2}[A-Z][a-z]+", username));
        String personCodeOfLatvian = "121200-11311";
        System.out.println(Pattern.matches("[0-9]{6}-[0-9]{5}", personCodeOfLatvian));
    }
}
