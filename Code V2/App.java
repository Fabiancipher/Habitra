import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.*;

public class App{
    //Declares objects as attributes, this helps to simply initiate them instead of declaring them every time we want one of these
    public static JPanel panel, newPanel;
    public static JFrame frame;
    public static JButton addH, addT, addB, back, add;
    public static JTextField name, deadline, time, diff;
    public static JLabel label;
    public static FileWriter writer;
    public static void main(String[] args) {
        try{
            File archive= new File("archivo.txt");
            if(archive.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        }
        catch(IOException e){
            System.out.println("Can't create file: "+e);
        }
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
                AddHabit();
                break;
            case 2:
                newPanel.setBackground(Color.decode("#8c1176"));
                AddTask();
                break;
            case 3:
                newPanel.setBackground(Color.decode("#2c118c"));
                AddBadHabit();
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
        back.addActionListener( e-> {
            newPanel.setVisible(false);
            panel.setVisible(true);
        });

        newPanel.add(back);

        frame.revalidate();
        frame.repaint();
    }

    private static void AddHabit(){
        label = new JLabel("ADD HABIT");
        label.setBounds(725, 20, 100, 20);
        label.setVisible(true);

        name = new JTextField("Name : ");
        name.setBounds(525, 100, 500, 100);
        name.setVisible(true);
        textDissapear(1);

        time= new JTextField("Time : ");
        time.setBounds(525, 300, 500, 100);
        time.setVisible(true);
        textDissapear(2);

        diff= new JTextField("Difficulty : ");
        diff.setBounds(525, 500, 500, 100);
        diff.setVisible(true);
        textDissapear(3);

        addButtonHabit();

        newPanel.add(label);
        newPanel.add(name);
        newPanel.add(time);
        newPanel.add(diff);

    }

    private static void AddTask(){
        label = new JLabel("ADD TASK");
        label.setBounds(725, 20, 100, 20);
        label.setVisible(true);

        name = new JTextField();
        name.setText("Name : ");
        name.setBounds(525, 100, 500, 100);
        name.setVisible(true);
        textDissapear(1);

        deadline= new JTextField("Deadline : ");
        deadline.setBounds(525, 300, 500, 100);
        deadline.setVisible(true);
        textDissapear(4);

        diff= new JTextField("Difficulty : ");
        diff.setBounds(525, 500, 500, 100);
        diff.setVisible(true);
        textDissapear(3);

        addButtonTask();

        newPanel.add(label);
        newPanel.add(name);
        newPanel.add(deadline);
        newPanel.add(diff);
    }

    private static void AddBadHabit(){
        label = new JLabel("ADD BAD HABIT");
        label.setForeground(Color.decode("#f0e9e9"));
        label.setBounds(725, 20, 100, 20);
        label.setVisible(true);

        name = new JTextField("Name : ");
        name.setBounds(525, 100, 500, 100);
        name.setVisible(true);
        textDissapear(1);

        time= new JTextField("Time : ");
        time.setBounds(525, 300, 500, 100);
        time.setVisible(true);
        textDissapear(2);

        diff= new JTextField("Difficulty : ");
        diff.setBounds(525, 500, 500, 100);
        diff.setVisible(true);
        textDissapear(3);

        addButtonHabit();

        newPanel.add(label);
        newPanel.add(name);
        newPanel.add(time);
        newPanel.add(diff);
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
    /**Creates an "add"*/
    private static void addButton(){
        add= new JButton("ADD!");
        add.setBounds(720, 700, 100, 60);
        add.setVisible(true);
    }

    /**Creates an "add" button for habits */
    private static void addButtonHabit(){
        addButton();
        add.addActionListener(e->{
            try{
                writer= new FileWriter("archivo.txt",true);
                writer.write(name.getText());
                writer.write(time.getText());
                writer.write(diff.getText());
                writer.close();
            }
            catch(IOException x){
                System.out.println("Impossible to write on file: "+x);
            }     
            newPanel.setVisible(false);
            panel.setVisible(true);
        });
        
        newPanel.add(add);
    }

    /**Creates an "add" button for tasks*/
    private static void addButtonTask(){
        addButton();
        
        add.addActionListener(e->{
            try{
                writer= new FileWriter("archivo.txt");
                writer.write(name.getText());
                writer.write(time.getText());
                writer.write(diff.getText());
                writer.close();
            }
            catch(IOException x){
                System.out.println("Impossible to write on file: "+x);
            }     
            newPanel.setVisible(false);
            panel.setVisible(true);
        });
        
        newPanel.add(add);
    }

    private static void textDissapear(int id){
        switch (id) {
            case 1:
                name.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e){
                if(name.getText().equals("Name : "))
                    name.setText("");
                }
                @Override
                public void focusLost(FocusEvent e){
                if(name.getText().isBlank())
                    name.setText("Name : ");
                }
                });
            break;

            case 2:
                time.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e){
                if(time.getText().equals("Time : "))
                    time.setText("");
                }
                @Override
                public void focusLost(FocusEvent e){
                if(time.getText().isBlank())
                    time.setText("Time : ");
                }
                });
            break;

            case 3:
                diff.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e){
                if(diff.getText().equals("Difficulty : "))
                    diff.setText("");
                }
                @Override
                public void focusLost(FocusEvent e){
                if(diff.getText().isBlank())
                    diff.setText("Difficulty : ");
                }
                });
            break;

            case 4:
                deadline.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e){
                if(deadline.getText().equals("Deadline : "))
                    deadline.setText("");
                }
                @Override
                public void focusLost(FocusEvent e){
                if(deadline.getText().isBlank())
                    deadline.setText("Deadline : ");
                }
                });
            break;
        
            default:
                System.out.println("Impossible to dissapear placeholder");
                break;
        }
        
    }
}