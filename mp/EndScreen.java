package ccprog3.mp;

import javax.swing.*;
import java.awt.*;

public class EndScreen {
    //Variables used
    private JFrame frame;
    private JLabel myLabel, winnerLabel;
    private ImageIcon background;

    //Constructor to show the endscreen
    public EndScreen(){
        background = new ImageIcon(getClass().getResource("pokeendscreen.jpg"));
        myLabel = new JLabel(background);
        myLabel.setSize(1024,565);

        frame = new JFrame("End Screen");
        frame.add(myLabel);
        frame.setSize(1024, 565);

        winnerLabel = new JLabel("YOU WIN!");
        winnerLabel.setBounds(500,100, 200, 200);
        winnerLabel.setFont(new java.awt.Font("Arial", Font.BOLD, 20));
        winnerLabel.setForeground(Color.green);

        myLabel.add(winnerLabel);
        frame.setVisible(true);

    }

}
