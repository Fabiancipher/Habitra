import javax.swing.*;
import java.awt.*;
import Item;

public class App{
    //Declares objects as attributes, this helps to simply initiate them instead of declaring them every time we want one of these
    public static JPanel panel, newPanel;
    public static JFrame frame;
    public static JButton addH, addT, addB, back;
    public static void main(String[] args) {
        startFrame();
        startButtons();
        
        panel.setLayout(null);
        panel.add(addH);
        panel.add(addT);
        panel.add(addB);

        panel.setBackground(Color.decode("#472287"));


    }
    /**Redirects to the corresponfing panel */
    private static void event(int id){
        panel.setVisible(false);
        newPanel = new JPanel();
        newPanel.setBounds(-400, 0, 1920, 1080);
        switch (id) {
            case 1:
                newPanel.setBackground(Color.decode("#911bcc"));
                break;
            case 2:
                newPanel.setBackground(Color.decode("#8c1176"));
                break;
            case 3:
                newPanel.setBackground(Color.decode("#2c118c"));
                break;
            default:
                newPanel.setBackground(Color.RED);
                break;
        }
        
        newPanel.setVisible(true);
        newPanel.setLayout(null);
        frame.add(newPanel);
        //Creates a button that goes back to the main panel
        back= new JButton("Back");
        back.setBounds(1400, 20, 100, 60);
        back.addActionListener(e->{
            newPanel.setVisible(false);
            panel.setVisible(true);
        });

        newPanel.add(back);

        frame.revalidate();
        frame.repaint();
    }
    /**Starts the frame with a panel */
    private static void startFrame(){
        frame = new JFrame("Habitra");
        panel = new JPanel();
        frame.setSize(1920,1080);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
    }
    /**Starts the buttons */
    private static void startButtons(){
        addH= new JButton("AddHabit");
        addH.setBounds(30, 500, 100, 60);
        addH.addActionListener(e -> {
            event(1);
        });
        
        addT= new JButton("AddTask");
        addT.setBounds(30, 600, 100, 60);
        addT.addActionListener(e -> {
            event(2);
        });

        addB= new JButton("AddBadHabit");
        addB.setBounds(30, 700, 130, 60);
        addB.addActionListener(e -> {
            event(3);
        });
    }
}