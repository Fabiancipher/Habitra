/**
 * This class displays the main menu.
 * It displays all habits.
 */
import java.util.*;
public class MainScreen implements Screen {
    private List<Item> Items = null;
    public void DisplayInfo(){
        if(this.Items.isEmpty()){
            System.out.println("There are no habits or tasks!");
            return;
        }
        for(Item item:this.Items){
            System.out.println(Item.toString());
        }
    }
}