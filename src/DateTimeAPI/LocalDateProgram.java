package DateTimeAPI;
import java.time.*;

public class LocalDateProgram {
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();//No Constructor in the LocalDate class
        System.out.println(date);

        int day=date.getDayOfMonth();
        int month=date.getMonthValue();
        int year=date.getYear();

        System.out.println(day+"/"+month+"/"+year);

    }
}
