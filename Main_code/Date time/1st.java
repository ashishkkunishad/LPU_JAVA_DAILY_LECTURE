import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

class lpu{
    public static void main(String[] args) {
        // LocalDate ld=LocalDate.now();
        // System.out.println("Local date: "+ld);
        // LocalTime lt=LocalTime.now();
        // System.out.println("Local Time: "+lt);
        // System.out.println("Local date and time: "+LocalDateTime.now());
        // System.out.println("Before formating: "+LocalDateTime.now());
         LocalDateTime defaultDateTime=LocalDateTime.now();
        // DateTimeFormatter customFormatDateTime= DateTimeFormatter.ofPattern("dd/MM/yyyy / E");
        // String formattedDate= defaultDateTime.format(customFormatDateTime);
        //System.out.println("After formating: "+formattedDate);

        // LocalDateTime ldt=LocalDateTime.of(2019, 11, 1, 4, 10, 30);//giving any date time
        // System.out.println("ldt: "+ldt);
        // String new1=defaultDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
        // System.out.println(new1);
        LocalDateTime ldt=LocalDateTime.of(2019, 11, 1, 4, 10, 30);
        System.out.println(ldt.get(ChronoField.DAY_OF_MONTH));
       // ldt.plusDays(0)


    }
}