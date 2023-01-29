package classes.player;

import classes.dice.Dice;

public abstract class Player {
    private static int nbOfPlayer = 0;
    private int id;
    private String name;
    private int point;

    /* Getter */
    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
    }

    /* Setter */

    public void setName(String name) {
        this.name = name;
    }

    public void setPoint(int point) {
        if (this.point + point > 21) {
           this.point = 0;
        } else {
            this.point += point;
        }
    }

    public Player(String name) {
        this.id = ++nbOfPlayer;
        this.name = name;
        this.point = 0;
    }

    public abstract void winDisplay();
    public abstract void loseDisplay();

    public void rollDice() {
        Dice d = new Dice();
        System.out.println(
                "\nThis time player " +
                        this.name +
                        " will have " +
                        d.getRandomMostNum() +
                        " dots rates up!"
        );
        d.setPoint();
        try {
            System.out.print("Rolling");
            for (int i = 0; i < 3; ++i) {
                // Delay for 7 seonds
                Thread.sleep(1000);
                System.out.print(".");
            }
            Thread.sleep(1000);

        }
        catch(InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(
                "Player " +
                        this.name +
                        " dice result: " +
                        d.getPoint()
        );
        setPoint(d.getPoint());
        System.out.println(
                "Player " +
                        this.name +
                        " total points: " +
                        this.point
        );
    }
}
