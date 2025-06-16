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

    public void GetInfo() {
        
    }

    public Boolean IsBadHabit(){

    }
}