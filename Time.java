package rami;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Time {
     void Time(){
    
       String time = LocalTime.now().toString().substring(0, 8);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH  :mm  :ss a");
                time = LocalTime.parse(time).format(formatter);
    }

}
