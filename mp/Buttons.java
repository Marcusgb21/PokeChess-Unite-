package ccprog3.mp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Buttons{
    //Variables used
    private static JButton sylveonbtn, gardebtn, pikabtn, grenbtn, venubtn, alo9btn, crambtn, cinderbtn;
    private static JButton zeraobtn, talflabtn, Absolbtn, Gengarbtn;
    private static JButton charbtn, lucariobtn, machampbtn, garchompbtn;
    private static JButton mamoswibtn, blastoisebtn, snorlaxbtn, crustlebtn, slowbrobtn;
    private static JButton blisbtn, eldebtn, mimebtn, wigbtn;
    private static JLabel text, atktext,deftext,supptext,spetext,alltext;
    private static JPanel panel;
    private static JFrame frame;
    public static String[] team = {"","","","","",""}; //team array
    private static int pokepos = 0;
    private static int atk = 0;
    private static int spe = 0;
    private static int def = 0;
    private static int all = 0;
    private static int supp = 0;//counters to limit pokemons of same class

    //getters for team
    public static String[] getTeam() {
        return team;
    }
    //setters for team
    public static void setTeam(String[] team) {
        Buttons.team = team;
    }

    public Buttons() throws IOException { //all buttons for choosing pokemon team

        panel = new JPanel();
        frame = new JFrame();
        frame.setBounds(10,10,1000,700);
        //frame.setSize(1000,700);
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.add(panel);
        panel.setBackground(Color.white);
        panel.setLayout(null);

        text = new JLabel("welcome to pokemon unite!");
        text.setBounds(10,20,800,25);
        text.setFont(new Font("Arial", Font.BOLD, 20));
        text.setForeground(Color.darkGray);
        panel.add(text);

        text = new JLabel("choose your class");
        text.setBounds(10,40,800,25);
        text.setFont(new Font("Arial", Font.BOLD, 16));
        text.setForeground(Color.RED);
        panel.add(text);

        atktext = new JLabel("Attacker button = Color Orange");
        atktext.setBounds(70, 450, 800, 25);
        atktext.setFont(new Font("Arial", Font.BOLD, 16));
        atktext.setForeground(Color.ORANGE);
        panel.add(atktext);

        spetext = new JLabel("Speedster Button = Color Cyan");
        spetext.setBounds(70,470,800,25);
        spetext.setFont(new Font("Arial", Font.BOLD, 16));
        spetext.setForeground(Color.CYAN);
        panel.add(spetext);

        alltext = new JLabel("All Rounder Button = Color Magenta");
        alltext.setBounds(70,490,800,25);
        alltext.setFont(new Font("Arial", Font.BOLD, 16));
        alltext.setForeground(Color.MAGENTA);
        panel.add(alltext);

        deftext = new JLabel("Defender Button = Color Blue");
        deftext.setBounds(70, 510, 800, 25);
        deftext.setFont(new Font("Arial", Font.BOLD, 16));
        deftext.setForeground(Color.BLUE);
        panel.add(deftext);

        supptext = new JLabel("Supporter Button = Color Yellow");
        supptext.setBounds(70, 530, 800, 25);
        supptext.setFont(new Font("Arial", Font.BOLD, 16));
        supptext.setForeground(Color.YELLOW);
        panel.add(supptext);

        //ATTACKERS////////////////////////////////////////////////////////////////////
        sylveonbtn = new JButton("Sylveon");
        sylveonbtn.setBounds(70, 80, 100, 25);
        sylveonbtn.setBackground(Color.ORANGE);
        sylveonbtn.setForeground(Color.white);
        panel.add(sylveonbtn);

        gardebtn = new JButton("Gardevoir");
        gardebtn.setBounds(70,120, 100, 25);
        gardebtn.setBackground(Color.ORANGE);
        gardebtn.setForeground(Color.white);
        panel.add(gardebtn);

        pikabtn = new JButton("Pikachu");
        pikabtn.setBounds(70,160, 100, 25);
        pikabtn.setBackground(Color.ORANGE);
        pikabtn.setForeground(Color.white);
        panel.add(pikabtn);

        grenbtn = new JButton("Greninja");
        grenbtn.setBounds(70,200, 100, 25);
        grenbtn.setBackground(Color.ORANGE);
        grenbtn.setForeground(Color.white);
        panel.add(grenbtn);

        venubtn = new JButton("Venusaur");
        venubtn.setBounds(70,240, 100, 25);
        venubtn.setBackground(Color.ORANGE);
        venubtn.setForeground(Color.white);
        panel.add(venubtn);

        alo9btn = new JButton("Alolan Ninetales");
        alo9btn.setBounds(70,280, 100, 25);
        alo9btn.setBackground(Color.ORANGE);
        alo9btn.setForeground(Color.white);
        panel.add(alo9btn);

        crambtn = new JButton("Cramorant");
        crambtn.setBounds(70,320, 100, 25);
        crambtn.setBackground(Color.ORANGE);
        crambtn.setForeground(Color.white);
        panel.add(crambtn);

        cinderbtn = new JButton("Cinderface");
        cinderbtn.setBounds(70, 360, 100, 25);
        cinderbtn.setBackground(Color.ORANGE);
        cinderbtn.setForeground(Color.white);
        panel.add(cinderbtn);

        //SPEEDSTERS\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        zeraobtn = new JButton("Zeraora");
        zeraobtn.setBounds(385, 80, 100, 25);
        zeraobtn.setBackground(Color.CYAN);
        zeraobtn.setForeground(Color.white);
        panel.add(zeraobtn);

        talflabtn = new JButton("Talon Flame");
        talflabtn.setBounds(385, 120, 100, 25);
        talflabtn.setBackground(Color.CYAN);
        talflabtn.setForeground(Color.white);
        panel.add(talflabtn);

        Absolbtn = new JButton("Absol");
        Absolbtn.setBounds(385, 160, 100, 25);
        Absolbtn.setBackground(Color.CYAN);
        Absolbtn.setForeground(Color.white);
        panel.add(Absolbtn);

        Gengarbtn = new JButton("Gengar");
        Gengarbtn.setBounds(385, 200, 100, 25);
        Gengarbtn.setBackground(Color.CYAN);
        Gengarbtn.setForeground(Color.white);
        panel.add(Gengarbtn);

        //ALL ROUNDERS\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        charbtn = new JButton("Charizard");
        charbtn.setBounds(280, 80, 100, 25);
        charbtn.setBackground(Color.MAGENTA);
        charbtn.setForeground(Color.white);
        panel.add(charbtn);

        lucariobtn = new JButton("Lucario");
        lucariobtn.setBounds(280, 120, 100, 25);
        lucariobtn.setBackground(Color.MAGENTA);
        lucariobtn.setForeground(Color.white);
        panel.add(lucariobtn);

        machampbtn = new JButton("Machamp");
        machampbtn.setBounds(280, 160, 100, 25);
        machampbtn.setBackground(Color.MAGENTA);
        machampbtn.setForeground(Color.white);
        panel.add(machampbtn);

        garchompbtn = new JButton("Garchomp");
        garchompbtn.setBounds(280, 200, 100, 25);
        garchompbtn.setBackground(Color.MAGENTA);
        garchompbtn.setForeground(Color.white);
        panel.add(garchompbtn);
        frame.setVisible(true);

        //DEFENDER\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        mamoswibtn = new JButton("MamoSwine");
        mamoswibtn.setBounds(175, 80, 100,25);
        mamoswibtn.setBackground(Color.BLUE);
        mamoswibtn.setForeground(Color.white);
        panel.add(mamoswibtn);

        blastoisebtn = new JButton("Blastoise");
        blastoisebtn.setBounds(175, 120, 100, 25);
        blastoisebtn.setBackground(Color.BLUE);
        blastoisebtn.setForeground(Color.white);
        panel.add(blastoisebtn);

        snorlaxbtn = new JButton("Snorlax");
        snorlaxbtn.setBounds(175, 160, 100, 25);
        snorlaxbtn.setBackground(Color.BLUE);
        snorlaxbtn.setForeground(Color.white);
        panel.add(snorlaxbtn);

        crustlebtn = new JButton("Crustle");
        crustlebtn.setBounds(175, 200, 100, 25);
        crustlebtn.setBackground(Color.BLUE);
        crustlebtn.setForeground(Color.white);
        panel.add(crustlebtn);

        slowbrobtn = new JButton("Slowbro");
        slowbrobtn.setBounds(175, 240, 100, 25);
        slowbrobtn.setBackground(Color.BLUE);
        slowbrobtn.setForeground(Color.white);
        panel.add(slowbrobtn);

        //SUPPORTER\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        blisbtn = new JButton("Blissey");
        blisbtn.setBounds(490, 80, 100, 25);
        blisbtn.setBackground(Color.YELLOW);
        blisbtn.setForeground(Color.white);
        panel.add(blisbtn);

        eldebtn = new JButton("Eldegoss");
        eldebtn.setBounds(490, 120, 100, 25);
        eldebtn.setBackground(Color.YELLOW);
        eldebtn.setForeground(Color.white);
        panel.add(eldebtn);

        mimebtn = new JButton("Mr. Mime");
        mimebtn.setBounds(490, 160, 100, 25);
        mimebtn.setBackground(Color.YELLOW);
        mimebtn.setForeground(Color.white);
        panel.add(mimebtn);

        wigbtn = new JButton("Wigglytuff");
        wigbtn.setBounds(490, 200, 100, 25);
        wigbtn.setBackground(Color.YELLOW);
        wigbtn.setForeground(Color.white);
        panel.add(wigbtn);

        //ATTACKER

        sylveonbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "syl"; //if pokemon is equal to syl then it gets printed out
                System.out.println(team[pokepos]);

               if(atk == 2) //Restriction set to 2 for maximum attacker slots
                   System.out.println("NO ATTACKER SLOTS LEFT");

                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                    System.out.println("proceed to game");
                    frame.dispose();
                    try {
                        NewWindow myWindow = new NewWindow();// called when pokemon team is full
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                }
                   atk++; //increments the attacker counter
                   pokepos++; //increments the position of the pokemon
                   System.out.println(pokepos);
                }
            }
            });

        gardebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "garde";
                System.out.println(team[pokepos]);

                if (atk == 2) //Restriction set to 2 for maximum attacker slots
                    System.out.println("NO ATTACK SLOTS LEFT");
                else {
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if (pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }

                    }
                    atk++;
                    pokepos++;
                }
            }
        });

        pikabtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "pik";
                System.out.println(team[pokepos]);

                if (atk == 2) //Restriction set to 2 for maximum attacker slots
                    System.out.println("NO ATTACK SLOTS LEFT");
                else {
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    atk++;
                    pokepos++;
                }

            }
        });
        grenbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "gren";
                System.out.println(team[pokepos]);

                if (atk == 2) //Restriction set to 2 for maximum attacker slots
                    System.out.println("NO ATTACK SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    atk++;
                    pokepos++;
                }
            }
        });

        venubtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "ven";
                System.out.println(team[pokepos]);
                if (atk == 2) //Restriction set to 2 for maximum attacker slots
                    System.out.println("NO ATTACK SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    atk++;
                    pokepos++;
                }
            }
        });
        alo9btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "nine";
                System.out.println(team[pokepos]);
                if (atk == 2) //Restriction set to 2 for maximum attacker slots
                    System.out.println("NO ATTACK SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    atk++;
                    pokepos++;
                }
            }
        });

        crambtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "cram";
                System.out.println(team[pokepos]);
                if (atk == 2) //Restriction set to 2 for maximum attacker slots
                    System.out.println("NO ATTACK SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    atk++;
                    pokepos++;
                }
            }
        });

        cinderbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "cinder";
                System.out.println(team[pokepos]);
                if (atk == 2) //Restriction set to 2 for maximum attacker slots
                    System.out.println("NO ATTACK SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    atk++;
                    pokepos++;
                }
            }
        });


        //SPEEDSTER
        zeraobtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "zer";
                System.out.println(team[pokepos]);
                if (spe == 2) //Restriction set to 2 for maximum speedster slots
                    System.out.println("NO SPEEDSTER SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    spe++;
                    pokepos++;
                }
            }
        });

        talflabtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "talon";
                System.out.println(team[pokepos]);
                if (spe == 2) //Restriction set to 2 for maximum speedster slots
                    System.out.println("NO SPEEDSTER SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    spe++;
                    pokepos++;
                }
            }
        });

        Absolbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "abs";
                System.out.println(team[pokepos]);
                if (spe == 2) //Restriction set to 2 for maximum speedster slots
                    System.out.println("NO SPEEDSTER SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    spe++;
                    pokepos++;
                }
            }
        });

        Gengarbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "gen";
                System.out.println(team[pokepos]);
                if (spe == 2) //Restriction set to 2 for maximum speedster slots
                    System.out.println("NO SPEEDSTER SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    spe++;
                    pokepos++;
                }
            }
        });

        //ALLROUNDERS
        charbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "chari";
                System.out.println(team[pokepos]);
                if (all == 2)
                    System.out.println("NO ALL ROUNDER SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    all++;
                    pokepos++;
                }
            }
        });

        lucariobtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "luc";
                System.out.println(team[pokepos]);
                if (all == 2)
                    System.out.println("NO ALL ROUNDER SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    all++;
                    pokepos++;
                }
            }
        });

        machampbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "mach";
                System.out.println(team[pokepos]);
                if (all == 2)
                    System.out.println("NO ALL ROUNDER SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    all++;
                    pokepos++;
                }
            }
        });
        garchompbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "gar";
                System.out.println(team[pokepos]);
                if (all == 2)
                    System.out.println("NO ALL ROUNDER SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    all++;
                    pokepos++;
                }
            }
        });
        //DEFENDER
        mamoswibtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "mamo";
                System.out.println(team[pokepos]);
                if (def == 2)
                    System.out.println("NO DEFENDER SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    def++;
                    pokepos++;
                }
            }
        });
        blastoisebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "blas";
                System.out.println(team[pokepos]);
                if (def == 2)
                    System.out.println("NO DEFENDER SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    def++;
                    pokepos++;
                }
            }
        });

        snorlaxbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "snor";
                System.out.println(team[pokepos]);
                if (def == 2)
                    System.out.println("NO DEFENDER SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    def++;
                    pokepos++;
                }
            }
        });
        crustlebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "crus";
                System.out.println(team[pokepos]);
                if (def == 2)
                    System.out.println("NO DEFENDER SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    def++;
                    pokepos++;
                }
            }
        });
        slowbrobtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "slow";
                System.out.println(team[pokepos]);
                if (def == 2)
                    System.out.println("NO DEFENDER SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    def++;
                    pokepos++;
                }
            }
        });
        //SUPPORTER
        blisbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "blis";
                System.out.println(team[pokepos]);
                if (supp == 2)
                    System.out.println("NO SUPPORTER SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    supp++;
                    pokepos++;
                }
            }
        });

        eldebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "elde";
                System.out.println(team[pokepos]);
                if (supp == 2)
                    System.out.println("NO SUPPORTER SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    supp++;
                    pokepos++;
                }
            }
        });

        mimebtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "mr";
                System.out.println(team[pokepos]);
                if (supp == 2)
                    System.out.println("NO SUPPORTER SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    supp++;
                    pokepos++;
                }
            }
        });

        wigbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                team[pokepos]= "wig";
                System.out.println(team[pokepos]);
                if (supp == 2)
                    System.out.println("NO SUPPORTER SLOTS LEFT");
                else{
                    //if it reaches to 4 then it proceeds to the game and calls NewWindow
                    if(pokepos == 4) {
                        System.out.println("proceed to game");
                        frame.dispose();
                        try {
                            NewWindow myWindow = new NewWindow(); // called when pokemon team is full
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                    supp++;
                    pokepos++;
                }
            }
        });
    }

}
