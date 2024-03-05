package ccprog3.mp;

import java.util.LinkedList;

public class pokemons {
    //variables used
    int xp;
    int yp;
    double attack, defense;
    int speed;
    int x,y;
    boolean isWhite;
    double hp;
    LinkedList<pokemons> ps;
    String name;
    int move;
    int point;
    double hpregen;

    //Constructor
    public pokemons(int xp, int yp, boolean isWhite, String n, double attack,double defense, int speed, int hp, LinkedList<pokemons> ps, int point, double hpregen) {
        this.xp = xp;
        this.yp = yp;
        x=xp*100;
        y=yp*100;
        this.isWhite = isWhite;
        this.ps=ps;
        name=n;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.hp = hp;
        this.point = point;
        this.hpregen = hpregen;
        ps.add(this);
    }
//method for moving pokemon and killing
    public void move(int xp,int yp, int xprev, int yprev, int num, int moves){

        if(NewWindow.getPokemon(xp*100,yp*100)!= null ){
            if(NewWindow.getPokemon(xp*100,yp*100).isWhite!=isWhite&& num==1){// restrictions depending on pokemon speed and position

                double hp = this.hp;
                double def = this.defense;

                NewWindow.getPokemon(xp*100, yp*100).kill(xp, yp, xprev, yprev);

            }
            else {
                x = this.xp * 100;
                y = this.yp * 100;
                return;
            }
        }
        if(num==1) {
            this.xp = xp;
            this.yp = yp;
            x = xp * 100;
            y = yp * 100;
        }
        else {
            x = this.xp * 100;
            y = this.yp * 100;
            return;
        }

        System.out.println("Round: "+ moves);
        if(moves==20) {
            EndScreen endScreen = new EndScreen();
        }
        move = moves;

    }
    public void kill(int xp,int yp, int xprev, int yprev){//kill method for removing pokemon

        double defendcom;

        defendcom = .8;
        //edit for demo purposes
        double hp = this.hp;
        double def = this.defense;

        BattleScreen battleScreen = new BattleScreen(xp, yp, xprev, yprev, hp, def, defendcom);
        battleScreen.battleScreen(xp, yp,xprev, yprev, hp, def, defendcom);

        ps.remove(this);

    }
}