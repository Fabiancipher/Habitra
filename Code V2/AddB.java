//*This is a class for the buttons that are used to add a new item(habit , bad habit or task) */
//Add buttons inherit from the DataB class
import java.util.Scanner;
import mypackage.NameB;

public class AddB extends DataB {
    private String name = null;

    public AddB(String name) {
        this.name = new NameB(name);
    }

    public String Process(String receivedData) {
        return "Added " + this.name + " and info: " + receivedData;
    }
    /**
     * This method prompts the user to enter a new name for the current object via the console,
     * reads the input, and updates the object's name using the OverWrite method.
     * Displays a message indicating the modification process.
     * * @return void
     * */
    public void GetInfo() {Scanner scanner = new Scanner(System.in);
        System.out.println("Enter info for " + nameText + ":");
        String input = scanner.nextLine();
        System.out.println(process(input));
    }
        
        public String OverWrite(String newName) {
        this.name = newName;
        return this.name;
    }
}