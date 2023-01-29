import classes.controller.Controller;
import classes.player.Bot;
import classes.player.Human;
import classes.player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Initialize */
        List<Player> players = new ArrayList<>();
        int currentPlayer = -1;
        int turns = 0;
        Controller c = new Controller(players);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of players (1-4): ");
        int numberOfPlayer = sc.nextInt();
        while (numberOfPlayer < 1 || numberOfPlayer > 4) {
            System.out.print("Invalid! Enter again (1-4): ");
            numberOfPlayer = sc.nextInt();
        }

        // Loai bo dau enter
        sc.nextLine();
        for (int i = 1; i <= numberOfPlayer; ++i) {
            System.out.print("\nEnter player " + i + " name: ");
            String name = sc.nextLine();
            players.add(new Human(name));
            System.out.println("Welcome player " + name + "!");
        }

        if (numberOfPlayer < 4) {
            for (int i = 1; i <= 4 - numberOfPlayer; ++i) {
                players.add(new Bot("Bot " + i));
            }
            System.out.println(
                    "\nBecause there is not enough 4 players, " +
                            (4 - numberOfPlayer) +
                            " bots will be added"
            );
        }

        /* Start the game */
        while (true) {
            currentPlayer++;
            if (currentPlayer > 3) {
                currentPlayer = 0;
                turns++;
                System.out.println("\nTURN " + turns + " HAS ENDED! ALL PLAYERS RESULT:");
                c.resultDisplay();
                System.out.print("\nTURN " + (turns + 1) + " BEGINS!");
            }
            System.out.println("\nPlayer " + (currentPlayer + 1) + " turn:");
            // Neu la nguoi choi
            if (players.get(currentPlayer) instanceof Human) {
                System.out.print("Enter \"roll\" to dice: ");
                String entered = sc.nextLine();
                while(!entered.equals("roll")) {
                    System.out.print("Invalid! Enter again (roll): ");
                    entered = sc.nextLine();
                }
            }

            c.letPlayerPlay(players.get(currentPlayer));
            if (players.get(currentPlayer).getPoint() == 21) {
                System.out.println("\nTHE GAME HAS ENDED AFTER " + turns + " TURNS! WE HAVE OUR WINNER!");
                for (int i = 0; i < players.size(); ++i) {
                    Player p = players.get(i);
                    if (i == currentPlayer) {
                        if (p instanceof Human) {
                            Human h = (Human) p;
                            h.winDisplay();
                        } else {
                            Bot b = (Bot) p;
                            b.winDisplay();
                        }
                    } else {
                        if (p instanceof Human) {
                            Human h = (Human) p;
                            h.loseDisplay();
                        } else {
                            Bot b = (Bot) p;
                            b.loseDisplay();
                        }
                    }
                }
                break;
            }
        }
    }
}
