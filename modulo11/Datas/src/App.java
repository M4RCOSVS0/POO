import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {

        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");//iso8601
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");//iso8601
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");//iso8601

        LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d09 = LocalDateTime.parse("20/07/2023 01:30", fm2);

        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20,1,30);

        System.out.println("d01 = " + d01.toString()); //implicitamente esta chamando o toString
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03); //data hora GNT
        System.out.println("d04 = " + d04); 
        System.out.println("d05 = " + d05); 
        System.out.println("d06 = " + d06); 
        System.out.println("d07 = " + d07); 
        System.out.println("d08 = " + d08); 
        System.out.println("d09 = " + d09); 
        System.out.println("d10 = " + d10); 
        System.out.println("d11 = " + d11); 
    }
}
