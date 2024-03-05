package ccprog3.mp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class StartMenu {
    //Variables used
    private JFrame frame;
    private ImageIcon background;
    private JLabel myLabel;
    private JButton startButton;

    //Constructor
    public StartMenu(){
        background = new ImageIcon(getClass().getResource("betterbackground.jpg"));
        myLabel = new JLabel(background);
        myLabel.setSize(1600, 900);

        frame = new JFrame("Starting Menu");
        frame.add(myLabel);
        frame.add(myLabel);
        frame.setSize(1600, 900);

        startButton = new JButton("Ready!");
        startButton.setFont(new java.awt.Font("Arial", Font.BOLD, 20));
        startButton.setBounds(750, 500, 100, 50);
        startButton.setBackground(Color.green);
        startButton.setForeground(Color.white);

        myLabel.add(startButton);
        frame.setVisible(true);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==startButton){ // if start button is clicked then it opens the Buttons class
                    frame.dispose();
                    try {
                        Buttons buttons = new Buttons();
                    } catch (IOException ex) {
                        ex.printStackTrace();
                }
            }
        }
    });


    ;}

}
