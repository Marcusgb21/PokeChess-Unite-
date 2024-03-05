package ccprog3.mp;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;

import static java.lang.Math.abs;

public class NewWindow {

    public static LinkedList<pokemons> ps = new LinkedList<>();
    public static pokemons selectedpokemons = null;


    NewWindow() throws IOException {
        BufferedImage all = ImageIO.read(new File("C:\\Users\\marc\\Documents\\School\\ProgrammingStuff\\JavaStuff\\src\\ccprog3\\mp\\pokemons.png"));
        Image[] imgs = new Image[26];

        String[] team = {"","","","","",""};
        int ind=0;
        for(int y=0;y<1000;y+=200){
            for(int x=0;x<1200;x+=200){
                imgs[ind]=all.getSubimage(x, y, 200, 200).getScaledInstance(100, 100, BufferedImage.SCALE_SMOOTH);
                if(ind<25)
                    ind++;
            }
        }

//POKEMONS STATS
        int x=0;
        System.out.println(Buttons.team[0]);
        System.out.println(Buttons.team[1]);
        System.out.println(Buttons.team[2]);
        System.out.println(Buttons.team[3]);
        System.out.println(Buttons.team[4]);
        System.out.println(Buttons.team[5]);
        pokemons syl, pik, ven, garde, gren, nine, cram, cinder, zer, talon, abs, gen, chari, luc, mach, gar, mamo, blas, snor, crus, slow, blis, elde, mr, wig;

        for(x=0; x<5 ;x++){
            //ATTACKER
            if(Buttons.team[x]=="syl")
                syl= new pokemons(0, x, true, "sylveon",0.40 , 0.15,2,75, ps, 1, 0.05);

            if(Buttons.team[x]=="pik")
                pik= new pokemons(0, x, true, "pikachu",0.40, 0.15,2,75,  ps, 1,0.05);

            if(Buttons.team[x]=="ven")
                ven= new pokemons(0, x, true, "venusaur",0.40, 0.15,2,75, ps, 1,0.05);

            if(Buttons.team[x]=="garde")
                garde= new pokemons(0, x, true, "gardevoir",0.40 , 0.15,2,75, ps,1, 0.05);

            if(Buttons.team[x]=="gren")
                gren= new pokemons(0, x, true, "greninja",0.40, 0.15,2,75, ps,1, 0.05);

            if(Buttons.team[x]=="nine")
                nine= new pokemons(0, x, true, "ninetales",0.40,0.15,2,75, ps,1, 0.05);

            if(Buttons.team[x]=="cram")
                cram= new pokemons(0, x, true, "cramorant",0.40,0.15,2,75, ps,1, 0.05);

            if(Buttons.team[x]=="cinder")
                cinder= new pokemons(0, x, true, "cinderace",0.40,0.15,2,75, ps,1, 0.05);

            //SPEEDSTER
            if(Buttons.team[x]=="zer")
                zer= new pokemons(0, x, true, "zeraora",0.40,0.05,3,50, ps,1, 0.05);

            if(Buttons.team[x]=="talon")
                talon= new pokemons(0, x, true, "talonflame",0.40,0.05,3,50, ps,1, 0.05);

            if(Buttons.team[x]=="abs")
                abs= new pokemons(0, x, true, "absol",0.40,0.05,3,50, ps,1, 0.05);

            if(Buttons.team[x]=="gen")
                gen= new pokemons(0, x, true, "gengar",0.40,0.05,3,50, ps, 1, 0.05);

            //ALL ROUNDER
            if(Buttons.team[x]=="chari")
                chari= new pokemons(0, x, true, "charizard",0.30,0.15,2,75, ps, 1, 0.10);

            if(Buttons.team[x]=="luc")
                luc= new pokemons(0, x, true, "lucario",0.30,0.15,2,75, ps, 1, 0.10);

            if(Buttons.team[x]=="mach")
                mach= new pokemons(0, x, true, "machamp",0.30,0.15,2,75, ps, 1, 0.10);

            if(Buttons.team[x]=="gar")
                gar= new pokemons(0, x, true, "garchomp",0.30,0.15,2,75, ps, 1, 0.10);

            //DEFENDER
            if(Buttons.team[x]=="mamo")
                mamo= new pokemons(0, x, true, "mamoswine",0.20,0.25,1,100, ps, 1, 0.05);

            if(Buttons.team[x]=="blas")
                blas= new pokemons(0, x, true, "blastoise",0.20,0.25,1,100, ps, 1, 0.05);

            if(Buttons.team[x]=="snor")
                snor= new pokemons(0, x, true, "snorlax",0.20,0.25,1,100, ps, 1, 0.05);

            if(Buttons.team[x]=="crus")
                crus= new pokemons(0, x, true, "crustle",0.20,0.25,1,100, ps, 1, 0.05);

            if(Buttons.team[x]=="slow")
                slow= new pokemons(0, x, true, "slowbro",0.20,0.25,1,100, ps, 1, 0.05);

            //SUPPORTER
            if(Buttons.team[x]=="blis")
                blis= new pokemons(0, x, true, "blissey",0.20,0.05,1,100, ps, 1, 0.15);

            if(Buttons.team[x]=="elde")
                elde= new pokemons(0, x, true, "eldegoss",0.20,0.05,1,100, ps, 1, 0.15);

            if(Buttons.team[x]=="mr")
                mr= new pokemons(0, x, true, "mr.mime",0.20,0.05,1,100, ps, 1, 0.15);

            if(Buttons.team[x]=="wig")
                wig= new pokemons(0, x, true, "wigglytuff",0.20,0.05,1,100, ps, 1, 0.15);

        }

        pokemons esylveon=new pokemons(6, 0, false, "sylveon",0.40 , 0.25, 2, 75 ,ps, 1, 0.05);
        pokemons ezeraora=new pokemons(6, 1, false, "zeraora",0.40,0.05,3,50 , ps, 1, 0.05);
        pokemons echarizard=new pokemons(6, 2, false, "charizard",0.30,0.15,2,75 , ps, 1, 0.10);
        pokemons emamoswine=new pokemons(6, 3, false, "mamoswine",0.20,0.25,1,100 , ps, 1, 0.05);
        //pokemons eemamoswine=new pokemons(6, 4, false, "blastoise",0.20,0.25,1,100 , ps);
        pokemons emrmmime=new pokemons(6, 4, false, "mr.mime",0.20,0.05,1,100 , ps, 1, 0.15);

        //Size of board
        JFrame boardframe = new JFrame();
        boardframe.setBounds(0,0,900,540);
        JPanel boardpn;

        JLabel stats = new JLabel("stats:");

        stats.setBounds(800,200,20,10);

        //Board
        boardpn = new JPanel(){
            public void paint(Graphics g) {
                boolean white = true;
                for (int y = 0; y < 5; y++) {// draws checkerboard

                    for (int x = 0; x < 7; x++) {

                        if (white) {
                            g.setColor(Color.white);
                        } else {
                            g.setColor(Color.GRAY);

                        }
                        g.fillRect(x * 100, y * 100, 100, 100);
                        if(x!=6)
                            white = !white;
                    }
                    white = !white;
                }


                int damson = 0;

                for(pokemons p: ps){ //assigns the position to the designated pokemon in the png file

                    int ind=0;
                    if(p.name.equalsIgnoreCase("sylveon")){
                        ind=0;
                    }
                    if(p.name.equalsIgnoreCase("pikachu")){
                        ind=1;
                    }
                    if(p.name.equalsIgnoreCase("venusaur")){
                        ind=2;
                    }
                    if(p.name.equalsIgnoreCase("gardevoir")){
                        ind=3;
                    }
                    if(p.name.equalsIgnoreCase("greninja")){
                        ind=4;
                    }
                    if(p.name.equalsIgnoreCase("ninetales")){
                        ind=5;
                    }
                    if(p.name.equalsIgnoreCase("cramorant")){
                        ind=6;
                    }
                    if(p.name.equalsIgnoreCase("cinderace")){
                        ind=7;
                    }
                    if(p.name.equalsIgnoreCase("zeraora")){
                        ind=8;
                    }
                    if(p.name.equalsIgnoreCase("talonflame")){
                        ind=9;
                    }
                    if(p.name.equalsIgnoreCase("absol")){
                        ind=10;
                    }
                    if(p.name.equalsIgnoreCase("gengar")){
                        ind=11;
                    }
                    if(p.name.equalsIgnoreCase("charizard")){
                        ind=12;
                    }
                    if(p.name.equalsIgnoreCase("lucario")){
                        ind=13;
                    }
                    if(p.name.equalsIgnoreCase("machamp")){
                        ind=14;
                    }
                    if(p.name.equalsIgnoreCase("garchomp")){
                        ind=15;
                    }
                    if(p.name.equalsIgnoreCase("mamoswine")){
                        ind=16;
                    }
                    if(p.name.equalsIgnoreCase("blastoise")){
                        ind=17;
                    }
                    if(p.name.equalsIgnoreCase("snorlax")){
                        ind=18;
                    }
                    if(p.name.equalsIgnoreCase("crustle")){
                        ind=19;
                    }
                    if(p.name.equalsIgnoreCase("slowbro")){
                        ind=20;
                    }
                    if(p.name.equalsIgnoreCase("blissey")){
                        ind=21;
                    }
                    if(p.name.equalsIgnoreCase("eldegoss")){
                        ind=22;
                    }
                    if(p.name.equalsIgnoreCase("mr.mime")){
                        ind=23;
                    }
                    if(p.name.equalsIgnoreCase("wigglytuff")){
                        ind=24;
                    }

                    if(!p.isWhite){
                        //ind+=6;
                    }
                    g.drawImage(imgs[ind], p.x, p.y, this);// paints pokemon based on index on png
                    if(damson<4)
                        damson++;
                }

            }
        };

        boardpn.add(stats);

        boardpn.setBounds(0,0,770,550);
        boardframe.add(boardpn);

        final int[] startx = new int[1];
        final int[] starty = new int[1];

        Random rand= new Random();
        int rng = rand.nextInt(2);


        boolean[] turn = new boolean[1];
        int[] moves = new int[1];
        int[] rounds = new int[1];

        moves[0] = 0;

        //random generator for who gets to move first
        if(rng==1) {
            turn[0] = true;
        }
        else {
            turn[0] = false;
        }


        boardframe.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {


            }
            @Override
            public void mousePressed(MouseEvent e) { //method for clicking on the pokemon

                selectedpokemons=getPokemon(e.getX(), e.getY());
                startx[0] = selectedpokemons.xp;
                starty[0] = selectedpokemons.yp;

                System.out.println("Pokemon's hp: "+ selectedpokemons.hp);

            }

            @Override
            public void mouseReleased(MouseEvent e) {//method

                if(abs(e.getX()/100-startx[0])<= selectedpokemons.speed&&abs(e.getY()/100-starty[0])<= selectedpokemons.speed
                        && selectedpokemons.isWhite == true && e.getX()/100!= 6 || selectedpokemons.isWhite == false && e.getX()/100 !=0) { // restriction for pokemon movement based on speed, position and turn
                    if(selectedpokemons.isWhite == true && turn[0] == true ||selectedpokemons.isWhite == false && turn[0] ==false) {


                        selectedpokemons.move(e.getX() / 100, e.getY() / 100, startx[0], starty[0], 1, rounds[0]);
                        moves[0]++;
                        if(moves[0]==3) {
                            turn[0] = !turn[0];
                            moves[0]=0;
                            rounds[0]++;
                        }

                        if(turn[0]== true)
                            System.out.println("Ally Turn");
                        else
                            System.out.println("Enemy Turn");

                        System.out.println("Round:" +moves[0]);
                    }
                    else{
                        selectedpokemons.move(e.getX() / 100, e.getY() / 100, startx[0], starty[0], 0, rounds[0]);



                        startx[0]=0;
                        boardframe.repaint();
                    }

                }
                else
                    selectedpokemons.move(e.getX() / 100, e.getY() / 100, startx[0], starty[0], 0, rounds[0]);


                startx[0]=0;
                boardframe.repaint();
            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        boardframe.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if(selectedpokemons!=null){
                    selectedpokemons.x=e.getX()-50;
                    selectedpokemons.y=e.getY()-50;
                    boardframe.repaint();

                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });

        boardframe.setVisible(true);
        boardframe.setDefaultCloseOperation(3);
    }

    public static pokemons getPokemon(int x, int y){
        int xp=x/100;
        int yp=y/100;
        for(pokemons p: ps){
            if(p.xp==xp&&p.yp==yp){
                return p;
            }
        }
        return null;

    }


}