import java.util.sacanner;
// This is a class for the buttons that are used to set the difficulty level of a task.
// DifficultyB class extends DataB and provides methods to set and process difficulty levels.
public class DifficultyB extends DataB {
    private String name = null;
    private String difficultyInput = null;

    public DifficultyB(String name) {
        this.name = name;
    }

    public String Process(String receivedData) {
        return "Processed difficulty for " + this.name + " with info: " + receivedData;
    }
    /**
     * This method prompts the user to enter a difficulty level for the current object via the console,
     * reads the input, and returns the difficulty level.
     * If the input is invalid, it defaults to "Easy".
     *
     * @return The difficulty level as a String.
     */
    public String GetDifficulty(difficultyInput) {
        System.out.println("Please enter the difficulty level (Easy, Medium, Hard):");
        Scanner scanner = new Scanner(System.in);
        String difficultyInput = scanner.nextLine();
        
        if (difficultyInput.equalsIgnoreCase("Easy") || 
            difficultyInput.equalsIgnoreCase("Medium") || 
            difficultyInput.equalsIgnoreCase("Hard")) {
            return difficultyInput;
        } else {
            System.out.println("Invalid input. Defaulting to Easy.");
            return "Easy";
        }
    }
}