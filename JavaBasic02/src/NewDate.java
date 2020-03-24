import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjuster;

public class NewDate {
    public static void main(String[] args) {
        LocalDate baseDate = LocalDate.of(2018, 5, 26);
        LocalTime baseTime = LocalTime.of(22,30);

        System.out.println(baseTime); // 00:00

        System.out.println(
                baseDate.plusDays(99)
        .plusMonths(2)
        .minusDays(2)); // 0000-00-00

    }
}
