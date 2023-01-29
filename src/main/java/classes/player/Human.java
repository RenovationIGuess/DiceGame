package classes.player;

public class Human extends Player {
    public Human(String name) {
        super(name);
    }

    @Override
    public void winDisplay() {
        System.out.println("WINNER - Player " + getName() + " has " + getPoint() + " points!");
    }

    @Override
    public void loseDisplay() {
        System.out.println("Player " + getName() + " has " + getPoint() + " points");
    }
}
