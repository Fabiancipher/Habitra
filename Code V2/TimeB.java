import java.time.LocalDateTime;
import java.util.Scanner;
// This class is used to put the period of time in which the user wants to track their habits or tasks.
// It extends the DataB class and provides methods to process time information.
public class TimeB extends DataB {
    private String name ;
    private String timeInput ;

    public TimeB(String name) {
        this.name = name;
    }

    public String Process(String receivedData) {
        return "Processed time for " + this.name + " with info: " + receivedData;
    }
    /* * This method determines the current time in minutes based on the input type.
     * It returns the total minutes since the start of the day, week, month, or year.
     * If no valid input is provided, it defaults to "Daily".
     *  @param timeInput The type of time input (Daily, Weekly, Monthly, Yearly).
     * @return The total minutes since the start of the specified time period.
     */
    public Integer DetTime(String timeInput) {
        
        if (timeInput.equals("Daily")){
            LocalDateTime now = LocalDateTime.now();
            return now.getHour() * 60 + now.getMinute();
        } else if (timeInput.equals("Weekly")) {
            LocalDateTime now = LocalDateTime.now();
            return now.getDayOfWeek().getValue() * 24 * 60 + now.getHour() * 60 + now.getMinute();
        } else if (timeInput.equals("Monthly")) {
            LocalDateTime now = LocalDateTime.now();
            return now.getDayOfMonth() * 24 * 60 + now.getHour() * 60 + now.getMinute();
        } else if (timeInput.equals("Yearly")) {
            LocalDateTime now = LocalDateTime.now();
            return now.getDayOfYear() * 24 * 60 + now.getHour() * 60 + now.getMinute();
        } else {
            if (timeInput == null || timeInput.isEmpty()) {
                timeInput = "Daily"; 
            }
        }
       
    }
}