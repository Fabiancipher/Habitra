import java.util.Scanner;
// This is a class for the buttons that are used to set a name for a task or item.
// NameB class extends DataB and provides methods to set and process names.
public class NameB extends DataB {
    private String name = null;

    public NameB(String name) {
        this.name = name;
    }

    public String Process(String receivedData) {
        return "Processed name for " + this.name + " with info: " + receivedData;
    }
    /**
     * This method prompts the user to enter a name for the current object via the console,
     * reads the input, and returns the name.
     * 
     * @return The name as a String.
     */
    public String GetName() {
        System.out.println("Please enter the name:");
        try (Scanner scanner = new Scanner(System.in)) {
            this.name = scanner.nextLine();
        }
        return this.name;
    }
}