package Practice;

import java.time.LocalDateTime;

public class dateTime {
    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();

        System.out.printf("%tB/%td/%tY %tI:%tM:%tS %Tp\n", date, date, date, date, date, date, date);
    }
}
