import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(dayOfWeek("Tue", 6));

    }

    public static String dayOfWeek(String day, int numberOfDays) {

        String[] strDays = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int startNumber = Arrays.asList(strDays).indexOf(day);

        int counter = startNumber;

        for (int i = 0; i <= numberOfDays; i++) {

            if (counter == 6) {
                counter = 0;
            } else {
                counter = counter + 1;
            }
        }
        if (counter == 0) {
            return strDays[6];
        }
        return strDays[counter - 1];
    }
}
