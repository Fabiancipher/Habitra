import java.util.Scanner;

// ModB class extends DataB and provides methods to modify and process a name.
// It allows setting a name, processing received data, and interactively updating the name.
public class ModB extends DataB {
    private String name = null;
    private NameB nameObj;
    public ModB(String name) {
       this.name = new NameB(name);
    }

    public String Process(String receivedData) {
        return "Modified " + this.name + " and info: " + receivedData;
    }

    /**
     * This method prompts the user to enter a new name for the current object via the console,
     * reads the input, and updates the object's name using the OverWrite method.
     * Displays a message indicating the modification process.
     * 
     * @return void
     */
    public void GetInfo() { 
        System.out.println("Modifying " + this.name + ". Please enter new name:");
        Scanner scanner = new Scanner(System.in);
        String newName = scanner.nextLine();
        OverWrite(newName);String result = OverWrite(newName);
    }
    /**
     * This method updates the name of the current object with the provided new name.
     * It returns the updated name as a String.
     *
     * @param newName The new name to set for the current object.
     * @return The updated name.
     */
    public String OverWrite(String newName) {
        this.name = newName;
        return this.name ;
    }
}