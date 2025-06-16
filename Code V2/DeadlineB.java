import java.time.LocalDateTime;
import java.util.scanner;
// This is a class for the buttoms that are used to set the deadline for a task.
// DeadlineB class extends DataB and provides methods to set and process deadlines.
public class DeadlineB extends DataB {
    private String name = null;
    private String timeInput = null;

    public TimeB(String name) {
        this.name = name;
    }

    public String Process(String receivedData) {
        return "Processed time for " + this.name + " with info: " + receivedData;
    }
    /**
     * This method prompts the user to enter a deadline in the format 'yyyy-mm-dd ',
     * reads the input, and returns the deadline as an integer representing seconds since epoch.
     * 
     * @param timeInput The input string for the deadline.
     * @return The deadline in seconds since epoch.
     */
    public Integer DetTime(String timeInput) {

        System.out.println("Please enter the deadline in the format 'yyyy-mm-dd ':");
        Scanner scanner = new Scanner(System.in);
        timeInput = scanner.nextLine();
       
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("yyyy-mm-dd ");
        LocalDateTime deadline = LocalDateTime.parse(timeInput, formatter);
        return (int) deadline.atZone(java.time.ZoneId.systemDefault()).toEpochSecond();
        
        }
       
    }
}