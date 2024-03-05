package ccprog3.mp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class BattleScreen implements ActionListener{
    //Variables used
    private JFrame frame;
    private JButton attackbtn, defendbtn, healbtn, runbtn;
    private ImageIcon background;
    private JLabel myLabel, hplabel;
    private double health, defense,rawdamage, totdamage, maxhealth, defencom;
    private int xcoord, ycoord;

    //Constructor
    public BattleScreen(int xp, int yp, int xprev, int yprev, double hp, double def, double defendcom) {
    }

    //Method of battlescreen
    public void battleScreen(int xp, int yp, int xprev, int yprev, double hp, double def, double defendcom) {
        //this.damage = damage;

        //frame.setUndecorated(true);
        defencom = defendcom;
        health = hp;
        defense = def;
        xcoord = xp;
        ycoord = yp;

        background = new ImageIcon(getClass().getResource("pokemonBSScreen.jpg"));
        myLabel = new JLabel(background);
        myLabel.setSize(1200, 675);

        hplabel = new JLabel("HP LABEL:" + health);
        hplabel.setBounds(500, 300, 100,80);

        frame = new JFrame("Battle Screen");
        frame.setSize(1200, 675);
        frame.add(myLabel);

        attackbtn = new JButton("ATTACK");
        attackbtn.setBounds(200, 500, 100, 80);

        runbtn = new JButton("RUN");
        runbtn.setBounds(400, 500, 100, 80);

        defendbtn = new JButton("DEFEND");
        defendbtn.setBounds(600, 500, 100, 80);

        healbtn = new JButton("HEAL");
        healbtn.setBounds(800, 500, 100, 80);

        myLabel.add(attackbtn);
        myLabel.add(runbtn);
        myLabel.add(defendbtn);
        myLabel.add(healbtn);

        centerFrame(frame);
        centerLabel(myLabel);

        myLabel.add(hplabel);
        maxhealth = health;
        attackbtn.addActionListener(this);
        setUpButtonListeners();
        frame.setUndecorated(true);
        frame.setVisible(true);

    }

    //Method to make the label in the center
    private void centerLabel(JLabel myLabel) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        //New location of the window
        int w = myLabel.getWidth();
        int h = myLabel.getHeight();
        int x = (dimension.width - w) / 2;
        int y = (dimension.height - h) / 2;

        myLabel.setLocation(x, y);

    }

    //Method to make the frame in the center
    private void centerFrame(JFrame frame) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

        //New location of the window
        int w = frame.getWidth();
        int h = frame.getHeight();
        int x = (dimension.width - w) / 2;
        int y = (dimension.height - h) / 2;

        frame.setLocation(x, y);
        frame.setLocationRelativeTo(null);
    }

    //action performed method
    @Override
    public void actionPerformed(ActionEvent e) {
        //Gets the raw damage of the pokemon
        rawdamage = (NewWindow.getPokemon(xcoord*100, ycoord*100).attack * maxhealth) - defense *  NewWindow.getPokemon(xcoord*100, ycoord*100).attack * maxhealth;
        totdamage = defencom * rawdamage; //total damage of the pokemon

        health -= totdamage; //decrements the health from the total damage


        hplabel.setText("HP:" + health);
        if(health<=0) //if health is equal to 0 then the battlescreen closes
            frame.dispose();
    }

    //Method for the other buttons
    public void setUpButtonListeners(){
        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == runbtn){ //if the runbtn is clicked then run is activated
                    frame.dispose();
                }
                else if(e.getSource() == defendbtn){ //if the defendbtn is clicked then run is activated
                    System.out.println("DEFEND");
                    frame.dispose();
                }
                else if(e.getSource() == healbtn){ //if the healbtn is clicked then run is activated
                    System.out.println("HEAL");
                    frame.dispose();
                }
            }
        };
        //buttons are called and uses button listener
        runbtn.addActionListener(buttonListener);
        defendbtn.addActionListener(buttonListener);
        healbtn.addActionListener(buttonListener);
    }



}




