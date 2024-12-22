import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainGet {
    public static void main(String[] args) {
        String input = ".12, 34, .50, 80 .12";
        Pattern pattern = Pattern.compile("\\d+(?=.)");
        Pattern pattern1 = Pattern.compile("(?<=\\.)\\d+");
        Matcher matcher = pattern.matcher(input);
        Matcher matcher1 = pattern1.matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
    }
}
