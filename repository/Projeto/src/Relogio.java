import java.util.*;
import java.text.*;

public class Relogio {

    public static void main(String[] args) {
        while (true) {
            Date date = new Date();
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            String formattedDate = dateFormat.format(date);
            System.out.println("Hora atual: " + formattedDate);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}