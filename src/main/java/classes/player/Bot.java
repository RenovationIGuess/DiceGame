package classes.player;

public class Bot extends Player {
    private final String[] happy = {
            "LONG MẠCH!",
            "Oai chưa?!",
            "Oách chưa?!",
            "Thường thôi"
    };
    private final String[] sad = {
            "Lần sau lại tới :(",
            "Ăn may",
            "Giỏi",
            "Thằng này có long mạch à?",
            ":(",
            "..."
    };

    @Override
    public void winDisplay() {
        System.out.println("WINNER - Player " + getName() + " has " + getPoint() + " points - expression: " + showImpression(1));
    }

    @Override
    public void loseDisplay() {
        System.out.println("Player " + getName() + " has " + getPoint() + " points - expression: " + showImpression(0));
    }

    public String showImpression(int result) {
        // 1 - Win / 0 - Lose
        if (result == 1) {
            int index = (int) (Math.random() * (happy.length));
            return happy[index];
        } else {
            int index = (int) (Math.random() * (sad.length));
            return sad[index];
        }
    }

    public Bot(String name) {
        super(name);
    }
}
